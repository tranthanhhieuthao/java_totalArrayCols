import java.util.Scanner;

public class TotalArrayCols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc hang");
        int sizeRow = scanner.nextInt();
        System.out.println("nhap vao kich thuoc cot");
        int sizeCols = scanner.nextInt();
        System.out.println("nhap vi tri cot can tinh tong");
        int Cols = scanner.nextInt();
        int totalCols =0;

        int [][] array = new int[sizeRow][sizeCols];
        System.out.println("nhap mang");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                int N = scanner.nextInt();
                array[i][j] = N;
            }
        }

        for (int i=0;i<array.length;i++){
            System.out.println(' ');
            for (int j =0;j<array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
        }

        for (int j=0;j<array.length;j++){
            totalCols +=array[j][Cols-1];
        }

        System.out.println("tong vi tri cot"+" "+Cols+" "+"la"+" "+totalCols);
    }
}
