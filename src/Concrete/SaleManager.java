package Concrete;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void getId(Sale sale) {
		System.out.println(sale.getGameName()+" oyununu"+sale.getId() +" id' ye sahip kisi aldi.");
		
	}

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + "adli oyun satildi.");
		// ek olarak gamer ile ilgili operasyon yapabiliriz.
	}

	@Override
	public void saleCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+"adli oyuncu"+game.getGameName()+"adli oyunu aldi."
				+ ""+"indirim orani: "+ game.getPrice()*campaign.getDiscountAmount()/100);
		
	}

	@Override
	public void update(Gamer gamer, Game game) {
		System.out.println("Satis guncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer, Game game) {
		System.out.println("Satis silindi.");
		
	}
	
	
}
