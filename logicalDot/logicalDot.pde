void setup(){
  size(800,800);
}
void draw(){
  noStroke();
  if(mousePressed){
    fill(#6a006a);
  }
  else{
    fill(#990099);
  }
  ellipse(400,400,400,400);
  
}