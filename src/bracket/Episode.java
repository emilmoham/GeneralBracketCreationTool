package bracket;

public class Episode extends Competitor{
    private int ID;
    private int score;
    private String name;
    
    private int day;
    private int month;
    private int year;
    public String date;
    
    
    
    
    public Episode(String title){
        super(title);
        name = title;
    }
    
    public Episode(String title, int id){
        super(title, id);
        name = title;
        ID = id;
    }
    
    public Episode(String title, int id, int d, int m, int y){
        super(title, id);
        name = title;
        ID = id;
        day = d;
        month = m;
        year = y;
    }
    
    /* Utility Functions */
    private void generateDate(){
        date = String.format("%02d", year) + "-"
                             + String.format("%02d", month) + "-"
                             + String.format("%02d", day);
    }
    
    public void print(){
        generateDate();
        System.out.println(ID + "\t" + date + "\t" + name);
    }
    
    /* Setters */
    public void recordWin(){
        score++;
    }
    
    public void recordLoss(){
        score--;
    }
    
    /* getters */
    public int getID(){
        return ID;
    }
    
    public int getScore(){
        return score;
    }
    
    public String getDate(){
        generateDate();
        return date;
    }
    
    public String getName(){
        return name;
    }
}
