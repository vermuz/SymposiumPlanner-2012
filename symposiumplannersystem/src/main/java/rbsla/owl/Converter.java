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

/**
 * Interface defining a converters.
 * @author <A HREF="mailto:paschke@in.tum.de">Adrian Paschke</A>
 * @version 0.1 <1 Feb 2005>
 * @since 0.1
 */
public interface Converter {
	
	/**
	 * Translates. 
	 * @param model
	 * @return ProvaModel
	 */
	public ProvaModel translate(Model model);
	
	/**
	 * Updates.
	 * @param model
	 * @return ProvaModel
	 */
	public ProvaModel update(Model model);
	
}
