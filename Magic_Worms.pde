int randomLX;
int randomLY;
int randColorR;
int randColorG;
int randColorB;

void setup(){
  size(1000,1000);
  background(0,0,0);
}


void draw(){
  if(mousePressed){
    Worm();
  }
}

public void Worm(){
  for(int i= 0; i<=300; i++){
    float randColorR= random(256);
    float randColorG= random(256);
    float randColorB= random(256);
    float randomLX = random (1001);
    float randomLY = random (1001);
    fill(randColorR, randColorG, randColorB); 
    ellipse(randomLX+5, randomLY, 10, 10);
  }
}
//Everytime the user clicks, spawn a new worm, with random colors, 
//same amount of ellipses
//RandomLX=random location of worm X
//RandomLY= random location of worm Y
//randColor R, G, and B will be for the randomized colors