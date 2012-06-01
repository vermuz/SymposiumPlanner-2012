/*
 * Copyright (C) 1999-2006 <a href="mailto:paschke@in.tum.de">Adrian Paschke</a>
 * 
 * The Utils Library is part of the Rule Based Service Level Agreement (RBSLA)
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
package rbsla.utils;

import java.util.Date;
import java.util.Calendar;



/**
 * Used inside the logical predicates to do basic math operations.
 */
public class Math {

    /**
	 * Cast object to double. Do upcast, if necessary.
	 * 
	 * @param o
	 * @return
	 */
	private static double castDouble(Object o) {
		if (o == null)
			throw new NullPointerException("");

		if (o instanceof Float)
			return ((Float) o).doubleValue();
		else if (o instanceof Double)
			return ((Double) o).doubleValue();
		else if (o instanceof Integer)
			return ((Integer) o).doubleValue();
		else if (o instanceof Long)
			return ((Long) o).doubleValue();
		else if (o instanceof Byte)
			return ((Byte) o).doubleValue();
		else
			throw new NullPointerException("");
	}

	/**
	 * Cast object to long. Do upcast, if necessary.
	 * 
	 * @param o
	 * @return
	 */
	private static long castLong(Object o) {
		if (o == null)
			throw new NullPointerException("");

		if (o instanceof Integer)
			return ((Integer) o).longValue();
		else if (o instanceof Long)
			return ((Long) o).longValue();
		else if (o instanceof Byte)
			return ((Byte) o).longValue();
		else
			throw new NullPointerException("");
	}
	
	private static int castInt(Object o)
	{
		if (o == null)
			throw new NullPointerException("");
		
		if (o instanceof Integer)
			return ((Integer)o).intValue();
		else
			throw new NullPointerException("");
			
	}

	private static int checkInt(Object o) 
	{
		if (o instanceof Integer)
			return 1;
		else if(o instanceof Long || o instanceof Byte)
			return 2;
		else
			return 4;
	}

	private static int checkInt(Object o1, Object o2) 
	{
		int ctr = checkInt(o1) + checkInt(o2);
		if (ctr == 2) //2 integers, we continue with integers
			return 1; 
		else if (ctr==3 || ctr==4) // at least one long/byte, but for sure no double, calculation works with long
			return 2;
		else 
			return 3; //at least one double/float, calculation works with double
	}

	static private int ADD = 0, SUB = 1, MULT = 2, DIV = 3, MOD = 4,
			DIVNATURAL = 5, EQU = 6, LESS = 7, LESSEQU = 8;
	

	/**
	 * Do math operation and get result back
	 * CAUTION: problems if an addition, multiplication,... of two integers becomes a long
	 * 
	 * @param operation
	 * @param o1
	 * @param o2
	 * @return
	 */
	private static Object r(int operation, Object o1, Object o2) {
		int isInt = checkInt(o1, o2);
		Object o = null;
		if (operation == ADD) 
		{
			if (isInt==1)
				o = o(castInt(o1) + castInt(o2));
			else if (isInt==2)
				o = o(castLong(o1) + castLong(o2));
			else
				o = o(castDouble(o1) + castDouble(o2));
		} 
		else if (operation == SUB) 
		{
			if (isInt==1)
				o = o(castInt(o1) - castInt(o2));	
			else if (isInt==2)
				o = o(castLong(o1) - castLong(o2));
			else
				o = o(castDouble(o1) - castDouble(o2));
		} 
		else if (operation == MULT) 
		{
			if (isInt==1)
				o = o(castInt(o1) * castInt(o2));	
			else if (isInt==2)
				o = o(castLong(o1) * castLong(o2));
			else
				o = o(castDouble(o1) * castDouble(o2));
		} 
		else if (operation == DIV) 
		{
			o = o(castDouble(o1) / castDouble(o2));
		} 
		else if (operation == DIVNATURAL) 
		{
			if (isInt==1)
				o = o(castInt(o1) / castInt(o2));	
			else if (isInt==2)
				o = o(castLong(o1) / castLong(o2));
			else
				throw new NullPointerException("");
		} 
		else if (operation == MOD) 
		{
			if (isInt==1)
				o = o(castInt(o1) % castInt(o2));	
			else if (isInt==2)
				o = o(castLong(o1) % castLong(o2));
			else
				throw new NullPointerException("");
		} 
		else if (operation == EQU) 
		{
			if (o1 instanceof String && o2 instanceof String)
				return o(o1.equals(o2));
			else {
				if (isInt <= 2)
					o = o(castLong(o1) == castLong(o2));
				else
					o = o(castDouble(o1) == castDouble(o2));
			}
		} 
		else if (operation == LESS) 
		{
			if (isInt <= 2)
				o = o(castLong(o1) < castLong(o2));
			else
				o = o(castDouble(o1) < castDouble(o2));
		} 
		else if (operation == LESSEQU) 
		{
			if (isInt <= 2)
				o = o(castLong(o1) <= castLong(o2));
			else
				o = o(castDouble(o1) <= castDouble(o2));
		}

		if (o instanceof Long || o instanceof Double || o instanceof Boolean) {
			if (o instanceof Double && ((Double) o).doubleValue() == Double.NaN) {
				o = new Double(0.0);
			}
		}
		
		return o;
	}

	private static Object r(long l) {
		return new Long(l);
	}

	private static Object r(double l) {
		return new Double(l);
	}

	private static Object o(int i)
	{
		return new Integer(i);
	}
	
	private static Object o(long l) {
		return new Long(l);
	}

	private static Object o(double d) {
		return new Double(d);
	}

	private static Object o(Object o) {
		return o;
	}

	private static Object o(boolean o) {
		return new Boolean(o);
	}

	// binary
	public static Object binary(int op, Object a, Object b) {
		return r(op, a, b);
	}

	//public static Object binary(int op, long a, int b) { return binary(op,
	// o(a), o(b)); }
	//public static Object binary(int op, int a, long b) { return binary(op,
	// o(a), o(b)); }
	public static Object binary(int op, long a, long b) {
		return binary(op, o(a), o(b));
	}

	//public static Object binary(int op, int a, int b) { return binary(op,
	// o(a), o(b)); }
	//public static Object binary(int op, float a, float b) { return binary(op,
	// o(a), o(b)); }
	public static Object binary(int op, double a, double b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryll(int op, long a, long b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryll(int op, Object a, Object b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryil(int op, int a, long b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryil(int op, Object a, Object b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryli(int op, Object a, Object b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryli(int op, long a, long b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryli(int op, long a, int b) {
		return binary(op, o(a), o(b));
	}

	public static Object binaryli(int op, int a, int b) {
		return binary(op, o(a), o(b));
	}

	// add
	public static Object add(Object a, Object b) {
		return r(ADD, a, b);
	}

	//	public static Object add(long a, long b) { return add(o(a), o(b)); }
	//public static Object add(long a, int b) { return add(o(a), o(b)); }
	//	public static Object add(int a, long b) { return add(o(a), o(b)); }
	//	public static Object add(double a, double b) { return add(o(a), o(b)); }

	// sub
	public static Object sub(Object a, Object b) {
		return r(SUB, a, b);
	}

	//	public static Object sub(long a, long b) { return sub(o(a), o(b)); }
	//	public static Object sub(long a, int b) { return sub(o(a), o(b)); }
	//	public static Object sub(int a, long b) { return sub(o(a), o(b)); }
	//	public static Object sub(double a, double b) { return sub(o(a), o(b)); }

	// mult
	public static Object mult(Object a, Object b) {
		return r(MULT, a, b);
	}

	//	public static Object mult(long a, long b) { return mult(o(a), o(b)); }
	//	public static Object mult(int a, long b) { return mult(o(a), o(b)); }
	//	public static Object mult(long a, int b) { return mult(o(a), o(b)); }
	//	public static Object mult(double a, double b) { return mult(o(a), o(b));
	// }

	// div
	public static Object div(Object a, Object b) {
		return r(DIV, a, b);
	}

	//	public static Object div(long a, long b) { return div(o(a), o(b)); }
	//	public static Object div(long a, int b) { return div(o(a), o(b)); }
	//	public static Object div(int a, long b) { return div(o(a), o(b)); }
	//	public static Object div(double a, double b) { return div(o(a), o(b)); }

	// divnatural
	public static Object divnatural(Object a, Object b) {
		return r(DIVNATURAL, a, b);
	}

	//	public static Object divnatural(long a, long b) { return divnatural(o(a),
	// o(b)); }
	//	public static Object divnatural(int a, long b) { return divnatural(o(a),
	// o(b)); }
	//	public static Object divnatural(long a, int b) { return divnatural(o(a),
	// o(b)); }
	//	public static Object divnatural(float a, float b) { return
	// divnatural(o(a), o(b)); }
	//	public static Object divnatural(double a, double b) { return
	// divnatural(o(a), o(b)); }

	// mod
	public static Object mod(Object a, Object b) {
		return r(MOD, a, b);
	}

	//	public static Object mod(long a, long b) { return mod(o(a), o(b)); }
	//	public static Object mod(int a, long b) { return mod(o(a), o(b)); }
	//	public static Object mod(long a, int b) { return mod(o(a), o(b)); }
	//	public static Object mod(double a, double b) { return mod(o(a), o(b)); }

	// abs
	public static long abs(Object a) {
		return java.lang.Math.abs(castLong(a));
	}

	public static long abs(long a) {
		return abs(o(a));
	}

	// equ
	public static Object equ(Object a, Object b) {
		return r(EQU, a, b);
	}

	//	public static Object equ(long a, long b) { return equ(o(a), o(b)); }
	//	public static Object equ(int a, long b) { return equ(o(a), o(b)); }
	//	public static Object equ(long a, int b) { return equ(o(a), o(b)); }
	//	public static Object equ(double a, double b) { return equ(o(a), o(b)); }
	//	public static Object equ(String a, String b) { return equ(o(a), o(b)); }

	// less
	public static Object less(Object a, Object b) {
		return r(LESS, a, b);
	}

	//	public static Object less(long a, long b) { return less(o(a), o(b)); }
	//	public static Object less(int a, long b) { return less(o(a), o(b)); }
	//	public static Object less(long a, int b) { return less(o(a), o(b)); }
	//	public static Object less(double a, double b) { return less(o(a), o(b));
	// }

	// lessequ
	public static Object lessequ(Object a, Object b) {
		return r(LESSEQU, a, b);
	}

	//	public static Object lessequ(long a, long b) { return lessequ(o(a),
	// o(b)); }
	//	public static Object lessequ(int a, long b) { return lessequ(o(a), o(b));
	// }
	//	public static Object lessequ(long a, int b) { return lessequ(o(a), o(b));
	// }
	//	public static Object lessequ(double a, double b) { return lessequ(o(a),
	// o(b)); }

	public Object castToLong(Object a) {
		return o(castLong(a));
	}

	public Object castToLong(long a) {
		return o(castToLong(a));
	}

	public static Date createDate(long a) {
		
		return createCalendar(a).getTime();
	}
	
	public static Calendar createCalendar(long a) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(a);
		return c;
	}

	public static void println(Object o) {
		System.out.println("   >" + o.toString());
	}
}