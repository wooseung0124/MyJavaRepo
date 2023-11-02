package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방3개짜리 int[]객체를 만들어서 참조값을 지역변수 nums에 담기
		int[] nums = {0,0,0}; // 객체는 없는 거고 배열만 있는 상황
		
		// 0번에 10, 1번에 20, 2번에 30을 저장해보세요
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		// 0으로 초기화된 방 500개짜리 int[]객체 만들어서 참조값을 지역 변수 nums2에 담기
		int[] nums2 = new int [500];
		
		/*
		 * 0번에는 1, 1번에는 2, 3번에는 3...499번에는 500을 저장하라
		 */
		for(int i=0; i<nums2.length; i++) {
			nums2[i] = i+1;
		}
	}
}
