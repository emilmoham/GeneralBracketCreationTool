/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runnable;

import UtilityClasses.CSVReader;
import bracket.Bracket;

/**
 *
 * @author tuf58189
 */
public class Main {
    public static void main(String[] args){
        Bracket b = new Bracket();
        
        CSVReader csvr = new CSVReader("ZP_ALL.csv", ",", "/");
        csvr.readFile(b);
        
        b.printAllEpisodes();
        b.initializeRounds();
    }
}
