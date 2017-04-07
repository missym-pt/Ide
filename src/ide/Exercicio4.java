/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ide;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MissyM
 */
public class Exercicio4 extends Exercicio{

    public Exercicio4(String array) {
        super(array);
    }
    @Override
    public int algor(String userinput) {
        
        userCriarJava(userinput, "ExerciseLoop.java" );
        compilaErros("ExerciseLoop.java");
        
        	  
		  String string__[] =new String[4];
		  string__[0]="(int \\w+\\s?[=]\\s?\\d\\s?[;])";
		  string__[1]="(while\\s?\\(\\s?\\w+\\s?[<]\\s?\\d+\\s?\\))";
		  string__[3]="(System[.]out[.](println||print)\\(\\w+\\);)";
                  string__[2]="(\\w+[+][+][;])";
                  
		  int cont = 0; Pattern p; Matcher m;
		  
		  for(int i=0;i<string__.length;i++){
		  
		  p = Pattern.compile(string__[i]);
		  
		  m = p.matcher(userinput);
		  
		  if(m.find())cont++;}
	  
        return cont >= 4 ? 4 : 0;
    }
    
    @Override
    public int checkResult(String userinput) {
        return y("ExerciseLoop", userinput);
    }

    public int x(BufferedReader bufferedReader, FileReader fileReader,String userinput) {
        String line = null;
        int count=0, score=0;
        try {
             while ((line = bufferedReader.readLine()) != null) {
                        score= line.contains(Integer.toString(count))? score+1:score;
                        count++;
                    }
        } catch (IOException ex) {
            Logger.getLogger(Exercicio1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return score>=10? 4:0;
    }

}
