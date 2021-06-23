package Concrete;

import Abstracts.GamerService;
import Adapters.GamerValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	private GamerValidationService gamerValidationService;
	
	
	public GamerManager(GamerValidationService gamerValidationService) {
		this.gamerValidationService = gamerValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(gamerValidationService.validateCheck(gamer)) {
			System.out.println("Mernis dogrulandi kayit basarili." + gamer.getFirstName() + " " + gamer.getLastName());
		}else {
			System.out.println("Mernis onaylanmadi kayit basarisiz.");
		}
			
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " "+ gamer.getLastName() + " oyuncu guncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " "+ gamer.getLastName() + " oyuncu silindi.");
		
	}

	

}
