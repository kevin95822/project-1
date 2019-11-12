package project1fall;

public class Candle {
	  private int height,width;
	  private float price;
	  private boolean lit;

	  //3 parameter constructor
	  public Candle(int h, int w, float p){
	    h = height;
	    w = width;
	    p = price;
	  }
	  
	  //get method
	  public int getHeight(){return height;}

	  public int getWidth(){return width;}

	  public float getPrice(){return price;}

	  public boolean getLit(){return lit;}

	  //set method
	  public void setHeight(int h){
		  h = height;
	  }
	  
	  public void setWidth(int w) {
		  w = width;
	  }
	  
	  public void setPrice(float p) {
		  p = price;
	  }
	  
	  public void setLit(boolean l) {
		  l = lit;
	  }
	  //show candle object as a string 
	  public String toString() {
		  return height + "," + width + "," + price;
	  }
}
