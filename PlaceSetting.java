//Совмещение композиции и наследованния
import static net.slav.util.Print.*;
class Plate{
	Plate(int i){
		print("Конструктор Plate");
	}
}
class DinnerPlate extends Plate{
	DinnerPlate(int i){
		super(i);
		print("Конструктор DinnerPlate");
	}
}
class Utensil{
	Utensil(int i){
		print("Конструктор Utensil");
	}
}
class Spoon extends Utensil{
	Spoon(int i){
		super(i);
		print("Конструктор Spoon");
	}
}
class Fork extends Utensil{
	Fork(int i){
		super(i);
		print("Конструктор Fork");
	}
}
class Knife extends Utensil{
	Knife(int i){
		super(i);
		print("Конструктор Knife");
	}
}
class Custom{
	Custom(int i){
		print("Конструктор Custom");
	}
}
public class PlaceSetting extends Custom{
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	public PlaceSetting(int i){
		super(i);
		sp = new Spoon(i);
		frk = new Fork(i);
		kn = new Knife(i);
		pl =new DinnerPlate(i);
		print("Конструктор PlaceSetting");
	}
	public static void main(String[] args){
		PlaceSetting x = new PlaceSetting(9);
	}
}
