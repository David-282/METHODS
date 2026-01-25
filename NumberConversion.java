public class NumberConversion{


     public static void main (String...args){

     int number =-100; 

     System.out.println(numberConverter(number));


}

     public static String numberConverter (int number){
          if  (number==0){
               return "0";
               }  
          if (number<0)
          number*=-1;


          

          int  originalNumber =number;
//          System.out.print(originalNumber);
          int division=0;
          int multiplication=0;
          String convertedNum="";
          int subtraction=0;
     for (int count = 0; count<number; count++){
          
     division = originalNumber/2;
     multiplication= division*2;
     subtraction = originalNumber-multiplication;

     convertedNum+= subtraction;
          if (division==0){
//     convertedNum+=1;
     break;
}
     
     

     }
}
