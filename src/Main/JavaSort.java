package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class JavaSort {
	public static void main(String[] args){
		JavaSort sort = new JavaSort();
		sort.testJavaSort_1();
		sort.testJavaSort_2();
		sort.testJavaSort_3();
		System.out.println("java sort test over");
	}
	
	/**
	 * 调用Java自带的Conllection.sort方法进行排序
	 * @param list
	 */
	public void javaSort(List<Integer> list){
		if(list == null || list.size() == 0){
			return;
		}
		Collections.sort(list,new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0-arg1;
			}
		});
	}
	
	/**
	 * 测试用例1
	 */
	private void testJavaSort_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(0);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(8);
		List<Integer> copy = new ArrayList();
		copy.addAll(list);
		javaSort(list);
		Utils.println(list);
		assert(Utils.equals(list, copy));
	}
	
	/**
	 * 测试用例2
	 */
	private void testJavaSort_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(0);
		list.add(1);
		list.add(-99);
		list.add(-0);
		list.add(8);
		list.add(199);
		list.add(8);
		List<Integer> copy = new ArrayList();
		copy.addAll(list);
		javaSort(list);
		Utils.println(list);
		assert(Utils.equals(list, copy));
	}
	
	/**
	 * 测试用例3
	 */
	private void testJavaSort_3(){
		List<Integer> list = null;
		List<Integer> copy = null;
		javaSort(list);
		Utils.println(list);
		assert(Utils.equals(list, copy));
	}
	
}
