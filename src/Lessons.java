
import java.text.DecimalFormat;

public class Lessons {
    public static void main (String args[]){
        
      System.out.println("                                            DATA TYPES                                                   ");        
System.out.println(" ");
        // Integers Types
    System.out.print("BYTE (8bit): Smallest type.  ");  
    byte A = 4; 

    System.out.println("SHORT (16bit): Can handle values between -32768 and 32767                             ");
    short B = 433;

    System.out.println("INT (32bit):Can handle larger numbers.                                                ");
    int C = 34478;          

    System.out.println("LONG (64bit): Letter \"L\" is placed                                                  ");
    long D = 569854L;



        // Float Types 
    System.out.println("FLOAT (32bit): Single precision. Letter \"f\" is placed                               ");
    float E = 5986f;
    
    System.out.println("DOUBLE (64bit): Can hadle larger number than FLOAT                                    ");    
    double F = 654825;
    
    
        //Character Types
    System.out.println("CHAR (8bit):                                                                          ");   
    char G = 'd';
              
                System.out.println("            ASCII: Letters to numbers (see the ASCHII table for reference)            ");
                byte H = 'A'; //ASCII 
                System.out.println("            UNICODE: Supports characters that are not traditionally used in English   ");
                char I = 'f'; //UNICODE
    
         //Boolean Type 
    System.out.println("BOOLEAN (1bit): For logical values                                                    ");
    boolean J = false;
    
 
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("                                         ARITHMETIC OPERATORS                                                    ");        
    //THESE ARE MATHEMATICAL OPERATIONS
    short num1 = 234;
    int num2 = 4253;
    
    
    System.out.print("ADDITION" );
        System.out.print(" (ex. Num 1 + Num 2 = " + (num1 + num2));
        System.out.println(")");
        
    System.out.print("SUBTRACTION" );
        System.out.print(" (ex. Num 2 + Num 1 = " + (num2 - num1) );
        System.out.println(")");
    
    System.out.print("MULTIPLICATION" );
        System.out.print(" (ex. Num 1 + Num 2 = " + (num1 * num2) );
        System.out.println(")");   
    
    System.out.print("DIVISION" );
        System.out.print(" (ex. Num 2 + Num 1 = " + (num2 / num1) );
        System.out.println(")");
    
    System.out.print("MODULUS" );
        System.out.print(" (ex. Num 2 + Num 1 = " + (num2 % num1) );
        System.out.println(")");
        
    System.out.println(" ");
    System.out.println("-ARITHMETIC EXPRESSIONS EXAMPLE-");
            
    byte val1 = 3;
    byte val2 = 7;
    double val3 = 543.0956;
        
        System.out.println(( val1/val2) + val2 );
        System.out.println(((float) val1/val2) + val2 ); //just add "(float)" to get the decimal points
        System.out.printf("%.2f", val3); //place "%.2f" to round off to two deciaml values
    System.out.println("");   
        
    //Use this method to format decimals of your choice
        DecimalFormat f = new DecimalFormat("#.###");  
        System.out.println(f.format(val3));
    
        
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("                                         ASSIGNMENT OPERATORS                                                    ");        
    //ASSIGNS SPECIFIC VALUES, VARIABLE AND/OR FUNCTIONS TO ANOTHER VARIABLE 
    
    byte example1 = 9;
    
    
    System.out.print("ASSIGNMENT");
        System.out.println(" (ex. a = 5) ");
        
    System.out.print("ADD & ASSIGNMENT");
        
        System.out.print(" (ex. " + (example1 += 3));   
        System.out.println(")");
    
    System.out.print("SUBTRACT & ASSIGNMENT");
        
        System.out.print(" (ex. " + (example1 -= 3));   
        System.out.println(")");
      
    System.out.print("MULTIPLY & ASSIGNMENT");
        
        System.out.print(" (ex. " + (example1 *= 3));   
        System.out.println(")");
    
    System.out.print("DIVIDE & ASSIGNMENT");
        
        System.out.print(" (ex. " + (example1 /= 3));   
        System.out.println(")");
        
    System.out.print("MODULUS & ASSIGNMENT");
        
        System.out.print(" (ex. " + (example1 %= 4));   
        System.out.println(")");   
        
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("                                         UNARY OPERATORS                                                    ");
    //THIS REQUIRES ONLY ONE OPERAND
    
    int N1 = 8;
     
System.out.println("PRE - INCREMENT");
    System.out.print("INCREMENT"); //PLUS ONE TO THE VALUE
        System.out.print(" (ex. " + ++N1 );
        System.out.println(")");  
    
    System.out.print("DECREMENT"); //MINUS ONE TO THE VALUE
        System.out.print(" (ex. " + --N1 );
        System.out.println(")");  
        System.out.println(" ");      
 
System.out.println("POST - INCREMENT");  //VALUES WILL SHOW UP ON THE SECOND PRINT    
    System.out.print("INCREMENT"); //PLUS ONE TO THE VALUE
        System.out.print(" (ex. " + N1++ );
        System.out.println(")");  
    
        System.out.println("       Second Print: " + N1); 
        
    System.out.print("DECREMENT"); //MINUS ONE TO THE VALUE
        System.out.print(" (ex. " + N1-- );
        System.out.println(")");

        System.out.println("       Second Print: " + N1);
        
System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                         COMPARISON OPERATORS                                                    ");
    //TO COMPARE, OBVIOUSLY... JK. ALSO KNOWN AS RELATIONAL OPERATORS.        
    
    boolean C1 = true;
    boolean C2 = false;
    boolean C3 = true;
  
    System.out.print("EQUAL TO");
        System.out.print(" (Answer: " + (C3 == C2));
        System.out.println(")"); 
        
    System.out.print("NOT EQUAL TO");
        System.out.print(" (Answer: " + (C3 == C2));
        System.out.println(")"); 
        
    byte Com1 = 43;
    byte Com2 = 31;
    
    System.out.print("GREATER THAN");
        System.out.print(" (Answer: " + (Com2 > Com1));
        System.out.println(")"); 
     
    System.out.print("LESS THAN");
        System.out.print(" (Answer: " + (Com2 < 56 ));
        System.out.println(")");
        
    System.out.print("GREATER THAN OR EQUAL TO");
        System.out.print(" (Answer: " + (Com2 >= 31));
        System.out.println(")");   
        
    System.out.print("LESS THAN OR EQUAL TO");
        System.out.print(" (Answer: " + (Com2 <= Com1));
        System.out.println(")"); 
        
System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                         SHIFT OPERATORS                                                    ");
    //MOVING THE BIT PATTERN (Only in Integers)
    
    byte x = 4<<2;
    byte y = 9>>2;
    
    System.out.println("Left Shift:" + x);
    System.out.println("Right Shift:" + y);
    
System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                         BITWISE OPERATORS                                                    ");
    //PERFORMS OPERATIONS BIT BY BIT ( For byte, int, short, long, and char data types)
     
    //TO REVIEW (Di tinuro samok)
    
   /* System.out.println("AND: \"&\" ");
        System.out.print(" (Result: " + ( y & y ) );
        System.out.println(")");
        
    System.out.println("OR: \"|\" ");
        System.out.print(" (Result: " + ( 6 | 9 ) );
        System.out.println(")");
        
    System.out.println("XOR: \"|\" ");
        System.out.print(" (Result: "  );
        System.out.println(")");   */
        
System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                         LOGICAL OPERATORS                                                    ");
        //USED IN BOOLEAN

     int P = 4;
     int o = 5;
     boolean result1 = (P > o) && (P > 2);
     boolean result2 = (P > o) || (P > 2);
     boolean result3 = (P > o) ^ (P > 2);
     boolean result4 = !(P > o) && (P > 2);
        
        
    System.out.println("LOGICAL AND: \"&&\" "); //REQUIRES TWO TRUE, RESULTS TO TRUE
        System.out.print(" (Result: " + result1 );
        System.out.println(")");

    System.out.println("LOGICAL OR: \"||\" "); // REQUIRES ONE TRUE, RESULTS TO TRUE
        System.out.print(" (Result: " + result2 );
        System.out.println(")");

    System.out.println("LOGICAL XOR: \"^\" "); // REQUIRES TWO TRUE, RESULTS TO FALSE
        System.out.print(" (Result: " + result3 );
        System.out.println(")");

    System.out.println("LOGICAL NOT: \"!\" "); // (PRE-FIX) INVERTS THE VALUE 
        System.out.print(" (Result: " + result4 );
        System.out.println(")");

System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("                                         CONDITIONAL OPERATORS                                                    ");
        //USED TO CONTROL THE FLOW OF THE PROGRAM, MAINLY USED IN LOOP STATEMENTS

       int Q,R;
            Q = 20;  
            R  = (Q == 1) ? 3: 2;  
        System.out.println("Value of y is: " +  R );  
              
            Q = 20;  
            R  = (Q == 20) ? 3: 2;             
        System.out.println("Value of y is: " + R );  

        System.out.println(" ");
        System.out.print("                                                 The End:");
        System.out.println(")");   
        
        
        //PWEDE NA KO MAMATA- MAGPAHINGA...
        
        
    }
}