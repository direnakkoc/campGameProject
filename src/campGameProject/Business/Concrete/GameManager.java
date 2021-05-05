package campGameProject.Business.Concrete;

import campGameProject.Business.Abstract.GameService;
import campGameProject.Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game was added : " + game.getName());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Game was deleted : " + game.getName());

	}

	@Override
	public void update(Game game) {
		System.out.println("Game was updated : " + game.getName());

	}

}
