/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;
import gui.mockup.Pert;
import gui.mockup.Ganntt;
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
    private Pert pert; //Pertt.class needs to be changed to PERT
    private Ganntt gantt; //Ganntt.class needs to be Gantt
    
    public Project(Task task)
    {
        primaryTask = task;
    }
    
    public void createWBT()
    {
        wbt = new WBT();
    }
    
    public void createPert()
    {
        pert = new Pert();
    }
    
    public void createGantt()
    {
        gantt = new Ganntt();
    }
    
    public WBT getWBT()
    {
        return wbt;
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
        return 4; //TEMPORARY
    }
    
    private void setPrimaryTask(Task task)
    {
        primaryTask = task;
    }
    
    private void setProjectName(String name)
    {
    
    
    }
    
    
}
