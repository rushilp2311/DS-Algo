function moveToEnd(array: number[], toMove: number): number[] {
  let ptr1: number = 0;
  let ptr2: number = 0;

  while (ptr1 < ptr2) {
    while (ptr1 < ptr2 && array[ptr2] === toMove) ptr2--;
    if (array[ptr1] === toMove) Swap(ptr1, ptr2, array);
    ptr1++;
  }
  return array;
}

function Swap(i: number, j: number, array: number[]): void {
  const temp = array[j];
  array[j] = array[i];
  array[i] = temp;
}
