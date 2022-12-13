/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeccct;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sameh
 */
class Task2 implements Runnable   
{
    String name;
      
    public Task2(String s){
        name = s;
    }
      
    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run(){
        try{
            for (int i = 0; i<=5; i++){
                System.out.println(i+1 + " : " +name);
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        }
        
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}