package problempractices;

public class reverseInt {
	
    public static int reverse(int x) {
        int reversed = 0;
        if(x<0){
        	x = Math.abs(x);
            while(x > 0){            	
                int tempReversed = (reversed * 10) + (x % 10);
                if((tempReversed - x%10) / 10 != reversed){
                	return 0;
                }
                reversed = tempReversed;
                x /= 10;
            }
            return reversed * -1;
        }
        while(x != 0){       
        	int digit = x % 10;
        	int tempReversed = (reversed * 10) + (digit);
            if((tempReversed - digit) / 10 != reversed){
            	return 0;
            }
            reversed = tempReversed;
            x /= 10;
        }
        return reversed;
//        int result = 0;
//
//        while (x != 0)
//        {
//            int tail = x % 10;
//            int newResult = result * 10 + tail;
//            if ((newResult - tail) / 10 != result)
//            { return 0; }
//            result = newResult;
//            x = x / 10;
//        }
//
//        return result;
    }

	public static void main(String[] args) {
		System.out.println(reverse(-123));

	}

}
