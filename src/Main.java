import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<WiseSaying> wiseSayings = new ArrayList<>();
		int lastId = 0;

		while (true) {
			System.out.print("명령어:");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("exit")) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			if (cmd.length() == 0) {
				System.out.println("명령어를 입력하세요");
				continue;

			}

			else if (cmd.equals("등록")) {
				int id = lastId + 1;
				System.out.println("명언");
				String title = sc.nextLine();
				System.out.println("작가");
				String author = sc.nextLine();

				WiseSaying wiseSaying = new WiseSaying(id, title, author);
				wiseSayings.add(wiseSaying);
				System.out.println(id + "번 명언이 등록 되었습니다");

				lastId++;

			}

			else if (cmd.equals("목록")) {
				System.out.println("  번호  /  작가  /  명언  ");
				System.out.println("======================================");

				for (int i = wiseSayings.size() - 1; i <= 0; i--) {

					WiseSaying output = wiseSayings.get(i);

					System.out.printf("  %d  /  %s  /  %s  \n", output.getId(), output.getAuthor(), output.getTitle());

				}

			}

			else if (cmd.equals("수정")) {
				String[] cmdbits = cmd.split(" ");

			}
		}

	}
}