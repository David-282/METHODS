public class NumberConversion{


     public static void main (String...args){


     convertABaseToAnother(4290,10,16);


}
     public static void  convertABaseToAnother (int number, int firstBase, int secondBase){
         int baseTenNumber = convertingToBaseTen(number, firstBase);
         String convertedNumber = convertFromBaseTen(baseTenNumber, secondBase);
         String finalNumber = reverseBaseTen(convertedNumber);
         if(baseTenNumber != -1){
              System.out.println("The number " + number + " in base " + firstBase + " is " + finalNumber + " in base " + secondBase);
         } else
     {
              System.out.println("Invalid Input, The base is not valid for the number provided");
              }
     
     }
    public static int convertingToBaseTen (int number, int firstBase){
        if(!validatingBaseZero(number, firstBase) || !validatingBase(number, firstBase)){
             return -1;
        }
     if (number<0){
          number = number*-1;
     }
     int baseTenNumber =0;
     int result=0;
     int exponential =0;
     while(number>0){
          int digit = number%10;
          result = digit * raiseToPower(firstBase,exponential);
          // if(result >=11){
          //     char letter = (char) ((result -10) + 'A');
          //      baseTenNumber += letter;
          // } else{
          //      baseTenNumber += result;
          // }
                    //      baseTenNumber += result;
          baseTenNumber += result; 
          number/=10;
          exponential++;
          }
     return baseTenNumber;
    
     }  
     public static String convertFromBaseTen (int number, int secondBase){
          if(number ==0){
               return "0";
          }
        if(!validatingBaseZero(number, secondBase)){
             return "Invalid Input";
        }
          int  originalNumber =number;
          int division=0;
          int multiplication=0;
          String convertedNum="";
          int subtraction=0;
          while(originalNumber>0){
               division = originalNumber/secondBase;
               multiplication = division * secondBase;
               subtraction = originalNumber - multiplication;
               if(subtraction > 10){
                    char  letter = (char) ((subtraction -10) + 'A');
                    convertedNum += letter;
               } else {
                    convertedNum += subtraction ;
               }
               originalNumber = division;
          }

return convertedNum;
     }

     public static int raiseToPower(int baseNumber, int exponential){
        int multiply = 1;
       for(int count = 1; count <= exponential; count++){
            multiply *= baseNumber  ;
        }
        return multiply;
    }
     public static String  reverseBaseTen (String number){
          String reversedNumber ="";
          for(int index = number.length() -1; index >=0; index--){
               reversedNumber += number.charAt(index);
          }

          return reversedNumber;
     } 

    public static boolean validatingBaseZero (int number, int base){
    
     if(base ==0 || base ==1 || base <0){
          return false;
     }
          return true;

     }
     public static  boolean validatingBase (int number,int base){


     int selectedNumber =0;

       while(number>0){       
       int digit = number%10;
       selectedNumber = digit;
   

     if(selectedNumber >= base){

            return false;
}
            number/=10; }
     
      
            return true; 
}

}
