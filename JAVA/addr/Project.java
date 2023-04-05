import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Project {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Addr> addList = new ArrayList<>();

    public static void main(String[]args){
       try {
           System.out.println("-----------------");
           System.out.println("1. 주소록 입력");
           System.out.println("2. 주소록 검색");
           System.out.println("3. 주소록 조회");
           System.out.println("4. 주소록 수정");
           System.out.println("5. 주소록 삭제");
           System.out.println("0. 종료");
           System.out.println("-----------------");
           int i=0;
            while(true){
                System.out.print("메뉴를 입력하세요 : ");
                String num = br.readLine();
                switch (num){
                    case "1":
                        addrInput();
                        break;
                    case "2":
                        addSearch();
                        break;
                    case "3":
                        addJohoi();
                        break;
                    case "4":
                        addUpdate();
                        break;
                    case "5":
                        addDelete();
                        break;
                }
            }
       }catch (Exception e){
           e.printStackTrace();
           System.out.println("에러 발생");
       }
    }
    //입력 case 1
    public static void addrInput(){
        try{
            Addr addr = new Addr();
            System.out.print("이름을 입력하세요 : ");
            addr.setName(br.readLine());
            System.out.print("전화번호를 입력하세요 : ");
            addr.setTel(br.readLine());
            System.out.print("회사 이름을 입력하세요 : ");
            addr.setCom(br.readLine());
            addr.setCreateDate(LocalDateTime.now());
            addList.add(addr);
            System.out.print(addr);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("에러 발생:1");
        }
    }
    //검색 case 2
    public static void addSearch(){
        try {
            System.out.print("검색할 이름을 입력하세요 : ");
            String input = br.readLine();
            for (Addr item : addList) {
                if (item.getName().equals(input)) {
                    System.out.println(item.toString());
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("에러 발생:2");
        }
    }
    //조회 case 3
    public static void addJohoi(){
        try{
            for(Addr item : addList){
                System.out.println(item.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("에러 발생:3");
        }
    }
    // 수정 case 4
    public static void addUpdate(){
        try{
            System.out.println("수정할 대상의 이름을 입력하세요.");
            String name = br.readLine();
            System.out.println("수정할 전화번호를 입력하세요.");
            String phone = br.readLine();
            System.out.println("수정할 회사를 입력하세요.");
            String com = br.readLine();
            for(Addr item: addList){
                if(item.getName().equals(name)) {
                    item.setTel(phone);
                    item.setCom(com);
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("에러 발생:4");
        }
    }
    // 삭제 case 5
    public static void addDelete(){
        try{
            System.out.println("삭제할 대상의 이름을 입력하세요");
            String name = br.readLine();
            for(int i=0;i<addList.size();i++){
                if(addList.get(i).getName().equals(name)) {
                    addList.remove(i);
                    System.out.println("삭제되었습니다.");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("에러 발생:5");
        }

    }
}
