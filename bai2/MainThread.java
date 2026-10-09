package bai2;

public class MainThread {
    public static void main(String[] args) {
        StudentMark student1 = new StudentMark("Nguyen Thanh Nam", 90, 90, 8.0);
        StudentMark student2 = new StudentMark("Phung Phu Bac", 70, 30, 3.9);
        System.out.println("KET QUA SINH VIEN 1");
        student1.displayResult();
        System.out.println("KET QUA SINH VIEN 2");
        student2.displayResult();
    }
}