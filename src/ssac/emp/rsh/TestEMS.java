package ssac.emp.rsh;

import java.util.Scanner;

public class TestEMS {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    EmployeeMGR mgr = new EmployeeMGR();

    while (true) {
      try {
        System.out.println("-------새싹 EMS 프로그램입니다-------");
        System.out.println("1. 등록");
        System.out.println("2. 목록");
        System.out.println("3. 상세");
        System.out.println("4. 수정");
        System.out.println("5. 삭제");
        System.out.println("6. 종료");
        System.out.print(">>>");
        int select = sc.nextInt();

        switch (select) {
          case 1: //등록
            mgr.insert();
            break;
          case 2: //목록
            mgr.selectAll();
            break;
          case 3: //상세
            mgr.select();
            break;
          case 4: //수정
            mgr.update();
            break;
          case 5: //삭제
            mgr.delete();
            break;
          case 6: //종료
            break;
          default:
            System.out.println("잘못된 입력입니다.");
            break;
        }
      } catch (EMSException e) {
        System.out.println("Error: " + e.getMessage() + '\n' + "Code: " + e.code);
      }
    }
  }
}