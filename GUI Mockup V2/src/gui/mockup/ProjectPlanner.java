/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;

import gui.mockup.Project;
import gui.mockup.GUI;

/**
 *
 * @author Samsung
 */
public class ProjectPlanner {
    private static Project openProject;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI screen = new GUI();
        screen.setVisible(true);
        
    }
    
    public void loadProject()
    {
        // openProject = new Project();     // get variables from database
    }
    
    public void saveProject()
    {
        // Send all project variables to database
    }
    
    public static Project getOpenProject()
    {
        return openProject;
    }
    
}
