/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registation;

/**
 *
 * @author nimeshi
 */
public class Registation extends javax.swing.JPanel {

    /**
     * Creates new form Registation
     */
    public Registation() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registation1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        Coureses = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Next = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Year = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        Batchno = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registation1.setBackground(new java.awt.Color(102, 102, 102));
        Registation1.setPreferredSize(new java.awt.Dimension(630, 600));
        Registation1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Student ID");
        Registation1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 20));
        Registation1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email");
        Registation1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Parent/Gurdian Name");
        Registation1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, 30));
        Registation1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 510, 30));
        Registation1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 540, 30));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jRadioButton2.setText("Female");
        Registation1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jRadioButton1.setText("Male");
        Registation1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));
        Registation1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Full Name");
        Registation1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("NIC");
        Registation1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 40, 30));
        Registation1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        Registation1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Parent/Gurdian Phone No.");
        Registation1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 260, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone no.");
        Registation1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 30));
        Registation1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 540, 40));
        Registation1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 56, 130, 40));

        Coureses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Courese-", "DEP-Direct Entry Program", "CMJD-Profesional", "CMJD-Cretificate", "CMJD-Diploma", " " }));
        Coureses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouresesActionPerformed(evt);
            }
        });
        Registation1.add(Coureses, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Gender");
        Registation1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 80, 30));
        Registation1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 540, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Birthday");
        Registation1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Courses");
        Registation1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 150, 30));
        Registation1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 540, 30));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        Registation1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 170, 30));

        Next.setBackground(new java.awt.Color(153, 153, 255));
        Next.setText("NEXT");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        Registation1.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-3 copy.png"))); // NOI18N
        Registation1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 270, 70));

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Year-", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        Registation1.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 130, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Type-", "Full Time", "Part Time" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        Registation1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        Batchno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Batch No-", "40", "41", "42", "43", "44", "45", "46", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55" }));
        Registation1.add(Batchno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 170, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Semi Batch No-", "1", "2", "3", "4", "5" }));
        Registation1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 170, -1));

        add(Registation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        Registation1.removeAll();
        Registation1.setVisible(true);
        Pay b= new Pay();
        b.setSize(Registation1.getSize());
        Registation1.add(b);
        Registation1.repaint();
        Registation1.revalidate();
    }//GEN-LAST:event_NextActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void CouresesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouresesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CouresesActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
//        Registation1.removeAll();
//        Registation1.setVisible(true);
//        Pay b= new Pay();
//        b.setSize(Registation1.getSize());
//        Registation1.add(b);
//        Registation1.repaint();
//        Registation1.revalidate();
    }//GEN-LAST:event_NextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Batchno;
    private javax.swing.JComboBox<String> Coureses;
    private javax.swing.JButton Next;
    private javax.swing.JPanel Registation1;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
