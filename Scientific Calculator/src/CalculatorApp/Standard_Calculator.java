package CalculatorApp;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Standard_Calculator extends javax.swing.JFrame {

    double num1, num2;
    double result;
    String operations = "";

    public Standard_Calculator() {
        initComponents();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jOn = new javax.swing.JRadioButton();
        jClean = new javax.swing.JButton();
        jBackspace = new javax.swing.JButton();
        jSquareRoot = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jDivision = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMultiplication = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSubstraction = new javax.swing.JButton();
        jAddition = new javax.swing.JButton();
        jEqual = new javax.swing.JButton();
        jDot = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jDisplay = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mStandard = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mScientific = new javax.swing.JMenuItem();

        jButton4.setText("jButton1");
        jButton4.setMargin(new java.awt.Insets(3, 15, 3, 15));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CALCULATOR"); // NOI18N
        setBounds(new java.awt.Rectangle(3, 3, 0, 0));
        setForeground(new java.awt.Color(153, 153, 255));
        setLocation(new java.awt.Point(200, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jOn.setBackground(new java.awt.Color(0, 102, 0));
        jOn.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        jOn.setForeground(new java.awt.Color(0, 0, 0));
        jOn.setText("ON");
        jOn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jOn.setBorderPainted(true);
        jOn.setFocusCycleRoot(true);
        jOn.setVerifyInputWhenFocusTarget(false);
        jOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOnActionPerformed(evt);
            }
        });

        jClean.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jClean.setText("C");
        jClean.setActionCommand("");
        jClean.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jClean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jClean.setEnabled(false);
        jClean.setFocusCycleRoot(true);
        jClean.setVerifyInputWhenFocusTarget(false);
        jClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleanActionPerformed(evt);
            }
        });

        jBackspace.setFont(new java.awt.Font("Wingdings", 1, 14)); // NOI18N
        jBackspace.setText("");
        jBackspace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jBackspace.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBackspace.setEnabled(false);
        jBackspace.setFocusCycleRoot(true);
        jBackspace.setVerifyInputWhenFocusTarget(false);
        jBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackspaceActionPerformed(evt);
            }
        });

        jSquareRoot.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        jSquareRoot.setText("");
        jSquareRoot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jSquareRoot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSquareRoot.setEnabled(false);
        jSquareRoot.setFocusCycleRoot(true);
        jSquareRoot.setVerifyInputWhenFocusTarget(false);
        jSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSquareRootActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setEnabled(false);
        jButton7.setFocusCycleRoot(true);
        jButton7.setVerifyInputWhenFocusTarget(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setEnabled(false);
        jButton8.setFocusCycleRoot(true);
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setEnabled(false);
        jButton9.setFocusCycleRoot(true);
        jButton9.setVerifyInputWhenFocusTarget(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jDivision.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jDivision.setText("/");
        jDivision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDivision.setEnabled(false);
        jDivision.setFocusCycleRoot(true);
        jDivision.setVerifyInputWhenFocusTarget(false);
        jDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivisionActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        Button4.setText("4");
        Button4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button4.setEnabled(false);
        Button4.setFocusCycleRoot(true);
        Button4.setVerifyInputWhenFocusTarget(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setEnabled(false);
        jButton5.setFocusCycleRoot(true);
        jButton5.setVerifyInputWhenFocusTarget(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setEnabled(false);
        jButton6.setFocusCycleRoot(true);
        jButton6.setVerifyInputWhenFocusTarget(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jMultiplication.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jMultiplication.setText("*");
        jMultiplication.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jMultiplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMultiplication.setEnabled(false);
        jMultiplication.setFocusCycleRoot(true);
        jMultiplication.setVerifyInputWhenFocusTarget(false);
        jMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiplicationActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setEnabled(false);
        jButton1.setFocusCycleRoot(true);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setEnabled(false);
        jButton2.setFocusCycleRoot(true);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setEnabled(false);
        jButton3.setFocusCycleRoot(true);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSubstraction.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jSubstraction.setText("-");
        jSubstraction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jSubstraction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSubstraction.setEnabled(false);
        jSubstraction.setFocusCycleRoot(true);
        jSubstraction.setVerifyInputWhenFocusTarget(false);
        jSubstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubstractionActionPerformed(evt);
            }
        });

        jAddition.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jAddition.setText("+");
        jAddition.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jAddition.setEnabled(false);
        jAddition.setFocusCycleRoot(true);
        jAddition.setVerifyInputWhenFocusTarget(false);
        jAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdditionActionPerformed(evt);
            }
        });

        jEqual.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jEqual.setText("=");
        jEqual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jEqual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jEqual.setEnabled(false);
        jEqual.setFocusCycleRoot(true);
        jEqual.setVerifyInputWhenFocusTarget(false);
        jEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEqualActionPerformed(evt);
            }
        });

        jDot.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jDot.setText(".");
        jDot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jDot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDot.setEnabled(false);
        jDot.setFocusCycleRoot(true);
        jDot.setVerifyInputWhenFocusTarget(false);
        jDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDotActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton0.setEnabled(false);
        jButton0.setFocusCycleRoot(true);
        jButton0.setVerifyInputWhenFocusTarget(false);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jDisplay.setBackground(new java.awt.Color(204, 255, 255));
        jDisplay.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jDisplay.setToolTipText("");
        jDisplay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 3, true));
        jDisplay.setEnabled(false);
        jDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayActionPerformed(evt);
            }
        });
        jDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDisplayKeyTyped(evt);
            }
        });

        jMenu.setBackground(new java.awt.Color(255, 102, 102));
        jMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 2, true));
        jMenu.setForeground(new java.awt.Color(0, 0, 0));
        jMenu.setText("Menu");
        jMenu.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });

        mStandard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mStandard.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mStandard.setText("Standard");
        mStandard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        mStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStandardActionPerformed(evt);
            }
        });
        jMenu.add(mStandard);
        JOptionPane.showMessageDialog(null, " Welcome To Standard Calculator. ", "WELCOME", JOptionPane.INFORMATION_MESSAGE);

        jMenu.add(jSeparator1);

        mScientific.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mScientific.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mScientific.setText("Scientific");
        mScientific.setActionCommand("mSt");
        mScientific.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        mScientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mScientificActionPerformed(evt);
            }
        });
        jMenu.add(mScientific);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jOn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jClean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClean, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        setBounds(0, 0, 269, 354);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        this.setSize(260, 336);
    }//GEN-LAST:event_formWindowActivated

    private void jOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOnActionPerformed
        if (jOn.isSelected()) {
            jDisplay.setEnabled(true);
            jClean.setEnabled(true);
            jBackspace.setEnabled(true);
            jButton0.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            Button4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jDot.setEnabled(true);
            jEqual.setEnabled(true);
            jSquareRoot.setEnabled(true);
            jDivision.setEnabled(true);
            jMultiplication.setEnabled(true);
            jSubstraction.setEnabled(true);
            jAddition.setEnabled(true);
        } else {
            jDisplay.setText("");
            jDisplay.setEnabled(false);
            jClean.setEnabled(false);
            jBackspace.setEnabled(false);
            jButton0.setEnabled(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            Button4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
            jButton9.setEnabled(false);
            jDot.setEnabled(false);
            jEqual.setEnabled(false);
            jSquareRoot.setEnabled(false);
            jDivision.setEnabled(false);
            jMultiplication.setEnabled(false);
            jSubstraction.setEnabled(false);
            jAddition.setEnabled(false);
        }
    }//GEN-LAST:event_jOnActionPerformed

    private void jCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleanActionPerformed
        jDisplay.setText("");
        result = 0;
        num1 = 0;
        num2 = 0;
        operations = "";
    }//GEN-LAST:event_jCleanActionPerformed

    private void jBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackspaceActionPerformed
        String bsp = null;
        if (jDisplay.getText().length() > 0) {
            StringBuilder strB = new StringBuilder(jDisplay.getText());
            strB.deleteCharAt(jDisplay.getText().length() - 1);
            bsp = strB.toString();
            jDisplay.setText(bsp);
        }
    }//GEN-LAST:event_jBackspaceActionPerformed

    private void jSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSquareRootActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        try {
            if (num1 < 0) {
                throw new ArithmeticException("Enter Positive Number.");
            } else {
                result = Math.sqrt(num1);
                jDisplay.setText(String.format("%.10f", result));
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e, "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jSquareRootActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String num = jDisplay.getText() + jButton7.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String num = jDisplay.getText() + jButton8.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String num = jDisplay.getText() + jButton9.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivisionActionPerformed
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "/";
    }//GEN-LAST:event_jDivisionActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        String num = jDisplay.getText() + Button4.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_Button4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String num = jDisplay.getText() + jButton5.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String num = jDisplay.getText() + jButton6.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiplicationActionPerformed
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "*";
    }//GEN-LAST:event_jMultiplicationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String num = jDisplay.getText() + jButton1.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String num = jDisplay.getText() + jButton2.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String num = jDisplay.getText() + jButton3.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jSubstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubstractionActionPerformed
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "-";
    }//GEN-LAST:event_jSubstractionActionPerformed

    private void jAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdditionActionPerformed
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "+";
    }//GEN-LAST:event_jAdditionActionPerformed

    private void jEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEqualActionPerformed
        num2 = Double.parseDouble(jDisplay.getText());
        switch (operations) {
            case "+": {
                result = num1 + num2;
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "-": {
                result = num1 - num2;
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "*": {
                result = num1 * num2;
                jDisplay.setText(String.format("%.5f", result));
                break;
            }
            case "/": {
                result = num1 / num2;
                jDisplay.setText(String.format("%10.5f", result));
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_jEqualActionPerformed

    private void jDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDotActionPerformed
        if (!jDisplay.getText().contains(".")) {
            jDisplay.setText(jDisplay.getText() + jDot.getText());
        }
    }//GEN-LAST:event_jDotActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        String num = jDisplay.getText() + jButton0.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayActionPerformed

    }//GEN-LAST:event_jDisplayActionPerformed

    private void jDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDisplayKeyTyped

    }//GEN-LAST:event_jDisplayKeyTyped

    private void mStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mStandardActionPerformed
        this.setResizable(false);
        this.setSize(260, 336);
    }//GEN-LAST:event_mStandardActionPerformed

    private void mScientificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mScientificActionPerformed
        new Scientific_Calculator().setVisible(true);
        close();
    }//GEN-LAST:event_mScientificActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
        if (evt.getSource() == mStandard) {
            new Standard_Calculator().mStandardActionPerformed(evt);
        } else {
            new Standard_Calculator().mScientificActionPerformed(evt);
        }
    }//GEN-LAST:event_jMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Standard_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Standard_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button4;
    private javax.swing.JButton jAddition;
    private javax.swing.JButton jBackspace;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jClean;
    private javax.swing.JTextField jDisplay;
    private javax.swing.JButton jDivision;
    private javax.swing.JButton jDot;
    private javax.swing.JButton jEqual;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jMultiplication;
    private javax.swing.JRadioButton jOn;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jSquareRoot;
    private javax.swing.JButton jSubstraction;
    private javax.swing.JMenuItem mScientific;
    private javax.swing.JMenuItem mStandard;
    // End of variables declaration//GEN-END:variables
}
