public class MarcRecordParser {
    public static void main(String[] args) {
        String marcRecord = "0001 123456\n" + 
        					"100 1 $aAuthor Name\n" 
        					+ "245 10 $aBook Title : $bSubtitle / $cAuthor Name.\n"
        					+ "260 $aPublisher Name $bYear\n" 
        					+ "300 $a200 pages\n";
        
        // 변수 선언
        int idNum = -1;
        String bookTitle = "";
        String subtitle = "";
        String authorName = "";
        String publisherName = "";
        String year = "";
        String totalPages = "";

        // 줄 단위로 문자열을 분할해서 입력처리
        String[] lines = marcRecord.split("\n");
        for (String line : lines) {
            // 파싱 후 변수 저장
            if (line.startsWith("0001")) { // 책 번호
                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    idNum = Integer.parseInt(parts[1]);
                }
            } else if (line.startsWith("100")) { // 작가 이름
                String[] parts = line.split("\\$");
                for (String part : parts) {
                    if (part.startsWith("a")) {
                        authorName = part.substring(1).trim();
                    }
                }
            } else if (line.startsWith("245")) { // 책 제목, 부제목, 작가 이름
                String[] parts = line.split("\\$");
                for (String part : parts) {
                    if (part.startsWith("a")) {
                        bookTitle = part.substring(1, part.length() - 2).trim();
                    } else if (part.startsWith("b")) {
                        subtitle = part.substring(1, part.length() - 2).trim();
                    } else if (part.startsWith("c")) {
                        authorName = part.substring(1, part.length() - 1).trim();
                    }
                }
            } else if (line.startsWith("260")) { // 출판사 이름, 출간연도
                String[] parts = line.split("\\$");
                for (String part : parts) {
                    if (part.startsWith("a")) {
                        publisherName = part.substring(1).trim();
                    } else if (part.startsWith("b")) {
                        year = part.substring(1).trim();
                    }
                }
            } else if (line.startsWith("300")) { // 총 페이지 수
                String[] parts = line.split("\\$");
                for (String part : parts) {
                    if (part.startsWith("a")) {
                        totalPages = part.substring(1).trim();
                    }
                }
            }
        }

        // 출력
        //System.out.println("번호: " + idNum);
        System.out.println("책명 : " + bookTitle + " , " + subtitle);
        System.out.println("저자 : " + authorName);
        System.out.println("출판사 : " + publisherName);
        System.out.println("출판년도 : " + year);
        System.out.println("총 페이지 : " + totalPages);
    }
}
