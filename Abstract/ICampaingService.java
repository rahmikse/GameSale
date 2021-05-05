package Abstract;

import Entities.Campaing;
import Entities.Gamers;
import Entities.Games;

public interface ICampaingService {

	void addCampaing(Campaing campaing,Games games,Gamers gamers);
	void deleteCampaing(Campaing campaing,Games games,Gamers gamers);
	void updateCampaing(Campaing campaing,Games games,Gamers gamers);
}
