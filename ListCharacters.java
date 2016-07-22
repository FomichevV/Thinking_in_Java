//программ выводит все строчные быквы
public class ListCharacters{
	public static void main(String[] args){
		for(char c = 0; c<128; c++)
			//isLoweCase метод проверяющий является ли буква строчной или нет
			if(Character.isLowerCase(c))
				System.out.println("значение "+(int)c+" символ "+c);
	}
}