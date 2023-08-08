
package Main;


public class Carga extends javax.swing.JFrame {

   
    public Carga() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loading = new javax.swing.JProgressBar();
        LoadingValue = new javax.swing.JLabel();
        loadinglb = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(480, 360));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(176, 112, 79));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 460, 10));

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0%");
        jPanel1.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 20));

        loadinglb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadinglb.setForeground(new java.awt.Color(255, 255, 255));
        loadinglb.setText("Cargando ...");
        jPanel1.add(loadinglb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 20, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Loading.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        Carga cg=new Carga();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cg.setVisible(true);
            }
        });
        
        Principal p= new Principal();
        cg.setVisible(true);
        
        try {
            
            for(int i=0;i<=100;i++){
                Thread.sleep(15);
                cg.LoadingValue.setText(i+"%");
                
                if(i==10){
                    cg.loadinglb.setText("Iniciando Carga...");
                }
                if(i==20){
                    cg.loadinglb.setText("..." );
                }
                if(i==40){
                    cg.loadinglb.setText(" ...." );
                }
                if(i==60){
                    cg.loadinglb.setText("..." );
                }
                if(i==80){
                    cg.loadinglb.setText("..." );
                }
                if(i==90){
                    cg.loadinglb.setText("..." );
                }
                cg.loading.setValue(i);
            }
        }catch(Exception e){
            
        }
        
        new Carga().setVisible(false);
       p.setVisible(true);
        cg.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loading;
    private javax.swing.JLabel loadinglb;
    // End of variables declaration//GEN-END:variables
}
