package leetcode

/*
    Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, return the
    index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
 */
fun main() {
    val ar = arrayOf(1, 3, 5, 6)
    val target = 5

    ar.forEachIndexed{ index, value ->
        if (value == target) {
            println(index)
        }
        if (value > target) {
            println(index - 1)
        }
    }
    println(ar.size)
}

/* Best solution
    class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        //Follow the binary search approach
        //Find left, right
        var left =0
        var right = nums.size -1

        //Find mid
        while (left <=right){
        var mid = (left+right) /2

        //if the target ==mid return
        if(target == nums[mid]){
            return mid
        }

        //else reduce left, right index based on condition.
        if(target < nums[mid]){
            right = mid -1
        }else{
            left = mid +1
        }
      }
      //if the number doesnt exist in the array it will return after all above are executed.
        return  left
    }
}
 */