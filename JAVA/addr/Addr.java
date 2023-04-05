import java.time.LocalDateTime;

public class Addr {
    //1필드
    private String name;
    private String tel;
    private String com;
    private LocalDateTime createDate;
    //2생성자
    public  Addr(){};
    public Addr(String name, String tel, String com, LocalDateTime createDate) {
        this.name = name;
        this.tel = tel;
        this.com = com;
        this.createDate = createDate;
    }
//    3메소드
    public String toString(){
        return "[ 주소록: 이름= "+this.name+", 전화번호= "+this.tel+", 회사= "+this.com+", 입력일= "+this.createDate+" ]\n";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
