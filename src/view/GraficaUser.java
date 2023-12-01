package view;

public class GraficaUser extends javax.swing.JFrame {
    
    /**
     * Creates new form GraficaUser
     */
    public GraficaUser() {
        initComponents();
        //candidatos = new ArrayList<Candidato>();
        AddjPanel addCandidato = new AddjPanel();
        addCandidato.setSize(643,377);
        addCandidato.setLocation(0,0);
        content.removeAll();
        content.add(addCandidato);
        content.revalidate();
        content.repaint();
    }


    private void initComponents() {

        content = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuAdd = new javax.swing.JMenu();
        jMenuItemAdd = new javax.swing.JMenuItem();
        jMenuItemBuscar = new javax.swing.JMenuItem();
        jMenuItemDelete = new javax.swing.JMenuItem();
        jMitemBuscar = new javax.swing.JMenuItem();
        jMenuShow = new javax.swing.JMenu();
        jMitemShow = new javax.swing.JMenuItem();
        jMenuContinuar = new javax.swing.JMenu();
        jMitemContinuar = new javax.swing.JMenuItem();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(115, 125, 188));
        setMinimumSize(new java.awt.Dimension(640, 410));
        setResizable(false);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMaximumSize(new java.awt.Dimension(650, 384));
        content.setMinimumSize(new java.awt.Dimension(650, 384));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));

        jMenuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/candidato.png"))); // NOI18N
        jMenuAdd.setText("Candidatos");

        jMenuItemAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/agregar.png"))); // NOI18N
        jMenuItemAdd.setText("Agregar candidato");
        jMenuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddActionPerformed(evt);
            }
        });
        jMenuAdd.add(jMenuItemAdd);

        jMenuItemBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/buscar.png"))); // NOI18N
        jMenuItemBuscar.setText("Buscar candidato");
        jMenuItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarActionPerformed(evt);
            }
        });
        jMenuAdd.add(jMenuItemBuscar);
        
        jMenuItemDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/borrar.png"))); // NOI18N
        jMenuItemDelete.setText("Eliminar candidato");
        jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteActionPerformed(evt);
            }
        });
        jMenuAdd.add(jMenuItemDelete);

        jMitemBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/actualizado.png"))); // NOI18N
        jMitemBuscar.setText("Actualizar candidato");
        jMitemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMitemBuscarActionPerformed(evt);
            }
        });
        jMenuAdd.add(jMitemBuscar);

        jMenuBar2.add(jMenuAdd);

        jMenuShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/ver.png"))); // NOI18N
        jMenuShow.setText("Ver");
        jMenuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuShowActionPerformed(evt);
            }
        });

        jMitemShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/ver.png"))); // NOI18N
        jMitemShow.setText("Mostrar candidatos");
        jMitemShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMitemShowActionPerformed(evt);
            }
        });
        jMenuShow.add(jMitemShow);

        jMenuBar2.add(jMenuShow);

        jMenuContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/garrapata.png"))); // NOI18N
        jMenuContinuar.setText("Continuar");
        jMenuContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuContinuarActionPerformed(evt);
            }
        });

        jMitemContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/resultado.png"))); // NOI18N
        jMitemContinuar.setText("Realizar Votacion");
        jMitemContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMitemContinuarActionPerformed(evt);
            }
        });
        jMenuContinuar.add(jMitemContinuar);

        jMenuBar2.add(jMenuContinuar);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cerrarVentana() {
        dispose();
    }

    private void jMenuShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuShowActionPerformed
        ShowCandidatos show = new ShowCandidatos();
        show.setSize(643,377);
        show.setLocation(0,0);
        content.removeAll();
        content.add(show);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jMenuShowActionPerformed

    private void jMenuContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuContinuarActionPerformed
        // Resultados frame parte
        
    }//GEN-LAST:event_jMenuContinuarActionPerformed

    private void jMenuItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddActionPerformed
        AddjPanel addCandidato = new AddjPanel();
        addCandidato.setSize(643,377);
        addCandidato.setLocation(0,0);
        content.removeAll();
        content.add(addCandidato);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jMenuItemAddActionPerformed

    private void jMenuItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarActionPerformed
        SearchJP search = new SearchJP();
        search.setSize(643,377);
        search.setLocation(0,0);
        content.removeAll();
        content.add(search);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jMenuItemBuscarActionPerformed

    private void jMenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteActionPerformed
        DeletePanel delete = new DeletePanel();
        delete.setSize(643,377);
        delete.setLocation(0,0);
        content.removeAll();
        content.add(delete);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jMenuItemDeleteActionPerformed

    private void jMitemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMitemBuscarActionPerformed
        UpdatePanel update = new UpdatePanel();
        update.setSize(643, 377);
        update.setLocation(0,0);
        content.removeAll();
        content.add(update);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jMitemBuscarActionPerformed

    private void jMitemShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMitemShowActionPerformed
        ShowCandidatos show = new ShowCandidatos();
        show.setSize(650, 384);
        show.setLocation(0,0);
        content.removeAll();
        content.add(show);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jMitemShowActionPerformed

    private void jMitemContinuarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        resultado.setLocationRelativeTo(null);
        resultado.setVisible(true);
        Resultados.jPanelContent.removeAll();
        JpaneVotacion votacion = new JpaneVotacion();
        votacion.setSize(643, 337);
        Resultados.jPanelContent.add(votacion);
        votacion.setLocation(0,0);
        Resultados.jPanelContent.revalidate();
        Resultados.jPanelContent.repaint();

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JMenu jMenuAdd;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuContinuar;
    private javax.swing.JMenuItem jMenuItemAdd;
    private javax.swing.JMenuItem jMenuItemBuscar;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenu jMenuShow;
    private javax.swing.JMenuItem jMitemBuscar;
    private javax.swing.JMenuItem jMitemContinuar;
    private javax.swing.JMenuItem jMitemShow;
    static boolean exit = false;
    static GraficaUser userInterface = new GraficaUser();
    public static Resultados resultado = new Resultados();
    //static ArrayList<Candidato> candidatos;

    // End of variables declaration//GEN-END:variables
    
}
