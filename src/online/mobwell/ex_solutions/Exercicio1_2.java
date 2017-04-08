/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.mobwell.ex_solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MissyM
 */
public class Exercicio1_2 extends Exercicio {

    public Exercicio1_2(String array) {

        super(array);
    }

    @Override
    public int algor(String userinput) {

        userCriarJava(userinput, "ExerciseOne.java");
        compilaErros("ExerciseOne.java");
        return userinput.contains("System.out.println(") ? 4 : 0;
    }

    @Override
    public int checkResult(String userinput) {
        return y("ExerciseOne", userinput);
    }

    public int x(BufferedReader bufferedReader, FileReader fileReader,String userinput) {
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                return line.equals("Hello ATEC!") ? 4 : 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(Exercicio1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
