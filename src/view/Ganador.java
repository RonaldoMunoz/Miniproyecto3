package view;
import javax.swing.*;

import controller.Controlador;


public class Ganador extends JPanel {

    private JLabel jLabelNameWinner;
    private JLabel jLabelPartidos;
    private JLabel jLabel2;
    private JList<String> jList1;
    private JScrollPane jScrollPane1;
    private JLabel jLabel3;
    private Controlador controlador = new Controlador();
    private JButton jButtonVerPropuestas;
    private JLabel jLabelPartidoConMasCandidatos;

    public Ganador() {
        initComponents();
 
    }

    private void initComponents() {
        jLabelNameWinner = new javax.swing.JLabel();
        jLabelPartidos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(643, 337));
        setMinimumSize(new java.awt.Dimension(643, 337));
        setPreferredSize(new java.awt.Dimension(643, 337));

        jLabelNameWinner.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelNameWinner.setText("El ganador de las elecciones es: " + controlador.getGanador().getNombre() + " CC: "+controlador.getGanador().getCedula());

        jLabelPartidos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelPartidos.setText("Partido con más candidatos: " + controlador.getPartidoMasCandidatos());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Top 3 ciudades con menos candidatos inscritos:");

        jList1.setBackground(new java.awt.Color(242, 242, 242));
        jList1.setBorder(null);
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList1.setModel(controlador.getTopciudades());
        jScrollPane1.setViewportView(jList1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/2560x1600-Fondo-de-pantalla-HD-Full-HD-papel-tapiz-de-color-solido-papel-tapiz-de-color-solido.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(210, 337));
        jLabel3.setMinimumSize(new java.awt.Dimension(210, 337));
        jLabel3.setPreferredSize(new java.awt.Dimension(210, 337));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNameWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelNameWinner)
                .addGap(18, 18, 18)
                .addComponent(jLabelPartidos)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
}
