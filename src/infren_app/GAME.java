package infren_app;

public class GAME {

	public static void main(String[] args) {
		PlayerC player=new PlayerC("HJ",100,10);
		EnemyC enemy=new EnemyC("Orc",80,5);
		
		while(player.isLive()&&enemy.isLive()) {
			player.attack(enemy);
			if(!enemy.isLive())
				break;
			enemy.attack(player);
		}
		
		if(player.isLive()) {
			System.out.println("�÷��̾� �¸�");
		}
		else {
			System.out.println("���� �¸�");
		}

	}

}
