package bracket;

import java.util.AbstractQueue;
import java.util.ArrayList;

public class Round {
    int ID;
    
    Match[] matches;
    ArrayList<Competitor> competitors;
    
    ArrayList<Competitor> winners;
    ArrayList<Competitor> losers;
    
    
    public Round(int id){
        ID = id;
        matches = new Match[(int)Math.pow(id, 2)];
    }
    
    public void setCompetitorsList(ArrayList<Competitor> c){
        competitors = c;
    }
    
    public void seed(){
        /*AbstractQueue<Competitor> competitors_q = new AbstractQueue<Competitor>();
        Competitor current;
        
        //Error Handling
        if(competitors.isEmpty()){
            System.out.println("Error: Cannot Seed Round " + ID + ". No Competitors have been added.");
        }
        
        for(int i = 0; i < competitors.size(); i++){
            competitors_q.add(competitors.get(i));
        }
        
        
        //Assign competitors to matches
        while((current = competitors_q.poll()) != null){
            //TODO
        }*/
        
        System.out.println("Seeding...");
    }
}
