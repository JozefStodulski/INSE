/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectplanner;
import java.util.Date;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Task {
    private int taskID;
    private String taskName;
    private Date EST;
    private int duration;
    private Date EET;
    private int LST;
    private int floatTime;
    private Date LET;
    private int eventID;
    private List<Task> dependancies;
    private List<Task> components;
    
    public Task(int taskID, String taskName, Date EST, int duration)
    {
        setTaskID(taskID);
        setTaskName(taskName);
        setEST(EST);
        setDuration(duration);
    }
    
    public void setTaskID(int ID)
    {
        taskID = ID;
    }
    
    public void setTaskName(String name)
    {
        taskName = name;
    }
    
    public void setEST(Date time)
    {
        EST = time;
    }
    
    public void setDuration(int time)
    {
        duration = time;
    }
    
    public void addDependency(Task dependency)
    {
        dependancies.add(dependency);
    }
    
    public void addComponents(Task task)
    {
        components.add(task);
    }
    
    public List<Task> getDependencies()
    {
        return dependancies;
    }
    
    public List<Task> getComponents()
    {
        return components;
    }
}
