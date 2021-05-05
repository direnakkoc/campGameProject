package campGameProject;

import campGameProject.Business.Concrete.CampaignManager;
import campGameProject.Business.Concrete.GameManager;
import campGameProject.Business.Concrete.SaleManager;
import campGameProject.Business.Concrete.UserManager;
import campGameProject.Entity.Campaign;
import campGameProject.Entity.Game;
import campGameProject.Entity.User;
import campGameProject.Validation.MernisServiceValidator;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "12345678912", "Diren", "Akkoc", 1994);

		Game game = new Game(1, "Chess", 1200, 2200);
		Campaign campaign = new Campaign(1, "Covid-19 Campaign", 20);

		UserManager userManager = new UserManager(new MernisServiceValidator());

		userManager.add(user);
		System.out.println("**********************************");

		GameManager gameManager = new GameManager();
		gameManager.add(game);
		System.out.println("**********************************");

		SaleManager saleManager = new SaleManager(new CampaignManager());
		saleManager.AfterCampaign(game, campaign);
		System.out.println("**********************************");
		saleManager.Sale(game, user);
		System.out.println("**********************************");

	}

}
