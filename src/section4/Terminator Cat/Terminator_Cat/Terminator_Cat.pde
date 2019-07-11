int x = 416;
int y = 456;
PImage catPic;
void setup(){
  size(1000, 1000);
  catPic = loadImage("cat.jpg");
catPic.resize(width, height);
background(catPic);
}

void draw(){
  fill(0, 250, 227);
ellipse(x, y, 75, 75);  
ellipse(597, 456, 75, 75);  
  if(mousePressed){
   println("Mouse's x-position: " + mouseX + 
   "\nMouse's y- position: " + mouseY + "\n");
}
  
  
}
void keyPressed() {
  x++;
  y++;
  
}
