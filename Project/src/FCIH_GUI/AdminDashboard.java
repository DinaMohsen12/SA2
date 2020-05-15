
package FCIH_GUI;

import FCIHCaseStudy.Student;
import Frames.Admin_CoursesFrame;
import Frames.Admin_EmployeesFrame;
import Frames.Admin_ProfessorsFrame;
import Frames.Admin_StudentsFrame;
import Frames.Admin_TAsFrame;
import Frames.Panels.ChartPanel;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dina
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        setLocation(250, 10);
        setTitle("Admin Dashboard");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenuItem();
        menuUsers = new javax.swing.JMenu();
        menuStudents = new javax.swing.JMenuItem();
        menuProfessors = new javax.swing.JMenuItem();
        menuTAs = new javax.swing.JMenuItem();
        menuEmployees = new javax.swing.JMenuItem();
        mainmenuCourses = new javax.swing.JMenu();
        menuCourses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuReport.setText("Reports");
        menuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportActionPerformed(evt);
            }
        });
        menuFile.add(menuReport);

        jMenuBar1.add(menuFile);

        menuUsers.setText("Users");

        menuStudents.setText("Students");
        menuStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStudentsActionPerformed(evt);
            }
        });
        menuUsers.add(menuStudents);

        menuProfessors.setText("Professors");
        menuProfessors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProfessorsActionPerformed(evt);
            }
        });
        menuUsers.add(menuProfessors);

        menuTAs.setText("Teaching Assistants");
        menuTAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTAsActionPerformed(evt);
            }
        });
        menuUsers.add(menuTAs);

        menuEmployees.setText("Employees");
        menuEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmployeesActionPerformed(evt);
            }
        });
        menuUsers.add(menuEmployees);

        jMenuBar1.add(menuUsers);

        mainmenuCourses.setText("Courses");
        mainmenuCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuCoursesActionPerformed(evt);
            }
        });

        menuCourses.setText("Manage Courses");
        menuCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCoursesActionPerformed(evt);
            }
        });
        mainmenuCourses.add(menuCourses);

        jMenuBar1.add(mainmenuCourses);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        int c = JOptionPane.showConfirmDialog(null, "Are you Sure, System will Exit");
        if (c == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStudentsActionPerformed
        // TODO add your handling code here:
        Admin_StudentsFrame f = new Admin_StudentsFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuStudentsActionPerformed

    private void menuProfessorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProfessorsActionPerformed
        // TODO add your handling code here:
        Admin_ProfessorsFrame f = new Admin_ProfessorsFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuProfessorsActionPerformed

    private void menuTAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTAsActionPerformed
        // TODO add your handling code here:
        Admin_TAsFrame f = new Admin_TAsFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuTAsActionPerformed

    private void menuEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmployeesActionPerformed
        // TODO add your handling code here:
        Admin_EmployeesFrame f = new Admin_EmployeesFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuEmployeesActionPerformed

    private void mainmenuCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuCoursesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mainmenuCoursesActionPerformed

    private void menuCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCoursesActionPerformed
        // TODO add your handling code here:
        Admin_CoursesFrame f = new Admin_CoursesFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_menuCoursesActionPerformed

    private void menuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportActionPerformed
        // TODO add your handling code here:
        JFrame f = new JFrame();
        f.setLocation(250, 100);
        f.setSize(600, 550);

        Student x = new Student();
        ArrayList<Student> s = x.listStudents();
        double[] values = new double[25];
        String[] names = new String[25];

        for (int i = 0; i < 25; i++) {

            names[i] = "Item " + i;
            if (i % 2 == 0) {
                values[i] = i * 5 + 1;
            } else {
                values[i] = i * 3 + 2;
            }
        }

        f.getContentPane().add(new ChartPanel(values, names, "GPA Report"));
        f.setVisible(true);
    }//GEN-LAST:event_menuReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mainmenuCourses;
    private javax.swing.JMenuItem menuCourses;
    private javax.swing.JMenuItem menuEmployees;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuProfessors;
    private javax.swing.JMenuItem menuReport;
    private javax.swing.JMenuItem menuStudents;
    private javax.swing.JMenuItem menuTAs;
    private javax.swing.JMenu menuUsers;
    // End of variables declaration//GEN-END:variables
}
