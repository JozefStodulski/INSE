/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;

import gui.mockup.ProjectPlanner;

/**
 *
 * @author Samsung
 */
public class Pertt {
    public int getFloatTime()
    {
        return ProjectPlanner.getOpenProject().getTotalDuration() -ProjectPlanner.getOpenProject().getMinDuration();
    }
}
