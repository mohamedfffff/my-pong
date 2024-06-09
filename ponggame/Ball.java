/*    */ package ponggame;
/*    */ import java.awt.Graphics;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class Ball extends Rectangle {
/*    */   int x;
/*    */   int y;
/*  8 */   int xSpeed = 2, ySpeed = 2; int width; int height;
/*  9 */   int velocity = 1;
/* 10 */   Random r = new Random();
/*    */   
/*    */   Ball(int x, int y, int width, int height) {
/* 13 */     this.x = x;
/* 14 */     this.y = y;
/* 15 */     this.width = width;
/* 16 */     this.height = height;
/*    */     
/* 18 */     if (this.r.nextInt(2) == 0) this.xSpeed = -2; 
/* 19 */     if (this.r.nextInt(2) == 0) this.ySpeed = -2;
/*    */   
/*    */   }
/*    */   
/*    */   public void move() {
/* 24 */     this.x += this.xSpeed;
/* 25 */     this.y += this.ySpeed;
/*    */   }
/*    */   public void draw(Graphics g) {
/* 28 */     g.setColor(Color.white);
/* 29 */     g.fillOval(this.x, this.y, this.width, this.height);
/*    */   }
/*    */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-pong\My Fucking Pong.jar!\ponggame\Ball.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */