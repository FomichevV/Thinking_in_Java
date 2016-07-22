public class WhileTest{
	static boolean condition(){
		double f=Math.random();
		boolean  result = f<0.99;
		System.out.print(f+ " < 0.99, "+result + ", ");
		return result;
	}
	public static void main(String[] args){
		while(condition()){
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
	}
}