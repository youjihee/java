package com.repeat.controller;

import java.util.Scanner;

import com.repeat.controller.RepeatController;
public class RepeatController {
	public void basicRepeat() {
	//기본 for문 활용하기
	//특정코드를 원하는 만큼 반복실행하게 하는 명령어
	//for(초기식;조건식;증감식){반복할 코드를 작성}
	//초기식 : 변수선언, 반복횟수에 대한 정보를 저장하는 저장소
   //조건식: for문의 코드를 실행할지 결정하는 조건, 
	//     true면 실행, false면 실행안함
	//  조건식은 일반적으로 초기식에 선언된 변수를 가지고 구성
	// 증감식 : 초기식에 선언한 변수의 값을 수정하는 연산 
	//-> 조건식의 결과를 변경 
		
	// 안녕하세요를 10번 출력하기 
	System.out.println("안녕하세요");
	
	for(int i=1; i<11; i++) {
		System.out.println("안녕하세요~");
	}
	
	//1~10까지 수를 출력하기 
//	System.out.println(1);
//	System.out.println(2);
//	System.out.println(3);
//	System.out.println(4);
//	System.out.println(5);
	
	for(int i=1; i<=5; i++) {
		System.out.println(i);
	}
	
	//1부터 10까지 출력하기
	for (int i=1; i<11; i++) {
		System.out.println(i+" ");
	}
	
	System.out.println();  //개행
	// for문의 {}내부에는 변수선언, 연산자, 조건문, 기능호출 등 모두
	// 선언이 가능함.
	String test="";
	for(int i=1; i<=5; i++){   // for문 안에 종속된 i는 중괄호 안에서만 의미를 갖는다. 
		int temp=100*i;         //for문 안에서 선언된 변수는(temp) for문 밖에서 사용 불가 
		temp++;
		if(temp>400) {
			System.out.println(temp+" "+i);
		}
	}
	
	// 1부터 100까지의 수를 출력하기.
	for(int i=1; i<=100; i++) {
		int count=1;
		System.out.print(count+++" ");
	}
	System.out.println();
	// 한줄로 출력
	// 1부터 100까지 짝수만 출력하기 	(방법1)
	for(int i=1; i<=100; i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
		// 1부터 100까지 짝수만 출력하기 	(방법2)
	for(int a=2; a<=100; a+=2) {
			System.out.print(a+" ");
			}
	}
	
	// 100부터 1까지 출력하기 (방법1)
	System.out.println();
	for(int i=100; i>0; i--) {
		System.out.print(i+" ");
	}
	//100부터 1까지 출력하기 (방법2)
	System.out.println();
	int count=100;
	for(int i=1; i<=100; i++) {
		System.out.print(count--+" ");
	}

	}
	// 반친구들의 이름을 5명 입력받고 출력하는 기능 구현하기 
	// public void inputStudent()
	public void inputStudent() {
		String name="";
		Scanner sc = new Scanner(System.in);  //맨 위에 import문 꼭 써줘야 함 
		for(int i=1; i<=5; i++) {
			System.out.println(i+". 이름: ");
			name+= sc.next(); //띄어쓰기 없으면 next 있으면 nextLine	
		}
		System.out.println(name);
		
//		//for문 사용시 초기식, 조건식, 증감식을 반드시 써야하나?
//		for(;!test.equals("end");) {
//			System.out.println(test);
//			test=sc.next();
//			}
//		System.out.println("이건 언제 실행할래?");
//		
	}
	// 사용자에게 숫자를 5개 입력받고 입력받은 숫자의 총합을 출력하기
	// public void sumNumber()	
	public void sumNumber() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=1; i<=5; i++) {
			System.out.println("숫자를 입력하시오: ");
			int num=sc.nextInt();
			sum+=num;		
		}	
		System.out.println("합계: "+sum);
	}
	//사용자에게  메세지를 입력받고 출력하는 기능 구현
	// 사용자가 exit라는 메시지를 입력할때까지 입력받고,
	// public void inputMsg()
	public void inputMsg() {
		Scanner sc = new Scanner(System.in);
		//String msg="";    //지역변수 초기화 해줘야 함 -> local variable may not have been iltilize
		String total="";
		for(String msg="";!msg.equals("exit");) { //지역변수 초기화 값 여기에 한번에 선언 가능
			System.out.println("메시지를 입력하세요: ");
			msg=sc.nextLine(); //msg는 입력받은 값
			System.out.println(msg);
//			total+=msg.equals("exit")?"":msg;   -> 이거랑 밑에 if문 두줄이랑 같은 의미 (이건 삼항연산자..?)
			if(msg.equals("exit")) {
				total+=msg;
			}
		}
		System.out.println(total);
		}

	public void forApp() {
		//for문 응용해보기 
		//1부터 사용자가 입력한 수까지 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int su =sc.nextInt();
		for(int i=1; i<=su; i++ ) {
			System.out.println(i+" ");
		}
		System.out.println();			
	}
	//사원정보를 입력 받는 기능 구현하기
	//3명의 사원의 정보를 입력받고 출력하는 기능
	//입력정보: 이름, 나이, 성별, 급여, 보너스(실수)
	//입력한 정보를 한번에 출력하게 구현 
	//예) 유병승 19 남 100 0.2
	//   홍길동 24 남 50 0.3
	//버전업 사용자가 원하는 만큼 사원정보 입력 후 출력하기 
	//public void empInputData()
	public void empInputData() {
		Scanner sc = new Scanner(System.in);
		String total="";
		for(int i=1; i<=2; i++) {
			System.out.println("이름: ");
			String name=sc.next();
			System.out.println("나이: ");
			int age =sc.nextInt();
			System.out.println("성별(남/여): ");
			char gender =sc.next().charAt(0);
			System.out.println("급여: ");
			int money =sc.nextInt();
			System.out.println("보너스: ");
			double bonus =sc.nextDouble();
			total+=(name+age+gender+money+bonus+"\n");
		}
		System.out.print(""+total);
		
		
	}	
}
