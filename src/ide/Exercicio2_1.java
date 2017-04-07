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
public class Exercicio2_1 extends Exercicio {

    public Exercicio2_1(String array) {
        super(array);
    }

    @Override
    public int algor(String userinput) {
        userCriarJava(userinput, "ExerciseExpenses.java");
        compilaErros("ExerciseExpenses.java");
        int count = 0;

        String algor = "(int \\w+\\s*[=]\\s*\\d*\\s*)|(\\w+\\s*[=]\\s*\\d*\\s*)";
        Pattern r = Pattern.compile(algor);
        Matcher m = r.matcher(userinput);

        String vars[] = {"water", "electricity", "gaz"};

        while (m.find()) {
            for (String s : vars) {
                if (m.group(0).contains(s)) {
                    count++; // verificar
                }
            }
        }
//TODO escalar pontuação consoante count
        return count == 3 ? 4 : 0;
    }

    @Override
    public int checkResult(String userinput) {
        return y("ExerciseExpenses", userinput);
    }

    public int x(BufferedReader bufferedReader, FileReader fileReader, String userinput) {

        try {
            if (bufferedReader.readLine() == null) {
                return 4;
            }
        } catch (IOException ex) {
            Logger.getLogger(Exercicio1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
