//Baekjoon #11659
//구간 합 구하기 4
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class BJ11659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		List <Integer> numbers = new ArrayList<Integer>();
		List <Integer> result = new ArrayList<Integer>();
				
//		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//수의 개수
		int N = Integer.parseInt(br.readLine().split(" ")[0]);
		int inputCase = Integer.parseInt(br.readLine().split(" ")[1]);
		
		System.out.println("N :"+N);
		System.out.println("inputCase :"+inputCase);
		
//		for (int i = 0; i < N; i++) {
//			int tmp = Integer.parseInt(br.readLine().split(" ")[i]);
//			numbers.add(tmp);
//		}
//		
//		for (int i = 0; i < inputCase; i++) {
//			int sum = 0;
//			int start = Integer.parseInt(br.readLine().split(" ")[0]);
//			int end = Integer.parseInt(br.readLine().split(" ")[1]);
//			
//			for (int j = start-1; j <=end-1; j++) {
//				sum += numbers.get(j);
//			}
//			result.add(sum);
//		}
//		
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i));
//		}		
	}
}
