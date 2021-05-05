package campGameProject.Business.Abstract;

import campGameProject.Entity.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	boolean IsThereCamgaign();

}
