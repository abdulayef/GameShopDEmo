package contrete;

import abstracts.GamerCheckService;
import abstracts.GamerManagerBase;
import entities.Gamer;

public class GamerManger extends GamerManagerBase {
    
    private GamerCheckService gamerCheckService;
    
    public GamerManger(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }
    
    @Override
    public void saved(Gamer gamer) {
        if (gamerCheckService.checkRealPerson(gamer)) {
            super.saved(gamer);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
