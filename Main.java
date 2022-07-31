//                                                               --------------Encaspsulation to make a calculator--------------
//                                                                                    

import java.util.*;
class calculater{
    int x;
    int y;


calculater(int x , int y){
    this.x=x;
    this.y=y;
}

public void getAdd(){
    int sum=x+y;
    System.out.println("sum is :"+sum);
} 

public void getSubtract(){
    int subtract=x-y;
    System.out.println("subtract is :"+subtract);
}

public void getMulti(){
    int multi=x*y;
    System.out.println("multification is :"+multi);
}

public void getDivision(){
    int divid=x/y;
    System.out.println("after divide is :"+divid);
}
}

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x=sc.nextInt();
        System.out.println("Enter second number :");
        int y=sc.nextInt();
        calculater z = new calculater(x,y);
        z.getAdd();
        z.getSubtract();
        z.getMulti();
        z.getDivision();
        
    }
}