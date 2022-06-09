/* 
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2022
 * Fecha de Actualización: 09/06/2022
 * Descripción: Programa que traduce palabras de Español a Inglés  y viceversa , 
 * 	también ofrece opciones de crear una nueva traducción y también eliminar   
 * 
 * */
package view;

/*----------------------------------------------------------------------------------*/

import java.util.HashMap;
import javax.swing.JOptionPane;
import traductor.controller.DiccionarioEaIcontroller;
import traductor.controller.DiccionarioINaEScontroller;
import traductor.model.DiccionarioEaImodel;
import traductor.model.DiccionarioINaESmodel;
import traductor.pojo.Palabra;

/*----------------------------------------------------------------------------------*/

public class DiseñoTraductorView extends javax.swing.JFrame {

    /*------------------------------------------------------------------------------*/
    
    private DiccionarioINaESmodel dicModel2 = new DiccionarioINaESmodel();
    private DiccionarioEaImodel dicModel = new DiccionarioEaImodel();
    private HashMap<String, String> palabraESaIN = new HashMap<String, String>();
    private HashMap<String, String> palabraINaES = new HashMap<String, String>();
    private static DiccionarioEaIcontroller model = new DiccionarioEaIcontroller();
    private static DiccionarioINaEScontroller model1 = new DiccionarioINaEScontroller();
    private static Palabra palabra = new Palabra();
    private String traducion1 = "";

    /*-------------------------------------------------------------------------------*/
    public DiseñoTraductorView() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        palabraESaIN = dicModel.CrearESaIN(palabraESaIN);
        palabraINaES = dicModel2.CrearINaES(palabraINaES);
    }

    // Eliminar los espacios que el usuario agrega de más
    public String borrarEspacios(String cadena) {
        while ((cadena.substring(cadena.length() - 1)).equals(" ")) {
            cadena = cadena.substring(0, cadena.length() - 1);
        }
        return cadena;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DiseñojPanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaENTRADA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSALIDA = new javax.swing.JTextArea();
        ButtonTraducir = new javax.swing.JButton();
        ButtonActualizar = new javax.swing.JButton();
        ButtonEscuchar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        ButtonAñadir = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonINTERCAMBIO = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        DiseñojPanel.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inglés", "Español" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextAreaENTRADA.setColumns(20);
        jTextAreaENTRADA.setLineWrap(true);
        jTextAreaENTRADA.setRows(5);
        jTextAreaENTRADA.setWrapStyleWord(true);
        jTextAreaENTRADA.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextAreaENTRADAAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTextAreaENTRADA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextAreaENTRADAMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaENTRADA);

        jTextAreaSALIDA.setColumns(20);
        jTextAreaSALIDA.setLineWrap(true);
        jTextAreaSALIDA.setRows(5);
        jTextAreaSALIDA.setWrapStyleWord(true);
        jTextAreaSALIDA.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextAreaSALIDAAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextAreaSALIDA);

        ButtonTraducir.setText("Traducir");
        ButtonTraducir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTraducirActionPerformed(evt);
            }
        });

        ButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/actualizar.png"))); // NOI18N
        ButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonActualizar.setMaximumSize(new java.awt.Dimension(43, 43));
        ButtonActualizar.setMinimumSize(new java.awt.Dimension(40, 40));
        ButtonActualizar.setPreferredSize(new java.awt.Dimension(43, 43));
        ButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarActionPerformed(evt);
            }
        });

        ButtonEscuchar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/megafono.png"))); // NOI18N
        ButtonEscuchar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/basura.png"))); // NOI18N
        ButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        ButtonAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/agregar-boton.png"))); // NOI18N
        ButtonAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAñadirActionPerformed(evt);
            }
        });

        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/editar.png"))); // NOI18N
        ButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonINTERCAMBIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/intercambiando-flechas (1).png"))); // NOI18N
        ButtonINTERCAMBIO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonINTERCAMBIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonINTERCAMBIOActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo_white.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        ButtonSalir.setBackground(new java.awt.Color(255, 51, 51));
        ButtonSalir.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 15)); // NOI18N
        ButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cerrar (1).png"))); // NOI18N
        ButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout DiseñojPanelLayout = new javax.swing.GroupLayout(DiseñojPanel);
        DiseñojPanel.setLayout(DiseñojPanelLayout);
        DiseñojPanelLayout.setHorizontalGroup(
            DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiseñojPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiseñojPanelLayout.createSequentialGroup()
                        .addComponent(ButtonEscuchar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAñadir)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEliminar))
                    .addGroup(DiseñojPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DiseñojPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(ButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DiseñojPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ButtonTraducir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DiseñojPanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonINTERCAMBIO)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiseñojPanelLayout.setVerticalGroup(
            DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiseñojPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonINTERCAMBIO)
                    .addGroup(DiseñojPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DiseñojPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(DiseñojPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(ButtonTraducir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DiseñojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ButtonEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButtonAñadir, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButtonEscuchar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(ButtonEditar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DiseñojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DiseñojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Intercambios de Inglés a Español y vicieversa
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        traducion1 = (String) jComboBox2.getSelectedItem();
        if (traducion1.equals("Inglés")) {
            jComboBox1.setSelectedItem((Object) "Español");
        } else {
            jComboBox1.setSelectedItem((Object) "Inglés");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    // Cerrar ventana con boton 
    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    //Aquí se realiza la acción de Traducir
    private void ButtonTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTraducirActionPerformed
        String entradaE = jTextAreaENTRADA.getText().toLowerCase();
        String entradaI = jTextAreaENTRADA.getText().toLowerCase();
        entradaE = borrarEspacios(entradaE);
        entradaI = borrarEspacios(entradaI);

        if (palabraESaIN.containsKey(entradaE)) {
            jTextAreaSALIDA.append("" + palabraESaIN.get(entradaE));
        } else if (palabraINaES.containsKey(entradaI)) {
            jTextAreaSALIDA.append("" + palabraINaES.get(entradaI));
        } else {
            jTextAreaSALIDA.append("Palabra no reconocida");
        }

        ButtonTraducir.setEnabled(false);
    }//GEN-LAST:event_ButtonTraducirActionPerformed

    // Agregar Nueva Traduccion
    private void ButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAñadirActionPerformed
        palabra.setEspaniol(JOptionPane.showInputDialog("Escriba la Palabra en Español"));
        palabra.setIngles(JOptionPane.showInputDialog("Escriba la Palabra en Ingles"));

        if (model.ESaIN(palabraESaIN, palabra.getEspaniol()) == null) {
            model.AgregarESaIN(palabraESaIN, palabra);
            model1.AgregarINaES(palabraINaES, palabra);
        } else {
            JOptionPane.showMessageDialog(null, "La palabra que está tratando de ingresar ya existe");
        }
    }//GEN-LAST:event_ButtonAñadirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        traducion1 = (String) jComboBox1.getSelectedItem();
        if (traducion1.equals("Español")) {
            jComboBox2.setSelectedItem((Object) "Inglés");
        } else {
            jComboBox2.setSelectedItem((Object) "Español");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Intercambio de Items
    private void ButtonINTERCAMBIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonINTERCAMBIOActionPerformed
        String J1 = (String) jComboBox1.getSelectedItem();
        String J2 = (String) jComboBox2.getSelectedItem();
        jComboBox2.setSelectedItem((Object) J1);
        jComboBox1.setSelectedItem((Object) J2);

        //INTERCAMBIO DE TEXTOS
        String obtenerE = jTextAreaENTRADA.getText();
        String obtenerS = jTextAreaSALIDA.getText();
        jTextAreaENTRADA.setText(obtenerS);
        jTextAreaSALIDA.setText(obtenerE);
    }//GEN-LAST:event_ButtonINTERCAMBIOActionPerformed

    // Estableciendo Texto por defecto
    private void jTextAreaENTRADAAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextAreaENTRADAAncestorAdded
        jTextAreaENTRADA.setText("Escriba Aquí...");
    }//GEN-LAST:event_jTextAreaENTRADAAncestorAdded

    //  
    private void jTextAreaSALIDAAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextAreaSALIDAAncestorAdded
        
    }//GEN-LAST:event_jTextAreaSALIDAAncestorAdded

    // Limpiar el Área de Texto
    private void ButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarActionPerformed
        jTextAreaENTRADA.setText("");
        jTextAreaSALIDA.setText("");
        ButtonTraducir.setEnabled(true);
    }//GEN-LAST:event_ButtonActualizarActionPerformed

    // Efecto MousePressed para poner un texto por defecto y eliminarlo
    private void jTextAreaENTRADAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaENTRADAMousePressed
        if (jTextAreaENTRADA.getText().equals("Escriba Aquí...")) {
            jTextAreaENTRADA.setText("");
        }
    }//GEN-LAST:event_jTextAreaENTRADAMousePressed

    // Eliminar palabras
    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        String entradaE = jTextAreaENTRADA.getText();
        String Eliminar_Palabra = JOptionPane.showInputDialog("Ingrese una palabra para Eliminar");

        palabraINaES.remove(palabraESaIN.get(Eliminar_Palabra));
        palabraESaIN.remove(Eliminar_Palabra);
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(DiseñoTraductorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseñoTraductorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseñoTraductorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseñoTraductorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseñoTraductorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizar;
    private javax.swing.JButton ButtonAñadir;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonEscuchar;
    private javax.swing.JButton ButtonINTERCAMBIO;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonTraducir;
    private javax.swing.JPanel DiseñojPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaENTRADA;
    private javax.swing.JTextArea jTextAreaSALIDA;
    // End of variables declaration//GEN-END:variables
}
