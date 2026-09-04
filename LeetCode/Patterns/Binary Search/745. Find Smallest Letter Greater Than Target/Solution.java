/*class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c: letters)
        {
            if(c>target)return c;
        }
        return letters[0];
        
    }
}*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length-1] <= target) 
        { 
            return letters[0];

        }
        int low = 0;
        int high = letters.length - 1;
          while (low <= high) {

            int mid = (low + high) / 2;

            if (letters[mid] <= target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return letters[low];
        
    }

}