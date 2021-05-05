package Concrete;

import Entities.Gamer;
import Interfaces.GamerCheckService;
import Interfaces.GamerServices;

public class GamerManagement implements GamerServices {
   GamerCheckService gameCheckService;
   
	public GamerManagement(GamerCheckService gameCheckService) {
	super();
	this.gameCheckService = gameCheckService;
}

	@Override
	public void add(Gamer gamer) {
	   if(gameCheckService.checkIfRealGamer(gamer))
	   {
		   System.out.println("add to db  :"+gamer.getFirstName()+"\t"+gamer.getLastName());
	   }
	   else
	   {
		   System.out.println("gamer is not valid");
	   }
		
	}

	@Override
	public void delete(Gamer gamer) {
		 if(gameCheckService.checkIfRealGamer(gamer))
		   {
			   System.out.println("delete to db  :"+gamer.getFirstName()+"\t"+gamer.getLastName());
		   }
		   else
		   {
			   System.out.println("gamer is not valid");
		   }
		
	}

	@Override
	public void update(Gamer gamer) {
		 if(gameCheckService.checkIfRealGamer(gamer))
		   {
			   System.out.println("update to db  :"+gamer.getFirstName()+"\t"+gamer.getLastName());
		   }
		   else
		   {
			   System.out.println("gamer is not valid");
		   }
		
	}

}
