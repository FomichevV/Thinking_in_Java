//Передача текущего объекта другому методу через this
class Person{
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();//peeled - очищенные
		System.out.println("Yummy");
	}
}

class Peeler{//Peeler машина длячистки кожуры
	static Apple peel(Apple apple){
		//Снимает кожуру
		return apple;//Возвращает типа Очищенное яблоко
	}
}

class Apple{
	Apple getPeeled(){ //получить очищенное
		return Peeler.peel(this); //Класс Apple вызывает Peeler.peel(),
	}//который по какой-то причине оформлен как внешний по отношению к Apple
	//( например чтобы не дублировать код и обслуживать несколько методов)
	//Для передочи текущего объекта внешнему методу используется слово this
}

public class PassingThis{
	public static void main(String[] args){
		new Person().eat(new Apple());
	}
}