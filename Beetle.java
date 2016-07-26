//Полный процесс иинициализации
import static net.slav.util.Print.*;

class Insect{
	private int i=9;
	protected int j;
	Insect(){
		print("i = "+ i+", j = "+j);
		j=39;
	}
	private static int x1 = printInit("Поле static Insect x1 инициализированно");
	static int printInit(String s){
		print(s);
		return 47;
	}
}

public class Beetle extends Insect{
	private int k = printInit("Поле Beetle k инициализированно");
	public Beetle(){
		print("k = " + k);
		print("j = " + j);
	}
	private static int x2 = printInit("Поле static Beetle x2 инициализированно");
	public static void main(String[] args){
		print("Конструктор Beetle");
		Beetle b = new Beetle();
	}
}
/*
1. Запуск класса Beetle начинается с выполнения метода Beetle.main()
поэтому загрузчик пытается найти скомпилированный код Beetle.class
2. Загрузчик видит что имеется базовый клас Insect, который затем загружается.
3. Затем проводится static-инициализация корневого базового класса, затем
следующего за ним производного
4. Все классы загружены и можно переходить к созданию объекта класса
5. Сначала всем примитивам данного объекта присваиваются значения
по умлчанию, а ссылкам null.
6. Затем вызывается конструктор базового класса. В этой программе автоматически, 
но можно вызвать и явно записав в первой стороке описания конструктора Beetle()
с помощью слова super
7. После завершения работы конструктора базового класса инициализируются
переменные, в порядке их определения.
8. Выполняется оставшееся тело конструктора.
*/