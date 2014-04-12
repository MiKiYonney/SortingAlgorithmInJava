package sort;
//时间复杂度为O(n2),空间复杂度为O(1)
//直接插入
public class Insert_InsertSort {
	public static void insertSort(int data[]){
		int temp , j;
		for (int i = 0; i < data.length; i++) {
			temp = data[i];
			j = i- 1;
			while(j >= 0 && data[i] > temp){
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = temp;
		}
	}
}
