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
public class ProjectPlanner {
    private static Project openProject;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserFront screen = new UserFront();
        screen.setVisible(true);
        
    }
    
    public static Project getOpenProject()
    {
        return openProject;
    }
    
}
