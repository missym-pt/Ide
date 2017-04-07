/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ide;

/**
 *
 * @author MissyM
 */
public class MockupData {

    public static String inputEx1_1 = "public class ExerciseOne {\n    public static void main(String[] args) {\n    }\n}";
    public static String inputEx1_2 = "public class ExerciseOne {\n    public static void main(String[] args) {\n       System.out.println(\"Hello ATEC!\");\n    }\n}";
    public static String inputEx2 = "public class ExerciseExpenses {\n    public static void main(String[] args) {  \n        int water = 15;\n        int electricity = 20;\n        int gaz = 13;\n    }\n}";
    public static String inputEx2_1 = "public class ExerciseExpenses {    public static void main(String[] args) {         int water = 15;        int electricity = 20;        int gaz = 13;         int sum = water + electricity + gaz;        System.out.println(sum);    }}";
    public static String inputEx3 = "public class ExerciseBalance {  \n  public static void main(String[] args) {         \n  int accountBalance = 300;   \n     int totalExpenses = 450;        \n        if(accountBalance >= totalExpenses){      \n      accountBalance = accountBalance - totalExpenses;   \n     } else {     \n       System.out.println(\"There's not enough money available on your account\");        }     }   }";
    public static String inputEx4 = "public class ExerciseLoop {\n    public static void main(String[] args) { \n    \n        int count = 0;\n        \n        while(count<10){\n            System.out.println(count);\n  count++;\n      }    \n    }\n}";
    public static String inputEx4_2 = "public class ExerciseLoop {\n    public static void main(String[] args) { \n    \n        for(int i=0; i<10; i++){\n            System.out.println(i);\n        }    \n    }\n}";
    public static String inputEx5_3 = "public class ExerciseMethods {    public static void main(String[] args) {    \n        System.out.println(sayHello());   }       \n    public static String sayHello(){   \n        String hello=\"Hello again.\";       \n        return hello;       \n        }}";
}
