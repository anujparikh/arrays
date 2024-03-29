# Arrays Data Structure

#### Introduction
An array is collection of items stored at contiguous memory locations. 
The idea is to store multiple items of same type together. 
This makes it easier to calculate the position of each element by simply adding an offset to a base value

#### Advantages of Arrays
- Arrays allow random access of elements. This makes accessing elements by position faster
- You can read or write a list item by referring to its index in constant time
- Arrays have better cache locality that can make a pretty big difference in performance

#### Best use-case
- Excessive read, as time complexity of read is always O(1)
- Random access to element using index

#### Time Complexity for Array (average and worst-case)
- Access: O(1)
- Search: O(n)
- Insertion: O(n)
- Deletion: O(n)

#### Time Complexity for `ArrayList` java class (worst-case)
- add(int i, E element): O(n - i)
- remove(int i): O(n - i)
- removeRange(int i, int j): O(n - i)
- remove(Object o): O(n)
- contains(Object o): O(n)
- indexOf(Object o): O(n)
- lastIndexOf(Object o): O(n)

#### Methods in `java.util.Array` Class
| Methods | Description | Returns | Notes | 
| ------- | :----------- | ------- | ---- |
| asList | This method returns a fixed-size list backed by the specified array | List |
| binarySearch | Searches the specified array for the specified value using the binary search algorithm | int | -1 if not found otherwise 0 or more index number
| copyOf | Copies the specified array, truncating or padding with defaults (if necessary) so the copy has the specified length | [] |
| copyOfRange | Copies the specified range of the specified array into a new array | [] | 
| deepEquals | Returns true if the two specified arrays are deeply equal to one another | Boolean | 
| equals | Returns true if the two specified arrays of objects are equal to one another | Boolean |
| fill | Assigns the specified value to each element of the specified range of the specified array | void | 
| sort | Sorts the specified array into ascending numerical order | void   

#### Common syntaxs
- Initializing Arrays in java
```java
int[] i = new int[4];
int[] i = new int[]{1,2,3,4};
```
- Copy Arrays in java
```java
Arrays.copyOf(originalArray, lengthOfArray);
Arrays.copyOfRange(originalArray, fromIndex, toIndex);
Arrays.asList(/* pass objects as list */);
```

### Examples
- [`Remove Duplicates from Sorted Array:`](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/) [Solution](./src/practice/examples/RemoveDuplicates.java) (Easy)
- [`Best Time to Buy and Sell Stock II:`](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/) [Solution](./src/practice/examples/BuyAndSellStocks.java) (Easy)
- [`Rotate Array`](https://leetcode.com/problems/rotate-array/) [Solution](./src/practice/examples/RotateArray.java) (Easy)
- [`Contains Duplicate`](https://leetcode.com/problems/contains-duplicate/) [Solution](./src/practice/examples/ContainsDuplicate.java) (Easy)
- [`Single Number`](https://leetcode.com/problems/single-number/) [Solution](./src/practice/examples/SingleNumber.java) (Easy)
- [`Intersection of 2 Arrays`](https://leetcode.com/problems/intersection-of-two-arrays-ii/) [Solution](./src/practice/examples/Intersection2Arrays.java) (Easy)
- [`Plus One`](https://leetcode.com/problems/plus-one/) [Solution](./src/practice/examples/PlusOne.java) (Easy)
- [`Move Zeros`](https://leetcode.com/problems/move-zeroes/) [Solution](./src/practice/examples/MoveZeros.java) (Easy)
- [`Two Sum`](https://leetcode.com/problems/two-sum/) [Solution](./src/practice/examples/TwoSum.java) (Easy)
- [`Valid Sudoku`](https://leetcode.com/problems/valid-sudoku/) [Solution](./src/practice/examples/ValidSudoku.java) (Easy)
- [`Rotate Image`](https://leetcode.com/problems/rotate-image/) [Solution](./src/practice/examples/RotateImage.java) (Medium)
- [`3 Sum`](https://leetcode.com/problems/3sum/) [Solution](./src/practice/examples/ThreeSum.java) (Medium)
- [`Set Matrix Zeros`](https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/) [Solution](./src/practice/examples/MatrixZeroes.java) (Medium)
- [`Group Anagrams`](https://leetcode.com/problems/group-anagrams/) [Solution](./src/practice/examples/GroupAnangrams.java) (Medium)
- [`Increasing Triplet Subsequence`](https://leetcode.com/problems/increasing-triplet-subsequence/) [Solution](./src/practice/examples/IncTripletSubSeq.java) (Medium)
- [`Merge Two Sorted Arrays`](https://leetcode.com/problems/merge-sorted-array/) [Solution](./src/practice/examples/MergeSortedArrays.java) (Easy)
- [`First Bad Version`](https://leetcode.com/problems/first-bad-version/) [Solution](./src/practice/examples/FirstBadVersion.java) (Easy)
- [`FizzBuzz`](https://leetcode.com/problems/fizz-buzz/) [Solution](./src/practice/examples/FizzBuzz.java) (Easy)
- [`Count Prime`](https://leetcode.com/problems/count-primes/) [Solution](./src/practice/examples/CountPrime.java) (Easy)
- [`Is Power of Three`](https://leetcode.com/problems/power-of-three/) [Solution](./src/practice/examples/PowerOfThree.java) (Easy)
- [`Pascal's Triangle`](https://leetcode.com/problems/pascals-triangle/) [Solution](./src/practice/examples/PascalTriangle.java) (Easy)
- [`Missing Number`](https://leetcode.com/problems/missing-number/) [Solution](./src/practice/examples/MissingNumber.java) (Easy)
- [`Search Insert Position`](https://leetcode.com/problems/search-insert-position/submissions/) [Solution](./src/practice/examples/SearchInsertPosition.java) (Easy)
- [`Sort Colors`](https://leetcode.com/problems/sort-colors/) [Solution](./src/practice/examples/SortColors.java) (Medium)
- [`Top K Frequent Elements`](https://leetcode.com/problems/top-k-frequent-elements/) [Solution](./src/practice/examples/TopKFrequentElements.java) (Medium)
- [`Kth Largest Elements`](https://leetcode.com/problems/kth-largest-element-in-an-array/) [Solution](./src/practice/examples/KthLargestElement.java) (Medium)
- [`Find Peak Element`](https://leetcode.com/problems/find-peak-element/) [Solution](./src/practice/examples/PeakElement.java) (Medium)
- [`Find First and Last Position of Element in Sorted Array`](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) [Solution with O(n)](./src/practice/examples/SearchRange.java) (Medium) - Pending `O(log n)` solution
- [`Merge Intervals`](https://leetcode.com/problems/merge-intervals/)[Solution](./src/practice/examples/MergeIntervals.java) (Medium)
- [`Non-overlapping Intervals`](https://leetcode.com/problems/non-overlapping-intervals/)[Solution](./src/practice/examples/NonOverlappingInterval.java) (Medium) (Greedy Algorithm - Need to understand that)