int RaindropY;
int RaindropX;
int score;
void setup(){
  size(900, 900);
}
void draw(){
  background(0,0,0);
  raindrop();
  Bucket();
  if(RaindropY>870){
  checkCatch(RaindropX);
  }
  fill(255, 255, 255);
  textSize(16);
  text("Score: " + score, 20, 20);

}

public void raindrop(){
 fill(164, 233,250);
 stroke(255, 255, 255);
RaindropY= RaindropY+15;
int randomNumber = (int) random(width);
if(RaindropY==900){
 RaindropY=0;
 RaindropX=randomNumber;
}
  ellipse(RaindropX,RaindropY,15,15);
}
public void Bucket(){
  fill(185,185,185);
  stroke(0,0,0);
  rect(mouseX, 870,50,50);
}

public void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Score: " + score); }