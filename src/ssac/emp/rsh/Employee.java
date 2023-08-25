package ssac.emp.rsh;

public class Employee {
  public String name;
  public String sabun;
  public String phone;
  public String addr;


  public String getName() {
    return name;
  }

  public String getSabun() {
    return sabun;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddr() {
    return addr;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSabun(String sabun) {
    this.sabun = sabun;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String toString() {
    return
            "이름:" + name + "| " +
            "사번:" + sabun + "| " +
            "전화번호:" + phone + "| " +
            "주소:" + addr;
  }
}