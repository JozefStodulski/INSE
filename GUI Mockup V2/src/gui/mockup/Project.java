/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;
import gui.mockup.Pertt;
import gui.mockup.Gantt;
import java.util.Date;
import gui.mockup.Task;
import gui.mockup.WBT;

/**
 *
 * @author jozefstodulski
 */
public class Project {
    private int projectID, totalDuration;
    private String projectName;
    private Date startDate;
    private Date completionDate;
    private Task primaryTask;
    private WBT wbt;
    private Pertt pertt;
    private Gantt gantt;
    private int minDuration;
    
    
    public Project(Task task)
    {
        setPrimaryTask(task);
    }
    
    public void createWBT()
    {
        wbt = new WBT();
    }
    
    public void createPert()
    {
        pertt = new Pertt();
    }
    
    public void createGantt()
    {
        gantt = new Gantt();
    }
    
    public WBT getWBT()
    {
        return wbt;
    }
    
    public Pertt getPertt()
    {
        return pertt;
    }
    
    public Task getPrimaryTask()
    {
        return primaryTask;
    }
    
    public int getTotalDuration()
    {
        return totalDuration;
    }
    
    public int getMinDuration()
    {
        minDuration = 0;
        for (Task task : getWBT().getLeaves(primaryTask))
        {
            minDuration = minDuration + task.getMinDiration();
        }
        return minDuration;
    }
    
    private void setPrimaryTask(Task task)
    {
        primaryTask = task;
    }
    
    public void setProjectName(String name)
    {
        projectName = name;
    }
    
    public void setTotalDuration(int duration)
    {
        totalDuration = duration;
    }
    
}
