package Abstract;
import Entities.Campaing;
import Entities.Games;


import Entities.Gamers;



public abstract class BaseGamersManager implements IGamersService,ICampaingService   {
	
	
	

	
	
	public void Save(Gamers gamers) {
		
		System.out.println("Oyuncu db'ye kaydedildi : " + gamers.id +". "+ gamers.firstName +" "+ gamers.lastName  +" "+ gamers.dateOfBirth +" "+ gamers.nationalId);
		
	}
	@Override
	public void addCampaing(Campaing campaing ,Games games,Gamers gamers) {
		System.out.println("Kampanya eklendi : " + campaing.discount );
		System.out.println(gamers.firstName+" adlı oyuncunun satın aldığı "+ games.gameName +" oyunu" +" uygulanan kampanya ile beraber "+ campaing.discount + " indirimli hale geldi.");
	}
	@Override
	public void deleteCampaing(Campaing campaing ,Games games,Gamers gamers) {
		System.out.println("Kampanya Silindi");
	}
	@Override
	public void updateCampaing(Campaing campaing ,Games games,Gamers gamers) {
		System.out.println("Kampanya Güncellendi");
	}
	
	
	public void add(Games games) {
		System.out.println("Oyun listeye Eklendi : " + games.gameName + " Fiyat :" + games.gamePrice);
		
	}

	
	public void delete(Games games) {
		System.out.println("Oyun listeden silindi");
		
	}
	
	
	
	
	
}
