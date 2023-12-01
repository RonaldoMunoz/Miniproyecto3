package view;

import java.util.ArrayList;

import controller.Controlador;
import model.Partido_p;

public class UpdatePanel extends javax.swing.JPanel implements VistaGeneral {

        public UpdatePanel() {
                initComponents();
                jPNewDatos.setVisible(false);
        }

        private void initComponents() {

                jPanelContainer = new javax.swing.JPanel();
                jPanelUpdate = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanelBuscar = new javax.swing.JPanel();
                jTFUpdate = new javax.swing.JTextField();
                jButtonUpdate = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPNewDatos = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jTFname = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jTFcedula = new javax.swing.JTextField();
                jCheckIzquierda = new javax.swing.JCheckBox();
                jCheckDerecha = new javax.swing.JCheckBox();
                jLabel7 = new javax.swing.JLabel();
                jCBciudad = new javax.swing.JComboBox<>();
                jCBpartido = new javax.swing.JComboBox<>();
                jLabel8 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTApromesas = new javax.swing.JTextArea();
                jButtonAddUpdate = new javax.swing.JButton();

                setBackground(java.awt.Color.lightGray);
                setMaximumSize(new java.awt.Dimension(650, 384));
                setMinimumSize(new java.awt.Dimension(650, 384));
                setPreferredSize(new java.awt.Dimension(650, 384));

                jPanelContainer.setMaximumSize(new java.awt.Dimension(650, 384));
                jPanelContainer.setMinimumSize(new java.awt.Dimension(650, 384));

                jPanelUpdate.setMaximumSize(new java.awt.Dimension(650, 384));
                jPanelUpdate.setMinimumSize(new java.awt.Dimension(650, 384));
                jPanelUpdate.setPreferredSize(new java.awt.Dimension(650, 384));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                                "imageSources/2560x1600-Fondo-de-pantalla-HD-Full-HD-papel-tapiz-de-color-solido-papel-tapiz-de-color-solido.jpg"))); // NOI18N
                jLabel3.setMaximumSize(new java.awt.Dimension(210, 337));
                jLabel3.setMinimumSize(new java.awt.Dimension(210, 337));
                jLabel3.setPreferredSize(new java.awt.Dimension(210, 337));

                jPanelBuscar.setMaximumSize(new java.awt.Dimension(283, 114));
                jPanelBuscar.setMinimumSize(new java.awt.Dimension(283, 114));

                jTFUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jTFUpdate.setMargin(new java.awt.Insets(2, 14, 3, 14));
                jTFUpdate.setMaximumSize(new java.awt.Dimension(5, 20));

                jButtonUpdate.setBackground(java.awt.Color.lightGray);
                jButtonUpdate.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("imageSources/actualizado.png"))); // NOI18N
                jButtonUpdate.setText("Actualizar");
                jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonUpdateActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel1.setText("Actualizacion de datos del candidato");

                jLabel2.setText("Ingrese la cedula del candidato que vas a actualizar:");

                javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
                jPanelBuscar.setLayout(jPanelBuscarLayout);
                jPanelBuscarLayout.setHorizontalGroup(
                                jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelBuscarLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanelBuscarLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jTFUpdate,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                70,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButtonUpdate))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanelBuscarLayout.setVerticalGroup(
                                jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelBuscarLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTFUpdate,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                23, Short.MAX_VALUE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jButtonUpdate)
                                                                .addContainerGap()));

                jPNewDatos.setMaximumSize(new java.awt.Dimension(200, 264));
                jPNewDatos.setMinimumSize(new java.awt.Dimension(200, 264));
                jPNewDatos.setPreferredSize(new java.awt.Dimension(200, 264));

                jLabel4.setText("Actualizando los datos de:");

                jLabel5.setText("Nombre:");

                jTFname.setMaximumSize(new java.awt.Dimension(120, 28));
                jTFname.setMinimumSize(new java.awt.Dimension(120, 28));
                jTFname.setPreferredSize(new java.awt.Dimension(120, 28));

                jLabel6.setText("Cedula:");

                jTFcedula.setMaximumSize(new java.awt.Dimension(120, 22));
                jTFcedula.setMinimumSize(new java.awt.Dimension(120, 22));
                jTFcedula.setPreferredSize(new java.awt.Dimension(120, 22));

                jCheckIzquierda.setText("Izquierda");
                jCheckIzquierda.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckIzquierdaActionPerformed(evt);
                        }
                });

                jCheckDerecha.setText("Derecha");
                jCheckDerecha.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckDerechaActionPerformed(evt);
                        }
                });

                jLabel7.setText("Inclinación Politica:");

                ArrayList<String> listaCiudades = new ArrayList<String>();
                for (model.C_origen ciudades : model.C_origen.values()) {
                        listaCiudades.add(ciudades.displayNameEnum());

                }

                jCBciudad.setModel(new javax.swing.DefaultComboBoxModel<>(listaCiudades.toArray(new String[0])));
                jCBciudad.setMaximumSize(new java.awt.Dimension(72, 22));

                ArrayList<String> listaPartidos = new ArrayList<String>();
                for (model.Partido_p partido : model.Partido_p.values()) {
                        listaPartidos.add(partido.displayNameEnum());

                }

                jCBpartido.setModel(new javax.swing.DefaultComboBoxModel<>(listaPartidos.toArray(new String[0])));
                jCBpartido.setMaximumSize(new java.awt.Dimension(150, 22));
                jCBpartido.setMinimumSize(new java.awt.Dimension(150, 22));
                jCBpartido.setPreferredSize(new java.awt.Dimension(150, 22));

                jLabel8.setText("Promesas:");

                jTApromesas.setColumns(20);
                jTApromesas.setRows(5);
                jScrollPane1.setViewportView(jTApromesas);

                jButtonAddUpdate.setBackground(new java.awt.Color(242, 242, 242));
                jButtonAddUpdate.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("imageSources/actualizado.png"))); // NOI18N
                jButtonAddUpdate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonAddUpdateActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPNewDatosLayout = new javax.swing.GroupLayout(jPNewDatos);
                jPNewDatos.setLayout(jPNewDatosLayout);
                jPNewDatosLayout.setHorizontalGroup(
                                jPNewDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNewDatosLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPNewDatosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                385,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPNewDatosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPNewDatosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPNewDatosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jCheckIzquierda,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jCheckDerecha)
                                                                                                                                .addComponent(jButtonAddUpdate,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addComponent(jLabel7))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPNewDatosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPNewDatosLayout.createSequentialGroup()
                                                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                166,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(44, 44, 44))
                                                                                                                .addGroup(jPNewDatosLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(91, 91, 91)
                                                                                                                                .addComponent(jLabel8))))
                                                                                .addGroup(jPNewDatosLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addGroup(jPNewDatosLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jTFname,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                119,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(85, 85, 85)
                                                                                                                .addComponent(jCBciudad,
                                                                                                                                0,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                jPNewDatosLayout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel6)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jTFcedula,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(52, 52, 52)
                                                                                                                                .addComponent(jCBpartido,
                                                                                                                                                0,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))))
                                                                .addGap(0, 6, Short.MAX_VALUE)));
                jPNewDatosLayout.setVerticalGroup(
                                jPNewDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPNewDatosLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel4)
                                                                .addGap(7, 7, 7)
                                                                .addGroup(jPNewDatosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jTFname,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCBciudad,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jCBpartido,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPNewDatosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jTFcedula,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPNewDatosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPNewDatosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPNewDatosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jLabel7)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jCheckIzquierda)
                                                                                                .addGap(2, 2, 2)
                                                                                                .addComponent(jCheckDerecha)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButtonAddUpdate,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                26,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(25, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanelUpdateLayout = new javax.swing.GroupLayout(jPanelUpdate);
                jPanelUpdate.setLayout(jPanelUpdateLayout);
                jPanelUpdateLayout.setHorizontalGroup(
                                jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                244,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanelUpdateLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanelUpdateLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPNewDatos,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                397,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addComponent(jPanelBuscar,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(2, 2, 2)));
                jPanelUpdateLayout.setVerticalGroup(
                                jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jPanelBuscar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPNewDatos,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                270,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                                .addGroup(jPanelUpdateLayout.createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                386,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
                jPanelContainer.setLayout(jPanelContainerLayout);
                jPanelContainerLayout.setHorizontalGroup(
                                jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanelContainerLayout.setVerticalGroup(
                                jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
        }

        private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) { // Boton para buscar al candidato
                                                                                    // que
                                                                                    // vamos a actualizar
                // Comprobamos si se encuentra el candidato
                if (controlador.buscarCandidato(jTFUpdate.getText()) != null) {
                        jPanelBuscar.setVisible(false);
                        jPNewDatos.setVisible(true);
                        jTFUpdate.setEditable(false);

                } else {
                        return;
                }

        }

        private void jCheckDerechaActionPerformed(java.awt.event.ActionEvent evt) {
                if (jCheckDerecha.isSelected() && jCheckIzquierda.isSelected()) {
                        jCheckIzquierda.setSelected(false);
                }
        }

        private void jCheckIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {
                if (jCheckDerecha.isSelected() && jCheckIzquierda.isSelected()) {
                        jCheckDerecha.setSelected(false);
                }
        }

        private void jButtonAddUpdateActionPerformed(java.awt.event.ActionEvent evt) {
                controlador.updateCandidato(controlador.AccederCandidato(jTFUpdate.getText()), getNombre(), getCedula(),
                                getCiudad(), getPartido(), getInclinacion(), getPromesas());
                jPNewDatos.setVisible(false);
                jPanelBuscar.setVisible(true);
                reiniciarVariables();
        }

        public void reiniciarVariables() {
                jTFname.setText(null);
                jTFcedula.setText(null);
                jTApromesas.setText(null);
                jCheckDerecha.setSelected(false);
                jCheckIzquierda.setSelected(false);
                jTFUpdate.setText(null);
                jTFUpdate.setEditable(true);

        }

        // Variables declaration - do not modify
        // Variables declaration - do not modify
        private javax.swing.JButton jButtonAddUpdate;
        private javax.swing.JButton jButtonUpdate;
        private javax.swing.JComboBox<String> jCBciudad;
        private javax.swing.JComboBox<String> jCBpartido;
        private javax.swing.JCheckBox jCheckDerecha;
        private javax.swing.JCheckBox jCheckIzquierda;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPNewDatos;
        private javax.swing.JPanel jPanelBuscar;
        private javax.swing.JPanel jPanelContainer;
        private javax.swing.JPanel jPanelUpdate;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea jTApromesas;
        private javax.swing.JTextField jTFUpdate;
        private javax.swing.JTextField jTFcedula;
        private javax.swing.JTextField jTFname;
        Controlador controlador = new Controlador();

        @Override
        public String getNombre() {
                return this.jTFname.getText();
        }

        @Override
        public String getCedula() {
                return this.jTFcedula.getText();
        }

        @Override
        public String getCiudad() {
                return ((String) this.jCBciudad.getSelectedItem()).replace(" ", "_");
        }

        @Override
        public String getPartido() {
                return ((String) this.jCBpartido.getSelectedItem()).replace(" ", "_");
        }

        @Override
        public ArrayList<String> getPromesas() {
                ArrayList<String> prom = new ArrayList<>();
                prom.add(this.jTApromesas.getText());
                return prom;
        }

        @Override
        public String getInclinacion() {
                if (jCheckDerecha.isSelected()) {
                        return "DERECHA";
                } else if (jCheckIzquierda.isSelected()) {
                        return "IZQUIERDA";
                } else {
                        return null;
                }
        }
}