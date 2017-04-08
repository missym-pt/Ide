/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.mobwell.ex_solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author MissyM
 */
public abstract class Exercicio {

    private String array;

    public Exercicio(String array) {
        this.array=array;
    }

    
    //valida agoritmo valido
 
    public abstract int checkResult(String userinput);
    public abstract int algor(String userinput);
    public abstract int x(BufferedReader bufferedReader, FileReader fileReader, String userinput);
    
    
    
    public int[] review(String array){
        
        int review[]=new int[4];
        
        review[1]=algor(array);
        review[2]=checkErros();
        review[0]= review[2] >= 4 ? 4 : 0;        
        review[3]=checkResult(array);
        
    return review;}
    
      
    public void userCriarJava(String userinput, String file) {

        try {
            FileWriter fileWriter = new FileWriter(file);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(userinput);
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            System.out.println("ERROR userCriarJava");
        }
    }

    public void compilaErros(String cmd) {
        
        String s="javac "+cmd+" > erros.txt 2>&1";
        try {
            String[] command = {"CMD", "/C", s};
            ProcessBuilder probuilder = new ProcessBuilder(command);

            probuilder.directory(new File(Settings.PROJECT_LOCATION)); //esta

            Process process = probuilder.start();
            
        } catch (IOException t) {
            System.out.println("ERROR listErrors");
        }
    }
    
    public int checkErros() {

       String file = "erros.txt";
        String line = null;
        int errors=0;

        try {
            FileReader fileReader = new FileReader(file);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                if (bufferedReader.readLine() == null) {return 4;}
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    errors=Character.isDigit(line.charAt(1))? 4: Character.isDigit(line.charAt(0))? Character.getNumericValue(line.charAt(0)):errors;
                    
                }
          return errors>4? 0 : 4-errors;      
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR Checking Errors");

        } catch (IOException ex) {
            System.out.println("ERROR Checking Errors");
        }
        
return 0;}
    
        public int y(String exercise, String userinput){
        
    String file = "result.txt"; 
        
        try {           
            // Log4j
            // Logger log = Logger.getLogger(se
            String[] command = {"CMD", "/C", "java "+exercise+" > result.txt 2>&1"};
            ProcessBuilder probuilder = new ProcessBuilder(command);

            probuilder.directory(new File(Settings.PROJECT_LOCATION)); //esta
            
            Process process = probuilder.start();
            
            try {
                FileReader fileReader = new FileReader(file);
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    
                    return x(bufferedReader, fileReader, userinput);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("ERROR Checking Result");
                
            } catch (IOException ex) {
                System.out.println("ERROR Checking Result");
            }
            return 0;
        } catch (IOException ex) {
             System.out.println("ERROR Checking Result");
        }
        return 0;}
}
