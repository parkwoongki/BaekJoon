package BaekJoon_07_15596;

public class BaekJoon_07_15596 {
	
	long sum(int[] a) {
        long ans = 0;
        
		for (int i : a) {
			ans += i;
		}
        
        return ans;
    }

}
