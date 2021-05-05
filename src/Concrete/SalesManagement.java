package Concrete;

import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Interfaces.SalesServices;

public class SalesManagement implements SalesServices {

	@Override
	public double buy(Gamer gamer, Product product, Campaign campaign) {
		double price=0;
		price=product.getPrice()-campaign.getDiscount();
		return price;
	
	}

}
