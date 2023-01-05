
public class FloatDoubleExample {

	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789f;	//숫자뒤 f : float형
		Double var2 = 0.1234567890123456789;	//double
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;	//e6 : 10^6
		float var4 = 3e6f;	//e6 : 10^6
		double var5 = 2e-3;	//e-3 : 10^(-3)
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}

}
