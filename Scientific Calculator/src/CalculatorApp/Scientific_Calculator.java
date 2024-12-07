package CalculatorApp;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Scientific_Calculator extends javax.swing.JFrame {

    double num1, num2;
    double result;
    BigInteger bigNum1, bigNum2, bigResut;
    String operations = "";

    public Scientific_Calculator() {
        initComponents();
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDisplay = new javax.swing.JTextField();
        jBackspace = new javax.swing.JButton();
        jSquareRoot = new javax.swing.JButton();
        jClean = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jDivision = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMultiplication = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSubstraction = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jDot = new javax.swing.JButton();
        jEqual = new javax.swing.JButton();
        jAddition = new javax.swing.JButton();
        jOn = new javax.swing.JRadioButton();
        jSquare = new javax.swing.JButton();
        jLogarithm = new javax.swing.JButton();
        jFloor = new javax.swing.JButton();
        jInverse = new javax.swing.JButton();
        jCeil = new javax.swing.JButton();
        jPermutation = new javax.swing.JButton();
        jCube = new javax.swing.JButton();
        jxPowery = new javax.swing.JButton();
        jPi = new javax.swing.JButton();
        jEulerNumber = new javax.swing.JButton();
        jExpLog = new javax.swing.JButton();
        jHypFunct = new javax.swing.JComboBox<>();
        jTrigFunct = new javax.swing.JComboBox<>();
        jRound = new javax.swing.JButton();
        jCombination = new javax.swing.JButton();
        jFactorial = new javax.swing.JButton();
        jMinusPlus = new javax.swing.JButton();
        jNumConvert = new javax.swing.JComboBox<>();
        jCubeRoot = new javax.swing.JButton();
        jxInversePowery = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mStandard = new javax.swing.JMenuItem();
        mScientific = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SCIENTIFIC CALCULATOR"); // NOI18N
        setBackground(new java.awt.Color(51, 102, 255));
        setBounds(new java.awt.Rectangle(3, 3, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 153, 255));
        setLocation(new java.awt.Point(200, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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
        jClean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCleanKeyPressed(evt);
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

        jButton4.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setEnabled(false);
        jButton4.setFocusCycleRoot(true);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        jSquare.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jSquare.setText("x^2");
        jSquare.setToolTipText("");
        jSquare.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jSquare.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSquare.setEnabled(false);
        jSquare.setFocusCycleRoot(true);
        jSquare.setVerifyInputWhenFocusTarget(false);
        jSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSquareActionPerformed(evt);
            }
        });

        jLogarithm.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jLogarithm.setText("log");
        jLogarithm.setToolTipText("");
        jLogarithm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jLogarithm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLogarithm.setEnabled(false);
        jLogarithm.setFocusCycleRoot(true);
        jLogarithm.setVerifyInputWhenFocusTarget(false);
        jLogarithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogarithmActionPerformed(evt);
            }
        });

        jFloor.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        jFloor.setText(" ");
        jFloor.setToolTipText("");
        jFloor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jFloor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFloor.setEnabled(false);
        jFloor.setFocusCycleRoot(true);
        jFloor.setVerifyInputWhenFocusTarget(false);
        jFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFloorActionPerformed(evt);
            }
        });

        jInverse.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jInverse.setText("x^(-1)");
        jInverse.setToolTipText("");
        jInverse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jInverse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInverse.setEnabled(false);
        jInverse.setFocusCycleRoot(true);
        jInverse.setVerifyInputWhenFocusTarget(false);
        jInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInverseActionPerformed(evt);
            }
        });

        jCeil.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        jCeil.setText(" ");
        jCeil.setToolTipText("");
        jCeil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jCeil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCeil.setEnabled(false);
        jCeil.setFocusCycleRoot(true);
        jCeil.setVerifyInputWhenFocusTarget(false);
        jCeil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCeilActionPerformed(evt);
            }
        });

        jPermutation.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jPermutation.setText("nPr");
        jPermutation.setToolTipText("");
        jPermutation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jPermutation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPermutation.setEnabled(false);
        jPermutation.setFocusCycleRoot(true);
        jPermutation.setVerifyInputWhenFocusTarget(false);
        jPermutation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPermutationActionPerformed(evt);
            }
        });

        jCube.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jCube.setText("x^3");
        jCube.setToolTipText("");
        jCube.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jCube.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCube.setEnabled(false);
        jCube.setFocusCycleRoot(true);
        jCube.setVerifyInputWhenFocusTarget(false);
        jCube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCubeActionPerformed(evt);
            }
        });

        jxPowery.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jxPowery.setText("x^y");
        jxPowery.setToolTipText("");
        jxPowery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jxPowery.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jxPowery.setEnabled(false);
        jxPowery.setFocusCycleRoot(true);
        jxPowery.setVerifyInputWhenFocusTarget(false);
        jxPowery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxPoweryActionPerformed(evt);
            }
        });

        jPi.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        jPi.setText("");
        jPi.setToolTipText("");
        jPi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jPi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPi.setEnabled(false);
        jPi.setFocusCycleRoot(true);
        jPi.setVerifyInputWhenFocusTarget(false);
        jPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPiActionPerformed(evt);
            }
        });

        jEulerNumber.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jEulerNumber.setText("e");
        jEulerNumber.setToolTipText("");
        jEulerNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jEulerNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jEulerNumber.setEnabled(false);
        jEulerNumber.setFocusCycleRoot(true);
        jEulerNumber.setVerifyInputWhenFocusTarget(false);
        jEulerNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEulerNumberActionPerformed(evt);
            }
        });

        jExpLog.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jExpLog.setText("ln");
        jExpLog.setToolTipText("");
        jExpLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jExpLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jExpLog.setEnabled(false);
        jExpLog.setFocusCycleRoot(true);
        jExpLog.setVerifyInputWhenFocusTarget(false);
        jExpLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExpLogActionPerformed(evt);
            }
        });

        jHypFunct.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jHypFunct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sinh", "cosh", "tanh", "csch", "sech", "coth" }));
        jHypFunct.setToolTipText("");
        jHypFunct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jHypFunct.setEnabled(false);
        jHypFunct.setFocusCycleRoot(true);
        jHypFunct.setVerifyInputWhenFocusTarget(false);
        jHypFunct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHypFunctActionPerformed(evt);
            }
        });

        jTrigFunct.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jTrigFunct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sin", "cos", "tan", "csc", "sec", "cot" }));
        jTrigFunct.setToolTipText("");
        jTrigFunct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jTrigFunct.setEnabled(false);
        jTrigFunct.setFocusCycleRoot(true);
        jTrigFunct.setVerifyInputWhenFocusTarget(false);
        jTrigFunct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrigFunctActionPerformed(evt);
            }
        });

        jRound.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jRound.setText("rund");
        jRound.setToolTipText("");
        jRound.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jRound.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRound.setEnabled(false);
        jRound.setFocusCycleRoot(true);
        jRound.setVerifyInputWhenFocusTarget(false);
        jRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoundActionPerformed(evt);
            }
        });

        jCombination.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jCombination.setText("nCr");
        jCombination.setToolTipText("");
        jCombination.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jCombination.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCombination.setEnabled(false);
        jCombination.setFocusCycleRoot(true);
        jCombination.setVerifyInputWhenFocusTarget(false);
        jCombination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombinationActionPerformed(evt);
            }
        });

        jFactorial.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jFactorial.setText("n!");
        jFactorial.setToolTipText("");
        jFactorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jFactorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFactorial.setEnabled(false);
        jFactorial.setFocusCycleRoot(true);
        jFactorial.setVerifyInputWhenFocusTarget(false);
        jFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFactorialActionPerformed(evt);
            }
        });

        jMinusPlus.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        jMinusPlus.setText("");
        jMinusPlus.setToolTipText("");
        jMinusPlus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jMinusPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMinusPlus.setEnabled(false);
        jMinusPlus.setFocusCycleRoot(true);
        jMinusPlus.setVerifyInputWhenFocusTarget(false);
        jMinusPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinusPlusActionPerformed(evt);
            }
        });

        jNumConvert.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jNumConvert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIN", "OCTAL", "HEX" }));
        jNumConvert.setToolTipText("");
        jNumConvert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jNumConvert.setEnabled(false);
        jNumConvert.setFocusCycleRoot(true);
        jNumConvert.setVerifyInputWhenFocusTarget(false);
        jNumConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumConvertActionPerformed(evt);
            }
        });

        jCubeRoot.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jCubeRoot.setText("3√");
        jCubeRoot.setToolTipText("");
        jCubeRoot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jCubeRoot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCubeRoot.setEnabled(false);
        jCubeRoot.setFocusCycleRoot(true);
        jCubeRoot.setVerifyInputWhenFocusTarget(false);
        jCubeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCubeRootActionPerformed(evt);
            }
        });

        jxInversePowery.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jxInversePowery.setText("x^(-y)");
        jxInversePowery.setToolTipText("");
        jxInversePowery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 255, 204), new java.awt.Color(51, 0, 255), new java.awt.Color(153, 153, 255)));
        jxInversePowery.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jxInversePowery.setEnabled(false);
        jxInversePowery.setFocusCycleRoot(true);
        jxInversePowery.setVerifyInputWhenFocusTarget(false);
        jxInversePowery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxInversePoweryActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(0, 0, 0)));
        jMenu.setText("Menu");
        jMenu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });

        mStandard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mStandard.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mStandard.setText("Standard");
        mStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStandardActionPerformed(evt);
            }
        });
        jMenu.add(mStandard);

        mScientific.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mScientific.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        mScientific.setText("Scientific");
        mScientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mScientificActionPerformed(evt);
            }
        });
        jMenu.add(mScientific);
        JOptionPane.showMessageDialog(null, " Welcome To Scientific Calculator. ", "WELCOME", JOptionPane.INFORMATION_MESSAGE);

        jMenu.add(jSeparator1);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jOn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jClean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTrigFunct, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jHypFunct, javax.swing.GroupLayout.Alignment.LEADING, 0, 87, Short.MAX_VALUE)
                                    .addComponent(jCubeRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jInverse, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jCombination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jNumConvert, 0, 86, Short.MAX_VALUE)
                                    .addComponent(jxInversePowery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jxPowery, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLogarithm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jExpLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPermutation, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFloor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jMinusPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEulerNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCeil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jMinusPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jOn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClean, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBackspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSquareRoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCube, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jCombination, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCeil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jHypFunct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRound, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTrigFunct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jxPowery, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)))
                                    .addComponent(jPermutation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jExpLog, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jEulerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLogarithm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jxInversePowery, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNumConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mScientificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mScientificActionPerformed
        this.setResizable(false);
        this.setSize(570, 365);
    }//GEN-LAST:event_mScientificActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String num = jDisplay.getText() + jButton7.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String num = jDisplay.getText() + jButton4.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String num = jDisplay.getText() + jButton1.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        String num = jDisplay.getText() + jButton0.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayActionPerformed

    }//GEN-LAST:event_jDisplayActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        this.setSize(570, 365);
    }//GEN-LAST:event_formWindowActivated

    private void mStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mStandardActionPerformed
        new Standard_Calculator().setVisible(true);
        close();
    }//GEN-LAST:event_mStandardActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
        if (evt.getSource() == mStandard) {
            new Scientific_Calculator().mStandardActionPerformed(evt);
        } else {
            new Scientific_Calculator().mScientificActionPerformed(evt);
        }
    }//GEN-LAST:event_jMenuActionPerformed

    private void jSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSquareActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = Math.pow(num1, 2);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jSquareActionPerformed

    private void jCubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCubeActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = Math.pow(num1, 3);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jCubeActionPerformed

    private void jxPoweryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxPoweryActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        jDisplay.setText(null);
        operations = "x^y";
    }//GEN-LAST:event_jxPoweryActionPerformed

    private void jPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPiActionPerformed
        num1 = Math.PI;
        jDisplay.setText(String.valueOf(num1));
    }//GEN-LAST:event_jPiActionPerformed

    private void jRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoundActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = Math.round(num1);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jRoundActionPerformed

    private void jEulerNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEulerNumberActionPerformed
        num1 = Math.E;
        jDisplay.setText(String.valueOf(num1));
    }//GEN-LAST:event_jEulerNumberActionPerformed

    private void jFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFactorialActionPerformed
        int num = Integer.parseInt(jDisplay.getText());
        if (num < 0) {
            bigNum1 = new BigInteger(jDisplay.getText().substring(1));
        } else if (num >= 0) {
            bigNum1 = new BigInteger(jDisplay.getText());
        }
        NumberFormat numForm = new DecimalFormat("0.#########E0");
        bigResut = Factorial(bigNum1);
        String str = numForm.format(bigResut);
        if (num < 0) {
            jDisplay.setText("-" + str);
        } else {
            jDisplay.setText(str);
        }
    }//GEN-LAST:event_jFactorialActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String num = jDisplay.getText() + jButton8.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String num = jDisplay.getText() + jButton5.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String num = jDisplay.getText() + jButton2.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String num = jDisplay.getText() + jButton9.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String num = jDisplay.getText() + jButton6.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String num = jDisplay.getText() + jButton3.getText();
        jDisplay.setText(num);
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void jDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDotActionPerformed
        if (!jDisplay.getText().contains(".")) {
            jDisplay.setText(jDisplay.getText() + jDot.getText());
        }
    }//GEN-LAST:event_jDotActionPerformed

    private void jDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDisplayKeyTyped

    }//GEN-LAST:event_jDisplayKeyTyped

    private void jEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEqualActionPerformed
        num2 = Double.parseDouble(jDisplay.getText());
        bigNum2 = new BigInteger(jDisplay.getText());
        switch (operations) {
            case "+": {
                result += num2;
                jDisplay.setText(String.valueOf(result));
                result = 0;
                break;
            }
            case "-": {
                result = num1 - num2;
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "*": {
                result = num1 * num2;
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "/": {
                result = num1 / num2;
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "x^y": {
                result = Math.pow(num1, num2);
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "x^(-y)": {
                result = 1 / Math.pow(num1, num2);
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "nCr": {
                // r must be less than n; n greater than 0; r greater or equals to 0
                try {
                    if ((num2 < num1) && (num1 > 0) && (num2 >= 0)) {
                        bigResut = (Factorial(bigNum1).divide(Factorial(bigNum2).multiply(Factorial(bigNum1.subtract(bigNum2)))));
                        NumberFormat numForm = new DecimalFormat("0.#########E0");
                        String str = numForm.format(bigResut);
                        if (num1 > 30) {
                            jDisplay.setText(str);
                        } else {
                            jDisplay.setText(String.valueOf(bigResut));
                        }
                    } else {
                        throw new ArithmeticException("\n Follow: \n   n > 0   and   r < n   and   r >= 0  ");
                    }
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, e, "Instrustion Box", JOptionPane.WARNING_MESSAGE);
                }
                break;
            }
            case "nPr": {
                // n greater than 0; r greater or equals to 0; r must be less than n 
                try {
                    if ((num2 < num1) && (num1 > 0) && (num2 >= 0)) {
                        bigResut = (Factorial(bigNum1).divide(Factorial(bigNum1.subtract(bigNum2))));
                        NumberFormat numForm = new DecimalFormat("0.#########E0");
                        String str = numForm.format(bigResut);
                        if (num1 > 18) {
                            jDisplay.setText(str);
                        } else {
                            jDisplay.setText(String.valueOf(bigResut));
                        }
                    } else {
                        throw new ArithmeticException("\n Follow: \n   n > 0   and   r < n   and   r >= 0  ");
                    }
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, e, "Instrustion Box", JOptionPane.WARNING_MESSAGE);
                }
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_jEqualActionPerformed

    private void jAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdditionActionPerformed
        for (int i = 0;; i++) {
            num1 = Double.parseDouble(jDisplay.getText());
            jDisplay.setText(null);
            result += num1;
            operations = "+";
        }
    }//GEN-LAST:event_jAdditionActionPerformed

    private void jSubstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubstractionActionPerformed
        if (jDisplay.getText().equals("")) {
            jDisplay.setText("-");
        }
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "-";
    }//GEN-LAST:event_jSubstractionActionPerformed

    private void jMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiplicationActionPerformed
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "*";
    }//GEN-LAST:event_jMultiplicationActionPerformed

    private void jDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivisionActionPerformed
        num1 = Double.parseDouble(jDisplay.getText());
        jDisplay.setText(null);
        operations = "/";
    }//GEN-LAST:event_jDivisionActionPerformed

    private void jTrigFunctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrigFunctActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        switch (jTrigFunct.getSelectedItem().toString()) {
            case "sin": {
                if ((num1 % 180 == 0) || (num1 % 360 == 0)) {
                    result = 0;
                } else {
                    result = Math.sin(Math.toRadians(num1));
                }
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "cos": {
                if ((num1 % 90 == 0) || (num1 % 270 == 0)) {
                    result = 0;
                } else {
                    result = Math.cos(Math.toRadians(num1));
                }
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "tan": {
                try {
                    if ((num1 % 180 == 0) || (num1 % 360 == 0)) {
                        result = 0;
                        jDisplay.setText(String.valueOf(result));
                    } else if ((num1 % 90 == 0) || (num1 % 270 == 0)) {
                        jDisplay.setText("NaN");
                        throw new ArithmeticException("\n  tan(" + num1 + ") is undifine.");
                    } else {
                        result = Math.tan(Math.toRadians(num1));
                        jDisplay.setText(String.valueOf(result));
                    }
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, e, "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }
            case "csc": {
                try {
                    if (num1 < -1 || num1 > 1) {
                        throw new ArithmeticException("\n Input Must Be Greater Than -1 And Less Than +1");
                    } else {
                        result = Math.toDegrees(Math.asin(num1));
                        jDisplay.setText(String.valueOf(result));
                    }
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, e, "WARNING", JOptionPane.WARNING_MESSAGE);
                }
                break;
            }
            case "sec": {
                try {
                    if (num1 < -1 || num1 > 1) {
                        throw new ArithmeticException("\n Input Must Be Greater Than -1 And Less Than +1");
                    } else {
                        result = Math.toDegrees(Math.acos(num1));
                        jDisplay.setText(String.valueOf(result));
                    }
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, e, "WARNING", JOptionPane.WARNING_MESSAGE);
                }
                break;
            }
            case "cot": {
                result = Math.toDegrees(Math.atan(num1));
                jDisplay.setText(String.valueOf(result));
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_jTrigFunctActionPerformed

    private void jSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSquareRootActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        try {
            if (num1 >= 0) {
                result = Math.sqrt(num1);
                jDisplay.setText(String.valueOf(result));
            } else {
                throw new ArithmeticException("\n !! Use A Positive Number !!");
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e, "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jSquareRootActionPerformed

    private void jMinusPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinusPlusActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        num1 = num1 * (-1);
        jDisplay.setText(String.valueOf(num1));
    }//GEN-LAST:event_jMinusPlusActionPerformed

    private void jLogarithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogarithmActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        try {
            if (num1 >= 0) {
                result = Math.log10(num1);
                jDisplay.setText(String.valueOf(result));
            } else {
                throw new ArithmeticException("\n   Found ERROR !!\n Use A Positive Number !!");
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e, "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLogarithmActionPerformed

    private void jExpLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExpLogActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        try {
            if (num1 >= 0) {
                result = Math.log(num1);
                jDisplay.setText(String.valueOf(result));
            } else {
                throw new ArithmeticException("\n   Found ERROR !!\n Use A Positive Number !!");
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e, "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jExpLogActionPerformed

    private void jHypFunctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHypFunctActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        switch (jHypFunct.getSelectedItem().toString()) {
            case "sinh": {
                result = Math.sinh(num1);
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "cosh": {
                result = Math.cosh(num1);
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "tanh": {
                result = Math.tanh(num1);
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "csch": {
                result = Math.log(num1 + Math.sqrt((Math.pow(num1, 2)) + 1));
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "sech": {
                result = Math.log(num1 + Math.sqrt((Math.pow(num1, 2)) - 1));
                jDisplay.setText(String.valueOf(result));
                break;
            }
            case "coth": {
                result = 0.5 * Math.log((1 + num1) / (1 - num1));
                jDisplay.setText(String.valueOf(result));
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_jHypFunctActionPerformed

    private void jNumConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumConvertActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        switch (jNumConvert.getSelectedItem().toString()) {
            case "BIN": {
                jDisplay.setText("BIN  " + Integer.toBinaryString((int) num1));
                JOptionPane.showMessageDialog(null, "Binary value of " + (int) num1, "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case "OCTAL": {
                jDisplay.setText("OCT  " + Integer.toOctalString((int) num1));
                JOptionPane.showMessageDialog(null, "Octal value of " + (int) num1, "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case "HEX": {
                jDisplay.setText("HEX  " + Integer.toHexString((int) num1));
                JOptionPane.showMessageDialog(null, "HexaDecimal value of " + (int) num1, "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            default: {
                break;
            }
        }
    }//GEN-LAST:event_jNumConvertActionPerformed

    private void jCubeRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCubeRootActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = Math.cbrt(num1);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jCubeRootActionPerformed

    private BigInteger Factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(Factorial(n.subtract(BigInteger.ONE)));
        }
    }

    private void jCombinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombinationActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        bigNum1 = new BigInteger(jDisplay.getText());
        jDisplay.setText(null);
        operations = "nCr";
    }//GEN-LAST:event_jCombinationActionPerformed

    private void jPermutationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPermutationActionPerformed
        num1 = Integer.valueOf(jDisplay.getText());
        bigNum1 = new BigInteger(jDisplay.getText());
        jDisplay.setText(null);
        operations = "nPr";
    }//GEN-LAST:event_jPermutationActionPerformed

    private void jInverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInverseActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = (1 / num1);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jInverseActionPerformed

    private void jOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOnActionPerformed
        if (jOn.isSelected()) {
            jDisplay.setEnabled(true);
            jClean.setEnabled(true);
            jBackspace.setEnabled(true);
            jButton0.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
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
            jMinusPlus.setEnabled(true);
            jLogarithm.setEnabled(true);
            jExpLog.setEnabled(true);
            jEulerNumber.setEnabled(true);
            jPi.setEnabled(true);
            jCeil.setEnabled(true);
            jFloor.setEnabled(true);
            jFactorial.setEnabled(true);
            jRound.setEnabled(true);
            jPermutation.setEnabled(true);
            jCombination.setEnabled(true);
            jSquare.setEnabled(true);
            jCube.setEnabled(true);
            jxPowery.setEnabled(true);
            jxInversePowery.setEnabled(true);
            jInverse.setEnabled(true);
            jCubeRoot.setEnabled(true);
            jTrigFunct.setEnabled(true);
            jHypFunct.setEnabled(true);
            jNumConvert.setEnabled(true);
        } else {
            jDisplay.setText("");
            jDisplay.setEnabled(false);
            jClean.setEnabled(false);
            jBackspace.setEnabled(false);
            jButton0.setEnabled(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
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
            jMinusPlus.setEnabled(false);
            jLogarithm.setEnabled(false);
            jExpLog.setEnabled(false);
            jEulerNumber.setEnabled(false);
            jPi.setEnabled(false);
            jCeil.setEnabled(false);
            jFloor.setEnabled(false);
            jFactorial.setEnabled(false);
            jRound.setEnabled(false);
            jPermutation.setEnabled(false);
            jCombination.setEnabled(false);
            jSquare.setEnabled(false);
            jCube.setEnabled(false);
            jxPowery.setEnabled(false);
            jxInversePowery.setEnabled(false);
            jInverse.setEnabled(false);
            jCubeRoot.setEnabled(false);
            jTrigFunct.setEnabled(false);
            jHypFunct.setEnabled(false);
            jNumConvert.setEnabled(false);
        }
    }//GEN-LAST:event_jOnActionPerformed

    private void jFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFloorActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = Math.floor(num1);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jFloorActionPerformed

    private void jCeilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCeilActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        result = Math.ceil(num1);
        jDisplay.setText(String.valueOf(result));
    }//GEN-LAST:event_jCeilActionPerformed

    private void jxInversePoweryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxInversePoweryActionPerformed
        num1 = Double.valueOf(jDisplay.getText());
        jDisplay.setText(null);
        operations = "x^(-y)";
    }//GEN-LAST:event_jxInversePoweryActionPerformed

    private void jCleanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCleanKeyPressed

    }//GEN-LAST:event_jCleanKeyPressed

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
            java.util.logging.Logger.getLogger(Scientific_Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scientific_Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Scientific_Calculator().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
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
    private javax.swing.JButton jCeil;
    private javax.swing.JButton jClean;
    private javax.swing.JButton jCombination;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jCube;
    private javax.swing.JButton jCubeRoot;
    private javax.swing.JTextField jDisplay;
    private javax.swing.JButton jDivision;
    private javax.swing.JButton jDot;
    private javax.swing.JButton jEqual;
    private javax.swing.JButton jEulerNumber;
    private javax.swing.JButton jExpLog;
    private javax.swing.JButton jFactorial;
    private javax.swing.JButton jFloor;
    private javax.swing.JComboBox<String> jHypFunct;
    private javax.swing.JButton jInverse;
    private javax.swing.JButton jLogarithm;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jMinusPlus;
    private javax.swing.JButton jMultiplication;
    private javax.swing.JComboBox<String> jNumConvert;
    private javax.swing.JRadioButton jOn;
    private javax.swing.JButton jPermutation;
    private javax.swing.JButton jPi;
    private javax.swing.JButton jRound;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jSquare;
    private javax.swing.JButton jSquareRoot;
    private javax.swing.JButton jSubstraction;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jTrigFunct;
    private javax.swing.JButton jxInversePowery;
    private javax.swing.JButton jxPowery;
    private javax.swing.JMenuItem mScientific;
    private javax.swing.JMenuItem mStandard;
    // End of variables declaration//GEN-END:variables

}
