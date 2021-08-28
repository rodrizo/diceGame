package juegoAzar;

import java.security.SecureRandom;
import javax.swing.Icon;
/**
 *
 * @author Rodney Rizo
 */
public class game extends javax.swing.JFrame {

    public static DataArray mainAccount = new DataArray();
    String [] dataGame = new String[10];
    String [] newArray = new String[10];
    
    
    SecureRandom random = new SecureRandom();

    public game() {
        initComponents();
    }
    
    //Función para jugador 1
    public int playerOne(){
        // Generando números aleatorios entre 1-6
        int dado1 = (int) (random.nextInt(6) + 1);
        int dado2 = (int) (random.nextInt(6) + 1);

        //Convirtiendo la imagen a ícono
        Icon one = new javax.swing.ImageIcon(getClass().getResource("/caras/dice1.png"));
        Icon two = new javax.swing.ImageIcon(getClass().getResource("/caras/dice2.png"));
        Icon three = new javax.swing.ImageIcon(getClass().getResource("/caras/dice3.png"));
        Icon four = new javax.swing.ImageIcon(getClass().getResource("/caras/dice4.png"));
        Icon five = new javax.swing.ImageIcon(getClass().getResource("/caras/dice5.png"));
        Icon six = new javax.swing.ImageIcon(getClass().getResource("/caras/dice6.png"));
        
        switch(dado1){
            case 1: lblDiceOne.setIcon(one); break;
            case 2: lblDiceOne.setIcon(two); break;
            case 3: lblDiceOne.setIcon(three); break;
            case 4: lblDiceOne.setIcon(four); break;
            case 5: lblDiceOne.setIcon(five); break;
            case 6: lblDiceOne.setIcon(six); break;
        }
        switch(dado2){
            case 1: lblDiceTwo.setIcon(one); break;
            case 2: lblDiceTwo.setIcon(two); break;
            case 3: lblDiceTwo.setIcon(three); break;
            case 4: lblDiceTwo.setIcon(four); break;
            case 5: lblDiceTwo.setIcon(five); break;
            case 6: lblDiceTwo.setIcon(six); break;
        }
        
        //Showing result
        int resultOne = dado1 + dado2;
        lblResultOne.setText("Resultado: "+resultOne);
        
        return resultOne;
        
    }

    public int playerTwo(){
        // Generando números aleatorios entre 1-6
        int dado1 = (int) (random.nextInt(6) + 1);
        int dado2 = (int) (random.nextInt(6) + 1);

        //Convirtiendo la imagen a ícono
        Icon one = new javax.swing.ImageIcon(getClass().getResource("/caras/dice1.png"));
        Icon two = new javax.swing.ImageIcon(getClass().getResource("/caras/dice2.png"));
        Icon three = new javax.swing.ImageIcon(getClass().getResource("/caras/dice3.png"));
        Icon four = new javax.swing.ImageIcon(getClass().getResource("/caras/dice4.png"));
        Icon five = new javax.swing.ImageIcon(getClass().getResource("/caras/dice5.png"));
        Icon six = new javax.swing.ImageIcon(getClass().getResource("/caras/dice6.png"));
        
        switch(dado1){
            case 1: lblDiceThree.setIcon(one); break;
            case 2: lblDiceThree.setIcon(two); break;
            case 3: lblDiceThree.setIcon(three); break;
            case 4: lblDiceThree.setIcon(four); break;
            case 5: lblDiceThree.setIcon(five); break;
            case 6: lblDiceThree.setIcon(six); break;
        }
        switch(dado2){
            case 1: lblDiceFour.setIcon(one); break;
            case 2: lblDiceFour.setIcon(two); break;
            case 3: lblDiceFour.setIcon(three); break;
            case 4: lblDiceFour.setIcon(four); break;
            case 5: lblDiceFour.setIcon(five); break;
            case 6: lblDiceFour.setIcon(six); break;
        }
        
        //Showing result
        int resultTwo = dado1 + dado2;
        lblResultTwo.setText("Resultado: "+resultTwo);
        
        return resultTwo;
    }
    
    //Pondrá los valores de las apuestas en el jugador 1
    public void betOne(int apuestaUno){
        lblBetOne.setText(String.valueOf(apuestaUno));
    }
    
    //Pondrá los valores de las apuestas en el jugador 2
    public void betTwo(int apuestaDos){
        lblBetTwo.setText(String.valueOf(apuestaDos));
    }
    
    //Esta función tendrá doble uso, retornará el numero de ronda para que este se vaya actualizando constantemente, además, mostrará estadísticas de cada ronda
    public int gettingRound(){
        //Getting round
        int ronda = Integer.parseInt(lblRound.getText());
        
        /*Condición según cada ronda
            Según la ronda, almacenar en la matriz la data del jugador 1 y 2
        Jugador 1 = [1][1] Jugador 2 = [2][1] .... etc
            
            Crear un método constructor en el InternalFrame para mandar la matriz ahí
        internalFrame(matriz[2][10])
            
            En el internalFrame, proceder a imprimir la información
        
        
        */
        
        //En JInternalFrame haremos esto, en cada label pondremos una concatenación de ambos jugadores en su ronda

        
        
        return ronda;
    }
    
    public String[] gettingStats(){
        int round = Integer.parseInt(lblRound.getText());
        
        return dataGame;
    }
    
    public void showStats(){
        
        
        //Sending all the info
        new stats(mainAccount.getArray()).setVisible(true);
        setVisible(false);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblResultOne = new javax.swing.JLabel();
        lblWinnerOne = new javax.swing.JLabel();
        lblBetOne = new javax.swing.JLabel();
        lblDiceOne = new javax.swing.JLabel();
        lblDiceTwo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblResultTwo = new javax.swing.JLabel();
        lblWinnerTwo = new javax.swing.JLabel();
        lblBetTwo = new javax.swing.JLabel();
        lblDiceThree = new javax.swing.JLabel();
        lblDiceFour = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnShowStats = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        lblRound = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dice Game");

        jPanel1.setBackground(new java.awt.Color(70, 70, 96));

        lblResultOne.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        lblWinnerOne.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblWinnerOne.setForeground(new java.awt.Color(0, 95, 153));

        lblBetOne.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBetOne.setForeground(new java.awt.Color(248, 72, 94));
        lblBetOne.setText("100");

        lblDiceOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caras/dice1.png"))); // NOI18N
        lblDiceOne.setText("jLabel1");

        lblDiceTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caras/dice2.png"))); // NOI18N
        lblDiceTwo.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 72, 94));
        jLabel1.setText("Q");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblResultOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblDiceOne, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(lblDiceTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblWinnerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBetOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiceOne)
                    .addComponent(lblDiceTwo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultOne, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWinnerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBetOne, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        lblResultTwo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        lblWinnerTwo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblWinnerTwo.setForeground(new java.awt.Color(0, 95, 153));

        lblBetTwo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBetTwo.setForeground(new java.awt.Color(248, 72, 94));
        lblBetTwo.setText("100");

        lblDiceThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caras/dice3.png"))); // NOI18N
        lblDiceThree.setText("jLabel1");

        lblDiceFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caras/dice4.png"))); // NOI18N
        lblDiceFour.setText("jLabel4");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 72, 94));
        jLabel2.setText("Q");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblDiceThree, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(lblDiceFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBetTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblResultTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblWinnerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiceThree)
                    .addComponent(lblDiceFour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(lblResultTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWinnerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBetTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        btnExit.setBackground(new java.awt.Color(180, 184, 151));
        btnExit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(17, 50, 77));
        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnShowStats.setBackground(new java.awt.Color(180, 184, 151));
        btnShowStats.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnShowStats.setForeground(new java.awt.Color(17, 50, 77));
        btnShowStats.setText("MOSTRAR");
        btnShowStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStatsActionPerformed(evt);
            }
        });

        btnNewGame.setBackground(new java.awt.Color(180, 184, 151));
        btnNewGame.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(17, 50, 77));
        btnNewGame.setText("NUEVA PARTIDA");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 209, 103));
        jLabel3.setText("JUGADOR 2");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 209, 103));
        jLabel4.setText("JUGADOR 1");

        btnPlay.setBackground(new java.awt.Color(180, 184, 151));
        btnPlay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(17, 50, 77));
        btnPlay.setText("JUGAR");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        lblRound.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblRound.setForeground(new java.awt.Color(246, 209, 103));
        lblRound.setText("0");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 209, 103));
        jLabel5.setText("Ronda #");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnShowStats, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(btnNewGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4)
                        .addGap(133, 133, 133)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRound, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRound)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPlay)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowStats, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        
        //Getting results from both functions
        int resultOne = playerOne();
        int resultTwo = playerTwo();
        int numRonda = gettingRound() +1;
        
        if(resultOne>resultTwo){
            //Añadiendo 10 a la apuesta uno
            int adding = 10 + Integer.parseInt(lblBetOne.getText());
            betOne(adding);
            //Quitando 10 de la apuesta dos
            int subtracting  = Integer.parseInt(lblBetTwo.getText()) - 10;
            betTwo(subtracting);
            lblWinnerOne.setText("GANADOR RONDA #"+numRonda);
            //Para que no salgan dos ganadores al mismo tiempo
            lblWinnerTwo.setText("");
            lblRound.setText(String.valueOf(numRonda));
        } 
        if (resultTwo>resultOne){
            //Añadiendo 10 a la apuesta dos
            int addingTwo = 10 + Integer.parseInt(lblBetTwo.getText());
            betTwo(addingTwo);
            //Quitando 10 de la apuesta uno
            int subtractingTwo = Integer.parseInt(lblBetOne.getText()) - 10;
            betOne(subtractingTwo);
            lblWinnerTwo.setText("GANADOR RONDA #"+numRonda);
            //Para que no salgan dos ganadores al mismo tiempo
            lblWinnerOne.setText("");
            lblRound.setText(String.valueOf(numRonda));
        }
        //Condición por si ambos valores son iguales, la ronda aumente a pesar de esto
        if(resultOne==resultTwo){
            lblRound.setText(String.valueOf(numRonda));
        }
        
        //No mostrar botón de estadísticas hasta que sea la ronda 10
        if(numRonda!=10){
            btnShowStats.setEnabled(false);
        }
        
        //Si la ronda es 10, procede a bloquear el botón de jugar
        if(numRonda==10){
            btnShowStats.setEnabled(true);
            btnPlay.setEnabled(false);
        }
        
        
        if(numRonda == 1){
                dataGame[0] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "            "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 0);
        }
        if(numRonda == 2){
                dataGame[1] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "          "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 1);
        }
        if(numRonda == 3){
                dataGame[2] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "           "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 2);
        }
        if(numRonda == 4){
                dataGame[3] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "           "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 3);
        }
        if(numRonda == 5){
                dataGame[4] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "           "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 4);
        }
        if(numRonda == 6){
                dataGame[5] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "           "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 5);
        }
        if(numRonda == 7){
                dataGame[6] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "            "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 6);
        }
        if(numRonda == 8){
                dataGame[7] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "           "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 7);
        }
        if(numRonda == 9){
                dataGame[8] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "             "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 8);
        }
        if(numRonda == 10){
                dataGame[9] = lblResultOne.getText()+"    Q"+lblBetOne.getText()
                                         + "             "+ lblResultTwo.getText() +"   Q"+lblBetTwo.getText();
                mainAccount.setArray(dataGame, 9);
        }
        
        
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnShowStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStatsActionPerformed
        showStats();        
    }//GEN-LAST:event_btnShowStatsActionPerformed

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnShowStats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBetOne;
    private javax.swing.JLabel lblBetTwo;
    private javax.swing.JLabel lblDiceFour;
    private javax.swing.JLabel lblDiceOne;
    private javax.swing.JLabel lblDiceThree;
    private javax.swing.JLabel lblDiceTwo;
    private javax.swing.JLabel lblResultOne;
    private javax.swing.JLabel lblResultTwo;
    private javax.swing.JLabel lblRound;
    private javax.swing.JLabel lblWinnerOne;
    private javax.swing.JLabel lblWinnerTwo;
    // End of variables declaration//GEN-END:variables
}
