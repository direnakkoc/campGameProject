package campGameProject.Business.Abstract;

import campGameProject.Entity.Campaign;
import campGameProject.Entity.Game;
import campGameProject.Entity.User;

public interface SaleService {
	void Sale(Game game, User user);
	void AfterCampaign(Game game, Campaign campaign);
	

}
