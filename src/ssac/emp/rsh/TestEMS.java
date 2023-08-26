package ssac.emp.rsh;

import java.util.Scanner;

// ssac.emp.rsh 패키지에 있는 클래스들을 사용하기 위한 import 문입니다.

// EMS 프로그램을 테스트하는 메인 클래스 정의 시작
public class TestEMS {

  // 메인 메서드 시작
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
    EmployeeMGR mgr = new EmployeeMGR(); // EmployeeMGR 객체 생성

    while (true) { // 무한 루프
      try {
        System.out.println("------ Sprout EMS 프로그램입니다 -------");
        System.out.println("1. 등록");
        System.out.println("2. 목록");
        System.out.println("3. 상세보기");
        System.out.println("4. 수정");
        System.out.println("5. 삭제");
        System.out.println("6. 종료");
        System.out.print(">>>");
        int select = sc.nextInt(); // 선택지 입력 받음

        switch (select) { // 선택지에 따라 실행할 코드 선택
          case 1: // 등록
            mgr.insert();
            break;
          case 2: // 목록
            mgr.selectAll();
            break;
          case 3: // 상세보기
            mgr.select();
            break;
          case 4: // 수정
            mgr.update();
            break;
          case 5: // 삭제
            mgr.delete();
            break;
          case 6: // 종료
            break;
          default: // 유효하지 않은 입력 처리
            System.out.println("유효하지 않은 입력입니다.");
            break;
        }
      } catch (EMSException e) { // EMSException 예외 처리
        System.out.println("오류: " + e.getMessage() + '\n' + "코드: " + e.code);
      }
    }
  }
}
