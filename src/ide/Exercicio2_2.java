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
public class Exercicio2_2 extends Exercicio {

    public Exercicio2_2(String array) {
        super(array);
    }

    @Override
    public int algor(String userinput) {
        
        userCriarJava(userinput, "ExerciseExpenses.java" );
        compilaErros("ExerciseExpenses.java");
        
        int count = 0;

        String algor[] = {"(int \\w+\\s*[=]\\s*\\d*\\s?)|(\\w+\\s*[=]\\s*\\d*\\s*)", "(int )?(\\s?sum\\s?[=]\\s?\\w+\\s?[+]\\s?\\w+\\s?[+]\\s?\\w+)", "System[.]out[.](println|print)[(](\\s?[\"]?\\s?(\\w+)?\\s?[\"]?\\s?)*(\\s?[+]?\\s?)*sum[)]"};
        String var[]={"water", "electricity", "gaz"};
        
        for (String s : algor) {
            Pattern r = Pattern.compile(s);
            Matcher m = r.matcher(userinput);
            while (m.find()) {
                    count++;
               }
            }
        
//TODO escalar pontuação consoante count
        return count >= 5 ? 4 : 0;
    }
    
    @Override
    public int checkResult(String userinput) {
        return y("ExerciseExpenses", userinput);
    }

    public int x(BufferedReader bufferedReader, FileReader fileReader, String userinput) {
        String line = null;
               String result = "";
        String algor = "(int \\w+\\s?[=]\\s?\\d*\\s?)|(\\w+\\s?[=]\\s?\\d*\\s?)";
        Pattern r = Pattern.compile(algor);
        Matcher m = r.matcher(userinput);
        String algor1 = "(\\d+)";
        Pattern r1 = Pattern.compile(algor1);
        Matcher m1 = r1.matcher(userinput);
        int total = 0;

        for (int i = 0; i < userinput.length(); i++) {
            if (m.find()) {
                String temp = m.group(0);
                for (int g = 0; g < temp.length(); g++) {
                    if (m1.find()) {

                        total += Integer.parseInt(m1.group(0));
                    }
                }
            }
        }

        try {
            while ((line = bufferedReader.readLine()) != null) {
                        return line.contains(Integer.toString(total)) ? 4 : 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(Exercicio1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    
}
