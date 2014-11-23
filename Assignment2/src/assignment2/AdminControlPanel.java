/*
 * Charles O'Neal
 * Assignment 2
 * This is the admin contol panel for the mini twitter project.  It is a
 * SINGLETON pattern that allows only one instance of the admin control panel
 */
package assignment2;

/**
 *
 * @author Charles
 */
public class AdminControlPanel extends javax.swing.JFrame {

   // SINGLETON PATTERN
   private static AdminControlPanel instance;
   /**
    * Creates new form AdminControlPanel
    */
   private AdminControlPanel() {
      initComponents();
   }
   
   public static AdminControlPanel getInstance() {
      if(instance == null) {
	 instance = new AdminControlPanel();
      }
      return instance;
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      userGroupPanel = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      userGroupTree = new javax.swing.JTree();
      buttonPannel = new javax.swing.JPanel();
      showPositivePercentageButton = new javax.swing.JButton();
      showMessagesTotalButton = new javax.swing.JButton();
      showGroupTotalButton = new javax.swing.JButton();
      showUserTotalButton = new javax.swing.JButton();
      openUserViewButton = new javax.swing.JButton();
      addUserButton = new javax.swing.JButton();
      addGroupButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Mini Twitter - Admin Control Panel");
      setPreferredSize(new java.awt.Dimension(700, 400));

      javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
      userGroupTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
      jScrollPane1.setViewportView(userGroupTree);

      javax.swing.GroupLayout userGroupPanelLayout = new javax.swing.GroupLayout(userGroupPanel);
      userGroupPanel.setLayout(userGroupPanelLayout);
      userGroupPanelLayout.setHorizontalGroup(
         userGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userGroupPanelLayout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addContainerGap())
      );
      userGroupPanelLayout.setVerticalGroup(
         userGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(userGroupPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1))
      );

      showPositivePercentageButton.setText("Show Positive Percentage");

      showMessagesTotalButton.setText("Show Messages Total");

      showGroupTotalButton.setText("Show Group Total");

      showUserTotalButton.setText("Show User Total");

      openUserViewButton.setText("Open User View");

      addUserButton.setText("Add User");

      addGroupButton.setText("Add Group");

      javax.swing.GroupLayout buttonPannelLayout = new javax.swing.GroupLayout(buttonPannel);
      buttonPannel.setLayout(buttonPannelLayout);
      buttonPannelLayout.setHorizontalGroup(
         buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(buttonPannelLayout.createSequentialGroup()
            .addContainerGap(19, Short.MAX_VALUE)
            .addGroup(buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPannelLayout.createSequentialGroup()
                     .addComponent(showMessagesTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(showPositivePercentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPannelLayout.createSequentialGroup()
                     .addComponent(showUserTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(showGroupTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(addUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(openUserViewButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addComponent(addGroupButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );
      buttonPannelLayout.setVerticalGroup(
         buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(buttonPannelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(addGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
            .addComponent(openUserViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60)
            .addGroup(buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(showGroupTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(showUserTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(buttonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(showPositivePercentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(showMessagesTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(userGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(buttonPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(userGroupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(buttonPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

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
	 java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
	 java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
	 java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	 java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
	 public void run() {
	    new AdminControlPanel().setVisible(true);
	 }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton addGroupButton;
   private javax.swing.JButton addUserButton;
   private javax.swing.JPanel buttonPannel;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JButton openUserViewButton;
   private javax.swing.JButton showGroupTotalButton;
   private javax.swing.JButton showMessagesTotalButton;
   private javax.swing.JButton showPositivePercentageButton;
   private javax.swing.JButton showUserTotalButton;
   private javax.swing.JPanel userGroupPanel;
   private javax.swing.JTree userGroupTree;
   // End of variables declaration//GEN-END:variables
}