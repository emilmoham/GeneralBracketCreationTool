package bracket;

import java.util.ArrayList;

public class Bracket {
    private ArrayList<Competitor> competitors;
    private ArrayList<Round> rounds;
    
    public Bracket(){
        competitors = new ArrayList<Competitor>();
    }
    
    public void addCompetitor(Competitor c){
        competitors.add(c);
    }
    
    public void initializeRounds(){
        int num_rounds;
        
        if(competitors.isEmpty()){
            System.out.println("Error: No competitors have been added.");
            System.out.println("Use <BracketReference>.addCompetitor(<competitor>)");
            return;
        }
        
        //Calculate Rounds needed to create bracket
        num_rounds = (int)Math.ceil(Math.log(competitors.size())/Math.log(2));
        
        rounds = new ArrayList<Round>();
        
        for(int i = 0; i < num_rounds; i++){
            rounds.add(new Round(i));
        }
        
        Round r = rounds.get(num_rounds-1);
        r.setCompetitorsList(competitors);
        r.seed();
    }
    
    //Testing Functions
    public void printAllEpisodes(){
        for(int i = 0; i < competitors.size(); i++){
            competitors.get(i).print();
        }
    }
}
