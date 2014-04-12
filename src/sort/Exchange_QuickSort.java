package sort;
import java.util.Arrays;
/**
 * 快速排序
 * 思路：
 * (1)从待排序的序列中选一个数据作为分界值
 * (2)比其小的放左边
 * (3)大的放右边
 * 实现(2)(3):
 * 1.定义i,i变量从第一个索引开始，找大于分界值的元素的索引，并用i记录
 * 2.定义j,j变量从右边的第一个索引开始，找小于分解至的元素的索引，并用j记录
 * 3.如果i<j，交换i,j处的元素
 * 重复执行1,2,3，知道i>=j,则可判断j左边的元素小于分解值，j右边的元素大于分解值，
 * 4.最后将分界值与j索引处的元素交换即可
 * @author yonney
 *
 */
public class Exchange_QuickSort {
	public static void quickSort(int data[],int first,int end){ //小于分解值的放左边，大于分解值的放右边
		if(first < end){//序排序
			int base = data[first];//第一个元素为分解值
			int i = first;//i从左边开始搜索，搜索大于分解值的元素的索引
			int j = end +1;//j从邮编开始搜索，搜索小于分解值的元素的索引 
			while(true){
				while(i < end && data[++i] <= base);//找到大于分解值的元素的索引，或者i已经到end处了
				while(j > first && data[--j]>=base);//找到小雨分解值的元素的索引，或者j已经到达first处了
				if(i < j){
					swap(data,i,j);
				}else{
					break;
				}
			}
			swap(data,first,j);
			quickSort(data,first,j-1);//递归左边序列
			quickSort(data,j+1,end);//递归右边序列
		}
	}
	public static void swap(int data[],int i, int j){
		int temp =data[j];
		data[j] = data[i];
		data[i] = temp;
	}
	public static void main(String[] args) {
		 int data[]={49,38,65,97,76,13};
		 System.out.println("before sort:"+Arrays.toString(data));
		 quickSort(data,0,data.length-1);
		 System.out.println("after sort:"+Arrays.toString(data));
	}
}
