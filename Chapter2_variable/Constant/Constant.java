class Constant {
  public static void main(String[] args) {
    // int triangleArea = (20 * 10) / 2;
    // int rectangleArea = 20 * 10; 
    
    // below cases that only need to change literal 
    final int WIDTH = 30; 
    final int HEIGHT = 40;

    int triangleArea = (WIDTH * HEIGHT) / 2;
    int rectangleArea = WIDTH * HEIGHT;  

    System.out.println(triangleArea); 
    System.out.println(rectangleArea);
  }
}