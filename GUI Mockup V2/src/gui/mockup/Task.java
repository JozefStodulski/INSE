/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;
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
    private List<Task> subtasks;
    private int width;
    
    public Task(int taskID, String taskName, Date EST, int duration)
    {
        setTaskID(taskID);
        setTaskName(taskName);
        setEST(EST);
        setDuration(duration);
        subtasks = new ArrayList<Task>();
    }
    
    public void setTaskID(int ID)
    {
        taskID = GUI.txtTaskID.;
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
    
    public void addSubtask(Task task)
    {
        subtasks.add(task);
    }
    
    public List<Task> getDependencies()
    {
        return dependancies;
    }
    
    public List<Task> getSubtasks()
    {
        return subtasks;
    }
    
    public int getMinDiration()
    {
        return 4; //TEMPORARY
    }
    
    public int getWidth()
    {
        width = updateWidth(this);
        return width;
    }
    
    private int updateWidth(Task node)
    {
        if (node.getSubtasks().isEmpty())
        {
            return 1;
        } 
        else
        {
            for (Task nodes : node.getSubtasks())
            {
                width = width + updateWidth(nodes);
            }
            return width;
        }
    }
    public String getName()
    {
        return taskName;
    }
}
