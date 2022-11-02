package Calculadora;

public class CalculadoraUI extends javax.swing.JFrame {
    private String cadenaNumeros = "";
    private String operaciones = "nula";
    private double primerNumero, resutado;
    private boolean punto = true;
    boolean igual=false;

    double num1 = 0;
    double num2 = 0;
    Operaciones operacion1 = new Operaciones();
    private Object numero1;
    private Object numero2;
 
    public CalculadoraUI() {
        initComponents();
        this.setTitle("Calculadora Brink");
        this.setLocationRelativeTo(null);  //Centra la ventana en la pantalla
        txtPantallita.setText("");
        txtPantallota.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPantallita = new javax.swing.JTextField();
        txtPantallota = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        c = new javax.swing.JButton();
        cc = new javax.swing.JButton();
        btnApagado = new javax.swing.JButton();
        btnBorrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 208, 247));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(49, 208, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setEnabled(false);
        jPanel1.setName(""); // NOI18N

        txtPantallita.setEditable(false);
        txtPantallita.setBackground(new java.awt.Color(209, 207, 207));
        txtPantallita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPantallita.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantallita.setBorder(new javax.swing.border.MatteBorder(null));
        txtPantallita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallitaActionPerformed(evt);
            }
        });

        txtPantallota.setEditable(false);
        txtPantallota.setBackground(new java.awt.Color(153, 149, 149));
        txtPantallota.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtPantallota.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantallota.setBorder(new javax.swing.border.MatteBorder(null));
        txtPantallota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallotaActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(142, 226, 255));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(142, 226, 255));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(255, 255, 233));
        btnSumar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(51, 51, 51));
        btnSumar.setText("+");
        btnSumar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(142, 226, 255));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(51, 51, 51));
        btn7.setText("7");
        btn7.setAlignmentX(20.0F);
        btn7.setAlignmentY(20.0F);
        btn7.setAutoscrolls(true);
        btn7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn7.setIconTextGap(7);
        btn7.setPreferredSize(new java.awt.Dimension(25, 25));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(142, 226, 255));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(142, 226, 255));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 255, 233));
        btnMenos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(142, 226, 255));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(142, 226, 255));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(142, 226, 255));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(255, 255, 233));
        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(142, 226, 255));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn1KeyTyped(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(142, 226, 255));
        btn0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(255, 255, 233));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(255, 255, 233));
        btnDividir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(255, 255, 233));
        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(240, 130, 128));
        c.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        c.setText("C");
        c.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        cc.setBackground(new java.awt.Color(240, 130, 128));
        cc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cc.setText("CC");
        cc.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });

        btnApagado.setBackground(new java.awt.Color(240, 130, 128));
        btnApagado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnApagado.setText("Off");
        btnApagado.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnApagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagadoActionPerformed(evt);
            }
        });

        btnBorrador.setBackground(new java.awt.Color(240, 130, 128));
        btnBorrador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrador.setText("Bs");
        btnBorrador.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnBorrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btnApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPantallita, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(txtPantallota))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtPantallita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPantallota, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApagado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel1.getAccessibleContext().setAccessibleName("gafas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        teclaPresionada('.');
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        if (txtPantallita.getText().equals(""))
        {
            txtPantallita.setText(Double.toString(num1)+" ÷");
            txtPantallota.setText("");
        }
        else
        {
            if (!txtPantallota.getText().equals("")){
            calculo();}
            txtPantallita.setText(Double.toString(num1)+" ÷");
            txtPantallota.setText("");
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        if (txtPantallita.getText().equals(""))
        {

            txtPantallota.setText("");
        }
        else
        {
            if (!txtPantallota.getText().equals("")){
            calculo();}
            txtPantallita.setText("");
            txtPantallota.setText(Double.toString(num1));
            igual=true;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        teclaPresionada('0');
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyTyped
        // XXXXXXXXXXXXXXXXXX
    }//GEN-LAST:event_btn1KeyTyped

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        // XXXXXXXXXXXXXXXXXX
    }//GEN-LAST:event_btn1KeyPressed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        teclaPresionada('1');
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if(txtPantallita.getText().equals(""))
//        try
//            String resultado = se.eval(txtPantallita.getText().equals(""))
        {
            txtPantallita.setText(Double.toString(num1)+" x");
            txtPantallota.setText("");
        }
        else
        {
            if(!txtPantallota.getText().equals("")){
            calculo();
            }
            txtPantallita.setText(Double.toString(num1)+" x");
            txtPantallota.setText("");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        teclaPresionada('3');
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        teclaPresionada('2');
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        teclaPresionada('4');
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if (txtPantallita.getText().equals(""))
        {
            txtPantallita.setText(Double.toString(num1)+" -");
            txtPantallota.setText("");
        }
        else
        {
            if (!txtPantallota.getText().equals("")){
            calculo();}
            txtPantallita.setText(Double.toString(num1)+" -");
            txtPantallota.setText("");
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        teclaPresionada('6');
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        teclaPresionada('5');
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        teclaPresionada('7');
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        if (txtPantallita.getText().equals(""))
        {
            txtPantallita.setText(Double.toString(num1)+" +");
            txtPantallota.setText("");
        }
        else
        {
            if (!txtPantallota.getText().equals("")){
            calculo();}
            txtPantallita.setText(Double.toString(num1)+" +");
            txtPantallota.setText("");
        }

    }//GEN-LAST:event_btnSumarActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        teclaPresionada('9');
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        teclaPresionada('8');
    }//GEN-LAST:event_btn8ActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
    txtPantallita.setText("");
    txtPantallota.setText("");
    num1 = 0;
    num2 = 0;
    }//GEN-LAST:event_ccActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
    txtPantallota.setText("");
 
       
       
    }//GEN-LAST:event_cActionPerformed

    private void txtPantallotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallotaActionPerformed
   
    }//GEN-LAST:event_txtPantallotaActionPerformed

    private void txtPantallitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallitaActionPerformed

    private void btnApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagadoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnApagadoActionPerformed

    private void btnBorradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorradorActionPerformed
        txtPantallota.setText(txtPantallota.getText().substring(0,txtPantallota.getText().length()-1));
    }//GEN-LAST:event_btnBorradorActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraUI().setVisible(true);
            }

        });
    }
    public void teclaPresionada(char tecla){
        if (txtPantallita.getText().equals("")) {
            if(igual){
                igual=false;
                txtPantallota.setText("");
            }
            if(txtPantallota.getText().length()<12)
            {
                txtPantallota.setText(txtPantallota.getText()+tecla);
                num1 = Double.parseDouble(txtPantallota.getText());
            }
        }else{
            if((txtPantallota.getText().length()<12)){
                txtPantallota.setText(txtPantallota.getText()+tecla);
                num2 = Double.parseDouble(txtPantallota.getText());
            }
        }
    }
    public void calculo()
    {
            String signo = txtPantallita.getText();
            char c = txtPantallita.getText().charAt(signo.length()-1);
            switch(c){
                case '+':   num1=operacion1.suma(num1, num2);
                            break;
                case '-':   num1=operacion1.resta(num1, num2);
                            break;
                case 'x':   num1=operacion1.multiplicacion(num1, num2);
                            break;
                case '÷':   num1= operacion1.divisio(num1, num2);
                            break;
                default :   num1=0;
                            break;
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnApagado;
    private javax.swing.JButton btnBorrador;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton c;
    private javax.swing.JButton cc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPantallita;
    private javax.swing.JTextField txtPantallota;
    // End of variables declaration//GEN-END:variables
}
