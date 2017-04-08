/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.mobwell.ex_solutions;

import static online.mobwell.ex_solutions.MockupData.*;

/**
 *
 * @author MissyM
 */
public class Ide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercicio exercicio1_1=new  Exercicio1_1(inputEx1_1);
        //Exercicio exercicio1_2 = new Exercicio1_2(inputEx1_2);
        //Exercicio exercicio2=new  Exercicio2_1(inputEx2);
         //Exercicio exercicio2_2=new  Exercicio2_2(inputEx2_1);
        //Exercicio exercicio3=new  Exercicio3(inputEx3);
        Exercicio exercicio4=new  Exercicio4(inputEx4);
        //Exercicio exercicio4_2=new  Exercicio4_2(inputEx4_2);
        //Exercicio exercicio5_3=new  Exercicio5_3(inputEx5_3);

        //int arr[]=exercicio1_1.review(inputEx1_1);
        //int arr[] = exercicio1_2.review(inputEx1_2);
        //int arr[]=exercicio2.review(inputEx2);
        //int arr[]=exercicio2_2.review(inputEx2_1);
        //int arr[]=exercicio3.review(inputEx3);
        int arr[]=exercicio4.review(inputEx4);
        //int arr[]=exercicio4_2.review(inputEx4_2);
        //int arr[]=exercicio5_3.review(inputEx5_3);
        int total = 0;
        for (int i : arr) {
            System.out.println(i);
            total += i;
        }

        System.out.println("Pontos totais ->" + total);

    }

}
