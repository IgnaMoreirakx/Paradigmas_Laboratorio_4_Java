/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import javax.swing.JOptionPane;


/**
 *
 * @author ignac
 */
public class Playing extends javax.swing.JFrame {

    /**
     *
     * Creates new form Playing
     */
    public Playing() {
        
        initComponents();
        Salir.setVisible(false);
        Mostrartuno.setText("Le corresponde jugar a " + CrearGame.game.dequieneselturno());
        mostrarcartas.setText("Las cartas sobre el área son: \n" + CrearGame.a1.areat_string());
        
        Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
        Estado.setEditable(false);
        mostrarcartas.setEditable(false);
        if((CrearMazo.mazo.getcartas().size() == 1 || CrearMazo.mazo.getcartas().isEmpty()) && CrearGame.a1.getArea().isEmpty()){
            CrearGame.game.finish();
            CrearGame.a1.getArea().clear();
            Mostrartuno.setText("Partida terminada!!!");
            Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
            JOptionPane.showMessageDialog(null, "El Ganador es: \n" + CrearGame.game.ganador());
           Spoit.setVisible(false);
           Pass.setVisible(false);
           Finish.setVisible(false);
           Salir.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Estado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarcartas = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        Mostrartuno = new javax.swing.JLabel();
        Spoit = new javax.swing.JButton();
        Pass = new javax.swing.JButton();
        Finish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 241, 187));

        jPanel1.setBackground(new java.awt.Color(155, 193, 188));

        Estado.setEditable(false);
        Estado.setBackground(new java.awt.Color(137, 221, 240));
        Estado.setColumns(20);
        Estado.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Estado.setLineWrap(true);
        Estado.setRows(5);
        Estado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(Estado);

        mostrarcartas.setBackground(new java.awt.Color(137, 221, 240));
        mostrarcartas.setColumns(20);
        mostrarcartas.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        mostrarcartas.setRows(5);
        mostrarcartas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(mostrarcartas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(161, 234, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Mostrartuno.setBackground(new java.awt.Color(244, 241, 187));
        Mostrartuno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Spoit.setBackground(new java.awt.Color(155,193,188));
        Spoit.setText("Spoit");
        Spoit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpoitActionPerformed(evt);
            }
        });

        Pass.setBackground(new java.awt.Color(155, 193, 188));
        Pass.setText("Pass");
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        Finish.setBackground(new java.awt.Color(155, 193, 188));
        Finish.setText("finish");
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/play.png"))); // NOI18N

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mostrartuno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Finish, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Spoit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(Salir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Mostrartuno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Spoit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir))
                .addGap(18, 18, 18)
                .addComponent(Finish, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SpoitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpoitActionPerformed
        // TODO add your handling code here:
        Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
        if((CrearMazo.mazo.getcartas().size() == 1 || CrearMazo.mazo.getcartas().isEmpty()) && CrearGame.a1.getArea().isEmpty()){
            CrearGame.game.finish();
            Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
            JOptionPane.showMessageDialog(null, "El Ganador es: \n" + CrearGame.game.ganador()); 
        }
        
        ViewSpoit ventanaspoit = new ViewSpoit();
        ventanaspoit.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_SpoitActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        if((CrearMazo.mazo.getcartas().size() == 1 || CrearMazo.mazo.getcartas().isEmpty()) && CrearGame.a1.getArea().isEmpty()){
            CrearGame.game.finish();
            Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
            JOptionPane.showMessageDialog(null, "El Ganador es: \n" + CrearGame.game.ganador()); 
        }
        CrearGame.game.pass();
         Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
        Mostrartuno.setText("Le corresponde jugar a " + CrearGame.game.dequieneselturno());
    }//GEN-LAST:event_PassActionPerformed

    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        // TODO add your handling code here:
        
        CrearGame.game.finish();
        CrearGame.a1.getArea().clear();
        Estado.setText(CrearGame.game.getJugadores() + "\n Cartas en el mazo: " + CrearMazo.mazo.getcartas().size() + "\nEl estado del juego es: " + CrearGame.game.getEstado() + "\nEl modo de juego es: " + CrearGame.game.getModo() );
        Mostrartuno.setText("Partida terminada!!!");
        JOptionPane.showMessageDialog(null, "El Ganador es: \n" + CrearGame.game.ganador());
        Spoit.setVisible(false);
        Pass.setVisible(false);
        Finish.setVisible(false);
        Salir.setVisible(true);
        
        
    }//GEN-LAST:event_FinishActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

 
   

   
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Estado;
    private javax.swing.JButton Finish;
    private javax.swing.JLabel Mostrartuno;
    private javax.swing.JButton Pass;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Spoit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mostrarcartas;
    // End of variables declaration//GEN-END:variables
}
