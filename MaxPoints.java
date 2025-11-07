package slidingwindow_twopointerr;

public class MaxPoints {
	static int maxcards(int [] cards,int k) {
		int lsum=0;
		int rsum=0;
		int sum=0;
		
		int rightIndex=cards.length-1;
		for(int i=0;i<k;i++) {
			lsum+=cards[i];
			sum=lsum;
			
		}
		//now we should remove from left and add from right side
		for(int i=k-1;i>=0;i--) {
			lsum=lsum-cards[i];
			rsum=rsum+cards[rightIndex];
			sum=Math.max(sum,lsum+rsum);
			rightIndex--;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] cards= {23,2,3,4,5,6,7,9,1};
		System.out.println(maxcards(cards,4));
		
		

	}

}
