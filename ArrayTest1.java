class ArrayTest1{

	public static void main(String[] args){
		/*
		js�� �迭 ���� �� �� ũ�⸦ ������� �ʾƵ� ������, 
		��� ��κ��� ���α׷��� ������ �迭 ���� �� �ݵ�� �� ũ�⸦ ����ϴ°� ��Ģ��

		1)����
			-���� byte short int long
			-�Ǽ� float double
		2)����
			-���� char
			-���ڿ� String
		3)���� boolean
		*/

		int[] arr=new int[4];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=12;

		//for�����̿��� ��� ��� ���
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
										
	}
}