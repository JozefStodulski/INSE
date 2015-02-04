/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectplanner;
import java.util.*;

/**
 *
 * @author Samsung
 */
public class WBT {
    private List<Task> leaves;
    
    public WBT()
    {}
    
    /**
     * @return All the micro-tasks at the bottom of the WBT
     */
    public List<Task> getLeaves()
    {
        leaves.clear();
        updateLeaves(ProjectPlanner.getOpenProject().getPrimaryTask());
        return leaves;
    }
    
    private void updateLeaves(Task node)
    {
        if (node.getSubtasks().isEmpty())
        {
            leaves.add(node);
        } 
        else
        {
            for (Task nodes : node.getSubtasks())
            {
                updateLeaves(nodes);
            }
        }
    }
    
}
