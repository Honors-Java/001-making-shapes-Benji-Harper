// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 
  rect(150, 150, 100, 50);
  rect(275, 135, 150, 15);
  rect(200, 225, 200, 100);
  ellipse(100, 275, 50, 50);
  ellipse(150, 275, 50, 50);
  ellipse(200, 275, 50, 50);
  ellipse(250, 275, 50, 50);
  ellipse(300, 275, 50, 50);
	
}