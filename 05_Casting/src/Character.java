
public class Character {

	public static void main(String[] args) {
		
		double d1 = 10;
		byte b1 = (byte)(short)(int)(long)(float)(double)d1;
		System.out.println(d1);
		
		
		short s1 = (short)(int)(long)(float)(double)d1;
		System.out.println(d1);
		
		int i1 = (int)(long)(float)(double)d1;
		System.out.println(d1);
		
		long l1 = (long)(float)(double)d1;
		System.out.println(d1);
		
		float f1 = (float)(double)d1;
		System.out.println(d1);

	}

}
