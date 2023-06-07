class ArrayTest3{
	public static void main(String[] args){
		char[][] arr= new char[2][3]; //2Ãþ3È£
		//!ÀÚ¹Ù¿¡¼­ ¹®ÀÚ(char)´Â '' È¬µû¿ÈÇ¥! 
		//!			¹®ÀÚ¿­(String)Àº "" ½Öµû¿ÈÇ¥!
		arr[0][0]='A';
		arr[0][1]='B';
		arr[0][2]='C';

		arr[1][0]='°¡';
		arr[1][1]='³ª';
		arr[1][2]='´Ù';

		for(int a=0; a<arr.length; a++){ //Ãþ
			for(int i=0; i<arr[a].length; i++){ //È£
				System.out.print(arr[a][i]);
			}
			System.out.println("");
		}
	}
}