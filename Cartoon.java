import static net.slav.util.Print.*;

class Art{
	Art(){ print("Конструктор Art");}
}
class Drawing extends Art{
	Drawing(){print("Конструктор Drawing");}
}
public class Cartoon extends Drawing{
	public Cartoon(){print("Конструктор Cartoon");}
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}