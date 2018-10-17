class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j= b.length()-1;
        int carry = 0;
        while(i>= 0 || j >=0) {
            int sum = 0;
            sum += (i>=0) ? a.charAt(i--) - '0' : 0;
            sum += (j>=0) ? b.charAt(j--) - '0' : 0;
            sum += carry;
            carry = sum / 2;
            sum = sum % 2;
            sb.append(sum);
        }
        if (carry != 0){sb.append(carry);}
        return sb.reverse().toString();
        
    }
}