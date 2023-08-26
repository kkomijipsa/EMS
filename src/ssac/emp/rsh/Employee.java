package ssac.emp.rsh;

// ssac.emp.rsh 패키지에 Employee 클래스를 정의
public class Employee {
  // 사원의 이름을 저장하는 문자열 변수
  public String name;
  // 사원의 사번을 저장하는 문자열 변수
  public String sabun;
  // 사원의 전화번호를 저장하는 문자열 변수
  public String phone;
  // 사원의 주소를 저장하는 문자열 변수
  public String addr;

  // 사원의 이름을 반환하는 메서드
  public String getName() {
    return name;
  }

  // 사원의 사번을 반환하는 메서드
  public String getSabun() {
    return sabun;
  }

  // 사원의 전화번호를 반환하는 메서드
  public String getPhone() {
    return phone;
  }

  // 사원의 주소를 반환하는 메서드
  public String getAddr() {
    return addr;
  }

  // 사원의 이름을 설정하는 메서드
  public void setName(String name) {
    this.name = name;
  }

  // 사원의 사번을 설정하는 메서드
  public void setSabun(String sabun) {
    this.sabun = sabun;
  }

  // 사원의 전화번호를 설정하는 메서드
  public void setPhone(String phone) {
    this.phone = phone;
  }

  // 사원의 주소를 설정하는 메서드
  public void setAddr(String addr) {
    this.addr = addr;
  }

  // 사원 정보를 문자열 형태로 반환하는 메서드
  public String toString() {
    return
        "이름:" + name + "| " +
            "사번:" + sabun + "| " +
            "전화번호:" + phone + "| " +
            "주소:" + addr;
  }
}
