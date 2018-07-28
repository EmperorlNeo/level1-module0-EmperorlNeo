PImage pictureOfRecord;
int x=0;
import ddf.minim.*;
Minim minim;
AudioPlayer song;

void setup(){
  pictureOfRecord= loadImage("Record.jpg");
  size(1200, 1200);
  minim = new Minim(this);
  song = minim.loadFile("Fire Flies.mp3", 512);
  
}

void draw(){
  x++;
 if (mousePressed==true){
 rotateImage(pictureOfRecord, x);
image(pictureOfRecord,0,0);

 }
 if (mousePressed==true){
 song.play();
 } else{
   song.pause();
 }
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/13.75);
     translate(-image.width/2, -image.height/2);
}