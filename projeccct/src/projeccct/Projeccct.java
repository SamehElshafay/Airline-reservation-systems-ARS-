/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeccct;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import view.Flight;
import view.Login;
import view.MAIN;
import view.Registeration;
  
/**
 *
 * @author sameh
 */
public class Projeccct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, SQLException {
        // TODO code application logic here
        /*Runnable r1 = new Task ("task 1");
        Runnable r2 = new Task2("task 2");
        Runnable r3 = new Task3("task 3");
        Runnable r4 = new Task2("task 4");
        Runnable r5 = new Task3("task 5");      
        
        Task  task   = new Task ("task 1");
        Task2 task2  = new Task2("task 2");
        Task3 task3  = new Task3("task 3");
        Task2 task21 = new Task2("task 4");
        Task3 task31 = new Task3("task 5");      
        final int MAX_NUMBER_OF_THREAD = 3 ;
        // creates a thread pool with MAX_T no. of 
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_NUMBER_OF_THREAD);  
        
        // passes the Task objects to the pool to execute (Step 3)
        
        
        pool.execute(task);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task21);
        pool.execute(task31);
        
        
        // pool shutdown ( Step 4)
        pool.shutdown();
        
        pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println(task.getDATE()+" <=================");
        */
        
        
        /*Database database = new Database();
        Connection con = database.connection();*/
        
        
        new Login().setVisible(true);
        //new Flight().setVisible(true);
        
        
        
        
        
    }
    
}

/*
Semaphore s = new Semaphore(1);
Thread x = new Thread (new Runnable() {
    @Override
    public void run() {
        try {
            System.out.println("before Thread pool");
            s.acquire();
            System.out.println("Excuting Thread pool");
        } catch (InterruptedException e) {
        }
        s.release();
        System.out.println("after Excuting Thread pool");
    }
});

x.start();
*/


//jdbc:mysql://localhost:3306/airlinereservation



/*List list = new ArrayList<>();
list.add(3);
list.add(1);
list.add("said");
list.add("emad");
list.add("saiedEmad");
list.add("12345678");
list.add(1);
database.addRow("customer", list);




List list = new ArrayList<>();
list.add("Fname");
list.add("'said'");
database.deleteValue("customer", list);


*/