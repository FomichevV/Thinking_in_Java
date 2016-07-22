class Book{
	boolean checkedOut=false;
	Book(boolean checkOut){
		checkedOut=checkOut;
	}
	void checkIn(){
		if(checkedOut)
			System.out.println("Ошибка: checkedOut");
		//Обычно это делается так
		//Super.finalize()//Вызов версии базового класса
	}
}
public class TerminationCondition{
	public static void main(String[] args){
		Book novel = new Book(true);
		//Правильная очистка
		novel.checkIn();
		//Теряем ссылку, забыли про очистку
		new Book(true);
		//Принудительная сборка мусора и финализация
		System.gc();
	}
}