class Solution {
    public int mySqrt(int x) {
        int low = 1,high = x;
        int mid ;
        int val;
        while(low <= high)
        {
          mid = (low + high) / 2;
          val = (mid * mid);
          if(val <= x)
          {
            low = mid + 1;
          }
        
        else
        {
            high = mid -1;
        }
        }
        
    
    return high;
    }
}