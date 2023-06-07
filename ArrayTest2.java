class ArrayTest2{
	public static void main(String[] args){

		//자바를 포함한 대부분의 프로그램 언어의 배열은 동적으로 줄어들거나 늘어나지 않음
		String[][] arr= new String[3][2]; //3층2호
		
		arr[0][0]="사과";
		arr[0][1]="딸기";
		arr[1][0]="벤츠";
		arr[1][1]="아우디";
		arr[2][0]="JAVA";
		arr[2][1]="Oracle";

		for(int a=0; a<arr.length; a++){//층
			for(int i=0; i<arr[a].length; i++){//호
				System.out.print(arr[a][i]);
			}
			System.out.println(""); //줄바꿈은 층수와 관련됨
		}
		
	}
}