/*
 * Copyright (C) 1999-2006 <a href="mailto:paschke@in.tum.de">Adrian Paschke</a>
 * 
 * The OWL2Prova library is part of the Rule Based Service Level Agreement (RBSLA)
 * framework, available at 
 * <a href=" http://ibis.in.tum.de/staff/paschke/rbsla/index.htm">RBSLA</a>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package rbsla.owl;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.rdf.model.impl.LiteralImpl;
import com.hp.hpl.jena.rdf.model.impl.ResourceImpl;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * <p>SimpleConverter.</p>
 * 
 * <p>The simple converter translates a RDF model into a Prova model.
 * The standard translation pattern is <code>["rdf","subject","predicate","object"]</code>
 * which translates a RDF triple <code>"subject predicate object"</code> 
 * into a Prova fact "<code>rdf(subject,predicate,object)</code>".</p>
 * 
 * <p>User-defined patterns can be set via the constructor or the setPattern method, e.g.:
 * <ul><li>["predicate","subject","object"] => predicate(subject,object)
 * <li>["subj_obj", "subject","object"] => subj_obj(subject,object)
 * <li>["rdf","RDFTriple","subject","predicate","object"] => rdf(RDFTriple,subject,predicate,object)</ul>
 * etc.
 * <code>"predicate","subject","object"</code> are restricted key words which define the position of 
 * the RDF subject, object and predicate in the output fact. 
 * The first term is always interpreted as predicate name of the prova fact.</p>
 * 
 * <p>The converter by default translates blank nodes/reification keys to anons "<code>_anonX</code>"
 * Standard XMLS datatypes such as String, Integer, Float, Double are 
 * automatically mapped to the corresponding Prova/Java types. </p>
 * 
 * @author <A HREF="mailto:paschke@in.tum.de">Adrian Paschke</A>
 * @version 0.1 <01 August 2005>
 * @since 0.1
 */

public class SimpleConverter implements Converter {
	
	private ArrayList pattern; // translation pattern

	/**
	 * Constructor.
	 * Uses the default tranlation pattern which is 
	 * <code>["rdf","subject",predicate","object"]</code> maps to <code>rdf(subject,predicate,object)</code>.
	 */
	public SimpleConverter() {
		pattern = new ArrayList();
		pattern.add("rdf");
		pattern.add("subject");
		pattern.add("predicate");
		pattern.add("object");
	}
	
	/**
	 * Constructor.
	 * @param pattern user defined pattern.
	 */
	public SimpleConverter(ArrayList pattern) {
		this.pattern = pattern;
	}
	
	/**
	 * Return the translation pattern of the converter.
	 * @return pattern ArrayList
	 */
	public ArrayList getPattern() {
		return pattern;
	}
	
	/**
	 * Set the translation pattern of the converter. 
	 * @param pattern translation pattern
	 */
	public void setPattern(ArrayList pattern) {
		this.pattern=pattern;
	}
	
	/**
	 * Translate: Translate the model to a prova model, 
	 * i.e. translate RDF triples to prova facts according to the
	 * set translation pattern.
	 * @param model a Model
	 * @return ProvaModel
	 */
	public ProvaModel translate(Model model) {
		
		int anon_counter = 0;
		HashMap anons = new HashMap();
		
		ProvaModel provaModel = new ProvaModel();
		NameSpaceList ns = new NameSpaceList(model); // create name space list
		for (StmtIterator iter = model.listStatements();iter.hasNext();) {
			Statement stmt = iter.nextStatement();
			
			
			Property predicate = stmt.getPredicate(); // predicate			
			Resource subject = stmt.getSubject(); // subject			

			//translate predicate
			String pred = ns.getAbbreviation(predicate.getNameSpace())+predicate.getLocalName();

			// translate subject - subject might be anon
			String subj;
			if (subject.isAnon()) {
				String id = subject.getId().toString();
				if (anons.containsKey(id)) subj=anons.get(id).toString();
				else {
					anon_counter++;
					subj = "_:anon"+anon_counter;					
					anons.put(id,subj);
				}
			} else subj = ns.getAbbreviation(subject.getNameSpace())+subject.getLocalName();						
			
			// translate object
			String obj;			
			if (stmt.getObject() instanceof ResourceImpl){ // object is resource			
				ResourceImpl object = (ResourceImpl) stmt.getObject();			
				if (object.isAnon()) {
					String id = object.getId().toString();
					if (anons.containsKey(id)) obj=anons.get(id).toString();
					else {
						anon_counter++;
						obj = "_:anon"+anon_counter;						
						anons.put(id,obj);
					}
					
				} else obj = ns.getAbbreviation(object.getNameSpace()) + object.getLocalName();
			
			} else if(stmt.getObject() instanceof LiteralImpl){ // object is literal				
				
				LiteralImpl object = (LiteralImpl) stmt.getObject();
				obj = new String(object.getString());
			} else obj=stmt.getObject().toString(); // undefined object		
		
								
			// build prova fact with pattern and add translated statement to prova model
			String fact="";
			for (int i=0;i<pattern.size();i++) {
				String s;
				if (i==0) s=""; else s="\""; 
				if (pattern.get(i).equals("predicate")) fact=fact+s+pred+s;
				else if (pattern.get(i).equals("subject")) fact=fact+s+subj+s;
				else if (pattern.get(i).equals("object")) fact=fact+s+obj+s;
				else fact=fact+s+pattern.get(i)+s;
				if (i==0) fact=fact+"(";
				else if (i==(pattern.size()-1)) fact=fact+").\r\n";
				else fact=fact+",";
			}
			provaModel.write(fact); //add fact to prova model
				
		}		
		return provaModel;		
	}
	
	/**
	 * Update: Simply overwrite the prova model
	 * @return ProvaModel
	 */
	public ProvaModel update(Model model) {
		ProvaModel pmodel = new ProvaModel();
		pmodel.write(
				"update_OWLModel():-retractAll(rdf(S,P,O)."+"\r\n"+
				"solve(update_OWLModel())."+"\r\n");
		pmodel.write(translate(model).toString());
		return pmodel;
	}

}
