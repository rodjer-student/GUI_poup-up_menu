import java.awt.Color;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;


public class NewJFrame extends javax.swing.JFrame {
    // define variable for set attributes
    private final SimpleAttributeSet mySet;
    public NewJFrame() {
        mySet = new SimpleAttributeSet();
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        textStyle = new javax.swing.JMenu();
        Bold = new javax.swing.JMenuItem();
        Italic = new javax.swing.JMenuItem();
        Plain = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        textColor = new javax.swing.JMenu();
        Red = new javax.swing.JMenuItem();
        Green = new javax.swing.JMenuItem();
        Blue = new javax.swing.JMenuItem();
        Black = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        paperColor = new javax.swing.JMenu();
        Red1 = new javax.swing.JMenuItem();
        Green1 = new javax.swing.JMenuItem();
        Blue1 = new javax.swing.JMenuItem();
        White = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();

        textStyle.setText("Text Style");
        textStyle.setToolTipText("Text Style");

        Bold.setBackground(java.awt.Color.white);
        Bold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bold.setText("Bold");
        Bold.setToolTipText("Bold");
        Bold.setOpaque(true);
        Bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoldActionPerformed(evt);
            }
        });
        textStyle.add(Bold);

        Italic.setBackground(java.awt.Color.white);
        Italic.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Italic.setText("Italic");
        Italic.setToolTipText("Italic");
        Italic.setOpaque(true);
        Italic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicActionPerformed(evt);
            }
        });
        textStyle.add(Italic);

        Plain.setBackground(java.awt.Color.white);
        Plain.setText("Plain");
        Plain.setToolTipText("Plain");
        Plain.setOpaque(true);
        Plain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlainActionPerformed(evt);
            }
        });
        textStyle.add(Plain);

        popupMenu.add(textStyle);
        popupMenu.add(jSeparator1);

        textColor.setText("Text Color");
        textColor.setToolTipText("Text Color");

        Red.setForeground(java.awt.Color.red);
        Red.setText("Red");
        Red.setToolTipText("Red");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });
        textColor.add(Red);

        Green.setForeground(java.awt.Color.green);
        Green.setText("Green");
        Green.setToolTipText("Green");
        Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenActionPerformed(evt);
            }
        });
        textColor.add(Green);

        Blue.setForeground(java.awt.Color.blue);
        Blue.setText("Blue");
        Blue.setToolTipText("Blue");
        Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueActionPerformed(evt);
            }
        });
        textColor.add(Blue);

        Black.setText("Black");
        Black.setToolTipText("Black");
        Black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackActionPerformed(evt);
            }
        });
        textColor.add(Black);

        popupMenu.add(textColor);
        popupMenu.add(jSeparator2);

        paperColor.setText("Paper Color");
        paperColor.setToolTipText("Paper Color");

        Red1.setBackground(java.awt.Color.red);
        Red1.setText("Red");
        Red1.setToolTipText("Red");
        Red1.setOpaque(true);
        Red1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Red1ActionPerformed(evt);
            }
        });
        paperColor.add(Red1);

        Green1.setBackground(java.awt.Color.green);
        Green1.setText("Green");
        Green1.setToolTipText("Green");
        Green1.setOpaque(true);
        Green1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Green1ActionPerformed(evt);
            }
        });
        paperColor.add(Green1);

        Blue1.setBackground(java.awt.Color.blue);
        Blue1.setText("Blue");
        Blue1.setToolTipText("Blue");
        Blue1.setOpaque(true);
        Blue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blue1ActionPerformed(evt);
            }
        });
        paperColor.add(Blue1);

        White.setBackground(java.awt.Color.white);
        White.setText("White");
        White.setToolTipText("White");
        White.setOpaque(true);
        White.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiteActionPerformed(evt);
            }
        });
        paperColor.add(White);

        popupMenu.add(paperColor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textPane.setComponentPopupMenu(popupMenu);
        jScrollPane1.setViewportView(textPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        textPane.setSelectedTextColor(Color.red);
        StyleConstants.setForeground(mySet, Color.red);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_RedActionPerformed

    private void GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenActionPerformed
        textPane.setSelectedTextColor(Color.green);
        StyleConstants.setForeground(mySet, Color.green);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_GreenActionPerformed

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueActionPerformed
        textPane.setSelectedTextColor(Color.blue);
        StyleConstants.setForeground(mySet, Color.blue);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_BlueActionPerformed

    private void BlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackActionPerformed
        textPane.setSelectedTextColor(Color.black);
        StyleConstants.setForeground(mySet, Color.black);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_BlackActionPerformed

    private void BoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoldActionPerformed
        StyleConstants.setBold(mySet, true);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_BoldActionPerformed

    private void ItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicActionPerformed
        StyleConstants.setItalic(mySet, true);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_ItalicActionPerformed

    private void PlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlainActionPerformed
        StyleConstants.setBold(mySet, false);
        StyleConstants.setItalic(mySet, false);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_PlainActionPerformed

    private void Red1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Red1ActionPerformed
        StyleConstants.setBackground(mySet, Color.red);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_Red1ActionPerformed

    private void Green1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Green1ActionPerformed
        StyleConstants.setBackground(mySet, Color.green);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_Green1ActionPerformed

    private void Blue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blue1ActionPerformed
        StyleConstants.setBackground(mySet, Color.blue);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_Blue1ActionPerformed

    private void WhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiteActionPerformed
        StyleConstants.setBackground(mySet, Color.white);
        textPane.setCharacterAttributes(mySet, true);
    }//GEN-LAST:event_WhiteActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Black;
    private javax.swing.JMenuItem Blue;
    private javax.swing.JMenuItem Blue1;
    private javax.swing.JMenuItem Bold;
    private javax.swing.JMenuItem Green;
    private javax.swing.JMenuItem Green1;
    private javax.swing.JMenuItem Italic;
    private javax.swing.JMenuItem Plain;
    private javax.swing.JMenuItem Red;
    private javax.swing.JMenuItem Red1;
    private javax.swing.JMenuItem White;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu paperColor;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JMenu textColor;
    private javax.swing.JTextPane textPane;
    private javax.swing.JMenu textStyle;
    // End of variables declaration//GEN-END:variables
}
