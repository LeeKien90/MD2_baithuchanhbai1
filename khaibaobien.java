public class khaibaobien {
    public static void main(String[] args) {

        int i = 10; //Khai báo biến i là kiểu int có giá trị là 10
        float f = 20.5f; //Khai báo biến f có kiểu là float có giá trị là 20.5
        boolean b = true; //Khai báo kiểu boolean
        char c = 'a'; //Khai báo biến c có kiểu char
        String s = "Hà Nội"; // Khai báo biến s có kiểu string
        //khai báo hằng số PI
        final double PI = 3.14;
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("PI = " + PI);
        String studentId = "001";
        String studentName = "Nguyen Văn A";
        int age = 20;
        float mark = 8.7f;
        System.out.printf("Mã SV: %s, Tên SV: %s, Tuổi: %d, Điểm: %f", studentId,studentName,age,mark);
    }
}