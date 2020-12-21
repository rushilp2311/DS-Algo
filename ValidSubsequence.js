//Time Complexity : O(n) | Space Complexity: O(1)
function ValidSubSequence(array, sequence) {
  let ptr = 0;
  for (const value of array) {
    if (ptr === sequence.length) break;
    if (sequence[ptr] === value) ptr++;
  }
  return ptr === sequence.length;
}

console.log(ValidSubSequence([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10]));
