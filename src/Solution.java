import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        System.out.println("Please enter in a number: ");
        Scanner key = new Scanner(System.in);
        int linelength = key.nextInt();
        String word="";
        ArrayList<String> words = new ArrayList<>();
        while (!word.equalsIgnoreCase("q")) {
            System.out.println("Please enter in a word or press q to stop: ");
            key = new Scanner(System.in);
            word = key.next();
            if (!word.equalsIgnoreCase("q")) {
                words.add(word);
            }
        }
        String realsentence="";
        int counter=0;
        while(counter<words.size()) {
            while (realsentence.length()+words.get(counter).length() <= linelength){
                if (realsentence.equalsIgnoreCase("")) {
                    realsentence = words.get(counter) + " ";

                }
                 else {
                     realsentence = realsentence + words.get(counter)+ " ";
                }
                 counter++;
                 if (counter>=words.size()){
                     break;
                 }
            }
            System.out.println(realsentence);
            realsentence = "";


            }
        }
    }
