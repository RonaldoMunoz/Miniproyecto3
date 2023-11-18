package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class JpaneVotacion extends javax.swing.JPanel {

    /**
     * Creates new form JpaneVotacion
     */
    public JpaneVotacion() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelVotosName = new javax.swing.JLabel();
        jTextFVotos = new javax.swing.JTextField();
        jButtonVotosAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(643, 337));
        setMinimumSize(new java.awt.Dimension(643, 337));
        setPreferredSize(new java.awt.Dimension(643, 337));

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setMaximumSize(new java.awt.Dimension(643, 337));
        jPanel2.setMinimumSize(new java.awt.Dimension(643, 337));
        jPanel2.setPreferredSize(new java.awt.Dimension(643, 337));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Votacion");


        jLabelVotosName.setText("Digite la cantidad de votos de: "+ AddjPanel.candidatos.get(index).getNombre());


        jTextFVotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFVotosActionPerformed(evt);
            }
        });

        jButtonVotosAdd.setBackground(java.awt.Color.lightGray);
        jButtonVotosAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("garrapata.png"))); // NOI18N
        jButtonVotosAdd.setText("Listo");
        jButtonVotosAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVotosAddActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "2560x1600-Fondo-de-pantalla-HD-Full-HD-papel-tapiz-de-color-solido-papel-tapiz-de-color-solido.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(210, 337));
        jLabel3.setMinimumSize(new java.awt.Dimension(210, 337));
        jLabel3.setPreferredSize(new java.awt.Dimension(210, 337));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jButtonVotosAdd)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFVotos,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelVotosName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                367,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(78, Short.MAX_VALUE)))))));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelVotosName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonVotosAdd)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 343,
                                                Short.MAX_VALUE))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFVotosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFVotosActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFVotosActionPerformed

private void jButtonVotosAddActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        if (jTextFVotos.getText().equals(null)) {

            JOptionPane.showMessageDialog(jPanel2,"Debes ingresar los votos de: " + AddjPanel.candidatos.get(index).getNombre());

            return;
        }

        int voto = Integer.parseInt(jTextFVotos.getText());
        AddjPanel.candidatos.get(index).setN_votos(voto);

        // Se le aumenta el índice para pasar al siguiente candidato
        jTextFVotos.setText(null);
        index += 1;

        if (index<AddjPanel.candidatos.size()) {
            jLabelVotosName.setText("Digite la cantidad de votos de: " + AddjPanel.candidatos.get(index).getNombre());
        }
        
        else { JOptionPane.showMessageDialog(jPanel2,"Haz ingresado correctamente los votos de los candidatos.");
            Resultados.jPanelContent.removeAll();
            Ganador ganador = new Ganador(AddjPanel.candidatos.toArray(new Candidato[0]));
            ganador.setSize(643, 337);
            Resultados.jPanelContent.add(ganador);
            ganador.setLocation(0,0);
            Resultados.jPanelContent.revalidate();
            Resultados.jPanelContent.repaint();
                return;
            }
        
       

        } catch(NumberFormatException ex){
            jTextFVotos.setText(null);
            JOptionPane.showMessageDialog(jPanel2,"Debes agregar un numero");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVotosAdd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelVotosName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFVotos;
    static int index = 0;
    
    // End of variables declaration//GEN-END:variables
}
