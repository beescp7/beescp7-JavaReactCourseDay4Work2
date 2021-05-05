import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Adapters.MernisGamerAdapter;
import Concrete.GamerManagement;
import Concrete.ProductManagement;
import Concrete.SalesManagement;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;
import Interfaces.GamerServices;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	        Date tarih = df.parse("1997/10/15");
	        Gamer gamer=new Gamer(1,"BERKAN", "OLGUN", "31774911766", tarih);
	        Campaign campaign=new Campaign(1, "try", 20);
	        Product product=new Product(1, "name", 100);
      GamerManagement gamerManagement=new GamerManagement(new MernisGamerAdapter());
      gamerManagement.add(gamer);
      gamerManagement.delete(gamer);
        
    SalesManagement salesManagement=new SalesManagement();
    System.out.println(salesManagement.buy(gamer, product, campaign));
	}

}
