
def maximumIn (numbers):
     largest=numbers[0]
     for count in numbers:
          if count>largest:
               largest= count
     return largest



numbers=[1,2,3,4,5,6,7,8]
print(maximumIn(numbers))


def minimumIn (numbers):
     smallest=numbers[0]
     for count in numbers:
          if count<smallest:
               smallest= count
     return smallest



numbers=[1,2,3,4,5,6,7,8]
print(minimumIn(numbers))


def sumOf (numbers):
     addition=0
     for count in numbers:
          addition+=count
     return addition

numbers=[1,2,3,4,5,6,7,8]
print(sumOf(numbers))



def sumOfEvenNumbersIn (numbers):

     sumOfEven=0;
     for count in numbers:
          if count%2==0:
               sumOfEven+=count
     return sumOfEven;

numbers=[1,2,3,4,5,6,7,8]
print(sumOfEvenNumbersIn(numbers))


def sumOfOddNumbersIn (numbers):
     sumOfOdd=0
     for count in numbers:
          if count%2!=0:
               sumOfOdd+=count
     return sumOfOdd


numbers=[1,2,3,4,5,6,7,8]
print(sumOfOddNumbersIn(numbers))



def maximumAndMinimumOf (numbers):
     largest =numbers[0]
     smallest = numbers[0]
     newArray= []
     for count in numbers:
          if count>largest:
               largest =count
          if count<smallest:
               smallest = count             
     newArray.append(smallest)      
     newArray.append(largest)

     return newArray

numbers=[1,2,3,4,5,6,7,8]
print(maximumAndMinimumOf(numbers))



def noOfOddNumbersIn (numbers):
     countOfOdd=0
     for count in numbers:
          if count%2!=0:
               countOfOdd+=1
     return countOfOdd

numbers=[1,2,3,4,5,6,7,8]
print(noOfOddNumbersIn(numbers))


def noOfEvenNumbersIn (numbers):
     countOfEven=0
     for count in numbers:
          if count%2==0:
               countOfEven+=1
     return countOfEven

numbers=[1,2,3,4,5,6,7,8,10]
print(noOfEvenNumbersIn(numbers))

def evenNumbersIn (numbers):
     evenArray= []
     for count in numbers:
          if count%2==0:
               evenArray.append(count)
     return evenArray


numbers=[1,2,3,4,5,6,7,8,10]
print(evenNumbersIn(numbers))



def oddNumbersIn (numbers):
     oddArray= []
     for count in numbers:
          if count%2!=0:
               oddArray.append(count)
     return oddArray


numbers=[1,2,3,4,5,6,7,8,10]
print(oddNumbersIn(numbers))



def squareNumbersIn (numbers):
     newArray= []
     for count in numbers:
          newArray.append(count*count)
     return newArray;

numbers=[1,2,3,4,5,6,7,8,10]
print(squareNumbersIn(numbers))



