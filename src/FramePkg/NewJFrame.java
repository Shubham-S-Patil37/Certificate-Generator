package FramePkg;
import Manager.Utilities;
import Manager.readSheet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public static int i , start, end;
    public static Utilities ut;
    public static readSheet rs;
    public static JFrame browsefile , selectfile ;

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        editComponents();
        allEntry.setSelected(true);
//        pathTxt.setText("D:\\mtSheet.xlsx");
        unEdited();
        new Thread(() -> {
            System.out.println("in thread");
            Utilities.getBrowsePopup("Browse", 880, 250);
            Utilities.getSelectPopup("GenerateFXML", 1000, 500);
        }).start();
    }

    void editComponents(){
//        ut.imageIcon(jLabel2, "image//pragti.png");
    }
    
    void unEdited(){
        startTxt.setEditable(false);
        endTxt.setEditable(false);
        singleTxt.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nameLeb = new javax.swing.JLabel();
        english = new javax.swing.JLabel();
        marathi = new javax.swing.JLabel();
        hindi = new javax.swing.JLabel();
        psychology = new javax.swing.JLabel();
        geography = new javax.swing.JLabel();
        defence = new javax.swing.JLabel();
        phy = new javax.swing.JLabel();
        env = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        percent_W = new javax.swing.JLabel();
        percent_N = new javax.swing.JLabel();
        remark = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        pathTxt = new javax.swing.JTextField();
        browseBtn = new javax.swing.JButton();
        allEntry = new javax.swing.JRadioButton();
        range = new javax.swing.JRadioButton();
        single = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        startTxt = new javax.swing.JTextField();
        endTxt = new javax.swing.JTextField();
        singleTxt = new javax.swing.JTextField();
        sheetTxt = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLeb.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        nameLeb.setText("Shubham Shashikant Patil");
        nameLeb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(nameLeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 208, 720, 30));

        english.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        english.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        english.setText("30");
        jPanel1.add(english, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 318, 100, 20));

        marathi.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        marathi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marathi.setText("30");
        jPanel1.add(marathi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, 20));

        hindi.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        hindi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hindi.setText("30");
        jPanel1.add(hindi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 362, 100, 20));

        psychology.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        psychology.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psychology.setText("30");
        jPanel1.add(psychology, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 406, 100, 20));

        geography.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        geography.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        geography.setText("30");
        jPanel1.add(geography, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 383, 100, 20));

        defence.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        defence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defence.setText("30");
        jPanel1.add(defence, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 427, 100, 20));

        phy.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phy.setText("30");
        jPanel1.add(phy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 471, 100, 20));

        env.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        env.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        env.setText("30");
        jPanel1.add(env, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 448, 100, 20));

        rollno.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        rollno.setText("10");
        jPanel1.add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 232, 150, 20));

        percent_W.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        percent_W.setText("seventy six point twenty");
        jPanel1.add(percent_W, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 517, 400, 20));

        percent_N.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        percent_N.setText("76.20%");
        jPanel1.add(percent_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 200, -1));

        remark.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        remark.setText("Good");
        jPanel1.add(remark, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 360, 30));

        total.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("300");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 514, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\study\\Java\\netbeans\\CertificateCreater\\Image\\pragti.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1135, 760));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pathTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pathTxt.setToolTipText("");

        browseBtn.setBackground(new java.awt.Color(255, 255, 255));
        browseBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        allEntry.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(allEntry);
        allEntry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        allEntry.setText("All Entry");
        allEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEntryActionPerformed(evt);
            }
        });

        range.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(range);
        range.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        range.setText("Given range");
        range.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeActionPerformed(evt);
            }
        });

        single.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(single);
        single.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        single.setText("Single Line");
        single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("All Entry From Given Sheet");

        startTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        startTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startTxtKeyTyped(evt);
            }
        });

        endTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        endTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        endTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                endTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                endTxtKeyTyped(evt);
            }
        });

        singleTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        singleTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        singleTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                singleTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                singleTxtKeyTyped(evt);
            }
        });

        sheetTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sheetTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sheetTxt.setText("Sheet Number");
        sheetTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sheetTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sheetTxtFocusLost(evt);
            }
        });
        sheetTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sheetTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sheetTxtKeyTyped(evt);
            }
        });

        startBtn.setBackground(new java.awt.Color(255, 255, 255));
        startBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pathTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sheetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(singleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(range, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(single, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(289, 289, 289))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allEntry)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pathTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(range)
                    .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(single)
                            .addComponent(singleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sheetTxt))))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1511, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleActionPerformed
        unEdited();
        singleTxt.setEditable(true);
    }//GEN-LAST:event_singleActionPerformed

    private void allEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEntryActionPerformed
    }//GEN-LAST:event_allEntryActionPerformed

    private void rangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeActionPerformed
        unEdited();
        startTxt.setEditable(true);
        endTxt.setEditable(true);
    }//GEN-LAST:event_rangeActionPerformed

    private void sheetTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sheetTxtFocusGained
        sheetTxt.setText("");
    }//GEN-LAST:event_sheetTxtFocusGained

    private void sheetTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sheetTxtFocusLost
        if(sheetTxt.getText().equals(""))
            sheetTxt.setText("Sheet Number");
    }//GEN-LAST:event_sheetTxtFocusLost

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        Utilities.select.setVisible(true);
            
    }//GEN-LAST:event_startBtnActionPerformed

    private void sheetTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sheetTxtKeyPressed
    }//GEN-LAST:event_sheetTxtKeyPressed

    private void startTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startTxtKeyPressed
    }//GEN-LAST:event_startTxtKeyPressed

    private void endTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_endTxtKeyPressed
    }//GEN-LAST:event_endTxtKeyPressed

    private void singleTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_singleTxtKeyPressed
    }//GEN-LAST:event_singleTxtKeyPressed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
//        pathTxt.setText(ut.myFileChooser());
//        Utilities.getBrowsePopup(880,250);
//            browsefile.setVisible(true);
        Utilities.browse.setVisible(true);
//        nc = new NewClass();
//        
//        
//        Platform.runLater(new Runnable() {
//            @Override
//            public void run() {
//              //javaFX operations should go here
//              nc.open();
//            }
//        });
        
    }//GEN-LAST:event_browseBtnActionPerformed

    private void endTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_endTxtKeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_endTxtKeyTyped

    private void startTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startTxtKeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_startTxtKeyTyped

    private void singleTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_singleTxtKeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_singleTxtKeyTyped

    private void sheetTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sheetTxtKeyTyped
        ut.isDigit(evt);
    }//GEN-LAST:event_sheetTxtKeyTyped

    public static void start(){
        if(allEntry.isSelected()){
            
            start = 0;
            end = rs.readSheet(Integer.parseInt(sheetTxt.getText()),pathTxt.getText()).getLastRowNum();
        }
        if(range.isSelected()){
            start = Integer.parseInt(startTxt.getText()) - 1;
            end   = Integer.parseInt(endTxt.getText()) - 1;
        }
        if(single.isSelected())
            end = start = Integer.parseInt(singleTxt.getText()) - 1;
        
        rs.getSheet(rs.readSheet(Integer.parseInt(sheetTxt.getText()),pathTxt.getText()),start,end);
        
    }
    
    public static void startConditions(){
        if(!pathTxt.getText().equals("")){
            if(!sheetTxt.getText().equals("") ){
                if(allEntry.isSelected())
                    start();
//                    new CreatFolder().show();
                else if(range.isSelected()){
                    if(startTxt.getText().equals("") || endTxt.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "enter Correct Range");
                    else
                        start();
//                        new CreatFolder().show();
                }
                else if(single.isSelected()){
                     if(singleTxt.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "enter Correct Row Number");
                     else
                         start();
//                         new CreatFolder().show();
                }
            }
            else
                JOptionPane.showMessageDialog(null, "enter Sheet Number");
        }
        else
            JOptionPane.showMessageDialog(null, "Select .xlsx file");
    }
    
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
    public static javax.swing.JRadioButton allEntry;
    private javax.swing.JButton browseBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JLabel defence;
    public static javax.swing.JTextField endTxt;
    public static javax.swing.JLabel english;
    public static javax.swing.JLabel env;
    public static javax.swing.JLabel geography;
    public static javax.swing.JLabel hindi;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel marathi;
    public static javax.swing.JLabel nameLeb;
    public static javax.swing.JTextField pathTxt;
    public static javax.swing.JLabel percent_N;
    public static javax.swing.JLabel percent_W;
    public static javax.swing.JLabel phy;
    public static javax.swing.JLabel psychology;
    public static javax.swing.JRadioButton range;
    public static javax.swing.JLabel remark;
    public static javax.swing.JLabel rollno;
    public static javax.swing.JTextField sheetTxt;
    public static javax.swing.JRadioButton single;
    public static javax.swing.JTextField singleTxt;
    public static javax.swing.JButton startBtn;
    public static javax.swing.JTextField startTxt;
    public static javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
