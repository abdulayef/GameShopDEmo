package abstracts;

import entities.Product;
import entities.User;

public interface ShopService {

    public void buy(Product product, User user);

    public void addCampaign();

    public void uptadeCampaign();

    public void removeCampaign();

}
