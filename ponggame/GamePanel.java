/*     */ package ponggame;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Image;
/*     */ import java.util.Random;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class GamePanel
/*     */   extends JPanel implements Runnable {
/*     */   static final int GAME_WIDTH = 1000;
/*     */   static final int GAME_HEIGHT = 555;
/*     */   static final int BALL_DIAMETER = 20;
/*     */   static final int PADDLE_WIDTH = 25;
/*     */   static final int PADDLE_HEIGHT = 100;
/*     */   Thread gameThread;
/*     */   
/*     */   GamePanel() {
/*  22 */     newPaddles();
/*  23 */     newBall();
/*  24 */     this.score = new Score(1000, 555);
/*  25 */     setFocusable(true);
/*  26 */     addKeyListener(this.blue);
/*  27 */     addKeyListener(this.red);
/*  28 */     setPreferredSize(new Dimension(1000, 555));
/*     */     
/*  30 */     this.gameThread = new Thread(this);
/*  31 */     this.gameThread.start();
/*     */   }
/*     */   Image image; Random random; Paddle blue; Paddle red; Ball ball; Score score;
/*     */   public void newBall() {
/*  35 */     this.random = new Random();
/*  36 */     this.ball = new Ball(490, this.random.nextInt(555), 20, 20);
/*     */   }
/*     */   public void newPaddles() {
/*  39 */     this.blue = new Paddle(0, 227, 25, 100, 1);
/*  40 */     this.red = new Paddle(975, 227, 25, 100, 2);
/*     */   }
/*     */   public void paint(Graphics g) {
/*  43 */     this.image = createImage(getWidth(), getHeight());
/*  44 */     Graphics graphics = this.image.getGraphics();
/*  45 */     draw(graphics);
/*  46 */     g.drawImage(this.image, 0, 0, this);
/*     */   }
/*     */   public void draw(Graphics g) {
/*  49 */     g.setColor(Color.green);
/*  50 */     g.drawLine(499, 0, 499, 555);
/*  51 */     this.blue.draw(g);
/*  52 */     this.red.draw(g);
/*  53 */     this.ball.draw(g);
/*  54 */     this.score.draw(g);
/*     */   }
/*     */   public void move() {
/*  57 */     this.blue.move();
/*  58 */     this.red.move();
/*  59 */     this.ball.move();
/*     */   }
/*     */ 
/*     */   
/*     */   public void checkCollision() {
/*  64 */     if (this.red.y <= 0)
/*  65 */       this.red.y = 0; 
/*  66 */     if (this.red.y >= 455) {
/*  67 */       this.red.y = 455;
/*     */     }
/*  69 */     if (this.blue.y <= 0)
/*  70 */       this.blue.y = 0; 
/*  71 */     if (this.blue.y >= 455) {
/*  72 */       this.blue.y = 455;
/*     */     }
/*     */     
/*  75 */     if (this.ball.y <= 0)
/*  76 */       this.ball.ySpeed *= -1; 
/*  77 */     if (this.ball.y >= 530) {
/*  78 */       this.ball.ySpeed *= -1;
/*     */     }
/*     */ 
/*     */     
/*  82 */     if (this.ball.x <= 25 && 
/*  83 */       this.blue.y < this.ball.y + 25 && this.blue.y + 105 > this.ball.y) {
/*  84 */       this.ball.xSpeed--;
/*  85 */       this.ball.xSpeed *= -1;
/*     */     } 
/*     */ 
/*     */     
/*  89 */     if (this.ball.x >= 955 && 
/*  90 */       this.red.y < this.ball.y + 25 && this.red.y + 105 > this.ball.y) {
/*  91 */       this.ball.xSpeed++;
/*  92 */       this.ball.xSpeed *= -1;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     if (this.ball.x <= 0) {
/*  99 */       newBall();
/* 100 */       this.score.player2++;
/*     */     } 
/* 102 */     if (this.ball.x >= 980) {
/* 103 */       newBall();
/* 104 */       this.score.player1++;
/*     */     } 
/*     */   }
/*     */   public void run() {
/*     */     while (true) {
/* 109 */       move();
/* 110 */       checkCollision();
/* 111 */       repaint();
/*     */       try {
/* 113 */         Thread.sleep(10L);
/* 114 */       } catch (InterruptedException ex) {
/* 115 */         Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              F:\Work Maybe\My Fucking Projects\my-pong\My Fucking Pong.jar!\ponggame\GamePanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */