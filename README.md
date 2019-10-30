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


### Examples
- Remove Duplicates from Sorted Array