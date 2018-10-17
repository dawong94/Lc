class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x!= 0) {
            int tail = x %10;
            int newRes = res*10 + tail;
            //if it's diff, overflow!
            if ((newRes - tail) /10 != res){return 0;}
            x = x/10;
            res= newRes;
        }
        return res;
        
    }
}