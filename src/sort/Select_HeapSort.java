package sort;

import java.util.Arrays;

/**
 * 堆排序(选择排序)
 * 堆的定义如下：具有n个元素的序列（h1,h2,...,hn),当且仅当满足（hi>=h2i,hi>=2i+1）或（hi<=h2i,hi<=2i+1）(i=1,2,...,n/2)时称之为堆。
 * 初始时把要排序的数的序列看作是一棵顺序存储的二叉树，调整它们的存储序，使之成为一个堆，这时堆的根节点的数最大。然后将根节点与堆的最后一个节点交换。然后对前面(n-1)个数重新调整使之成为堆。依此类推，直到只有两个节点的堆，并对它们作交换，最后得到有n个节点的有序序列。
 * 1.建堆  n-1次建堆   每次log2n
 * 2.拿堆顶与最后一个节点交换
 * 对n个数据元素的数据组而言，堆排序需经过n-1次建堆，每次建堆选出该堆的最大值或最小值（通过树形结构保存选择排序中已经比较过了的结果）
 * 所以堆排序有两个函数组成。一是建堆的渗透函数，二是反复调用渗透函数实现排序的函数。
 * 时间复杂度：O(nlog2n)  空间O(1)
 * @author yonney
 *
 */
public class Select_HeapSort {
	//1.建堆
	//对data数组从0到lastIndex建大顶堆
	public static void buildMaxHeap(int[] data, int lastIndex){
		//从lastIndex处节点（最后一个节点）的父节点开始
		for(int i = (lastIndex -1)/2;i >=0; i--){
			int k = i;//当前正在判断的节点
			while(k*2+1 <= lastIndex){//如果当前K节点的子节点存在
				//K节点的左子结点的索引biggerIndex
				 int biggerIndex=2*k+1;  
				//如果biggerIndex小于lastIndex,即biggerIndex+1代表的K节点的右子节点存在
				 if(biggerIndex<lastIndex){  
					 //如果右子节点的值较大  
					 if(data[biggerIndex]<data[biggerIndex+1]){  
						  //biggerIndex总是记录较大子节点的索引  
	                        biggerIndex++;  
					 }
				 }
				  //如果k节点的值小于其较大的子节点的值  
				 if(data[k]<data[biggerIndex]){  
					  //交换他们  
	                   swap(data,k,biggerIndex);
					 //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
	                    k=biggerIndex;  
				 }else{
					 break;
				 }
			}
		}
	}
	//2.拿堆顶与最后一个节点交换
	public static void swap(int[] data,int i,int j){
		int tmp=data[i];  
        data[i]=data[j];  
        data[j]=tmp;  
	}
	public static void main(String[] args) {
		int data[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int arrayLength =data.length;  
		 //循环建堆  
        for(int i = 0; i <arrayLength-1;i++){  
            //建堆  
        	buildMaxHeap(data,arrayLength-1-i);  
            //交换堆顶和最后一个元素  
            swap(data,0,arrayLength-1-i);  
            System.out.println(Arrays.toString(data));  
        }  
	}
}
