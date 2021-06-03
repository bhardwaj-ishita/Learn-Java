# hashing:

-map keys or values into a hash table by using hashing function
-used for faster access to elements
-efficiency depends on the hash function used

## introduction:

question) store employee records keyed using phone numbers. it should efficiently perform three queries-
1) insert phone no and info
2) search phone no and info
3) delete phone no and info

this can be processed by using
-array or linked list for O(n) time in linear fashion: if we sort info and store in array we can *search* in O(logn) by using binary search but insert and deletion will be costly as we have to maintain sorted order
-balanced binary search tree for O(logn) time: insert, search and deletion all in same moderate time
-direct access table: make a huge ass array and store phone numbers as index in array. But if the number is huge then storing an int that big is not feasable. We might be able to all the operations in O(1) but huge space and storage problem

Through hashing we get O(1) search time and O(n) worst case. 

The main aim is always to use a hash function to convert the phone number into a smaller yet unique number which can be used as an index in a table called hash table

### hash function:

A hash function maps a big number or a string to a small integer that can be used as index in hash table

the mapped integer value is used as an index in hash table

1. efficiently computable
2. should uniformly distribute the keys (each table position equally likely for each key)

efwse

### hash table:

an array that stores pointers to records corresponding to a given key

an entry in hash table is null if no existing key has a hash function value equal to the index for the entry

### collision handling:

sometimes there are possibilities that two keys result in same value

hence the newly inserted key maps to an already occupied slot in hash table 

and this is called collision

hence to handle these situations we have a few techniques:

1. **chaining**: make each cell of hash table point to a linked list records that have same hash function value. it’s simple but requires extra memory outside the table
2. **open addressing**: all elements are stored in hash table itself. No key is generated. Each table contains either a record or NIL. We examine the table slots one by one until the desired element is found or it is clear that the element is not in the table

efasf

