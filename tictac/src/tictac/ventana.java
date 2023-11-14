
package tictac;
import javax.swing.JOptionPane;

public class ventana extends javax.swing.JFrame {
    boolean turno = true;
    private int [] [] matriz1  = new int[3][3];
    private int [] [] matriz2 = new int[3][3];
    private int [] [] matriz3 = new int[3][3];
    private int [] [] matriz4 = new int[3][3];
    private int [] [] matriz5 = new int[3][3];
    private int [] [] matriz6 = new int[3][3];
    private int [] [] matriz7 = new int[3][3];
    private int [] [] matriz8 = new int[3][3];
    private int [] [] matriz9 = new int[3][3];

    
    
    
    public ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boto1 = new javax.swing.JButton();
        boto2 = new javax.swing.JButton();
        boto3 = new javax.swing.JButton();
        boto4 = new javax.swing.JButton();
        boto5 = new javax.swing.JButton();
        boto6 = new javax.swing.JButton();
        boto7 = new javax.swing.JButton();
        boto8 = new javax.swing.JButton();
        boto9 = new javax.swing.JButton();
        botoreinicio = new javax.swing.JButton();
        botosalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(125, 187, 216));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        boto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto1ActionPerformed(evt);
            }
        });

        boto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto2ActionPerformed(evt);
            }
        });

        boto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto3ActionPerformed(evt);
            }
        });

        boto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto4ActionPerformed(evt);
            }
        });

        boto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto5ActionPerformed(evt);
            }
        });

        boto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto6ActionPerformed(evt);
            }
        });

        boto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto7ActionPerformed(evt);
            }
        });

        boto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto8ActionPerformed(evt);
            }
        });

        boto9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto9ActionPerformed(evt);
            }
        });

        botoreinicio.setText("Reinicio");
        botoreinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoreinicioActionPerformed(evt);
            }
        });

        botosalir.setText("Salir");
        botosalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botosalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(botoreinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botosalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boto7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boto8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boto9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boto4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boto1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boto1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boto2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boto3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boto4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boto5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boto6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boto7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boto8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boto9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoreinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botosalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botosalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botosalirActionPerformed
        //Creacion ventana emergente con JOptionPane
        int opcion = JOptionPane.showConfirmDialog(this, "¿Cerrar el juego?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_botosalirActionPerformed

    private void boto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto1ActionPerformed
        String valor;
        if(matriz1[0][0] == 0){
            if (turno==true){matriz1[0][0] = 1;} else{matriz1[0][0] = 2;}
            if(matriz1[1][0] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto1.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto1ActionPerformed

    private void boto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto2ActionPerformed
        String valor;
        if(matriz1[1][0] == 0){
            if (turno==true){matriz1[1][0] = 1;} else{matriz1[1][0] = 2;}
            if(matriz1[1][0] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto2.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto2ActionPerformed

    private void boto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto3ActionPerformed
        String valor;
        if(matriz1[2][0] == 0){
            if (turno==true){matriz1[2][0] = 1;} else{matriz1[2][0] = 2;}
            if(matriz1[2][0] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto3.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto3ActionPerformed

    private void boto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto4ActionPerformed
        String valor;
        if(matriz1[0][1] == 0){
            if (turno==true){matriz1[0][1] = 1;} else{matriz1[0][1] = 2;}
            if(matriz1[0][1] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto4.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto4ActionPerformed

    private void boto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto5ActionPerformed
        String valor;
        if(matriz1[1][1] == 0){
            if (turno==true){matriz1[1][1] = 1;} else{matriz1[1][1] = 2;}
            if(matriz1[1][1] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto5.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto5ActionPerformed

    private void boto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto6ActionPerformed
        String valor;
        if(matriz1[2][1] == 0){
            if (turno==true){matriz1[2][1] = 1;} else{matriz1[2][1] = 2;}
            if(matriz1[2][1] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto6.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto6ActionPerformed

    private void boto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto7ActionPerformed
        String valor;
        if(matriz1[0][2] == 0){
            if (turno==true){matriz1[0][2] = 1;} else{matriz1[0][2] = 2;}
            if(matriz1[0][2] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto7.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto7ActionPerformed

    private void boto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto8ActionPerformed
        String valor;
        if(matriz1[1][2] == 0){
            if (turno==true){matriz1[1][2] = 1;} else{matriz1[1][2] = 2;}
            if(matriz1[1][2] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto8.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto8ActionPerformed

    private void boto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto9ActionPerformed
        String valor;
        if(matriz1[2][2] == 0){
            if (turno==true){matriz1[2][2] = 1;} else{matriz1[2][2] = 2;}
            if(matriz1[2][2] == 1){valor = "X";} else {valor = "O";}
            valor = (turno) ? "X" : "O";
            boto9.setText(valor);
            turno = !turno;}
    }//GEN-LAST:event_boto9ActionPerformed

    private void botoreinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoreinicioActionPerformed
    for (int i = 0; i < matriz1.length; i++) {
        for (int j = 0; j < matriz1[i].length; j++) {
            matriz1[i][j] = 0;
        }}
    boto1.setText("");
    boto2.setText("");
    boto3.setText("");
    boto4.setText("");
    boto5.setText("");
    boto6.setText("");
    boto7.setText("");
    boto8.setText("");
    boto9.setText("");
    }//GEN-LAST:event_botoreinicioActionPerformed
         

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boto1;
    private javax.swing.JButton boto2;
    private javax.swing.JButton boto3;
    private javax.swing.JButton boto4;
    private javax.swing.JButton boto5;
    private javax.swing.JButton boto6;
    private javax.swing.JButton boto7;
    private javax.swing.JButton boto8;
    private javax.swing.JButton boto9;
    private javax.swing.JButton botoreinicio;
    private javax.swing.JButton botosalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
