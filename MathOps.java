import java.util.*;

public class MathOps{
	public static void main(String[] args){
		int i, j, k;
		//Создание генератора
		System.out.println("Тесты для натуральных чисел:");
		Random rand = new Random(47);
		j=rand.nextInt(100)+1;
		System.out.println("j : "+j);
		k=rand.nextInt(100)+1;
		System.out.println("k : "+k);
		i=j+k;
		System.out.println("j + k : "+i);
		i=j-k;
		System.out.println("j - k : "+i);
		i=j/k;
		System.out.println("j / k : "+i);
		i=j*k;
		System.out.println("j * k : "+i);
		i=j%k;
		System.out.println("j % k : "+i);
		j%=k;
		System.out.println("j %/ k : "+j);
		System.out.println("Тесты для вещественных чисел:");
		float u,v,w;
		v=rand.nextFloat();
		System.out.println("v : "+v);
		w=rand.nextFloat();
		System.out.println("w : "+w);
		u=v+w;
		System.out.println("v + w : "+u);
		u=v-w;
		System.out.println("v - w : "+u);
		u=v/w;
		System.out.println("v / w : "+u);
		u=v*w;
		System.out.println("v * w : "+u);
		System.out.println("Следубщее относится также к сhar, byte, short, long, int, double:");
		u+=v;
		System.out.println("u += v : "+u);
		u-=v;
		System.out.println("u -= v : "+u);
		u/=v;
		System.out.println("u /= v; : "+u);
		u*=v;
		System.out.println("u *= v : "+u);
	}
}