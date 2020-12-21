//Time Complexity : O(n) | Space Complexity: O(1)
function twoNumberSum(array: number[], targetSum: number): number[] {

  let left: number = 0;
  let right: number = array.length - 1;

  while (left < right) {
    const sum: number = array[left] + array[right];
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