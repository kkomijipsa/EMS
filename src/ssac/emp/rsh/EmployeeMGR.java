package ssac.emp.rsh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMGR {
  Scanner sc = new Scanner(System.in);
  private Employee emp;
  private Map<String, Employee> db = new HashMap<>();

  public void insert() {  //직원 등록
    emp = new Employee();
    System.out.println("직원을 등록합니다");
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
    if (yesorno.equals("예")) {
      db.put(emp.getName(), emp);
      System.out.println("등록이 완료되었습니다");
    }
    System.out.println(db.get(emp.name).toString());
  }


  public void delete() throws EMSException {      //직원 삭제
    System.out.print("삭제할 사원의 이름을 입력 하세요: ");
    String yourName = sc.next();
    if (db.containsKey(yourName)) {
      db.remove(yourName);
      System.out.println("삭제되었습니다.");
    } else {
      throw new EMSException("유효하지 않은 사원입니다.", 101);
    }
  }

  public void update() throws EMSException {    //직원 수정
    while (true) {
      System.out.print("수정할 사원의 이름을 입력 하세요: ");
      String yourName = sc.next();
      if (db.containsKey(yourName)) {
        System.out.println("수정할 파트를 선택하세요");
        System.out.print("이름 | 사번 | 전화번호 | 주소 |");
        String updatePart = sc.next();
        if (updatePart.equals("이름") || updatePart.equals("사번") ||
            updatePart.equals("전화번호") || updatePart.equals("주소")) {

          if (updatePart.equals("이름")) {
            System.out.println("변경할 이름 입력 : ");
            emp.setName(sc.next());
            db.put(emp.getName(), emp);
          }

          if (updatePart.equals("사번")) {
            System.out.println("변경할 사번 입력 : ");
            emp.setSabun(sc.next());
            db.put(emp.getSabun(), emp);
          }

          if (updatePart.equals("전화번호")) {
            System.out.println("변경할 전화번호 입력 : ");
            emp.setPhone(sc.next());
            db.put(emp.getPhone(), emp);
          }

          if (updatePart.equals("주소")) {
            System.out.println("변경할 주소 입력 : ");
            emp.setAddr(sc.next());
            db.put(emp.getAddr(), emp);
          }

          System.out.println("수정이 정상적으로 완료되었습니다.");
          System.out.println(db.get(emp.getName()).toString());
          break;
        } else {
          System.out.println("유효하지 않은 파트입니다.");
        }
      } else {
        throw new EMSException("유효하지 않은 사원입니다.", 101);
      }
    }
  }

  public void select() throws EMSException {  //직원 검색
    System.out.print("찾으실 사원의 이름을 입력해주세요: ");
    String yourName = sc.next();
    if (db.containsKey(yourName)) {
      System.out.println(db.get(yourName).toString());
    } else {
      throw new EMSException("유효하지 않은 사원입니다.", 101);
    }
  }


  public void selectAll() {   //전 사원 정보 출력
    System.out.println("==========모든 사원 정보 출력==========");
    for (String key : db.keySet()) {
      Employee val = db.get(key);
      System.out.println("[" + key + "]" + "{" + val.toString() + "}");
    }

  }
}



