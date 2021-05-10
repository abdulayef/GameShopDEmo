/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import entities.Product;
import entities.User;

public abstract class GameShopService implements ShopService {

    @Override
    public void buy(Product game, User gamer) {
        System.out.println();
    }

    @Override
    public void addCampaign() {
    }

    @Override
    public void uptadeCampaign() {
    }

    @Override
    public void removeCampaign() {
    }

}
