package campGameProject.Business.Concrete;

import campGameProject.Business.Abstract.CampaignService;
import campGameProject.Business.Abstract.SaleService;
import campGameProject.Entity.Campaign;
import campGameProject.Entity.Game;
import campGameProject.Entity.User;

public class SaleManager implements SaleService {
	private CampaignService campaignService;

	public SaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void Sale(Game game, User user) {
		System.out.println(game.getName() + " was purchased by " + user.getName() + ".");

	}

	@Override
	public void AfterCampaign(Game game, Campaign campaign) {
		if (this.campaignService.IsThereCamgaign()) {
			System.out.println("For " + game.getName() + " there is a discount which is called " + campaign.getCampaignName()+".");
		} else {
			System.out.println(game.getName() + " was sold.");
		}

	}

}
