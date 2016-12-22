package supernova;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikastaank
 */
public class FileProcessor {
    
    public static String processFile(BufferedReaderProcessor p) throws IOException
    {
        try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }
    public static String processFile() throws IOException
    {
        try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }
    public static void main(String args[])
    {
        try {
            String oneLine=processFile((BufferedReader br)-> br.readLine());
            String twoLine=processFile((BufferedReader  br1) ->br1.readLine() + br1.readLine());
        } catch (IOException ex) {
            Logger.getLogger(FileProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
