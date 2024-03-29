class DateBox{
	/*
	클래스 영역에 선언된 변수를 가리켜 멤버변수라고 함
	이 멤버변수를 property(속성)라고 함
	[자바의 자료형]
	-문자 
		문자: char(2byte-이유? 변수에 담을 수 있는 데이터 중, 한글 중국어 등 전세계 문자를 지원하기 때문. 즉, 자바는 유니코드 기반.)
		문자열: String
	-숫자
		정수: byte(1) < short(2) < ★int(4) < long(8)
		실수: float(4) < double(8)
	-논리값
		boolean(1)
	*/
	int width=5;

	//클래스 안에 실행부를 두면, 단지 이 클래스가 실행할 수 있는 클래스가 되는 것 뿐임
	public static void main(){
		//int=4byte=32bit, 정수 계산할 때는 거의 주로 int 사용
		/*
		현대 대부분의 프로그래밍 언어가 아직까지도 연산 수행 시 32비트 시스템에 최적화되어 있기때문에
		즉, 32비트에서 속도가 가장 빠르기 때문에 32비트 용량에 해당하는 
		다시 말해 4바이트 자료형인 int형이 아직까지는 가장 많이 사용되고 있음
		따라서 아래의 코드에서 개발자가 x의 자료형과 y의 자료형을 int형보다 작은 자료형으로 선언한다고 할지라도,
		연산속도 최적화로 인해 더하기 연산 시 자동으로 x, y의 자료형이 int형으로 바뀜.
		이러한 현상으로 가리켜 '자동 형변환'이라고 함
		*/
		byte x=3;
		short y=1000;
		int z=x+y;
	}

}