import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] plusOne(int[] digits) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        int carry = 1;
        int i = digits.length-1;
        while(i>=0 || carry > 0){
            int sum = 0;
            if(i >= 0) sum = carry + digits[i];
            else sum = carry;
            carry = sum/10;
            integerDeque.addFirst(sum%10);
            i--;
        }
        return integerDeque.stream().mapToInt(j -> j).toArray();
    }
}