/*    */ package ponggame;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.event.KeyEvent;
/*    */ 
/*    */ public class Paddle extends Rectangle implements KeyListener {
/*    */   int id;
/*    */   int x;
/*  8 */   int speed = 0; int y; int PADDLE_WIDTH; int PADDLE_HEIGHT;
/*    */   
/*    */   Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
/* 11 */     this.id = id;
/* 12 */     this.x = x;
/* 13 */     this.y = y;
/* 14 */     this.PADDLE_WIDTH = PADDLE_WIDTH;
/* 15 */     this.PADDLE_HEIGHT = PADDLE_HEIGHT;
/*    */   }
/*    */   
/*    */   public void keyPressed(KeyEvent e) {
/* 19 */     switch (this.id) {
/*    */       case 1:
/* 21 */         if (e.getKeyCode() == 87)
/* 22 */           this.speed = -10; 
/* 23 */         if (e.getKeyCode() == 83)
/* 24 */           this.speed = 10; 
/*    */         break;
/*    */       case 2:
/* 27 */         if (e.getKeyCode() == 38)
/* 28 */           this.speed = -10; 
/* 29 */         if (e.getKeyCode() == 40)
/* 30 */           this.speed = 10; 
/*    */         break;
/*    */     } 
/*    */   }
/*    */   public void keyReleased(KeyEvent e) {
/* 35 */     switch (this.id) {
/*    */       case 1:
/* 37 */         if (e.getKeyCode() == 87)
/* 38 */           this.speed = 0; 
/* 39 */         if (e.getKeyCode() == 83)
/* 40 */           this.speed = 0; 
/*    */         break;
/*    */       case 2:
/* 43 */         if (e.getKeyCode() == 38)
/* 44 */           this.speed = 0; 
/* 45 */         if (e.getKeyCode() == 40)
/* 46 */           this.speed = 0; 
/*    */         break;
/*    */     } 
/*    */   }
/*    */   public void move() {
/* 51 */     this.y += this.speed;
/*    */   }
/*    */   public void draw(Graphics g) {
/* 54 */     if (this.id == 1) {
/* 55 */       g.setColor(Color.blue);
/*    */     } else {
/* 57 */       g.setColor(Color.red);
/* 58 */     }  g.fillRect(this.x, this.y, this.PADDLE_WIDTH, this.PADDLE_HEIGHT);
/*    */   }
/*    */   
/*    */   public void keyTyped(KeyEvent e) {}
/*    */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-pong\My Fucking Pong.jar!\ponggame\Paddle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */