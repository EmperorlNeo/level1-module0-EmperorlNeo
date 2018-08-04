int pongX;
int pongS =5;
void setup(){
  size(800,800);
}

void draw(){
  background(255,255,255);
    fill(0,0,0);
  stroke(0,0,0);
  ellipse(pongX,400,40,40);
  if(pongX>800){
  pongS=pongS*-1;
  }
  else if(pongX<0){ 
    pongS=pongS*-1;
  }
  pongX+=pongS;
  
}