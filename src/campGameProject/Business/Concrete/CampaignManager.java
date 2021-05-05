package campGameProject.Business.Concrete;

import java.util.List;

import campGameProject.Business.Abstract.CampaignService;
import campGameProject.Entity.Campaign;
import campGameProject.Entity.User;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign was added : " + campaign.getCampaignName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign was deleted : " + campaign.getCampaignName());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign was updated : " + campaign.getCampaignName());

	}

	@Override
	public boolean IsThereCamgaign() {

		return true;
	}

}
