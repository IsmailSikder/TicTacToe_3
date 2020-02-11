/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.String;

/**
 *
 * @author SuFiaN SiKdeR
 */
public class TicTacToe_f extends javax.swing.JFrame {
    
    //Declaring variable game start
    private String startGame ;
    
    //Intializing count variable for each player
    private int xCount = 0;
    private int oCount =0;

    /**
     * Creates new form TicTacToe_f
     */
    public TicTacToe_f() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
        //Thread.sleep(1000);
        choosePlayerMark();
    }
    
    /**
     * This method keep ga,e scores
     */
    private void gameScore()
    {
        jlbPlayerX.setText(String.valueOf(xCount));
        jlbPlayerO.setText(String.valueOf(oCount));
    } 
    
    //This method implement choice of players as either "X" 0r "O"
    private void choosePlayerMark()
    {
        Object[] options ={"X","O"};
        int playerChoice = JOptionPane.showOptionDialog(frame,"Choose Your mark", "TicTacToe", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if(playerChoice==0)
            startGame="X";
        else
            startGame = "O";
        
        
       /* if(startGame=="X")
            startGame="O";
        else
            startGame="X";
        */
    }
    
    private void choosePlayer()
    {
        if(startGame=="X")
            startGame="O";
        else
            startGame="X";
        
    }
    //This method decide winner for the ame
    
 //This method decide winner for the ame
    boolean winner = false;
    String winnerText;
    private void gameWinner()
    {
        String buttonText[][] = new String[3][3];
        buttonText[0][0] = jButton1.getText();
        //Get the text from each button
        //String b1 = jButton1.getText();
       buttonText[0][1] = jButton2.getText();
       buttonText[0][2] = jButton3.getText();
        
        buttonText[1][0] = jButton4.getText();
        buttonText[1][1] = jButton5.getText();
        buttonText[1][2] = jButton6.getText();
        
        buttonText[2][0] = jButton7.getText();
        buttonText[2][1] = jButton8.getText();
       buttonText[2][2] = jButton9.getText();
        
       
       //Checking in horizontally 
       
        for(int i=0;i<buttonText.length;i++)
        {
            if(buttonText[i][0]==buttonText[i][1]&&buttonText[i][1]==buttonText[i][2])
            {

                
                if(buttonText[i][0]=="X")
                {  
                    xCount++;
                    winner =true;
                    winnerText="X";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                if(buttonText[i][0]=="O")
                {
                    oCount++;
                    winner =true;
                    winnerText="O";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                gameScore();
            }
        }
        
        //Checking in verticelly 
        for(int i=0;i<buttonText.length;i++)
        {
            if(buttonText[0][i]==buttonText[1][i]&&buttonText[1][i]==buttonText[2][i])
            {

               
                if(buttonText[0][i]=="X")
                {  
                    xCount++;
                    winner =true;
                    winnerText="X";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                }
                if(buttonText[0][i]=="O")
                {
                    oCount++;
                    winner =true;
                    winnerText="O";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

                }
                gameScore();
            }
        }
           //Diagonally check
            if(buttonText[0][0]==buttonText[1][1]&&buttonText[0][0]==buttonText[2][2])
            {

                
                if(buttonText[1][1]=="X")
                {
                    xCount++;
                    winner =true;
                    winnerText="X";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

                }
                if(buttonText[1][1]=="O")
                {
                    oCount++;
                    winner =true;
                    winnerText="O";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

                }
                gameScore();
            }
            
            //Diagonally check 
             if(buttonText[0][2]==buttonText[1][1]&&buttonText[0][2]==buttonText[2][0])
            {

               // winnerText=buttonText[0][2];
                if(buttonText[1][1]=="X")
                {
                    xCount++;
                    winner =true;
                    winnerText="X";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

                }
                if(buttonText[1][1]=="O")
                {
                    oCount++;
                    winner =true;
                    winnerText="O";
                    JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

                }
                gameScore();
            }       
    }
    
    /*private void showWinner()
    {
        gameWinner();
        
        if(winner==true)
             JOptionPane.showMessageDialog(this, "Winner is: "+ winnerText, "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        //else
            // JOptionPane.showMessageDialog(this, "No body won", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        //JButton[][] buttons = new JButton[3][3];
            
            
    }*/
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlbPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlbPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 3, 56)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTacToe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlbPlayerX.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlbPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jlbPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setText("Palyer O:");
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlbPlayerO.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jlbPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jlbPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Declaring a JFrame variable 
     private JFrame frame;
     private int moveCount = 0;
     
     //Reset the board in it's earlier stage 
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
         winner=false;
        winnerText=null;
        moveCount=0;
         jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
    }//GEN-LAST:event_jbtnResetActionPerformed

   //Exits program
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm If You Want to Exit","TicTacToe",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed


   //All button action
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(winner==false){
        if(jButton1.getText()=="X"||jButton1.getText()=="O")
        {
            JOptionPane.showMessageDialog(frame, "Player "+ jButton1.getText()+ " Already Selected This" );
        }
        else
        {
            jButton1.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
                jButton1.setForeground(Color.GREEN);
            else
               jButton1.setForeground(Color.BLUE);
            choosePlayer();
            gameWinner();
            // showWinner();
             moveCount++;
        }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(winner==false){
        if(jButton2.getText()=="X"||jButton2.getText()=="O")
        {
            JOptionPane.showMessageDialog(frame, "Player "+ jButton2.getText()+ " Already Selected This" );
        }
        else
        {
            jButton2.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
                jButton2.setForeground(Color.GREEN);
            else
               jButton2.setForeground(Color.BLUE);
            choosePlayer();
             //showWinner();
            gameWinner();
            moveCount++;
        }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
        if(jButton3.getText()=="X"||jButton3.getText()=="O")
        {
            JOptionPane.showMessageDialog(frame, "Player "+ jButton3.getText()+ " Already Selected This" );
        }
        else
        {
            jButton3.setText(startGame);
            if(startGame.equalsIgnoreCase("x"))
                jButton3.setForeground(Color.GREEN);
            else
               jButton3.setForeground(Color.BLUE);
            choosePlayer();
             //showWinner();
            gameWinner();
            moveCount++;
        }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
            if(jButton4.getText()=="X"||jButton4.getText()=="O")
            {
                JOptionPane.showMessageDialog(frame, "Player "+ jButton4.getText()+ " Already Selected This" );
            }
            else
            {
                jButton4.setText(startGame);
                if(startGame.equalsIgnoreCase("x"))
                    jButton4.setForeground(Color.GREEN);
                else
                   jButton4.setForeground(Color.BLUE);
                choosePlayer();
               // showWinner();
                gameWinner();
                moveCount++;
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
            if(jButton5.getText()=="X"||jButton5.getText()=="O")
            {
                JOptionPane.showMessageDialog(frame, "Player "+ jButton5.getText()+ " Already Selected This" );
            }
            else
            {
               jButton5.setText(startGame);
               if(startGame.equalsIgnoreCase("x"))
                   jButton5.setForeground(Color.GREEN);
               else
                  jButton5.setForeground(Color.BLUE);
               choosePlayer();
               // showWinner();
               gameWinner();
               moveCount++;
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
            if(jButton6.getText()=="X"||jButton6.getText()=="O")
            {
                JOptionPane.showMessageDialog(frame, "Player "+ jButton6.getText()+ " Already Selected This" );
            }
            else
            {
               jButton6.setText(startGame);
               if(startGame.equalsIgnoreCase("x"))
                   jButton6.setForeground(Color.GREEN);
               else
                  jButton6.setForeground(Color.BLUE);
               choosePlayer();
                //showWinner();
               gameWinner();
               moveCount++;
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
            if(jButton7.getText()=="X"||jButton7.getText()=="O")
            {
                JOptionPane.showMessageDialog(frame, "Player "+ jButton7.getText()+ " Already Selected This" );
            }
            else
            {
               jButton7.setText(startGame);
               
               if(startGame.equalsIgnoreCase("x"))
                   jButton7.setForeground(Color.GREEN);
               else
                  jButton7.setForeground(Color.BLUE);
               
               choosePlayer();
               //showWinner();
                gameWinner();
               moveCount++;
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
            if(jButton8.getText()=="X"||jButton8.getText()=="O")
            {
                JOptionPane.showMessageDialog(frame, "Player "+ jButton8.getText()+ " Already Selected This" );
            }
            else
            {
               jButton8.setText(startGame);
                if(startGame.equalsIgnoreCase("x"))
                   jButton8.setForeground(Color.GREEN);
               else
                  jButton8.setForeground(Color.BLUE);
               choosePlayer();
                //showWinner();
               gameWinner();
               moveCount++;
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(winner==false)
        {
            if(jButton9.getText()=="X"||jButton9.getText()=="O")
            {
                JOptionPane.showMessageDialog(frame, "Player "+ jButton9.getText()+ " Already Selected This" );
            }
            else
            {
                jButton9.setText(startGame);
                if(startGame.equalsIgnoreCase("x"))
                   jButton9.setForeground(Color.GREEN);
                else
                   jButton9.setForeground(Color.BLUE);
                choosePlayer();
                //showWinner();
                gameWinner();
                moveCount++;
            }
        }
        else
            JOptionPane.showMessageDialog(frame, "Reset the board" );
        if(moveCount==9 && winner==false)
            JOptionPane.showMessageDialog(frame, "It is a Tie");
    }//GEN-LAST:event_jButton9ActionPerformed
                                         

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
            java.util.logging.Logger.getLogger(TicTacToe_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_f.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_f().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlbPlayerO;
    private javax.swing.JLabel jlbPlayerX;
    // End of variables declaration//GEN-END:variables
}
