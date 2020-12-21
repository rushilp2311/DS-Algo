//array = [3, 5, -4, 8, 11, 1, -1, 6]
//targetSum = 10

//Time Complexity : O(n) | Space Complexity: O(1)
function TwoNumberSum(array, targetSum) {
  let left = 0;
  let right = array.length - 1;

  while (left < right) {
    const sum = array[left] + array[right];
    if (sum === targetSum) {
      return [array[left], array[right]].sort();
    } else if (sum < targetSum) {
      left++;
    } else {
      right--;
    }
  }
  return [];
}

console.log(TwoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10));
