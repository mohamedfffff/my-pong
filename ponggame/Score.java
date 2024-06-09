/*    */ package ponggame;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Rectangle;
/*    */ 
/*    */ public class Score extends Rectangle {
/*    */   static int GAME_WIDTH;
/*  8 */   int player1 = 0; static int GAME_HEIGHT;
/*  9 */   int player2 = 0;
/*    */   
/*    */   Score(int GAME_WIDTH, int GAME_HEIGHT) {
/* 12 */     Score.GAME_WIDTH = GAME_WIDTH;
/* 13 */     Score.GAME_HEIGHT = GAME_HEIGHT;
/*    */   }
/*    */   public void draw(Graphics g) {
/* 16 */     g.setColor(Color.white);
/* 17 */     g.setFont(new Font("Consolas", 0, 60));
/*    */     
/* 19 */     g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
/*    */     
/* 21 */     g.drawString(String.valueOf(this.player1 / 10) + String.valueOf(this.player1 % 10), GAME_WIDTH / 2 - 85, 50);
/* 22 */     g.drawString(String.valueOf(this.player2 / 10) + String.valueOf(this.player2 % 10), GAME_WIDTH / 2 + 20, 50);
/*    */   }
/*    */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-pong\My Fucking Pong.jar!\ponggame\Score.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */