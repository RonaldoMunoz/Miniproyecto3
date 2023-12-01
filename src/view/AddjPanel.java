package view;

import java.util.ArrayList;
import javax.swing.JComboBox;
import controller.Controlador;

public class AddjPanel extends javax.swing.JPanel implements VistaGeneral{

    
    public AddjPanel() {
        initComponents();
        

    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFcedula = new javax.swing.JTextField();
        jComboBoxCity = new JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxDerecha = new javax.swing.JCheckBox();
        jCheckBoxIzquierda = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPartido = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFpromesas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(187, 187, 187));
        setMaximumSize(new java.awt.Dimension(643, 377));
        setMinimumSize(new java.awt.Dimension(643, 377));
        setPreferredSize(new java.awt.Dimension(643, 377));

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));
        jPanel1.setMaximumSize(new java.awt.Dimension(643, 337));
        jPanel1.setMinimumSize(new java.awt.Dimension(643, 337));
        jPanel1.setPreferredSize(new java.awt.Dimension(643, 337));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cedula:");


        ArrayList<String> listaCiudades = new ArrayList<String>();
        for (model.C_origen ciudades : model.C_origen.values() ) {
            listaCiudades.add(ciudades.displayNameEnum());
            
        }
        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(listaCiudades.toArray(new String[0])));

        jLabel3.setText("Ciudad de origen:");

        jCheckBoxDerecha.setText("Derecha");
        jCheckBoxDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDerechaActionPerformed(evt);
            }
        });

        jCheckBoxIzquierda.setText("Izquierda");
        jCheckBoxIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxIzquierdaActionPerformed(evt);
            }
        });

        jLabel4.setText("Ideologia:");

        ArrayList<String> listaPartidos = new ArrayList<String>();
        for (model.Partido_p partido : model.Partido_p.values() ) {
            listaPartidos.add(partido.displayNameEnum());
            
        }

        jComboBoxPartido.setModel(new javax.swing.DefaultComboBoxModel<>(listaPartidos.toArray(new String[0])));

        jLabel5.setText("Partido Politico:");



        jLabel6.setText("Promesas:");

        jButtonAdd.setBackground(new java.awt.Color(187, 187, 187));
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("imageSources/agregar-archivo.png"))); // NOI18N
        jButtonAdd.setText("Agregar");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jCheckBoxIzquierda)
                                .addComponent(jButtonAdd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFpromesas, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxDerecha)
                                .addGap(209, 209, 209)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDerecha)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFpromesas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxIzquierda)
                        .addGap(42, 42, 42)
                        .addComponent(jButtonAdd)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents



    private void jCheckBoxDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDerechaActionPerformed
        if(jCheckBoxDerecha.isSelected() && jCheckBoxIzquierda.isSelected()){
            jCheckBoxIzquierda.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxDerechaActionPerformed

    private void jCheckBoxIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxIzquierdaActionPerformed
        if(jCheckBoxDerecha.isSelected() && jCheckBoxIzquierda.isSelected()){
            jCheckBoxDerecha.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxIzquierdaActionPerformed



    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
        
        controlador.addCandidato(getNombre(),getCedula(),getPartido(),getCiudad(),getPromesas(),getInclinacion());
        reiniciarVariables();
    }

        @Override
    public String getNombre() {
        
        return this.jTextfNombre.getText(); 
    }

    @Override
    public String getCedula() {
        
        return this.jTextFcedula.getText();
    }

    @Override
    public String getCiudad() {
        
        return ((String) this.jComboBoxCity.getSelectedItem()).replace(" ", "_");
        
    }

    @Override
    public String getPartido() {
        return ((String) this.jComboBoxPartido.getSelectedItem()).replace(" ", "_");
    }

    @Override
    public ArrayList <String> getPromesas() {
        ArrayList <String> prom = new ArrayList<>() ;
        prom.add(this.jTextFpromesas.getText());
       return prom;
    }


    
    @Override
    public String getInclinacion(){
        if(jCheckBoxDerecha.isSelected()){
        return "DERECHA";}
        else if (jCheckBoxIzquierda.isSelected()){
            return "IZQUIERDA";
        }
        else {return null;}
    }
    
    public void reiniciarVariables(){
        jTextFcedula.setText(null);
        jTextFpromesas.setText(null);
        jTextfNombre.setText(null);
        if(jCheckBoxDerecha.isSelected()){
            jCheckBoxDerecha.setSelected(false);
        }
        else if(jCheckBoxIzquierda.isSelected()){
            jCheckBoxDerecha.setSelected(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JCheckBox jCheckBoxDerecha;
    private javax.swing.JCheckBox jCheckBoxIzquierda;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFcedula;
    private javax.swing.JTextField  jTextFpromesas;
    private javax.swing.JTextField  jTextfNombre;
    private Controlador controlador = new Controlador();



}
