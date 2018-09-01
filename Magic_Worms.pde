int randomLX;
int randomLY;
int randColorR;
int randColorG;
int randColorB;
int Worm;
int RandY;
int RandX;

void setup(){
  size(1200,1200);
  background(0,0,0);
}


void draw(){
  makeMagical();
  if(mousePressed){
    Worm();
    makeMagical();
  }
}

public void Worm(){
  for(int i= 0; i<=300; i++){
    float randColorR= random(256);
    float randColorG= random(256);
    float randColorB= random(256);
    float randomLX = random (1201);
    float randomLY = random (1201);
    float randY = random (3);
    float randX = random (3);
    fill(randColorR, randColorG, randColorB);
    ellipse(randomLX, randomLY, 5, 5);
    ellipse(randomLX+randX, randomLY+randY, 5, 5);
    ellipse(randomLX+randX+2, randomLY+randY+2, 5, 5);
    ellipse(randomLX+randX+4, randomLY+randY+4, 5, 5);
    ellipse(randomLX+randX+6, randomLY+randY+6, 5, 5);
    ellipse(randomLX+randX+8, randomLY+randY+8, 5, 5);
    ellipse(randomLX+randX+10, randomLY+randY+10, 5, 5);
    ellipse(randomLX+randX+12, randomLY+randY+12, 5, 5);
    ellipse(randomLX+randX+14, randomLY+randY+14, 5, 5);
    ellipse(randomLX+randX+16, randomLY+randY+16, 5, 5);
    ellipse(randomLX+randX+18, randomLY+randY+18, 5, 5);
  }
}
public void makeMagical(){
  fill(0, 0, 0,30);
  rect(0, 0, width, height);
  noStroke();
}
float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount *frequency),0 , 1, 0, width);
}
float getWormY(int i) {
  return map(noise(i*noiseInterval + frameCount *frequency),0 , 1, 0, height);
}
float frequency = 5;
float noiseInterval = PI;
//Everytime the user clicks, spawn a new worm, with random colors, 
//same amount of ellipses
//RandomLX=random location of worm X
//RandomLY= random location of worm Y
//randColor R, G, and B will be for the randomized colors