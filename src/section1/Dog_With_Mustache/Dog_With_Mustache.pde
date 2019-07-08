PImage moustache;
PImage dog;
void setup() {
  dog = loadImage("friend.jpg");
  moustache = loadImage("moustache.png");
size(800, 600);

dog.resize(800,600);
}
void draw() {
  background(dog);
  if(mousePressed){
  image(moustache, mouseX-321, mouseY-217);
}}
