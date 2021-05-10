/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adabter;

import abstracts.GamerCheckService;
import entities.Gamer;

/**
 *
 * @author Мухаммед
 */
public class MernisCheckService implements GamerCheckService {

    @Override
    public boolean checkRealPerson(Gamer costumer) {
        System.out.println("Cheked with mernis service");
        return true;
    }

}
