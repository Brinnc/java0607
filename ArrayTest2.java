class ArrayTest2{
	public static void main(String[] args){

		//�ڹٸ� ������ ��κ��� ���α׷� ����� �迭�� �������� �پ��ų� �þ�� ����
		String[][] arr= new String[3][2]; //3��2ȣ
		
		arr[0][0]="���";
		arr[0][1]="����";
		arr[1][0]="����";
		arr[1][1]="�ƿ��";
		arr[2][0]="JAVA";
		arr[2][1]="Oracle";

		for(int a=0; a<arr.length; a++){//��
			for(int i=0; i<arr[a].length; i++){//ȣ
				System.out.print(arr[a][i]);
			}
			System.out.println(""); //�ٹٲ��� ������ ���õ�
		}
		
	}
}