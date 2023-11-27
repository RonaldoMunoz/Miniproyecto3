package view;



import controller.Controlador;

public class ShowCandidatos extends javax.swing.JPanel {

    /**
     * Creates new form ShowCandidatos
     */
    public ShowCandidatos() {
        initComponents();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jShowCandidatos = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(643, 377));
        setMinimumSize(new java.awt.Dimension(643, 377));
        setPreferredSize(new java.awt.Dimension(643, 377));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/2560x1600-Fondo-de-pantalla-HD-Full-HD-papel-tapiz-de-color-solido-papel-tapiz-de-color-solido.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(210, 377));
        jLabel1.setMinimumSize(new java.awt.Dimension(210, 377));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
    
        StringBuilder datos = controlador.mostrarCandidatos();
    
        jTextArea1.setText(datos.toString());
        jTextArea1.setEditable(false); // Hacer que el TextArea sea o no editable
    
        jShowCandidatos.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Candidatos Inscritos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jShowCandidatos)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jShowCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );


    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jShowCandidatos;
    private javax.swing.JTextArea jTextArea1;
    private Controlador controlador = new Controlador(); 
    // End of variables declaration//GEN-END:variables
}
