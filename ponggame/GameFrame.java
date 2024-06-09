/*    */ package ponggame;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import javax.swing.JFrame;
/*    */ 
/*    */ public class GameFrame
/*    */   extends JFrame {
/*    */   GameFrame() {
/* 10 */     add(new GamePanel());
/* 11 */     setTitle("Pong Game");
/* 12 */     setResizable(false);
/* 13 */     setBackground(Color.black);
/* 14 */     setDefaultCloseOperation(3);
/* 15 */     pack();
/* 16 */     setVisible(true);
/* 17 */     setLocationRelativeTo((Component)null);
/*    */   }
/*    */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-pong\My Fucking Pong.jar!\ponggame\GameFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */