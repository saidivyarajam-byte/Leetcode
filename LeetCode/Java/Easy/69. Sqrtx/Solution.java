class Solution {
    public int mySqrt(int x) {
        int l=0,h=x;
        int mid=0;
        int ans=0;
        while(l<=h){
            mid=(l+(h-l)/2);
            long sq=(long)mid*mid;
            if(sq==x){
                ans=mid;
                break;
            }
            else if(sq>x){
                h=mid-1;
            }
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}