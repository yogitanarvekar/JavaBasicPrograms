
 public class Main {
     public static void main(String[] args) {

//         int a = 1, b = 8, d = 9;
//         String s = "Hello";
//         char c = 'a';
//         System.out.println(a+b+d);           output=18

         //data type
//         int aa=7+7;
//         String ss = "Yogita";
//         System.out.println( ss.length());    output= 6
//         System.out.println(aa);              output=14

         // java type casting
//           long x = 11111111;
//           System.out.println(x);             output=11111111

//         int myInt = 9;
//         double myDouble = myInt;
//         System.out.println(myInt);           output=9
//         System.out.println(myDouble);        output=9.0
//
//         double dd = 9.78;
//         int myInt = (int) dd;
//         System.out.println(dd);               Outputs 9.78
//             System.out.println(myInt);        Outputs 9

//         int xx = (int) 9.0;
//         System.out.println(xx);               Output=9

//         java operators
//
//         int a=9 , b=9;
//         System.out.println(a%b);

         // a=10;
//        int x = ++a; //a=11
//        System.out.println("x1 = "+ x); //x=11
//        x=a++; // x=11 , a=12
//        System.out.println("x2 = "+ x);// x==11
//        System.out.println("a = "+ a);// a=12

//        // a=10;
//        int x = a++; //x=10 , a=11
//        System.out.println("x1 = "+ x); //x=10
//        x= ++a; // x=12 , a=12
//        System.out.println("x2 = "+ x);// x=12
//        System.out.println("a = "+ a);// a=12

//         int a=10;
//         int x = a--;    x=10 a=9
//         System.out.println("x1 = "+ x++);    x1=10
//         System.out.println(x); x=11
//         x= --a; a=8, x=8
//         System.out.println("x2 = "+x); x2=8
//         System.out.println("a ="+a); a=8

         //Assignment Operators

//        int x=15;

//        x=5;//5
//        x+=5; // x=x+5;
//        x-=10; // x=x-10 => x=15-10 =>5
//        x*=10;
//        x/=10;
//        x%=10;
//        x&=10;
//        x|=10;
//        x^=10; //x=x^10 => 15^10
//        x>>=10;
//        <<x=10;

         //Comparison Operation

//         int a = 10;
//         int b = 10;
//         System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a<b); //5<10
//        System.out.println(a>b);//5>10
//        System.out.println(a<=b);
//        System.out.println(a>=b);



         //        Logical Operators

//        int a=10;
//        int b=20;

//        a==b || a==10
//        false || true
//
//        a==10 || a==b
//        true

//        if(a==10 || a==b){
//            System.out.println("yes.....");
//        }else {
//            System.out.println("noooo....");
//        }

//        a=10
//        b=20
//        if(a==10 && a==b){
//            System.out.println("yes.....");
//        }else {
//            System.out.println("noooo....");
//        }

         //a=10
//        if(!(a==11)){
//            System.out.println("yes.....");
//        }else {
//            System.out.println("noooo....");
//        }

         // Initial values
//        int a = 5;
//        int b = 7;
//        System.out.println(a|b);
//
//         // bitwise and
//         // 0101 & 0111=0101 = 5
//        System.out.println("a&b = " + (a & b));
////
//          System.out.println("a|b = " + (a | b)); // bitwise or
//         System.out.println("a^b = " + (a ^ b)); // bitwise xor
//        System.out.println("~a = " + ~a);  // bitwise not
////        // assignment operator to // a=a&b
//        a &= b;
//        System.out.println("a= " + a);


//         java math
//         System.out.println( Math.max(111,16) );    //111
//        System.out.println( Math.min(111,16) );     //16
//
//        int a = 50-100;   //-50
//        System.out.println("a= "+a);
//        a = Math.abs(a); //a= -50
//        System.out.println("abs a = "+ a);              //abs a=50
//        System.out.println(Math.random()*100);      //19.677787925614297
//        System.out.println(Math.addExact(11,14));        //25


//      java booleans


//        boolean name = false;
//        System.out.println(name);       //false
//
//        int x = 10;
//        int y = 9;
//        System.out.println(x > y);      //true


         //if else condition
//         int time = 20;
//         if (time < 18) {
//             System.out.println("Good day.");
//         } else {
//             System.out.println("Good evening.");     output= Good evening.
//         }

         //if ,else if, else example

         //1)

//        if(10>20){
//            System.out.println(" 10 is smaller than 20");
//        }else if(20>30){
//            System.out.println(" 20 is smaller than 30");
//        } else{
//            System.out.println(" bigger ");                 //op= bigger
//        }

         //2)

//         int number = 22;
//
//        if (number < 10) { // 22 < 10
//            System.out.println("Good morning.");
//        } else if (number > 18) {
//            System.out.println("Good day.");
//        } else {
//            System.out.println("Good evening.");
//        }



         // ---------------While Loop-------------



         //java switch

//         int day = 3;
//        switch (day){
//            case 1:
//                System.out.println("mon");
//                break;
//            case 2:
//                System.out.println("tue");
//                break;
//            case 3:
//                System.out.println("wed");
//                break;
//            default:
//                System.out.println("wrong day");
//        }


         //-------------------------------- while loop -------------------------------
//        //1) String myName = "amit";
//         int i = 40;
//         while (i < 50) {
//             System.out.println(i+" "+ myName);
//             i++;
//         }
//            //2)
//         int i = 0;
//         while (i < 5) {
//             System.out.println(i);
//             i++;
//         }

         //--------------------------------do/ while loop -------------------------------

//         int i=0;
//        do{
//            System.out.println(i+" amit");
//            i++;
//        }while(i<10);

         //---------------------for loop----------









     }
 }