class ArrayTest1{

	public static void main(String[] args){
		/*
		js는 배열 선언 시 그 크기를 명시하지 않아도 되지만, 
		사실 대부분의 프로그래밍 언어에서는 배열 선언 시 반드시 그 크기를 명시하는게 원칙임

		1)숫자
			-정수 byte short int long
			-실수 float double
		2)문자
			-문자 char
			-문자열 String
		3)논리값 boolean
		*/

		int[] arr=new int[4];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=12;

		//for문을이용해 모든 요소 출력
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
										
	}
}