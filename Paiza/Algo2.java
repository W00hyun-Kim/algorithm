import java.util.*;
import java.util.Scanner;

public class Algo2 {

	public static void main(String[] args) {
		List<Integer> targetX = new ArrayList<Integer>();
		List<Integer> targetY = new ArrayList<Integer>();
		List<String> result = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		// 공사 현장의 x좌표
		int a = sc.nextInt();
		// 공사 현장의 y좌표
		int b = sc.nextInt();
		// 소음의 크기
		int R = sc.nextInt();
		// 나무 그늘의 수
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			targetX.add(sc.nextInt());
			targetY.add(sc.nextInt());
		}

		for (int i = 0; i < N; i++) {
			if (Math.pow((targetX.get(i) - a), 2) + Math.pow((targetY.get(i) - b), 2) >= Math.pow(R, 2)) {
				result.add("silent");
			} else {
				result.add("noisy");
			}
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}
}
