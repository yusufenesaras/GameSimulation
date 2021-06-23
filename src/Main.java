import java.rmi.RemoteException;
import Abstracts.GamerService;
import Adapters.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GamerManager;
import tr.gov.nvi.tckimlik.WS.*;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;
import Entities.Campaign;
public class Main {

	public static void main(String[] args) throws RemoteException{
		
		Campaign campaign1 = new Campaign(1,"Yeni kayýt indirimi",20);
		
		Gamer gamer1 = new Gamer(3, "Yusuf Enes", "Aras",2000,10000000000L); // Mernis doðrulandý.
		
		Game game1 = new Game(1, "NFS Underground",59,29,30);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
	}

}
