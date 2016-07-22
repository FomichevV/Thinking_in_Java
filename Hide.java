//Перегрузка имени метода из базового класса
// в производном классе не скроет базовую версию метода
import static net.slav.util.Print.*;

class Homer{
	char doh(char c){
		print("doh(char)");
		return 'd';
	}
	float doh(float f){
		print("doh(float)");
		return 1.0f;
	}
}
class Milhouse{}
class Bart extends Homer {
	void doh(Milhouse m){
		print("doh(Milhouse)");
	}
}
class Lisa extends Homer {
	@Override float doh(float f){
		print("doh(Milhouse)");
		return f;
	}
}
public class Hide{
	public static void main(String[] args){
		Lisa b = new Lisa();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(11);
	}
}