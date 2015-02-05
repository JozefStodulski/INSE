/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectplanner;
import java.util.*;

/**
 *
 * @author jozefstodulski
 */
public class TestWBT {
    private static Date testDate;
    private static Task testPrimeTask;
    private static Task testTask1;
    private static Task testTask2;
    private static Task testTask3;
    private static Task testTask4;
    private static Task testTask5;
    private static Task testTask6;
    private static Project testProj;
    
    public static void main(String[] args) {
        testDate = new Date();
        
        testPrimeTask = new Task(1, "prime name", testDate, 5);
        testTask1 = new Task(1, "t name1", testDate, 5);
        testTask2 = new Task(1, "t name2", testDate, 5);
        testTask3 = new Task(1, "t name3", testDate, 5);
        testTask4 = new Task(1, "t name4", testDate, 5);
        testTask5 = new Task(1, "t name5", testDate, 5);
        testTask6 = new Task(1, "t name6", testDate, 5);
        
        testProj = new Project(testPrimeTask);
        
        testPrimeTask.addSubtask(testTask1);
        testPrimeTask.addSubtask(testTask2);
        testTask1.addSubtask(testTask3);
        testTask1.addSubtask(testTask4);
        testTask2.addSubtask(testTask5);
        testTask2.addSubtask(testTask6);
        
        testProj.createWBT();
        
        for (Task task : testProj.getWBT().getLeaves(testProj.getPrimaryTask()))
        {
            System.out.println(task.getName());
        }
    }
}
