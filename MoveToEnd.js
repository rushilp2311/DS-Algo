function MoveToEnd(array, toMove) {
  let ptr1 = 0;
  let ptr2 = 0;

  while (ptr1 < ptr2) {
    while (ptr1 < ptr2 && array[ptr2] === toMove) ptr2--;
    if (array[ptr1] === toMove) swap(ptr1, ptr2, array);
    ptr1++;
  }
  return array;
}

function swap(i, j, array) {
  const temp = array[j];
  array[j] = array[i];
  array[i] = temp;
}
