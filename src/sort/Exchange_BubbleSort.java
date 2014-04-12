package sort;

import java.util.Arrays;

/**
 * 冒泡排序（交换）
 * 第i次比较保证i大的数排在n-i的位置
 * 第1次比较保证第1大的位置排在n处
 * 第一趟：0和1,1和2，n-2和n-1比较，前一个大于后一个则交换
 * i趟冒泡，n-i次比较，n-i-1次对象交换
 * 比较总数：n-1+n-2+n-3+……+1  n(n-2)/2
 * 移动总数：n*(n-1)*3/2
 * 【时间复杂度O(n2)，空间复杂度O(1)】
 * @author yonney
 *
 */
public class Exchange_BubbleSort {
	public static void bubbleSort(int data[]){
		for (int i = 0; i < data.length; i++) {
			boolean flag = false;
			System.out.println(i+1+"趟排序：");
			for (int j = 0; j < data.length-i-1; j++) {
				if(data[j] > data[j+1]){
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
					flag = true;
				}
				System.out.println(Arrays.toString(data));
				if(!flag){//如果某趟没交换，则代表已经处于有序状态了
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		 int data[]={49,38,65,97,76,13};
		 System.out.println("before sort:"+Arrays.toString(data));
		 bubbleSort(data);
		 System.out.println("after sort:"+Arrays.toString(data));
	}
}
