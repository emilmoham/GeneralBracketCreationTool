package UtilityClasses;

import bracket.Competitor;
import bracket.Bracket;
import bracket.Episode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    int linesRead = 0;
    int dateCollumn = 0;

    String inputFilePath;
    String csvSplitBy;
    String dateSplitBy;

    private BufferedReader br;

    public CSVReader(String path, String delimiter) {
        inputFilePath = path;
        csvSplitBy = delimiter;
    }

    public CSVReader(String path, String delimiter, String dateDelimiter) {
        inputFilePath = path;
        csvSplitBy = delimiter;
        dateSplitBy = dateDelimiter;
    }

    public void readFile(Bracket b) {
        /* This file is currently hard coded to only accept episodes as 
         * competitors, will fix in future hopefully
         */
        
        String line;
        
        try {
            br = new BufferedReader(new FileReader(inputFilePath));
        } catch (FileNotFoundException ex) {
            System.out.println("File \"" + inputFilePath + "\" could not be opened...");
        }
                
        try{
            while((line = br.readLine()) != null){
                Competitor episode = lineToEpisode(line);
                b.addCompetitor(episode);
                linesRead++;
            }
        } catch(IOException e){
        }
        
    }

    public Competitor lineToEpisode(String line) {
        String[] entry = line.split(csvSplitBy);
        String[] date = entry[dateCollumn].split(dateSplitBy);
        Episode retval = new Episode(entry[1],
                                     linesRead,
                                     Integer.parseInt(date[2]),
                                     Integer.parseInt(date[0]),
                                     Integer.parseInt(date[1]));
        return retval;
    }
}