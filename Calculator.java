class Calculator{

    static int a =10; //global variable
    static String s = " book";
    
    static void abc(){
        int u = 1; //local variable
        int r = u+a;
        System.out.println(r);
        System.out.println(200);
    }
    
    static void xyz(){
        double y = 1.5;
        double k = y+a;
        System.out.println(y+a);
        System.out.println(a+s);
    }

    public static void main(String[] args){
        xyz();
        //abc();
    }
 
/*
what is class & how to declare a class?
what is variable & how to declare variable?
what is method & how to declare method?
what is OOP?
what does class consist of?
what are the different data type in java? and what are their differences? 
Difference between local and globar variable?
what is static in java and what are the restrictions between static and non-stratic properties?
how to call a method inside another method? 
How to print in java? difference between plint and println method? 
what is main method in java and why do we need main method? 
what is compile time error in java? 
what is run time error in java? 

Homework::::::::::::::::::

create a class as Calculator
declare all 8 premitive data type in global position 
declare few methods 
declre few local variable 
+, -, /, * use the operator and combining boith local and global variable
call those methods inside main method to execute them
*/
    
    
   
    
}