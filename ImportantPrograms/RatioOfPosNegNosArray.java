package PracticeProgram;

public class RatioOfPosNegNosArray {

	public static void main(String[] args) {
		int a[]= {1,1,0,-1,-1};
		
		float pos=0;
		float neg=0;
		float zero=0;

		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				pos+=1;
			}
			if(a[i]<0) {
				neg+=1;
			}
			else if(a[i]==0) {
				zero+=1;
			}
		}
		
		System.out.format("Ratio of Positive Numbers-"+"%.6f",pos/a.length);
		System.out.println();
		System.out.format("Ratio of Negative Numbers-"+ "%.6f",neg/a.length);
		System.out.println();
		System.out.format("Ratio of Zeros Numbers-"+"%.6f",zero/a.length);

	}

}
