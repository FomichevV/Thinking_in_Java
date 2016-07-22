class Value{
	int i;
}

public class Equivalence{
	public static void main(String[] args){
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println("Сравниваются ссылки объектов");
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
		System.out.println("Сравниваются содержимое объектов");
		System.out.println(n1.equals(n2));
		System.out.println("Но если создать свой класс, то по умолчанию equals будет сравнивать ссылки");
		Value v1=new Value();
		Value v2=new Value();
		v1.i=v2.i=100;
		System.out.println(v1.equals(v2));
		System.out.println("Чтобы сравнивал значения, нужно переопределить метод, в нашем новом классе");
	}
}