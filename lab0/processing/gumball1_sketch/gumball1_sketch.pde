//Student: Marianne Paulson

//Initialize rectangle variables and color var for Insert Quarter
int insQtr_x = 80;
int insQtr_y = 700;
int insQtr_w = 200;
int insQtr_h = 60;

//Initialize rectangle variables and col var for Turn Crank
int turnCrank_x = 500;
int turnCrank_y = 700;
int turnCrank_w = 200;
int turnCrank_h = 60;

//Initialize states for hovered and pressed
boolean insertQtrBtnHovered = false;
boolean turnCrankBtnHovered = false;
boolean insertQtrBtnPressed = false;
boolean turnCrankBtnPressed = false;

//initialize colors
color grey = color(209);
color black = color(0);
color white = color(255);

//instantiate a gumball machine so we can call methods - starting with 5 gumballs
GumballMachine gumballMachine = new GumballMachine(5);

PFont font;

void setup() 
{
  size(800, 800) ;
  background(255) ; //white
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);

  // load font
  font = loadFont("BookAntiqua-48.vlw");
  //  textFont(font, 32);
}

void draw() {
  background(255);
  fill(black);
  textFont(font, 32);
  text("The Gumball Machine", 250, 40);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);  

  textFont(font, 20);
  text("Current State: ", 10, 80);
  text(gumballMachine.getState().toString(), 250, 80);
  text("Remaining gumballs:", 10, 110);
  text(gumballMachine.getCount(), 250, 110);

  if (insertQtrBtnHovered) {
    fill(grey);
  } else if (insertQtrBtnPressed) {
    fill(black);
  } else {
    fill(white);
  }


  rect(insQtr_x, insQtr_y, insQtr_w, insQtr_h);
  if (turnCrankBtnHovered) {
    fill(grey);
  } else if (turnCrankBtnPressed) {
    fill(black);
  } else {
    fill(white);
  }

  rect(turnCrank_x, turnCrank_y, turnCrank_w, turnCrank_h);

  fill(black);
  textFont(font, 20);
  text("Insert Quarter", 83, 730);
  text("Turn Crank", 503, 730);
  //runTest() ;
  mouseHover();
}

void mouseHover() {
  if (mouseX >= insQtr_x && mouseX <= insQtr_x + insQtr_w && 
    mouseY >= insQtr_y && mouseY <= insQtr_y + insQtr_h) {
    insertQtrBtnHovered = true; 
    turnCrankBtnHovered = false;
    insertQtrBtnPressed = false;
    turnCrankBtnPressed = false;
  } else if (mouseX >= turnCrank_x && mouseX <= turnCrank_x+turnCrank_w && 
    mouseY >= turnCrank_y && mouseY <= turnCrank_y+turnCrank_h) {
    turnCrankBtnHovered = true; 
    insertQtrBtnHovered = false;
    turnCrankBtnPressed = false;
    insertQtrBtnPressed = false;
  } else {
    insertQtrBtnHovered = false;
    turnCrankBtnHovered = false;
  }
}
void mousePressed() {
  if (insertQtrBtnHovered) {
    insertQtrBtnPressed = true;
    insertQtrBtnHovered = false;
    turnCrankBtnPressed = false;
    turnCrankBtnHovered = false;
    gumballMachine.insertQuarter();
  } else if (turnCrankBtnHovered) {
    insertQtrBtnPressed = false;
    ;
    insertQtrBtnHovered = false;
    turnCrankBtnPressed = true;
    turnCrankBtnHovered = false;
    gumballMachine.turnCrank();
  }
}

public void runTest() {
  GumballMachine gumballMachine = new GumballMachine(5);
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
}
