import java.util.*;
//Синтаксис forearch
public class ForEarchFloat{
	public static void main(String[]args){
		Random rand = new Random(47);
		float f[] = new float[10];
		for(int i =0; i<10; i++)
			f[i]=rand.nextFloat();
		//Далее for выводит все элементы массива автоматически переберая по всем элементам
		for(float x : f)
			System.out.println(x);
	}
}