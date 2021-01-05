# Search-Sort-Algorithms
-----------------------------------------
#Search Algorithms
------------------------
1-Linear Search 
------------------
        --> Searching an element from a given array of size N using linear search requires O(N) time such that we need to traverse complete array linearly.
            Best Case(When the item to be searched is in 1st position)-O(1) time such that returning without traversing remaining array if found.
            Average and Worst Case(When element is in the last index of array) O(N) time.
                                      
2-Binary Search
----------------
        --> For using binary search the array should be sorted. Then the searched item is matched with the middle elememnt of the array if found return 
            else check to the left half or right half accordingly.
            Binary Search is better than linear as it divide the problem into half recursively.
            Time Complexity of binary search is O(logN).
              
#Basic Sort Algorithms
------------------
1-Selection Sort
------------------
        --> Selection Sort finds the next small element in every iteration and puts the element in beginning after the sorted elements.
            It is an inplace algo such that does not require any additional space.
            It requires less number of swapping-O(N)
            Best, Average, and Worst Case- O(N^2).
       
2-Bubble Sort
--------------
        --> Bubble Sort compares two corresponding elements and pushes the largest element in the end of the array in every iteration
            It is an inplace algo such that does not requires extra space for sorting.
            Best Case- If the array is already sorted then the time is O(N). Swapping required-O(1)
            Average and Worst Case- O(N^2). Swappinng- O(N^2).
            
3-Insertion Sort
-----------------
        --> Insertion sort is also an inplace algo and is stable(i.e maintains the order for same element).
            It divides the array in sorted and unsorted parts and increases size of sorted array by processing each element linearly.
            Process each element of the array and place it in the right position in the sorted part of the array.
            It is an adaptive algo(i.e time complexity and opertions differs according to the number of unsorted element in the array).
            It is better than Selection and Bubble sort and majorly beneficial for sorting small array.
            Best Case(already sorted array)-O(N) and swap operation-O(1)
            Average & Worst Case-O(N^2) and swap-O(N^2).
            
#Efficient Sort Algorithms
--------------------------

1-Merge Sort
---------------
       --> Merge Sort works on Divide and Conquer technique(dividing the problem into sub-problems and so-on) and uses Recursion.
           It is not an inplace algo it requires some additional storage. And is a stable algo.
           Divides the array into 2 parts recursively and then merge them to get sorted array.
           Best, Average, & Worst Case-O(NlogN). And space complexity-O(NlogN),if the used auxilary subarrays are are not cleared, and if cleared then O(N).
           
2-Quick Sort
-------------
      --> QuickSort is an inplace algo and also uses divide and conquer technique and recursion. But is not stable algo.
          In quicksort a pivot element is selected at each partition and then it is obtains a position such that all its left element is smaller and right are greater.
          It is widely applicable where the kth smallest/largest element is needed.
          Best & Average Case-O(NlogN) Worst Case-O(N^2).
          Since its worst case occurs rarely and we can also optimize it by using randomized version of QuickSort.Therefore, can be neglected.
          It perform better than MergeSort in real implementation.
          
 3-Heap Sort
 -----------
       --> HeapSort is based on Binay Heap data-structure(Complete Binary Tree). For ASC order we uses Max-Heap and for DSC order Min-Heap is used.
           Heapify can be used to enhance its performance.
           Firstly the array elements are heapified(i.e turned into max-heap or min-heap accordingly)
           Then the elements are deleted from the heap to get the sorted-array.
           Best, Average & Worst Case- O(NlogN).
           It is an inplace algo and does not require any additional space-O(1) . It is not stable.
          
       
