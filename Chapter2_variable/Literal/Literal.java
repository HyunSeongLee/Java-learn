class Literal {
  public static void main(String[] args) {
    // Number literal
    long big = 100_000_000_000L; 
    long hex = 0xFFFF_FFFF_FFFF_FFFFL;

    float pi = 3.14f; 
    double rate = 3.598; // double is default type, don't need to put d at the end 

    int i = 'A'; // fine A is 65 in Unicode, possible to store 
    long l = 123; // fine long is larger than int 
    double d = 3.14f; // fine double is larger than float 

    // int i = 0x123456789;     
    // float f = 3.14; 
     
    // Character literal
    char ch = 'J';
    String name = "Java"; 

    // empty string
    String str = "";
    char ch = ' ';
    String name = new String("Java"); 

    
  }
}