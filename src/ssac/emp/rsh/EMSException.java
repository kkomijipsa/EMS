package ssac.emp.rsh;

// ssac.emp.rsh 패키지에 EMSException 클래스를 정의
public class EMSException extends Exception {

  // int 타입의 code 멤버 변수를 선언
  public int code;

  // EMSException 클래스의 기본 생성자를 정의
  public EMSException() {
    // 부모 클래스(Exception)의 기본 생성자를 호출
    super();
  }

  // message와 code를 매개변수로 받는 생성자를 정의
  public EMSException(String message, int code) {
    // 부모 클래스(Exception)의 생성자를 호출하면서 메시지를 전달
    super(message);
    // 인자로 받은 code 값을 멤버 변수에 할당
    this.code = code;
  }
}
