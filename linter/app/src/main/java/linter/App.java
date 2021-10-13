/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.file.*;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    static  String map (int[][] arr){
        HashSet<Integer> mySet = new HashSet<>();
        HashSet<Integer> tempreture = new HashSet<>();
        int min = arr[0][0];
        int max = arr[0][0];
        String result = "";

        for(int i=0; i < arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                mySet.add(arr[i][j]);
                if(arr[i][j] < min){
                    min = arr[i][j];
                }else if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        for(int k = min + 1 ; k < max; k++){
            tempreture.add(k);
        }
        System.out.println("High :" + max);
        System.out.println("Low :" + min);

        for(Integer temp : tempreture){
            if(!mySet.contains(temp)){
              result= "Never saw tempreture : " + temp ;
            }
        }
       return result ;
    }


    static String tally(List<String> list){
        HashSet<String> mySet = new HashSet<>(list);
        HashMap<String, Integer> hash = new HashMap<>();

        for(String i : mySet){
            hash.put(i,0);
        }

        for(String votes : list){
            if(hash.containsKey(votes)){
                Integer k = hash.get(votes);
                k++;
                hash.put(votes,k);
            }
        }
        int counter =0;
        String winner = "none";
        for(String i : mySet){
            if(hash.get(i) > counter){
                counter = hash.get(i);
                winner = i;
            }
        }
        return  winner;
    }

    static String Linter(Path path){
        String msg = "";

        try {
           List<String> lines = Files.readAllLines(path);
            int counter = 0;

            for(String data : lines){
                counter++;
                if(!(data.isEmpty())){
                    if(data.endsWith("{") || data.endsWith("}") || data.endsWith("else")|| data.endsWith("if") || data.endsWith(";") ){
                    }else{
                        System.out.println("Line " + counter +" Missing semicolon.");
                        msg += "Line" + counter + "Missing semicolon";
                    }
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("error");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return msg;

    }





    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        File file = new File("gates.js");

    }

    }