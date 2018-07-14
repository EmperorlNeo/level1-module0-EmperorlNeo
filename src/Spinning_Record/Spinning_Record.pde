PImage pictureOfRecord;
int x=0;

void setup(){
  pictureOfRecord= loadImage("Record.jpg");
  size(1200, 1200);
}

void draw(){
  x++;
 if (mousePressed==true){
 rotateImage(pictureOfRecord, x);
image(pictureOfRecord,0,0);
 }
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}