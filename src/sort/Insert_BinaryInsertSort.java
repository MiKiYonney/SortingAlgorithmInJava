package sort;
import java.util.Arrays;
/**
 * 二分插入排序
 * @author yonney
 *
 */
public class Insert_BinaryInsertSort {
	public static void binaryInsertSort(int data[]){
		for (int i = 0; i < data.length; i++) {
			int temp = data[i];
			int low = 0;
			int high = i-1;
			while(low <= high){
				int mid = (low+high)/2;
				if(temp < data[mid]){
					high = mid -1;
				}else{
					low = mid +1;
				}
			}
			for(int j = i ;j > low; j--){//low~i的数据往后移
				data[j] = data[j-1];
			}
			data[low] = temp;
			System.out.println(Arrays.toString(data));
		}
	}
	
	public static void main(String[] args) {
		 int data[] = {49,38,13,97,76,13};
		 System.out.println("before sort:"+Arrays.toString(data));
		 binaryInsertSort(data);
		 System.out.println("after sort:"+Arrays.toString(data));
	}
}
