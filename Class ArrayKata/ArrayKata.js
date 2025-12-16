function maximumIn(numbers){
    let largest = numbers[0]
    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] > largest) {
            largest = numbers[count]
}
}
          return largest
}

function minimumIn(numbers){
    let smallest = numbers[0]
    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] < smallest) {
            smallest = numbers[count]
}
}
        return smallest
}

function sumOf(numbers){
    let sum = 0
    for (let count = 0; count < numbers.length; count++){
        sum += numbers[count]
}
    return sum
}

function sumOfEvenNumbersIn(numbers){
    let sumOfEven = 0
    for (let count = 0; count < numbers.length; count++){
        if (numbers[count] % 2 === 0) {
            sumOfEven += numbers[count]
 }
}
    return sumOfEven
}

function sumOfOddNumbersIn(numbers){
    let sumOfOdd = 0
    for (let count = 0; count < numbers.length; count++){
        if (numbers[count] % 2 !== 0) {
            sumOfOdd += numbers[count]
                         }
}          
    return sumOfOdd
}

function maximumAndMinimumOf(numbers){
    let largest = numbers[0]
    let smallest = numbers[0]
    let newArray = []

    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] > largest){
            largest = numbers[count]
        }
        if (numbers[count] < smallest){
            smallest = numbers[count]
}
}

    newArray[0] = largest
    newArray[1] = smallest

    return newArray
}

function noOfOddNumbersIn(numbers) {
    let countOfOdd = 0
    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] % 2 !== 0) {
            countOfOdd += 1
}
}
               return countOfOdd
}

function noOfEvenNumbersIn(numbers) {
    let countOfEven = 0
    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] % 2 === 0) {
            countOfEven += 1
}
}
          return countOfEven
}

function evenNumbersIn(numbers) {
    let evenArray = []
    let counter = 0
    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] % 2 === 0) {
            evenArray[counter] = numbers[count]
            counter++
}
}
    return evenArray
}

function oddNumbersIn(numbers) {
    let oddArray = []
    let counter = 0
    for (let count = 0; count < numbers.length; count++) {
        if (numbers[count] % 2 !== 0) {
            oddArray[counter] = numbers[count]
            counter++
}
}
    return oddArray
}

function squareNumbersIn(numbers) {
     let newArray = []
    let counter = 0
    for (let count = 0; count < numbers.length; count++) {
        newArray[counter] = numbers[count] * numbers[count]
        counter++
}
    return newArray
}


let number = [1, 2, 3, 4, 5, 6, 8, 9]

console.log( maximumIn(number))
console.log( minimumIn(number))
console.log( sumOf(number))
console.log( sumOfEvenNumbersIn(number))
console.log( sumOfOddNumbersIn(number))
console.log( maximumAndMinimumOf(number))
console.log(evenNumbersIn(number))
console.log( oddNumbersIn(number))
console.log( squareNumbersIn(number))

