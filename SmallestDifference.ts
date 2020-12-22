//Time Complexity O(nlog(n) + mlog(m)) | Space Complexity O(1)
function smallestDifference(arrayOne: number[], arrayTwo: number[]): number[] {

  arrayOne.sort();
  arrayTwo.sort();

  let ptr1: number = 0;
  let ptr2: number = 0;
  let smallest: number = Infinity;
  let current: number = Infinity;
  let smallestPair: number[] = [];

  while (ptr1 < arrayOne.length && ptr2 < arrayTwo.length) {
    let firstNumber: number = arrayOne[ptr1];
    let secondNumber: number = arrayTwo[ptr2];
    if (firstNumber < secondNumber) {
      current = secondNumber - firstNumber
      ptr1++;
    } else if (secondNumber < firstNumber) {
      current = firstNumber - secondNumber;
      ptr2++;
    }
    else {
      return [firstNumber, secondNumber];
    }
    if (smallest > current) {
      smallest = current;
      smallestPair = [firstNumber, secondNumber];
    }
  }
  return smallestPair;
}