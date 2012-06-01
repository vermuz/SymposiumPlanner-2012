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

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import com.hp.hpl.jena.rdf.model.Model;


/**
 * Mapping of the namespaces to the PROVA used short cuts.
 * 
 * @author <A HREF="mailto:paschke@in.tum.de">Adrian Paschke</A>
 * @version 0.1 <1 Feb 2005>
 * @since 0.1
 */
public class NameSpaceList {
	
	
	private Map nameSpaces; // [prefix -> namespace URI] map
	private Map inverseNameSpaces; // [namespace URI -> prefix] map
	
	/**
	 * Constructor
	 * Creates a namespace list with standard namespaces (rdf,rdfs,owl,xmlns)
	 */
	public NameSpaceList() {
		this.defaultDeclarations();
	}
	
	/**
	 * Constructor
	 * Creates a namespace list from a model
	 * @param model Model
	 */
	public NameSpaceList(Model model) {

		Model jenaModel = model;
		
		this.nameSpaces=jenaModel.Standard.getNsPrefixMap();
		this.nameSpaces.put("xmlns","http://www.w3.org/2001/XMLSchema#");		
		this.nameSpaces.putAll(jenaModel.getNsPrefixMap()); // map [prefix->URI]
		
		inverseNameSpaces = new HashMap(); // map URI->prefix		
		Set ns_set = nameSpaces.entrySet();
		for (Iterator it=ns_set.iterator();it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();			
			inverseNameSpaces.put(entry.getValue(),entry.getKey());
		}
		
	}
	
	/**
	 * Constructor
	 * Creates a namespace list with the input namespace map of the form [prefix-->namespace]
	 * @param ns Map [prefix-->namespace] map
	 */
	public NameSpaceList(Map ns){
		this.nameSpaces=ns;
		inverseNameSpaces = new HashMap(); // map URI->prefix
		Set ns_set = nameSpaces.entrySet();
		for (Iterator it=ns_set.iterator();it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			inverseNameSpaces.put(entry.getValue(),entry.getKey());
		}
	}
	
	private void defaultDeclarations(){
		
		nameSpaces = new HashMap();
		inverseNameSpaces = new HashMap();
		
		
		nameSpaces.put("rdf","http://www.w3.org/1999/02/22-rdf-syntax-ns#");
		nameSpaces.put("rdfs","http://www.w3.org/2000/01/rdf-schema#");
		nameSpaces.put("owl","http://www.w3.org/2002/07/owl#");
		nameSpaces.put("xmlns","http://www.w3.org/2001/XMLSchema#");
		nameSpaces.put("vcard","http://www.w3.org/2001/vcard-rdf/3.0#");
		nameSpaces.put("dc","http://purl.org/dc/elements/1.1/");
		nameSpaces.put("rss","http://purl.org/rss/1.0/");
		nameSpaces.put("daml","http://www.daml.org/2001/03/daml+oil#");
		nameSpaces.put("jms","http://jena.hpl.hp.com/2003/08/jms#");
		
		inverseNameSpaces.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#","rdf");
		inverseNameSpaces.put("http://www.w3.org/2000/01/rdf-schema#","rdfs");
		inverseNameSpaces.put("http://www.w3.org/2002/07/owl#","owl");
		inverseNameSpaces.put("http://www.w3.org/2001/XMLSchema#","xmlns");
		inverseNameSpaces.put("http://www.w3.org/2001/vcard-rdf/3.0#","vcard");
		inverseNameSpaces.put("http://purl.org/dc/elements/1.1/","dc");
		inverseNameSpaces.put("http://purl.org/rss/1.0/","rss");
		inverseNameSpaces.put("http://www.daml.org/2001/03/daml+oil#","daml");
		inverseNameSpaces.put("http://jena.hpl.hp.com/2003/08/jms#","jms");
	}
	
	/**
	 * Add a namespace declaraction to the namespace list
	 * @param nameSpace namespace URI
	 * @param abbreviation prefix, e.g. rdfs_,owl_,<user-defined>_
	 */
	public void addDeclaration(String nameSpace, String abbreviation){
		inverseNameSpaces.put(nameSpace,abbreviation);
		nameSpaces.put(abbreviation,nameSpace);
	}
	
	/**
	 * Return the namespace prefix, i.e. the abbreviation for a namespace URI
	 * e.g., rdf_ or rdfs_
	 * @param nameSpace URI
	 * @return namespace prefix (abbreviation)
	 */
	public String getAbbreviation(String nameSpace){		
		String ns=nameSpace;
		if (inverseNameSpaces.containsKey(nameSpace)) {
			ns = (String) inverseNameSpaces.get(nameSpace)+"_";
			if (ns.equals("_")) ns="default_";
		}
		return ns;
	}
	
	/**
	 * Return the namespace URI
	 * @param abbreviation prefix, e.g. rdf_
	 * @return namespace namespace URI
	 */
	public String getNameSpace(String abbreviation){
		if (abbreviation.equals("default")) abbreviation="";
		if (nameSpaces.containsKey(abbreviation)) return (String) nameSpaces.get(abbreviation);
		else return ""; // return empty URI		
	}
	
	/**
	 * Get namespaces
	 * @return Map namespaces
	 */
	public Map getNameSpaces() {
		return nameSpaces;
	}
	
	/**
	 * Set namespaces
	 * @param ns
	 */
	public void setNameSpaces(Map ns) {		
			this.nameSpaces=ns;
			inverseNameSpaces = new HashMap(); // map URI->prefix
			Set ns_set = nameSpaces.entrySet();
			for (Iterator it=ns_set.iterator();it.hasNext();) {
				Map.Entry entry = (Map.Entry) it.next();
				inverseNameSpaces.put(entry.getValue(),entry.getKey());
			}		
	}
}
