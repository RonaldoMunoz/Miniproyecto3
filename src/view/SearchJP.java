package view;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import controller.Controlador;
import model.Candidato;

public class SearchJP extends javax.swing.JPanel {

    public SearchJP() {
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(643, 377));
        setMinimumSize(new java.awt.Dimension(643, 377));
        setPreferredSize(new java.awt.Dimension(643, 377));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "imageSources/2560x1600-Fondo-de-pantalla-HD-Full-HD-papel-tapiz-de-color-solido-papel-tapiz-de-color-solido.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Candidato.");

        jLabel3.setText("Digite la cedula del candidato:");

        jTextFBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFBuscarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(java.awt.Color.lightGray);
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/buscar.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 298, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFBuscarActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFBuscarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtener el texto ingresado en el campo de búsqueda
        String cedulaABuscar = jTextFBuscar.getText();

        // Llamar al controlador para buscar el candidato
        Candidato candidatoEncontrado = controlador.buscarCandidato(cedulaABuscar);

        if (candidatoEncontrado != null) {
            // Si se encuentra el candidato, actualizar la interfaz con sus datos
            JTextArea showInfoCandidato = new JTextArea();
            showInfoCandidato.setEditable(false);
            showInfoCandidato.append("Candidato encontrado:\n");
            showInfoCandidato.append(candidatoEncontrado.listarDatos()); // Mostrar los datos del candidato

            // Mostrar los datos del candidato en una ventana emergente (JOptionPane)
            JOptionPane.showMessageDialog(this, showInfoCandidato, "Información del Candidato",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si no se encuentra el candidato, mostrar un mensaje indicando que no se encontró
            JOptionPane.showMessageDialog(this, "Candidato no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFBuscar;
    private Controlador controlador = new Controlador();
    // End of variables declaration//GEN-END:variables
}
