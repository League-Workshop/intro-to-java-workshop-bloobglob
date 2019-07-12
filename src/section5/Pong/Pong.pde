  import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int dir = 1;
int ballX = 750/2;
int ballY = 750/2;
void setup(){
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
size(750,750); 

}

void draw(){
  background(#020848);
  fill(#FF0000);
  noStroke();
  ellipse(ballX, ballY, 20, 20);
  if(ballY == height){
    sound.trigger();
  }
  fill(#2DFF00);
  rect(mouseX - 50 , 700, 100, 20);
if(dir == 1){
  ballY = ballY+10;
} else {
  ballY = ballY-10;
}


if(intersects(ballX, ballY, mouseX, 700, 100) == true){
dir = 0;
} else {
  if(ballY < 11){
dir = 1;
  }
}
}
         boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > 700 && ballX > mouseX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;}
