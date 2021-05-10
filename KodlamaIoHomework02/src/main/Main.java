package main;

import abstracts.GamerManagerBase;
import adabter.MernisCheckService;
import contrete.GamerManger;
import entities.Gamer;

public class Main {
    
    public static void main(String[] args) {
        
        GamerManagerBase gamerManagerBase = new GamerManger(new MernisCheckService());
        
        Gamer gamer = new Gamer("Mahammad", "Abdullayev", "31.07.2001", "7KA1CYR");
        gamerManagerBase.saved(gamer);
    }
}
