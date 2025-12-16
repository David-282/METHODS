import java.util.Arrays;
     public class ArrayKata{
     
     public static void main(String...args){

     int [] number = {1,2,3,4,5,6,8,9};
     
          System.out.println(Arrays.toString(squareNumbersIn(number)));
}


public static int maximumIn (int [] numbers){

 int largest=numbers[0];

     for (int count =0;count <numbers.length;count ++){

     if (numbers[count]>largest){

          largest= numbers[count];
}
}
          return largest;
}

public static int minimumIn (int [] numbers){

 int smallest=numbers[0];

     for (int count =0;count <numbers.length;count ++){

     if (numbers[count]<smallest){

          smallest= numbers[count];
}
}
          return smallest;
}


public static int sumOf (int [] numbers){

 int sum=0;

     for (int count =0;count <numbers.length;count ++){

               sum+=numbers[count];
}

          return sum;
}


public static int sumOfEvenNumbersIn (int [] numbers){

 int sumOfEven=0;

     for (int count =0;count <numbers.length;count ++){

          if(numbers[count]%2==0){

               sumOfEven+=numbers[count];
}
}

          return sumOfEven;
}

public static int sumOfOddNumbersIn (int [] numbers){

 int sumOfOdd=0;

     for (int count =0;count <numbers.length;count ++){

          if(numbers[count]%2!=0){

               sumOfOdd+=numbers[count];
}
}
          return sumOfOdd;
}


public static int [] maximumAndMinimumOf (int [] numbers){

 int largest =numbers[0];
 int smallest = numbers[0];
 int [] newArray = new int [2];

     for (int count =0;count <numbers.length;count ++){

     if (numbers[count]>largest){

        largest = numbers[count];
}
          if (numbers[count]<smallest){
          smallest = numbers[count];
       
}
}            
              newArray[1]= smallest;       
             newArray[0]= largest;

      return newArray;
}

public static int noOfOddNumbersIn (int [] numbers){

 int countOfOdd=0;

     for (int count =0;count <numbers.length;count ++){

          if(numbers[count]%2!=0){

               countOfOdd+=1;
}
}
          return countOfOdd;
}

public static int noOfEvenNumbersIn (int [] numbers){

 int countOfEven=0;

     for (int count =0;count <numbers.length;count ++){

          if(numbers[count]%2==0){

               countOfEven+=1;
}
}

          return countOfEven;
}

public static int [] evenNumbersIn (int [] numbers){

 int [] evenArray= new int [noOfEvenNumbersIn(numbers)];
 int counter=0;
     for (int count =0;count <numbers.length;count ++){

          if(numbers[count]%2==0){

               evenArray[counter]=numbers[count];
               counter++;
}
}

          return evenArray;
}

public static int [] oddNumbersIn (int [] numbers){

 int [] oddArray= new int [noOfOddNumbersIn(numbers)];
 int counter=0;
     for (int count =0;count <numbers.length;count ++){

          if(numbers[count]%2!=0){

               oddArray[counter]=numbers[count];
               counter++;
}
}

          return oddArray;
}


public static int [] squareNumbersIn (int [] numbers){

     int [] newArray= new int [numbers.length];
     int counter =0;
     
     for(int count=0; count<numbers.length;count++){
           newArray[counter]= numbers[count]*numbers[count];
          counter++;
}
          

     return newArray;


}
}
