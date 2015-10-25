package calculator;


import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import java.util.Iterator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zero
 */



public class Frame extends javax.swing.JFrame {
  static ArrayList<String> nput = new ArrayList<>(10); 
  static String termbuf = "";
  static ArrayList<String> oput = new ArrayList<>(10); 
  static boolean newstring = false;
  static boolean rad = true;
  static int parenmatch=0;
  static int textfield;
  static boolean second = false;
  static ArrayList storage[] = new ArrayList[10];
  static boolean sto = false;
  static boolean rec = false;
    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("9");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("6");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(".");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("8");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("0");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("4");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("ans");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("(");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton15.setText("^");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("/");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("*");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("-");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("+");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton25.setText("ln");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton24.setText("e");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton26.setText("log10");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton28.setText("abs");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton31.setText("√");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton34.setText("x");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(jButton34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton25)
                        .addComponent(jButton24)
                        .addComponent(jButton26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton15)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton9)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton10)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7)
                    .addComponent(jButton11)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton8)
                    .addComponent(jButton12)
                    .addComponent(jButton34)))
        );

        jButton30.setText("rad");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton27.setText("Clear");
        jButton27.setMaximumSize(new java.awt.Dimension(60, 23));
        jButton27.setMinimumSize(new java.awt.Dimension(60, 23));
        jButton27.setPreferredSize(new java.awt.Dimension(60, 23));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton21.setText("Back");
        jButton21.setMaximumSize(new java.awt.Dimension(60, 23));
        jButton21.setMinimumSize(new java.awt.Dimension(60, 23));
        jButton21.setPreferredSize(new java.awt.Dimension(60, 23));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton29.setText("2nd");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ans:");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29))
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton22.setText("derive");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Graph");

        jButton20.setText("=");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton22)
                .addComponent(jButton23)
                .addComponent(jButton20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public static boolean isSymbola(String exp){
    if(exp.equals("cos")){
        return true;
    }
    if(exp.equals(" nCr ")){
        return true;
    }
    if(exp.equals(" nPr ")){
        return true;
    }
    if(exp.equals("acos")){
        return true;
    }
    if(exp.equals("asin")){
        return true;
    }
    if(exp.equals("atan")){
        return true;
    }
    if(exp.equals("√")){
        return true;
    }
    if(exp.equals("log")){
        return true;
    }
    if(exp.equals("ln")){
        return true;
    }
    if(exp.equals("sin")){
        return true;
    }
    if(exp.equals("tan")){
        return true;
    }
    if(exp.equals("cot")){
        return true;
    }
    if(exp.equals("sec")){
        return true;
    }
    if(exp.equals("csc")){
        return true;
    }
    if(exp.equals("cosh")){
        return true;
    }
    if(exp.equals("sinh")){
        return true;
    }
    if(exp.equals("tanh")){
        return true;
    }
    if(exp.equals("abs")){
        return true;
    }
    if(exp.equals("(")){
        return true;
    }
    if(exp.equals("^")){
        return true;
    }
    if(exp.equals("*")){
        return true;
    }
    if(exp.equals("/")){
        return true;
    }
    if(exp.equals("+")){
        return true;
    }
    if(exp.equals("-")){
        return true;
    }
    if(exp.equals("ⁿ√")){
        return true;
    }
            
    return false;
}
    public static boolean isSymbolb(String exp){
    if(exp.equals(")")){
        return true;
    }
    if(exp.equals(" nPr ")){
        return true;
    }
    if(exp.equals("^")){
        return true;
    }
    if(exp.equals("*")){
        return true;
    }
    if(exp.equals("ⁿ√")){
        return true;
    }
     if(exp.equals(" nCr ")){
        return true;
    }
    if(exp.equals("!")){
        return true;
    }
    if(exp.equals("/")){
        return true;
    }
    if(exp.equals("+")){
        return true;
    }
    if(exp.equals("-")){
        return true;
    }
    return false;
}
    
    
    
    public static double fact (double i){
        double fact = 1;
        if((Math.round(i*1000000.0)/1000000.0<0)||(Math.round(i*1000000.0)/1000000.0)%1!=0){
            return Double.NaN;
        }
        else{
        while(i>0){
            if(i==0){
                return fact;
            }
            else{
                fact = fact*(Math.round(i*1000000.0)/1000000.0);
                i=i-1;
            }
        }
        return fact;
        }
    }
    
    
    
    public static ArrayList evaluate(ArrayList input){
        if(hasx(input)){
            input=new ArrayList(1);
            input.add("cannot evaluate x");
            return input;
        }
       makeSenseNums(input);
    if(parenmatch!=0){
        input = new ArrayList(1);
        input.add("unable to match parentheses");
        return input;
    }
    int i = 0;
    int g = -1;
    boolean hasextrap=false;
    try{
    while(i<input.size()){
        
        if((input.get(i)).equals("(")){
            int j = i+1;
            while (j<input.size()){
                if (input.get(j).equals("(")){
                    i=j;
                    hasextrap=true;
                }
                if (input.get(j).equals(")")){
                    String test = "*";//*related
                    if(i==j-1){
                        input= (new ArrayList(1));
                        input.add("() bad math operation");
                        return input;
                    }
                    if(i>0){
                 test = ((String)(input.get(i-1)));
                    }
                   
                  input.addAll(i,evaluate(new ArrayList(input.subList(i+1,j))));
                  input.subList(i+1,j+2).clear();///must fix for when result arrayList is > size 1
                  if(i>1){
                  if(isSymbola((String)input.get(i-2))&&input.get(i-1).equals("-")){
                   input.set(i, String.valueOf(-1*Double.parseDouble((String)input.get(i))));
                   input.remove(i-1);
                  }
                  }
                  if(!isSymbola(test)){
                      input.add(i,"*");
                      i=i+1;
                  }
                  if(i<input.size()-1&&!isSymbolb((String)input.get(i+1))&&!input.get(i+1).equals(")")){
                      input.add(i+1, "*");
                     // System.out.println(input.get(i));
                  }
                  
                  
                         
                  j=input.size();
                  i=0;//resets i and j to go throught the terms again for parentheses
                  
                }
                j++;
            }
            
        }//parentheses are gonna be harder than I thought
        
     i++;
        if(hasextrap){
            i=0;
            hasextrap=false;
        }
    }
    i=0;
    
    while(i<input.size()){
        if(input.get(i).equals("abs")){
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.abs(b)));
            input.remove(i+1); 
            //System.out.println(input);
        }
        if(input.get(i).equals("ln")){
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.log(b)));
            input.remove(i+1); 
        }
        if(input.get(i).equals("log")){
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.log10(b)));
            input.remove(i+1); 
            
        }
        if(input.get(i).equals("sin")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.sin(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.sin(b)));
                input.remove(i+1);
            } 
        }     
        if(input.get(i).equals("cos")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.cos(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.cos(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("tan")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.tan(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.tan(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("csc")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(1/Math.sin(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(1/Math.sin(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("sec")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(1/Math.cos(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(1/Math.cos(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("cot")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(1/Math.tan(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(1/Math.tan(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("acos")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.acos(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.acos(b)));
                input.remove(i+1);
            }  
        }
        if(input.get(i).equals("asin")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.asin(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.asin(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("atan")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.atan(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.atan(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("cosh")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.cosh(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.cosh(b)));
                input.remove(i+1);
            } 
        }
        if(input.get(i).equals("sinh")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.sinh(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.sinh(b)));
                input.remove(i+1);
            }  
        }
        if(input.get(i).equals("tanh")){
            if(!rad){
            double b = Math.toRadians(Double.parseDouble((String)input.get(i+1)));
            input.set(i,String.valueOf(Math.tanh(b)));
            input.remove(i+1);
            }
            else{
                double b = Double.parseDouble((String)input.get(i+1));
                input.set(i,String.valueOf(Math.tanh(b)));
                input.remove(i+1);
            }  
        }
        i++;
    }
    i=input.indexOf("!");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            input.set(i,String.valueOf(fact(b)));
            if(!((input.size()-1)==i)){
                if(!isSymbolb((String)input.get(i+1))){
                    input.add(i+1, "*");
                }
            }
            input.remove(i-1);
            
            
            i=input.indexOf("!");

        }
    i=input.indexOf(" nCr ");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            double a = Double.parseDouble((String)input.get(i+1));
            double c = fact(a)*fact(b-a);
             a = fact(b);
            input.set(i,String.valueOf(a/c));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf(" nCr ");

        }
    i=input.indexOf(" nPr ");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            double a = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(fact(b)/fact(a)));
            System.out.print(input);
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf(" nPr ");

        }
       
    i=input.indexOf("√");
       while(i>-1){
            double a = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.pow(a,0.5)));
            input.remove(i+1);
            i=input.indexOf("√");

        }
    i=input.indexOf("ⁿ√");
       while(i>-1){
            double b = Double.parseDouble((String)input.get(i-1));
            double a = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.pow(a,Math.pow(b,-1))));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("ⁿ√");

        }
       
    i=input.indexOf("^");
       while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(Math.pow(a,b)));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("^");

        }
      i=input.indexOf("*");
        while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a*b));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("*");

        }
     i=input.indexOf("/");
        while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a/b));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("/");

        }
     i=input.indexOf("+");
        while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a+b));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("+");

        }
     i=input.indexOf("-");
        while(i>-1){
            double a = Double.parseDouble((String)input.get(i-1));
            double b = Double.parseDouble((String)input.get(i+1));
            input.set(i,String.valueOf(a-b));
            input.remove(i-1);
            input.remove(i);
            i=input.indexOf("-");

        }
        
             
          return input;    
        }
    
    catch(Exception nfe){
        //System.out.println(input);
    input.clear();
    input.add("invalid syntax");
    return input;
}
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jTextField2.setText("");
        termbuf="";
        parenmatch=0;
        nput.clear();// TODO add your handling code here:
        sto= false;
        jButton20.setText("=");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(sto==false){
        if(parenmatch==0){
        if(!(termbuf.equals(""))){
            nput.add(termbuf);
        }
        //System.out.print(nput);
        termbuf="";
        jTextField1.setText("");
        oput = evaluate((ArrayList)nput.clone());
        Iterator i = oput.iterator();
        while(i.hasNext()){
            jTextField1.setText(jTextField1.getText()+i.next());

        }
        newstring=true;
        }
        else{
        if(parenmatch>0&&newstring==false){
        parenmatch-=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText(")");
            newstring=false;
        }
        else{
            jTextField2.setText(jTextField2.getText() + ')');
        }
        if(termbuf.equals("")){
            nput.add(")");
        }
        else{
            nput.add(termbuf);
            nput.add(")");
            termbuf="";

        }
       }
        if(parenmatch==0){
            jButton20.setText("=");
        }
        }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(sto==false){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            jTextField2.setText(oput.get(0)+"+");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '+');
        }
        if(nput.size()>0&&!isSymbola(nput.get(nput.size()-1))&&termbuf.equals("")){
                nput.add("+");
            }
        else if(termbuf.equals("")){
            termbuf="+";
        }
        
        else{
            nput.add(termbuf);
            nput.add("+");
            termbuf="";

        }
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("tanh(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "tanh(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tanh");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tanh");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       if(sto==false){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            jTextField2.setText(oput.get(0)+"-");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '-');
        }
        
if(nput.size()>0&&!isSymbola(nput.get(nput.size()-1))&&termbuf.equals("")){
                nput.add("-");
            }
        else if(termbuf.equals("")){
            termbuf="-";
        }
        
        else{
            nput.add(termbuf);
            nput.add("-");
            termbuf="";
        }
        ////System.out.println(nput);
       }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("cosh(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "cosh(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cosh");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cosh");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
       }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(sto==false){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            jTextField2.setText(oput.get(0)+"*");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '*');
        }
        if(termbuf.equals("")){
            nput.add("*");
        }
        else{
            nput.add(termbuf);
            nput.add("*");
            termbuf="";

        }
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("sinh(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "sinh(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sinh");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sinh");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(sto==false){
        if(newstring){
            nput=new ArrayList(10);
           if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            jTextField2.setText(oput.get(0)+"/");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '/');
        }
        if(termbuf.equals("")){
            nput.add("/");
        }
        else{
            nput.add(termbuf);
            nput.add("/");
            termbuf="";

        }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(sto==false){
        if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            jTextField2.setText(oput.get(0)+"^");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '^');
        }
        if(termbuf.equals("")){
            nput.add("^");
        }
        else{
            nput.add(termbuf);
            nput.add("^");
            termbuf="";

        }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(sto==false){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '(');
        }
        jButton20.setText(")");
            if(termbuf.equals("")){
                nput.add("(");
            }
            else{
                nput.add(termbuf);
                nput.add("(");
                termbuf="";

            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(!sto){
        if(second==false){
            if(newstring){
                
                if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
                    nput=new ArrayList(10);
                jTextField2.setText("("+jTextField1.getText()+ ")");
                }
                else{
                    jTextField1.setText("unable to use ans");
                }
                newstring=false;
                parenmatch=0;
            }
            else{
             if(!(jTextField1.getText().equals("")||(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax")))){
                    jTextField2.setText(jTextField2.getText() + "(" + jTextField1.getText() + ")");
             }
            }
            if(!termbuf.equals("")){
                nput.add(termbuf);
                termbuf = "";
            }
      if(!(jTextField1.getText().equals("")||(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax")))){
                nput.add("(");
                nput.addAll(oput); 
                nput.add(")");
            }
        }
        else{
            if(!termbuf.equals("")){
                nput.add(termbuf);
            }
            sto = true;
            jTextField2.setText("Choose store location(0-9)  ");
            second = !second;
    if(second){
    jButton12.setText("Store");
    jButton4.setText("Rec");
    jButton9.setText("sin");
    jButton5.setText("asin");
    jButton17.setText("sinh");
    jButton1.setText("csc");
    jButton10.setText("cos");
    jButton6.setText("acos");
    jButton2.setText("sec");
    jButton18.setText("cosh");
    jButton11.setText("tan");
    jButton7.setText("atan");
    jButton3.setText("cot");
    jButton19.setText("tanh");
    jButton24.setText("π");
    }
    else{
        jButton12.setText("ans");
        jButton4.setText(".");
        jButton9.setText("7");
        jButton5.setText("8");
        jButton17.setText("*");
        jButton1.setText("9");
        jButton10.setText("4");
        jButton6.setText("5");
        jButton2.setText("6");
        jButton18.setText("-");
        jButton11.setText("1");
        jButton7.setText("2");
        jButton3.setText("3");
        jButton19.setText("+");
        jButton24.setText("e");
    }
        }
        }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("1");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '1');
        }
        termbuf = termbuf+'1';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("tan(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "tan(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tan");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("tan");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
            
        }
               else{
           if(rec&&storage[1]!=null){
               nput.add("(");
               nput.addAll(storage[1]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[1] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("4");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '4');
        }
        termbuf = termbuf+'4';// TODO add your handling code here:
        }
                        else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("cos(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "cos(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cos");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cos");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
               else{
           if(rec&&storage[4]!=null){
               nput.add("(");
               nput.addAll(storage[4]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[4] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("7");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '7');
        }
        termbuf = termbuf+'7';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("sin(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "sin(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sin");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sin");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
               else{
           if(rec&&storage[7]!=null){
               nput.add("(");
               nput.addAll(storage[7]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[7] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if (!sto){
        //  if()
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("0");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '0');
        }
        termbuf = termbuf+'0';
       }
       else{
           if(rec&&storage[0]!=null){
               nput.add("(");
               nput.addAll(storage[0]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[0] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if (!sto){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("2");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '2');
        }       // TODO add your handling code here:
        termbuf = termbuf+'2';
       }
           else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("atan(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "atan(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("atan");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("atan");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
       }
              else{
           if(rec&&storage[2]!=null){
               nput.add("(");
               nput.addAll(storage[2]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[2] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (!sto){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("5");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '5');
        }
        termbuf = termbuf+'5';// TODO add your handling code here:
       }
                       else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("acos(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "acos(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("acos");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("acos");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
       }
              else{
           if(rec&&storage[5]!=null){
               nput.add("(");
               nput.addAll(storage[5]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[5] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("8");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '8');
        }
        termbuf = termbuf+'8';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("asin(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "asin(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("asin");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("asin");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
               else{
           if(rec&&storage[8]!=null){
               nput.add("(");
               nput.addAll(storage[8]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[8] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!sto){
        if(second==false){
            if(newstring){
                nput=new ArrayList(10);
                jTextField2.setText(".");
                newstring=false;
                parenmatch=0;
            }
            else{
                jTextField2.setText(jTextField2.getText() + ".");
            }
            termbuf = termbuf + ".";
         }
         else
         {
            if(!termbuf.equals("")){
                nput.add(termbuf);
            }
             sto = true;
             rec=true;
             jTextField2.setText("Choose recall location(0-9)  ");
             second = !second;
    if(second){
    jButton12.setText("Store");
    jButton4.setText("Rec");
    jButton9.setText("sin");
    jButton5.setText("asin");
    jButton17.setText("sinh");
    jButton1.setText("csc");
    jButton10.setText("cos");
    jButton6.setText("acos");
    jButton2.setText("sec");
    jButton18.setText("cosh");
    jButton11.setText("tan");
    jButton7.setText("atan");
    jButton3.setText("cot");
    jButton19.setText("tanh");
    jButton24.setText("π");
    }
    else{
        jButton12.setText("ans");
        jButton4.setText(".");
        jButton9.setText("7");
        jButton5.setText("8");
        jButton17.setText("*");
        jButton1.setText("9");
        jButton10.setText("4");
        jButton6.setText("5");
        jButton2.setText("6");
        jButton18.setText("-");
        jButton11.setText("1");
        jButton7.setText("2");
        jButton3.setText("3");
        jButton19.setText("+");
        jButton24.setText("e");
    }
         }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("3");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '3');
        }
        termbuf = termbuf+'3';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("cot(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "cot(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cot");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("cot");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
               else{
           if(rec&&storage[3]!=null){
               nput.add("(");
               nput.addAll(storage[3]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[3] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("6");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '6');
        }
        termbuf = termbuf+'6';// TODO add your handling code here:
        }
                        else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("sec(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "sec(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sec");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("sec");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
               else{
           if(rec&&storage[6]!=null){
               nput.add("(");
               nput.addAll(storage[6]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[6] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!sto){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("9");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '9');
        }
        termbuf = termbuf+'9';// TODO add your handling code here:
        }
            else{
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("csc(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "csc(");
        }
        if(termbuf.equals("")){
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("csc");
            nput.add("(");
        }
        else{
             if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
            if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("csc");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
          
            }
        }
            else{
           if(rec&&storage[9]!=null){
               nput.add("(");
               nput.addAll(storage[9]);
               nput.add(")");
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
           else{
               storage[9] = (ArrayList)oput.clone();
               rec = false;
               sto = false;
               jTextField2.setText("");
               termbuf="";
               for(int i=0; i<nput.size(); i++){
                   jTextField2.setText(jTextField2.getText() + nput.get(i));
               }
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        if(nput.size()!=0){
        if(termbuf.equals("")){
            if(nput.get(nput.size()-1).equals("(")){
                parenmatch-=1;
                if(parenmatch==0){
                    jButton20.setText("=");
                }
            }
              if(nput.size()>=3&&nput.get(nput.size()-3).equals("(")&&nput.get(nput.size()-1).equals(")") &&(nput.get(nput.size()-2).equals(String.valueOf(Math.E))|| nput.get(nput.size()-2).equals(String.valueOf(Math.PI)))){//removing greek
                nput.subList(nput.size()-3, nput.size()).clear();
                //parenmatch-=1;
            }
              else if(nput.size()>=3&&nput.get(nput.size()-3).equals("(")&&nput.get(nput.size()-1).equals(")") &&oput.size()>0&&nput.get(nput.size()-2).equals(oput.get(0))){//removing ans
                  nput.subList(nput.size()-3, nput.size()).clear();
              }
              else if(nput.size()>-1&&nput.get(nput.size()-1).equals(")")){
                parenmatch+=1;
                jButton20.setText(")");
                nput.remove(nput.size()-1);
            }

            else{
                  nput.remove(nput.size()-1);
            }
           // System.out.print(nput);
            jTextField2.setText("");
        for(int i=0;i<nput.size(); i++){
            jTextField2.setText(jTextField2.getText() + nput.get(i));
        }
        }// TODO add your handling code here:
        else{
            jTextField2.setText("");
        for(int i=0;i<nput.size(); i++){
            jTextField2.setText(jTextField2.getText() + nput.get(i));
        }
       // System.out.print(nput);
        termbuf="";
        }
        newstring=false;
        }
        else{
            termbuf="";
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
       if(rad==true){
           jButton30.setText("deg");
           rad=false;
       }
       else{
           jButton30.setText("rad");
           rad=true;
       }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       if(sto==false){
           if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("e");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + 'e');
        }
        if(termbuf.equals("")){
            nput.add("(");
            nput.add(String.valueOf(Math.E));
            nput.add(")");      
        }
        else{
            nput.add(termbuf);
            nput.add("(");
            nput.add(String.valueOf(Math.E));
            nput.add(")");
            termbuf="";

        }
       }
           else{
            if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("π");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + 'π');
        }
        if(termbuf.equals("")){
            nput.add("(");
            nput.add(String.valueOf(Math.PI));
            nput.add(")");      
        }
        else{
            nput.add(termbuf);
            nput.add("(");
            nput.add(String.valueOf(Math.PI));
            nput.add(")");
            termbuf="";

        }
           }
       }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if(sto==false){
            if(!second){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("ln(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "ln(");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("ln");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("ln");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
        }
        else{
            
            if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText(" nCr  ");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + " nCr ");
        }
        if(termbuf.equals("")){
            nput.add(" nCr ");     
        }
        else{
            nput.add(termbuf);
            nput.add(" nCr ");
            termbuf="";

        }
           }
        }
    
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if(sto==false){
            if(!second){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("log(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "log(");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("log");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("log");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
        }
          else{
            if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("!");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + '!');
        }
        if(termbuf.equals("")){
            nput.add("!");     
        }
        else{
            nput.add(termbuf);
            nput.add("!");
            termbuf="";

        }
           }
    }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if(sto==false){
            if(!second){
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("√");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "√");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("√");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("√");
            termbuf="";

        }
        }
     else{
           if(newstring){
            nput=new ArrayList(10);
            if(!(oput.get(0).equals("() bad math operation")||oput.get(0).equals("invalid syntax"))){
            nput.addAll(oput);
            }
            jTextField2.setText(oput.get(0)+"ⁿ√");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "ⁿ√");
        }
        if(termbuf.equals("")){
            nput.add("ⁿ√");     
        }
        else{
            nput.add(termbuf);
            nput.add("ⁿ√");
            termbuf="";

        }
           }
    }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
     
       System.out.println("npuy" + derive(nput));
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
    second = !second;
    if(second){
    jButton12.setText("Store");
    jButton4.setText("Rec");
    jButton9.setText("sin");
    jButton5.setText("asin");
    jButton17.setText("sinh");
    jButton1.setText("csc");
    jButton10.setText("cos");
    jButton6.setText("acos");
    jButton2.setText("sec");
    jButton18.setText("cosh");
    jButton11.setText("tan");
    jButton7.setText("atan");
    jButton3.setText("cot");
    jButton19.setText("tanh");
    jButton24.setText("π");
    jButton26.setText("!");
    jButton31.setText("ⁿ√");
    jButton25.setText("nCr");
    jButton28.setText("nPr");
    
    }
    
    
    else{
        jButton12.setText("ans");
        jButton4.setText(".");
        jButton9.setText("7");
        jButton5.setText("8");
        jButton17.setText("*");
        jButton1.setText("9");
        jButton10.setText("4");
        jButton6.setText("5");
        jButton2.setText("6");
        jButton18.setText("-");
        jButton11.setText("1");
        jButton7.setText("2");
        jButton3.setText("3");
        jButton19.setText("+");
        jButton24.setText("e");
        jButton26.setText("log10");
        jButton31.setText("√");
        jButton25.setText("ln");
        jButton28.setText("abs");
    }    
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(sto==false){
            if(!second){
        parenmatch+=1;
        if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("abs(");
            newstring=false;
            parenmatch=1;
        }
        else{
            jTextField2.setText(jTextField2.getText() + "abs(");
        }
        if(termbuf.equals("")){
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("abs");
            nput.add("(");
        }
        else{
            if(termbuf.equals("-")&&(nput.size()==0||isSymbola(nput.get(nput.size()-1)))){
                nput.add("-1");
                nput.add("*");
            }
            else{
            nput.add(termbuf);
            }
          if((nput.size()>0)&&!isSymbola(nput.get(nput.size()-1))){
              nput.add("*");
          }
            nput.add("abs");
            nput.add("(");
            termbuf="";

        }
        jButton20.setText(")");
        }   
            
            else{
            
            if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText(" nPr  ");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + " nPr ");
        }
        if(termbuf.equals("")){
            nput.add(" nPr ");     
        }
        else{
            nput.add(termbuf);
            nput.add(" nPr ");
            termbuf="";

        }
           }
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
     if(newstring){
            nput=new ArrayList(10);
            jTextField2.setText("x");
            newstring=false;
            parenmatch=0;
        }
        else{
            jTextField2.setText(jTextField2.getText() + 'x');
        }
        if(termbuf.equals("")){
            //nput.add("(");
            nput.add("x");

        }
        else{
            nput.add("x");
            
            termbuf="";

        }
    }//GEN-LAST:event_jButton34ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

public static void makeSenseNums(ArrayList<String> eq){
    for(int i=0; i<eq.size()-1; i++ ){
        if(!isSymbola(eq.get(i))&&!isSymbolb(eq.get(i))&&!isSymbola(eq.get(i+1))&&!isSymbolb(eq.get(i+1))){
            eq.set(i, eq.get(i)+eq.get(i+1));
            eq.remove(i+1);
        }
}
}

public static ArrayList derive(ArrayList input){
    ArrayList<String> oput = new ArrayList();
       makeSenseNums(input);
    if(parenmatch!=0){
        input = new ArrayList(1);
        input.add("unable to match parentheses");
        return input;
    }if(!hasx(input)){
        return evaluate(input);
    }
    int i=input.indexOf("*");
        while(i>-1){
            System.out.println("while");
            double a = Double.parseDouble((String)input.get(i-1));
            int j = i;
            while(j<input.size()&&!input.get(j).equals("(")){
                j++;
            }
            if(j==input.size()){
                System.out.println("if");
                input.remove(i);
            }
            else{
            ArrayList q = new ArrayList(input.subList(i+1, rpblok(j,input)));
                System.out.println("else");
                input.remove(i);
            
            }

            i=input.indexOf("*");

        }
    
    
    
    i = 0;
    
  //  try{
    
    //System.out.println(input.size());
    
    if(input.get(i).equals("(")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+1, rpblok(i,input)));
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("abs")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("ln")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            if(hasx(q)){
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            }
            else{
                System.out.println("qq");
                oput.addAll(evaluate(q));
            }
            return oput;
            
        }
        if(input.get(i).equals("log")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            //System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.add("(");
            oput.addAll(q);
            oput.add("*");
            oput.add(String.valueOf(Math.log(10)));
            oput.add(")"); 
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
            
        }
        if(input.get(i).equals("sin")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }     
        if(input.get(i).equals("cos")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("tan")){
           //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("csc")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("sec")){
           //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("cot")){
          //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("acos")){
           //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("asin")){
           //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("atan")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("cosh")){
           //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        }
        if(input.get(i).equals("sinh")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput; 
        }
        if(input.get(i).equals("tanh")){
            //System.out.println("rp" + rpblok(i+1,input));
            ArrayList q = new ArrayList(input.subList(i+2, rpblok(i+1,input)));
            System.out.println("q" + q);
            //if(rpblok(i,input))
            oput.add("(");
            oput.add("1");
            oput.add("/");
            oput.addAll(q);
            oput.add(")"); 
           if(!derive(q).isEmpty()){
            oput.add("*");
            }
          
            oput.addAll(derive(q));
            return oput;
        
        
    } 
          return oput;    
       // }
    
//  catch(Exception nfe){
//        //System.out.println(input);
//    input.clear();
//    input.add("invalid syntax");
//    return input;
//}
    }
public static int rpblok(int i,ArrayList<String> input){
    //System.out.println("0input "+input.get(i));
    int count = 0;
    //System.out.println("rinput"+ input);
    for(int j = i;j<input.size(); j++){
        if(input.get(j).equals("(")){
        count++;
        
        }
        else if(input.get(j).equals(")")){
            count--; 
        }
        //System.out.println("count" +count);
        if(count==0){
            //System.out.println("j");
            return j;
        }
    }
    //System.out.println("n");
    return 0;
}
public static boolean hasx(ArrayList list){
    for (int i = 0; i < list.size(); i++) {
        if(list.get(i).equals("x")){
            return true;
        }
    }
    return false;
}
public static int lpblok(int i,ArrayList<String> input){
    //System.out.println("0input "+input.get(i));
    int count = 0;
    //System.out.println("rinput"+ input);
    for(int j = i;j>0; j--){
        if(input.get(j).equals("(")){
        count++;
        
        }
        else if(input.get(j).equals(")")){
            count--; 
        }
        //System.out.println("count" +count);
        if(count==0){
            //System.out.println("j");
            return j;
        }
    }
    //System.out.println("n");
    return 0;
}
}