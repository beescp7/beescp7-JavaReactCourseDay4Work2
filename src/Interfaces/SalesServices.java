package Interfaces;

import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;

public interface SalesServices {
 double buy(Gamer gamer,Product product,Campaign campaign);
}
