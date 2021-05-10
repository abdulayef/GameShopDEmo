/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrete;

import abstracts.GamerCheckService;
import entities.Gamer;

/**
 *
 * @author Мухаммед
 */
public class GamerCheckManger implements GamerCheckService {

    @Override
    public boolean checkRealPerson(Gamer costumer) {

        return false;
    }

}
