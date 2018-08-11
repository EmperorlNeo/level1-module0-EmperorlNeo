import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int pongX;
int pongS =15;
int pongY;
void setup(){
  size(800,800);
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
sound.trigger();
backgroundImage = loadImage("image.jpg");
}

void draw(){
  background(255,255,255);
  image(backgroundImage,0,0);
  image(backgroundImage,0,0, 800, 800);
    fill(0,0,0);
  stroke(0,0,0);
  ellipse(pongX,pongY,40,40);
  rect(mouseX, 770, 100,100);
  if(pongX>800){
  pongS=pongS*-1;
  }
  else if(pongX<0){ 
    pongS=pongS*-1;
  }
  pongX+=pongS;
  if(pongY>760){
   pongS=pongS*-1; 
  }
  else if(pongY<0){
  pongS=pongS*-1;
  }
  pongY+=pongS; 

}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
