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
public class Exercicio3 extends Exercicio {

    public Exercicio3(String array) {
        super(array);
    }

    @Override
    public int algor(String userinput) {

        userCriarJava(userinput, "ExerciseBalance.java");
        compilaErros("ExerciseBalance.java");

        int count = 0;

        String algor[] = {"(int \\w+\\s*[=]\\s*\\d*\\s*)|(, \\w+\\\\s*[=]\\\\s*\\\\d*\\\\s*)", "if[(]\\s*\\w+\\s*((>=)|(<=)|<|>)\\s*\\w+\\s*[)]", "System[.]out[.](println|print)[(]\\s*[\"].+[\"][)]"};

        for (String s : algor) {
            Pattern r = Pattern.compile(s);
            Matcher m = r.matcher(userinput);
            while (m.find()) {
                count++;
            }
        }
//TODO escalar pontuação consoante count
        return count >= 4 ? 4 : 0;
    }

    @Override
    public int checkResult(String userinput) {
        return y("ExerciseBalance", userinput);
    }

    public int x(BufferedReader bufferedReader, FileReader fileReader, String userinput) {
        String line = null;

        String result = "";
        String algor = "(int \\w+\\s*[=]\\s*\\d*\\s*)|(\\w+\\s*[=]\\s*\\d*\\s*)";
        Pattern r = Pattern.compile(algor);
        Matcher m = r.matcher(userinput);
        String algor1 = "(\\d+)";
        int accountBalance = 0;
        int totalExpenses = 0;

        for (int i = 0; i < userinput.length(); i++) {
            while (m.find()) {
                String temp = m.group(0);
                Pattern r1 = Pattern.compile(algor1);
                Matcher m1 = r1.matcher(temp);
                if (temp.contains("accountBalance")) {
                    if (m1.find()) {
                        accountBalance = Integer.parseInt(m1.group(0));
                    }
                } else if (temp.contains("totalExpenses")) {
                    if (m1.find()) {
                        totalExpenses = Integer.parseInt(m1.group(0));
                    }
                }
            }
        }

        try {
            if (accountBalance <= totalExpenses && bufferedReader.readLine() != null) {
                return 4;
            } else {
                return 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(Exercicio1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
