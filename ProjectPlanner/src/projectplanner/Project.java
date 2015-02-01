/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectplanner;
import java.util.Date;

/**
 *
 * @author jozefstodulski
 */
public class Project {
    private int projectID;
    private String projectName;
    private Date startDate;
    private Date completionDate;
    
    private WBT wbt;
    private Pertt pert; //Pertt.class needs to be changed to PERT
    private Ganntt gantt; //Ganntt.class needs to be Gantt
    
    public Project()
    {
        wbt = new WBT();
        pert = new Pertt();
        gantt = new Ganntt();
    }
}
