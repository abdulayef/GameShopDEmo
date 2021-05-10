package abstracts;

import entities.Gamer;

public abstract class GamerManagerBase implements GamerService {
    @Override
    public void saved(Gamer gamer) {
        System.out.println(gamer.firstName+" save");
    }

    @Override
    public void remove(Gamer gamer) {
        System.out.println(gamer.lastName+" removed");
    }
}
