package ch7_2;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if ( f instanceof Unit) {
			System.out.println(" f in Unit");
		}
		if ( f instanceof Fightable) {
			System.out.println(" f in Fightable");
		}
		if ( f instanceof Movable) {
			System.out.println(" f in Movable");
		}
		if ( f instanceof Attackable) {
			System.out.println(" f in Attackable");
		}
		if ( f instanceof Object) {
			System.out.println(" f in Object");
		}
		
		

	}

}


class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {
	
}

interface Movable {
	void move (int x, int y);
}

interface Attackable {
	void attack(Unit u);
}
