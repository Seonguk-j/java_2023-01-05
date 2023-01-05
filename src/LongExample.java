
public class LongExample {

	public static void main(String[] args) {
		//int : 4byte : -21억 ~ +21억
		long var1 = 10;				//int 10 <- 작은곳에서 큰곳으로 넣는거 가능
		long var2 = 20L;			//L : long 타입 입력
//		long var3 = 100000000000;	//int 1000억 -> 범위 초과 에러
		long var4 = 100000000000L;	//long 1000억 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
