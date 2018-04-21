<b>Binary Search:</b> As the name says "Binary" Search. It is a searching algorithm which divides its search into half of the originial problem.

Note*: Binary Search can be used ONLY with sorted numbers/values.

Lets make it simple. Suppose you have an array of 14 numbers and you want to search the index containing the valie '6' :
Initially we have these values: 
int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
left:   0   [ Starting index of array ]
right:  14 [ Ending index of array, ie: Size of array. Its okay to pass 14 ]
target: 6

Initially our function will look like:   binarySearch(int[] nums, int target (6), int left(0), int right(14))

Binary Search starts to compare the target value 6 with the value at middle index of the array
ie: 
( left index + right index ) / 2   - That is how we get the index at the middle of OUR* array
middle = (0+14)/2 = 7
is 6 == nums[6]     ? NO
is 6 > nums[middle] ? NO   ( as nums[7] = 8)
is 6 < nums[middle] ? YES, that means the target value has to be between nums[0] & nums[7]

Now we call the same function and pass our new parameters,  left & right, left's value will remain same and right's will change to the value of 'mid'
ie:  binarySearch(nums,      6,      0,      7)
                       target^   left^  right^
Now, though the array is same, our Algorithm is SURE that the target value is between nums[0] & nums[7] so it does not waste time in searching the other half of the array. In fact for our Algoritmh the other half of the array does not EXIST AT ALL.
For him its just int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8,<strike>9,10,11,12,13,14};</strike>
                         nums[0]^.............nums[7]^

Now again it checks the value at index  (0+7)/2 : 3

IS 6 > nums[3] YES,  now pass 3 as left index & right's index will remain unchanged.

Now nums = <strike>{1,2,3,</strike 4,  5,  6,  7,  8, <strike>9,10,11,12,13,14}</strike>
                           nums [3]^........nums[7]^

check the value at index (3+7)/2 : 5

IS 6 == nums[5]  YES. Value found at index: 5;