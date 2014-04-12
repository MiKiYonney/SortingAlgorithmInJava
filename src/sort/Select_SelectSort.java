package sort;
/**
 * 选择排序（直接选择排序）
 * 第一趟比较：把第一个数依次与后面的数比较，如果大于则交换，则第一趟比较保证最小的数据在第一位
 * 【选择排序的时间复杂度和空间复杂度分别为 O(n2 )和 O(1)】 （选择排序只需要一个额外空间用于数组元素交换）。
 * 遍历数组的过程中，以 i代表当前需要排序的序号，则需要在剩余的 [i…n-1] 中找出其中的最小值，然后将找到的最小值与 i指向的值进行交换。第N趟比较保证第N小的数排在第N位
 * @author yonney
 *
 */
public class Select_SelectSort {
	public void selectSort(int[] A){
		int temp;
		for(int i =0 ; i < A.length-1;i++){
			int selected  = i;
			  // 由于每一趟都会将最小的放在最前面，所以索引+1
			for(int j = i+1 ;j < A.length;j++){
				//选择的数大于当前的数（小），则将当前数变为选择的数
				if(A[j] < A[selected] ){
					selected = j;
				}
			}
			temp = A[i];
			A[i] = A[selected];
			A[selected] = temp;
		}
		
		
	}
	public static void main(String[] args) {
		int A[] = { 2, 6, 10, 3, 9, 80, 1, 16, 27, 20, 11, 3, 1, 100, 89 };
		
		long start = System.nanoTime();//开始时间
		new Select_SelectSort().selectSort(A);
		System.out.println(System.nanoTime() - start);
		
		for (int i = 0; i < A.length; i++) {
			  System.out.print(A[i] + "  ");
		}
	}
}
