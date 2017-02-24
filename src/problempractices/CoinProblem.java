//package problempractices;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class CoinProblem {
//
//    public static long makeChange(int[] coins, int money) {
//    	HashMap<String, Long> memo = new HashMap<String,Long>();
//    	return makeChange(coins, money, 0, memo);
//        
//    }
//    
//    public static long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo){
//    	System.out.println("----------starting new index " + index);
//    	String key = String.valueOf(money) + "-" + index;
//    	if (index == coins.length - 1){
//    		if(money % coins[index] == 0){
//    			memo.put(key, 1L);
//    			return 1;
//		}
//    	memo.put(key, 0L);
//		return 0;
//    	}
//    	int currentCoin = coins[index];
//    	System.out.println("--current coin " + currentCoin);
//    	long ways = 0;
//    	for(int i = 0; i*currentCoin <= money; i++){
//    		System.out.println("in for loop");
//    		
//    		int remaining = money - i*currentCoin;
//    		System.out.println("i = " + i + " current coin is " + currentCoin + " remaining is " + remaining);
//    		ways += makeChange(coins, remaining, index + 1, memo);
//    	}
//    	memo.put(key, ways);
//    	return ways;
////    	System.out.println("----------starting new index " + index);
////    	if (index == coins.length - 1){
////    		if(money % coins[index] == 0){
////    			System.out.println("returnin 1!!!!! ***********");
////    			return 1;
////    		}
////    		System.out.println("returnin 0!!!!! ***********");
////    		return 0;
////    	}
////    	int currentCoin = coins[index];
////    	System.out.println("--current coin " + currentCoin);
////    	long ways = 0;
////    	for(int i = 0; i*currentCoin <= money; i++){
////    		System.out.println("in for loop");
////    		
////    		int remaining = money - i*currentCoin;
////    		System.out.println("i = " + i + " current coin is " + currentCoin + " remaining is " + remaining);
////    		ways += makeChange(coins, remaining, index + 1);
////    	}
////    	return ways;
//    }
//    
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int coins[] = new int[m];
//        for(int coins_i=0; coins_i < m; coins_i++){
//            coins[coins_i] = in.nextInt();
//        }
//        Arrays.sort(coins);
//        int newCoins[] = new int[m];
//        for(int i = 0; i < m ; i++){
//        	newCoins[i] = coins[ m - 1 - i ];
//        }
//        System.out.println(makeChange(newCoins, n));
//    }
//
//}
