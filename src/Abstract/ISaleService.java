package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public interface ISaleService {
	
	void getId(Sale sale);
	void sale(Gamer gamer,Game game);
	void saleCampaign(Gamer gamer,Game game,Campaign campaign);
	void update(Gamer gamer, Game game);
	void delete(Gamer gamer, Game game);
}
