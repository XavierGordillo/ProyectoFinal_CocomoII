/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_cocomo.ii.vista;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import proyectofinal_cocomo.ii.controlador.Métodos;
import static proyectofinal_cocomo.ii.vista.frmFa.tableFactor;

/**
 *
 * @author xavie
 */
public class frmFactorescala extends javax.swing.JFrame {
    
   

    /**
     * Creates new form frmFactorescala
     */
    
    Métodos met = new Métodos();
    public frmFactorescala() {
        initComponents();
        
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Factores de Escala");
        model.addColumn("Muy Bajo");
        model.addColumn("Bajo");
        model.addColumn("Normal");
        model.addColumn("Alto");
        model.addColumn("Muy Alto");
        model.addColumn("Extra Alto");
     
        model.addRow(new Object[]{"PREC","Extremadamente nuevo","Muy nuevo","Novedoso","Familiar","Muy Familiar","Extremadamente familiar"});
        model.addRow(new Object[]{"FLEX","Riguroso","Relajación ocasional","Alguna relajacioón","Conformidad","Alguna Conformidad","Metas generales"});
        model.addRow(new Object[]{"RESL","Poco(20%)","Algo(40%)","A menudo(60%)","Generalmente(75%)","Casi siempre(90%)","Siempre(100%)"});
        model.addRow(new Object[]{"TEAM","Muy difíciles","Algo difíciles","Cooperativas básicas","Bastante cooperativos","Altamaente cooperativos","Alto nivel"});
        model.addRow(new Object[]{"PMAT","Nivel 1 Bajo","Nivel 1 Alto","Nivel 2","Nivel 3","Nivel 4","Nivel 5"});
        
        tablaFe.setModel(model);
        
       tablaFe.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
       TableColumn columna;
        columna=tablaFe.getColumnModel().getColumn(0);
        columna.setPreferredWidth(250);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        //Columna 1
        columna=tablaFe.getColumnModel().getColumn(1);
        columna.setPreferredWidth(300);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        //Columna 2
        columna=tablaFe.getColumnModel().getColumn(2);
        columna.setPreferredWidth(300);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        //Columna 3
        columna=tablaFe.getColumnModel().getColumn(3);
        columna.setPreferredWidth(300);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        //Columna 4
        columna=tablaFe.getColumnModel().getColumn(4);
        columna.setPreferredWidth(300);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        //Columna 5
        columna=tablaFe.getColumnModel().getColumn(5);
        columna.setPreferredWidth(300);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        //Columna 6
        columna=tablaFe.getColumnModel().getColumn(6);
        columna.setPreferredWidth(300);
        columna.setMaxWidth(150);
        columna.setMinWidth(150);
        tablaFe.setRowHeight(40);
        
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFe = new javax.swing.JTable();
        cbxPrec = new javax.swing.JComboBox<>();
        cbxFlex = new javax.swing.JComboBox<>();
        cbxResl = new javax.swing.JComboBox<>();
        cbxPmai = new javax.swing.JComboBox<>();
        cbxTeam = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaFe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tablaFe);

        cbxPrec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6.20", "4.96", "3.72", "2.48", "1.24", "0.00" }));

        cbxFlex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5.07", "4.05", "3.04", "2.03", "1.01", "0.00" }));

        cbxResl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7.07", "5.65", "4.24", "2.83", "1.41", "0.00" }));

        cbxPmai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7.80", "6.24", "4.68", "3.12", "1.56", "0.00" }));

        cbxTeam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5.48", "4.38", "3.29", "2.19", "1.10", "0.00" }));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 11)); // NOI18N
        jLabel1.setText("Cuadro de ponderación de factores de escala(SFi)");

        jButton1.setText("Hecho");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFlex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxResl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(284, 284, 284)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cbxPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxFlex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxResl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxPmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // met.calculoFi();
       // met.calcularB();
       met.calculoFi();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmFactorescala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFactorescala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFactorescala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFactorescala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFactorescala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbxFlex;
    public static javax.swing.JComboBox<String> cbxPmai;
    public static javax.swing.JComboBox<String> cbxPrec;
    public static javax.swing.JComboBox<String> cbxResl;
    public static javax.swing.JComboBox<String> cbxTeam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFe;
    // End of variables declaration//GEN-END:variables
}
