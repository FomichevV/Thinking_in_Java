public class Precedence{
	public static void main(String[] args){
		int x=1, y=2, z=3;
		int b=x+(y-2)/(z+2);
		int a=x+y-2/z+2;
		System.out.println("b = " + b);
		System.out.println("a = " + a);
	}
}