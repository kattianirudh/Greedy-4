// Time Complexity : O(2*N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    1. Take the pair, i.e. first element from top array and bottom array
    2. Check if any of the numbers don't exist in the pair. If they both don't return -1
    3. Else return the minimum number of rotations required to make the row same
*/


// Your code here along with comments explaining your approach
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res = check(tops, bottoms, tops[0]);
        if(res != -1) return res;
        return check(tops, bottoms, bottoms[0]);
    }
    
    private int check(int[] tops, int[] bottoms, int target) {
        int aRot = 0; int bRot = 0;
        for(int i=0;i<tops.length;i++) {
            if(tops[i] != target && bottoms[i] != target) return -1;
            if(tops[i] != target) aRot ++;
            if(bottoms[i] != target) bRot ++;
        }
        return Math.min(aRot, bRot);
    }
}
