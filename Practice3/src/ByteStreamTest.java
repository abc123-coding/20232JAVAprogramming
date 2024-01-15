import java.io.*;

public class ByteStreamTest {
    public static void main(String[] args) throws IOException {
        // 두 개의 배열 생성
        int[] num = {1, 2, 3, 4, 5};
        String[] firstname = {"Kim", "Park", "Jung", "Lee"};

        // 배열 객체를 파일에 저장 (DataOutputStream 사용)
        FileOutputStream fos = new FileOutputStream("objects.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        // 첫 번째 배열 저장
        for (int n : num) {
            dos.writeInt(n);
        }
        // 두 번째 배열 저장
        for (String s : firstname) {
            dos.writeUTF(s);
        }
        dos.close();

        // 파일에서 배열 객체 읽어 들이기 및 출력 (DataInputStream 사용)
        FileInputStream fis = new FileInputStream("objects.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        // 첫 번째 배열 읽어 들이기 및 출력
        for (int i = 0; i < num.length; i++) {
            int n = dis.readInt();
            System.out.print(n + " ");
        }

        System.out.println("");
        for (int i = 0; i < firstname.length; i++) {
            String s = dis.readUTF();
            System.out.print(s + " ");
        }

        dis.close();
    }
}
