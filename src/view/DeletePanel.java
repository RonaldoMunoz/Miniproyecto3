package view;

import java.awt.event.ActionEvent;
import controller.Controlador;





public class DeletePanel extends javax.swing.JPanel {


    Controlador controlador = new Controlador();

    public DeletePanel() {
        initComponents();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFDelete = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(643, 337));
        setMinimumSize(new java.awt.Dimension(643, 337));
        setPreferredSize(new java.awt.Dimension(643, 377));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Eliminacion del candidato");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Digite la cedula del candidato:");

        jButtonDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/borrar.png"))); // NOI18N
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "imageSources/2560x1600-Fondo-de-pantalla-HD-Full-HD-papel-tapiz-de-color-solido-papel-tapiz-de-color-solido.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(210, 337));
        jLabel3.setMinimumSize(new java.awt.Dimension(210, 337));
        jLabel3.setPreferredSize(new java.awt.Dimension(210, 337));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(285, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFDelete, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE));
    }

    private void jButtonDeleteActionPerformed(ActionEvent evt) {
        controlador.deleteCandidato(jTextFDelete.getText());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFDelete;
    // End of variables declaration//GEN-END:variables
}
