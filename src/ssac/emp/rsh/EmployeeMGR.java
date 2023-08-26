package ssac.emp.rsh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// ssac.emp.rsh 패키지에 있는 클래스들을 사용하기 위한 import 문

// 사원 관리 클래스 정의 시작
public class EmployeeMGR {
  Scanner sc = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
  private Employee emp; // Employee 객체 참조 변수
  private Map<String, Employee> db = new HashMap<>(); // 사원 정보를 저장할 맵 객체 생성

  // 사원 등록 메서드 정의
  public void insert() {
    emp = new Employee(); // 새로운 Employee 객체 생성
    System.out.println("사원 등록");
    System.out.print("이름: ");
    emp.setName(sc.next());

    System.out.print("사번: ");
    emp.setSabun(sc.next());

    System.out.print("전화번호: ");
    emp.setPhone(sc.next());

    System.out.print("주소: ");
    emp.setAddr(sc.next());

    System.out.println("등록하시겠습니까? 예/아니오");
    String yesorno = sc.next();
    if (yesorno.equals("예")) { // 등록 여부 확인
      db.put(emp.getName(), emp); // db 맵에 사원 정보 추가
      System.out.println("등록 완료");
    }
    System.out.println(db.get(emp.name).toString()); // 등록된 사원 정보 출력
  }

  // 사원 삭제 메서드 정의 (예외 처리 포함)
  public void delete() throws EMSException {
    System.out.print("삭제할 사원의 이름을 입력하세요: ");
    String yourName = sc.next();
    if (db.containsKey(yourName)) { // 이름을 키로한 사원 정보가 있는 경우
      db.remove(yourName); // 해당 사원 정보 삭제
      System.out.println("삭제되었습니다");
    } else {
      throw new EMSException("유효하지 않은 사원입니다.", 101); // 예외 던지기
    }
  }

  // 사원 수정 메서드 정의 (예외 처리 포함)
  public void update() throws EMSException {
    while (true) { // 무한 루프
      System.out.print("수정할 사원의 이름을 입력하세요: ");
      String yourName = sc.next();
      if (db.containsKey(yourName)) { // 이름을 키로한 사원 정보가 있는 경우
        System.out.println("수정할 항목을 선택하세요");
        System.out.print("이름 | 사번 | 전화번호 | 주소 |");
        String updatePart = sc.next();
        if (updatePart.equals("이름") || updatePart.equals("사번") ||
            updatePart.equals("전화번호") || updatePart.equals("주소")) {

          if (updatePart.equals("이름")) { // 이름 수정
            System.out.println("변경할 이름을 입력하세요: ");
            emp.setName(sc.next());
            db.put(emp.getName(), emp);
          }

          if (updatePart.equals("사번")) { // 사번 수정
            System.out.println("변경할 사번을 입력하세요: ");
            emp.setSabun(sc.next());
            db.put(emp.getSabun(), emp);
          }

          if (updatePart.equals("전화번호")) { // 전화번호 수정
            System.out.println("변경할 전화번호를 입력하세요: ");
            emp.setPhone(sc.next());
            db.put(emp.getPhone(), emp);
          }

          if (updatePart.equals("주소")) { // 주소 수정
            System.out.println("변경할 주소를 입력하세요: ");
            emp.setAddr(sc.next());
            db.put(emp.getAddr(), emp);
          }

          System.out.println("수정이 완료되었습니다.");
          System.out.println(db.get(emp.getName()).toString()); // 수정된 사원 정보 출력
          break; // 루프 종료
        } else {
          System.out.println("유효하지 않은 항목");
        }
      } else {
        throw new EMSException("유효하지 않은 사원입니다.", 101); // 예외 던지기
      }
    }
  }

  // 사원 조회 메서드 정의 (예외 처리 포함)
  public void select() throws EMSException {
    System.out.print("조회할 사원의 이름을 입력하세요: ");
    String yourName = sc.next();
    if (db.containsKey(yourName)) { // 이름을 키로한 사원 정보가 있는 경우
      System.out.println(db.get(yourName).toString()); // 사원 정보 출력
    } else {
      throw new EMSException("유효하지 않은 사원입니다.", 101); // 예외 던지기
    }
  }

  // 모든 사원 정보 출력 메서드 정의
  public void selectAll() {
    System.out.println("========== 모든 사원 정보 출력 ==========");
    for (String key : db.keySet()) {
      Employee val = db.get(key);
      System.out.println("[" + key + "]" + "{" + val.toString() + "}"); // 사원 정보 출력
    }
  }
}
