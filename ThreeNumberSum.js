//Time Complexity O(n^2) | Space Complexity O(n)
function ThreeNumberSum(array, targetSum) {
  array.sort();
  const triplets = [];
  for (let i = 0; i < array.length - 2; i++) {
    let left = i + 1;
    let right = array.length - 1;
    while (left < right) {
      const currentSum = array[i] + array[left] + array[right];
      if (currentSum === targetSum) {
        triplets.push([array[i], array[left], array[right]]);
        left++;
        right--;
      } else if (currentSum < targetSum) {
        left++;
      } else {
        right--;
      }
    }
  }
  return triplets;
}

const result = ThreeNumberSum([12, 3, 1, 2, -6, 5, -8, 6], 0);
console.log(result[0][2]);
