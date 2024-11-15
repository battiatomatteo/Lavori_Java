/**
 * 
 */
//package pair;
/**
 * 
 */
public class MainInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//costruttore : deprecato
		Integer i1 = new Integer(42);
		Integer i2 = new Integer(42);
		System.out.println("i1 == i2"+ (i1 == i2));
		
		//boxing
		Integer i3 =  Integer.valueOf(42);   //usa la cache 
		
		// auto-boxing  (compatta)
		Integer i5 = 42; // abbreviazione per Integer.valueOf(42);
		Integer i6 = 42;
		System.out.println("i5 == i6"+ (i5 == i6));
		
		
		//unboxing
		int ii1 = i5.intValue();
		System.out.println("ii1 = " + ii1);
		
		int ii2 = i5 ;
		System.out.println("ii2 = " + ii2);
		
	}

}
