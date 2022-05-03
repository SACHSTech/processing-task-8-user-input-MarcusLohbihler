import processing.core.PApplet;

public class Sketch extends PApplet {
	  float blockX = 175;
    float blockY = 175;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    mousePressed();
    letters();
    block();
    }
  
  // define other methods down here.

  //black circle in white background that follows mouse, if the mouse is pressed, the background turns black and the circle becomes white
  public void mousePressed(){
    if(mousePressed == false){
      background(255);
      fill(0);
      ellipse (mouseX, mouseY, 50, 50);
    }else if (mousePressed == true){
      background(0);
      fill(255);
      ellipse (mouseX, mouseY, 50, 50);
    }
  }
  //prints the letters a, b, or c to the screen depending on which key is clicked. If no key is pressed, no letter is printed. Follows the mouse
  public void letters(){
     char letterKey = key;

      if(keyPressed){
        if(key == 'a'){
          fill(255, 0, 0);
          textSize(50);
          text(key, mouseX, mouseY);
        } else if(key == 'b'){
          fill(0, 0, 255);
          textSize(50);
          text(key, mouseX, mouseY);
        } else if(key == 'c'){
          fill(255, 255, 0);
          textSize(50);
          text(key, mouseX, mouseY);
        }  
      }
  }

  //if the mouse is dragged, the background becomes grey
  public void mouseDragged(){
    int colour = 175;
    background(colour);
  }

  //if the mouse is clicked, draw a white cube to the screen which follows the mouse
  public void mouseClicked(){
      fill(255);
      rect(mouseX, mouseY, 50, 50);
  }

  //Print block to the center of the screen which moves up, down, left, or right depending on the arrow key that is pressed. If it goes offscreen, it is brought back to the center of the screen. The block also changes colours when the mouse is pressed.
  public void block(){

    
    if (keyPressed) {
      if (keyCode == UP) {
        
        blockY--;
        
      } 
      else if (keyCode == DOWN) {
        
        blockY++;
        
      }else if(keyCode == LEFT){
        
        blockX--;
        
      }else if(keyCode == RIGHT){
        
       blockX++; 
        
      }

      if(blockX < 0 || blockX > width || blockY < 0 || blockY > height){
        blockX = 175;
        blockY = 175;
      }
    }
    if(mousePressed == true){
      fill(255);
    } else if(mousePressed == false){
      fill(0);
    }
    rect(blockX, blockY, 50, 50);
  }
}