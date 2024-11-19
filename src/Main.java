import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Classroom classRoom = new Classroom();
        boolean check = true;
        do {
            System.out.println("1. Nhập thông tin");
            System.out.println("2. In thông tin");
            System.out.println("3. Sắp xếp theo GPA");
            System.out.println("4. Xóa theo ID");
            System.out.println("5. Kiểm tra");
            System.out.println("6. Thoát");
            System.out.println("Nhập lựa chọn");
            int select = sc.nextInt();
            sc.nextLine();
            try {
                switch (select) {
                    case 1:
                        classRoom.inputList();
                        break;
                    case 2:
                        classRoom.output();
                        break;
                    case 3:
                        classRoom.sortByGpa();
                        break;
                    case 4:
                        System.out.println("Nhập ID cần tìm");
                        int idIndex = sc.nextInt();
                        sc.nextLine();
                        classRoom.removeById(idIndex);
                        break;
                    case 5:
                        System.out.println("Nhập ID cần kiểm tra");
                        int idIndex2 = sc.nextInt();
                        sc.nextLine();
                        if (classRoom.findFail(idIndex2)) {
                            System.out.println("Đỗ");
                        } else {
                            System.out.println("Trượt");
                        }
                        break;
                    case 6:
                        check = false;
                        break;
                    default:
                        System.out.println("Không hợp lệ");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (check != false);
    }
}