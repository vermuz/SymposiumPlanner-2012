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

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Prova model.
 * 
 * @author <A HREF="mailto:paschke@in.tum.de">Adrian Paschke</A>
 * @version 0.1 <1 Feb 2005>
 * @since 0.1
 */
 
public class ProvaModel extends StringWriter {
	


	/**
	 * Constructor
	 *
	 */
	public ProvaModel() {
		super();
	}
	
	/**
	 * Print prova model to system out
	 */
	public void printModel(){
		System.out.println(this.toString());
	}

//	Object append( Object o ) {
//        getBuffer().append(o);
//        return this;
//    }

    /**
	 * Writes the modle to a file (prova script).
	 * @param _outputFile the output file
	 * @throws Exception input/output
	 */
	public void writeModel(String _outputFile) throws Exception{
		PrintWriter _printWriter = new PrintWriter(new FileWriter(_outputFile));
		_printWriter.print(this.toString());
		_printWriter.close();
	}


}
