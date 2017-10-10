package bracket;

public abstract class Competitor {
    private int ID;
    private int score;
    private String name;
    
    public Competitor(String _name){
        name = _name;
        score = 0;
    }
    
    public Competitor(String _name, int id){
        ID = id;
        name = _name;
        score = 0;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    public abstract void recordWin();
    public abstract void recordLoss();
    
    public abstract void print();
}
