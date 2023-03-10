
public class SignOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;									//11;
		++x;									//12;
		System.out.println("x = " + x);			//x = 12;
		
		System.out.println("----------------");
		y--;									//9;
		--y;									//8;
		System.out.println("y = " + y);			//y = 8;
		
		System.out.println("----------------");
		z = x++;								//z = 12, x = 13;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("----------------");
		z = ++x;								//z = 14, x = 14;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("----------------");
		z = ++x + y++;							//x = 15, z = 15 + 8 = 23, y = 9;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
