/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Consultas;

/**
 *
 * @author SENA
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Producto extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaBD
     */
    public Producto () {
            initComponents();
        cargarDriver();
    }
    private void cargarDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex) {
            setTitle(ex.toString());
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
        Lbldescripcion = new javax.swing.JLabel();
        Lblprecio = new javax.swing.JLabel();
        Lblresultado = new javax.swing.JLabel();
        Tf1 = new javax.swing.JTextField();
        Tf2 = new javax.swing.JTextField();
        BtnAlta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LblConsultar = new javax.swing.JLabel();
        Tf3 = new javax.swing.JTextField();
        BtnConsultar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        Lbldescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbldescripcion.setForeground(new java.awt.Color(255, 255, 255));
        Lbldescripcion.setText("DESCRIPCION");
        jPanel1.add(Lbldescripcion);
        Lbldescripcion.setBounds(80, 150, 91, 20);

        Lblprecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lblprecio.setForeground(new java.awt.Color(255, 255, 255));
        Lblprecio.setText("PRECIO");
        jPanel1.add(Lblprecio);
        Lblprecio.setBounds(110, 210, 49, 20);

        Lblresultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lblresultado.setForeground(new java.awt.Color(255, 255, 255));
        Lblresultado.setText("RESULTADO");
        jPanel1.add(Lblresultado);
        Lblresultado.setBounds(140, 290, 170, 20);

        Tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf1ActionPerformed(evt);
            }
        });
        jPanel1.add(Tf1);
        Tf1.setBounds(180, 150, 190, 30);

        Tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf2ActionPerformed(evt);
            }
        });
        jPanel1.add(Tf2);
        Tf2.setBounds(180, 210, 190, 30);

        BtnAlta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAlta.setText("ALTAS");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAlta);
        BtnAlta.setBounds(260, 330, 73, 26);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("VENDEDOR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 460, 90, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 50, 140, 30);

        LblConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LblConsultar.setForeground(new java.awt.Color(255, 255, 255));
        LblConsultar.setText("INGRESE CODIGO DE CONSULTA ");
        jPanel1.add(LblConsultar);
        LblConsultar.setBounds(410, 140, 200, 30);
        jPanel1.add(Tf3);
        Tf3.setBounds(600, 140, 200, 30);

        BtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnConsultar.setText("CONSULTAR");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConsultar);
        BtnConsultar.setBounds(680, 190, 120, 26);

        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar);
        BtnEliminar.setBounds(550, 190, 110, 26);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf2ActionPerformed

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        // TODO add your handling code here:
        BtnAlta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Lblresultado.setText("");
                try {
                    try (Connection conexion = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10708655","sql10708655","V3MmHRxhCd")) {
                    Statement comando=conexion.createStatement();
                    comando.executeUpdate("insert into articulo(descripcion,precio) values('"+Tf1.getText()+"',"+Tf2.getText()+")");

                conexion.close();
                }

                Lblresultado.setText("se registraron los datos");

                Tf1.setText("");
                Tf2.setText("");
                } catch(SQLException ex){
                setTitle(ex.toString());
                }
            }
        });

    }//GEN-LAST:event_BtnAltaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vendedor abrir = new Vendedor();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
            // TODO add your handling code here:
    BtnConsultar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
        Lblresultado.setText("");
        Tf1.setText("");
        Tf2.setText("");
        try {
            Connection
            conexion=DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10708655","sql10708655","V3MmHRxhCd");
            Statement comando=conexion.createStatement();
            ResultSet registro = comando.executeQuery("select descripcion,precio from articulo where codigo="+Tf3.getText());
            if (registro.next()==true) {
                Tf1.setText(registro.getString("descripcion"));
                Tf2.setText(registro.getString("precio"));
            } else {
                Lblresultado.setText("No existe un artículo con dicho código");
               }
        conexion.close();
        } catch(SQLException ex){
            setTitle(ex.toString());
        }
        }
    });
     
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void Tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf1ActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        BtnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            Lblresultado.setText("");

            try {
                Connection
                conexion=DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10708655","sql10708655","V3MmHRxhCd");
                Statement comando=conexion.createStatement();
                int eliminar = comando.executeUpdate("DELETE FROM articulo WHERE codigo ="+Tf3.getText());
                if (eliminar > 0) {
                    Lblresultado.setText("Artículo Eliminado");
                } else {
                    Lblresultado.setText("No existe un artículo con dicho código");
                   }
            conexion.close();
            } catch(SQLException ex){
                setTitle(ex.toString());
            }
            }
        });
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JLabel LblConsultar;
    private javax.swing.JLabel Lbldescripcion;
    private javax.swing.JLabel Lblprecio;
    private javax.swing.JLabel Lblresultado;
    private javax.swing.JTextField Tf1;
    private javax.swing.JTextField Tf2;
    private javax.swing.JTextField Tf3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
