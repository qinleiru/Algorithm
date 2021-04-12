package leetcode;

//给定数组，给定target只，返回下标
public class TestMain {
	public int[] result(int[]a,int target) {
		int c[]=new int[]{-1,-1};
		if(a.length==1)   return c;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==target&&i!=j) {
					c[0]=i;
					c[1]=j;
					break;
				}
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int[]a=new int[] {1,2,3,4,5};
		int target=10;
		TestMain testmain=new TestMain();
		int c[]=testmain.result(a, target);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
}
