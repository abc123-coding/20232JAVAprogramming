import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// 버튼을 눌러서 해당 값 출력하도록 시험문제
// 내가 100살이 되는 날은?
public class TimeTest1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("오늘의 날짜: " + date);
		System.out.println("현재의 시간: " + time);
		System.out.println("현재의 날짜와 시간: " + dt);
	
	}

}
