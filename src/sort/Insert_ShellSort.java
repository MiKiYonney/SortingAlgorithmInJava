package sort;

import java.util.Arrays;

public class Insert_ShellSort {
	public static void shellSort(int data[]){
		int h = 1;
		while(h <= data.length /3){
			h = h*3 +1;
		}
		while(h > 0){
			for (int i = h; i < data.length; i++) {
				int temp = data[i];
				if(data[i] < data[i-h]){
					int j = i - h;
					for (; j>=0 && data[j] > temp; j-=h) {
						data[j+h] = data[j];
					}
					data[j+h] = temp;
				}
				System.out.println(Arrays.toString(data));
			}
			h = (h-1)/3;
		}
	}
	public static void main(String[] args) {
		int data[] = {49,38,13,97,76,13};
		System.out.println("before sort:"+Arrays.toString(data));
		shellSort(data);
		System.out.println("after sort:"+Arrays.toString(data));
	}
}
