import static net.slav.util.Print.*;

class Game{
	Game(int i){
		print("Конструктор Game");
	}
}
class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		print("Конструктор BoardGame");
	}
}
public class Chess extends BoardGame{
	Chess(){
		super(11);
		print("Конструктор Chess");
	}
	public static void main(String[] args){
		Chess x = new Chess();
	}
}