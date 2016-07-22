class SpaceShipControls{
	void up(int velocity){}
	void down(int velocity){}
	void left(int velocity){}
	void right(int velocity){}
	void forward(int velocity){System.out.println("OK");}
	void back(int velocity){}
	void turboBoost(){}
}

public class SpaceShipDelegation{
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name){
		this.name=name;
	}
	//Делегированные методы
	public void back(int velocity){
		controls.back(velocity);
	}
	public void down(int velocity){
		controls.down(velocity);
	}
	public void forward(int veloсity){
		controls.forward(veloсity);
	}
	public void left(int veloсity){
		controls.left(veloсity);
	}
	public void right(int veloсity){
		controls.right(veloсity);
	}
	public void turboBoost(){
		controls.turboBoost();
	}
	public void up(int veloсity){
		controls.up(veloсity);
	}
	public static void main(String[] args){
		SpaceShipDelegation protector=new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}
}