package View;

import Controller.ProductosController;
import Functions.FunctionsView;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
public class ViewAlmacen extends javax.swing.JFrame {
    private static final FunctionsView Functions = new FunctionsView();
    private static final ProductosController controller = new ProductosController();
    public ViewAlmacen() {
        initComponents();
        //LLENO EL MODELO
        controller.llenarTabla(tableContent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Image imagen =new ImageIcon(getClass().getResource("/Image/fondo.jpg")).getImage();
        jPanelContainer = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            }
        };
        jLabelIcono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableContent = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtbuscador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));
        jPanelContainer.setName(""); // NOI18N
        jPanelContainer.setOpaque(false);

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icono.png"))); // NOI18N
        jLabelIcono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FERRETERIA SAN PEDRO");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel1.setOpaque(true);

        tableContent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Categoría", "Producto", "Cantidades", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUpate(evt);
            }
        });
        jScrollPane1.setViewportView(tableContent);
        tableContent.getAccessibleContext().setAccessibleName("TablaDatos");

        btnCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreate.setText("Nuevo Producto");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateProduct(evt);
            }
        });

        btnRead.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRead.setText("Buscar");
        btnRead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchProduct(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Actualizar\n");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateProduct(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Eliminar\n");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteProduct(evt);
            }
        });

        txtbuscador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(164, 164, 164))
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCreate)
                    .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(74, 74, 74)
                        .addComponent(btnRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelContainer.getAccessibleContext().setAccessibleName("Container");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateProduct
        boolean enviado = controller.CreateNewProduct(Functions.CreateNewProduct());
        if(enviado) {
            JOptionPane.showMessageDialog(tableContent, "Se Envio Correctamente");
        } else {
            JOptionPane.showInputDialog(tableContent, "Sucedio Un Error");
        }
        controller.llenarTabla(tableContent);
    }//GEN-LAST:event_btnCreateProduct

    private void jTableUpate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUpate
        Functions.UpdateProduct(tableContent);
    }//GEN-LAST:event_jTableUpate

    private void btnUpdateProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateProduct
        boolean enviado = controller.UpdateProduct(Functions.getDatos());
        if(enviado) {
            JOptionPane.showMessageDialog(tableContent, "Se Actualizo Correctamente");
        } else {
            JOptionPane.showInputDialog(tableContent, "Sucedio Un Error");
        }
        controller.llenarTabla(tableContent);
    }//GEN-LAST:event_btnUpdateProduct

    private void btnDeleteProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteProduct
        boolean enviado = controller.DeleteProduct(Functions.getDatos().get("nomProducto").toString());
        if(enviado) {
            JOptionPane.showMessageDialog(tableContent, "Se Borro Correctamente");
        } else {
            JOptionPane.showInputDialog(tableContent, "Sucedio Un Error");
        }
        controller.llenarTabla(tableContent);
    }//GEN-LAST:event_btnDeleteProduct

    private void SearchProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchProduct
        controller.SearchProduct(tableContent, Integer.parseInt(Functions.SearchCategory(txtbuscador)));
    }//GEN-LAST:event_SearchProduct

    class fondopanel extends JPanel{
        private Image imagen;
    @Override
        public void paint(Graphics g){
            imagen =new ImageIcon(getClass().getResource("/Image/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAlmacen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIcono;
    public javax.swing.JPanel jPanelContainer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableContent;
    private javax.swing.JTextField txtbuscador;
    // End of variables declaration//GEN-END:variables
}
