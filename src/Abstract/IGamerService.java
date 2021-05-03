package Abstract;
import Entities.Gamer;

public interface IGamerService {
	
	void add(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);
}
