//Time Complexity O(nlog(n) + mlog(m)) | Space Complexity O(1)
function SmallestDifference(arrayOne, arrayTwo) {
  arrayOne.sort();
  arrayTwo.sort();
  let ptr1 = 0;
  let ptr2 = 0;
  let smallest = Infinity;
  let current = Infinity;
  let smallestPair = [];

  while (ptr1 < arrayOne.length && ptr2 < arrayTwo.length) {
    let firstNumber = arrayOne[ptr1];
    let secondNumber = arrayTwo[ptr2];

    if (firstNumber < secondNumber) {
      current = secondNumber - firstNumber;
      ptr1++;
    } else if (secondNumber < firstNumber) {
      current = firstNumber - secondNumber;
      ptr2++;
    } else {
      return [firstNumber, secondNumber];
    }
    if (smallest > current) {
      smallest = current;
      smallest = [firstNumber, secondNumber];
    }
  }
  return smallestPair;
}

const result = SmallestDifference([1, 2, 3, 4], [7, 8, 9, 4]);

console.log(result[0]);
