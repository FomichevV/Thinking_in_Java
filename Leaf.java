public class Leaf{
	int i =0;
	Leaf increment(){
		i++;
		return this;//Возвращает ссылку на оббъект для которого применялся этот метод
	}
	void  print(){
		System.out.println("i = "+i);
	}
	public static void main(String[] args){
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}