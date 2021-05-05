import Abstract.BaseGamersManager;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.GamersManager;
import Entities.Campaing;
import Entities.Gamers;
import Entities.Games;
import Utils.LogManager;
import Utils.MernisLog;




public class Main {

	public static void main(String[] args) {
		
		BaseGamersManager baseGamersManager = new GamersManager();
		
		
		
		BaseGamersManager baseGamersManager1 = new GamersManager();
		
		
		
		

		Gamers gamer1 = new Gamers();
		gamer1.setFirstName("Rahmi");
		gamer1.setLastName("Köse");
		gamer1.setId(1);
		gamer1.setDateOfBirth("1999");
		gamer1.setNationalId("1111111");
		
		Gamers gamer2 = new Gamers();
		gamer2.setFirstName("Serhat");
		gamer2.setLastName("Köse");
		gamer2.setId(2);
		gamer2.setDateOfBirth("1994");
		gamer2.setNationalId("2222222");
		
		
		LogManager logManager = new LogManager("Rahmi", "Köse", "2222222", "29.10.1999");
		logManager.log(gamer1);
		logManager.log(gamer2);

		baseGamersManager.Save(gamer1);
		baseGamersManager.Save(gamer2);
		
		
		

		BaseGamersManager baseGamersManager3 = new GameManager();

		BaseGamersManager baseGamersManager2 = new CampaingManager();
		Campaing campaing = new Campaing();
		Games games = new Games(1, "Call of Duty: Black Ops Cold War", 400);
		baseGamersManager3.add(games);
		campaing.setDiscount("%30");
		baseGamersManager2.addCampaing(campaing, games,gamer1);
		baseGamersManager2.deleteCampaing(campaing, games,gamer1);
		baseGamersManager2.updateCampaing(campaing, games,gamer1);
		
		

	}

}
