type Triplets = [number, number, number];

//Time Complexity O(n^2) | Space Complexity O(n)
function threeNumberSum(array: number[], targetSum: number): Triplets[] {
  array.sort();
  const triplets: Triplets[] = []

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
