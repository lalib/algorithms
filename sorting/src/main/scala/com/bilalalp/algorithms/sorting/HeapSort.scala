package com.bilalalp.algorithms.sorting

import com.bilalalp.algorithms.datastructure.heap.HeapStructure

object HeapSort extends AbstractSort {

  override def sort[T: Manifest](elementArray: Array[T])(implicit ordering: Ordering[T]): Unit = {

    val heapOperation: HeapStructure[T] = new HeapStructure[T]
    heapOperation createHeap elementArray
    val sortedArray = heapOperation.sort()

    for (i <- elementArray.indices) elementArray(i) = sortedArray(i)
  }
}