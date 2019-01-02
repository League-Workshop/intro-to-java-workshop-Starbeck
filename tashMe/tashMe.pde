PImage mustache;
PImage capybara;
void setup(){
  capybara=loadImage("capybara.JPG");
  size(800,600);
  capybara.resize(800,600);
  mustache=loadImage("mustache.png");
  mustache.resize(200,100);
}
void draw(){
  background(capybara);
  if(mousePressed){
    image(mustache,400,300);
  }
  
}