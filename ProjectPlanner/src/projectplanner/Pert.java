/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectplanner;

/**
 *
 * @author Samsung
 */
public class Pert {
    public int getFloatTime()
    {
        return ProjectPlanner.getOpenProject().getTotlDuration() -ProjectPlanner.getOpenProject().getMinDuration();
    }
}
