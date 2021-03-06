/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;
// import gui.mockup.Task;  // needed?
import java.util.*;

/**
 *
 * @author Samsung
 */
public class WBT {
    private List<Task> leaves;
    
    public WBT()
    {
        leaves = new ArrayList<>();
    }
    
    /**
     * @return leaves       All the micro-tasks at the bottom of the WBT
     * @param primaryTask  Node whose descended leaves are requested
     */
    public List<Task> getLeaves(Task primaryTask)
    {
        leaves.clear();
        updateLeaves(primaryTask);
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
