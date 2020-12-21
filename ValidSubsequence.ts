//Time Complexity : O(n) | Space Complexity: O(1)
function validSubsequence(array: number[], seqeunce: number[]): boolean {
  let ptr: number = 0;
  for (const value of array) {
    if (ptr === seqeunce.length) break;
    if (seqeunce[ptr] === value) ptr++;
  }
  return ptr === seqeunce.length
}