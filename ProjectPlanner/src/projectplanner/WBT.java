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
    
    public List<Task> getLeaves()
    {
        leaves.clear();
        updateLeaves(ProjectPlanner.getOpenProject().getPrimaryTask());
        return leaves;
    }
    
    public void updateLeaves(Task node)
    {
        if (node.getComponents().isEmpty())
        {
            leaves.add(node);
        } 
        else
        {
            for (Task nodes : node.getComponents())
            {
                updateLeaves(nodes);
            }
        }
    }
    
}