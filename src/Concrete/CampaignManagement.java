package Concrete;

import Entities.Campaign;
import Interfaces.CampaignServices;

public class CampaignManagement implements CampaignServices {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(" add campaign"+campaign.getName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println(" delete campaign"+campaign.getName());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(" update campaign"+campaign.getName());
		
	}

}
