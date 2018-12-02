//***************************
 // 파일명: DirectedMatrixGraphTest.java
 // 작성자: 황현기
 // 작성일: 20181129
 // 프로그램 설명:인접행렬을 이용하여 방향그래프의 깊이우선탐색하기
 //***************************
package hw10_1;

import java.util.Scanner;

public class DirectedMatrixGraphTest {

	public static void main(String[] args) {
		System.out.println("hw10_1 : 항현기");

		// 정점 수 n 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정점 수 입력: ");
		int n = scan.nextInt();

		// 정점 수가 n인 방향 그래프를 생성
		DirectedMatrixGraph graph = new DirectedMatrixGraph(n);

		// 간선 수 e 입력
		System.out.print("간선 수 입력: ");
		int e = scan.nextInt();

		// e개의 간선(정점 쌍)을 입력받아 그래프에 삽입
		System.out.println(e + "개의 간선을 입력하세요(각 간선은 정점 번호 2개를 whitespace로 구분하여 입력):");
		for(int i = 0; i < e; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			graph.addEdge(v1, v2);
		}

		// 각 정점의 인접 정점들을 출력
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.print("정점 " + i + "에 인접한 정점 = ");
			graph.printAdjacentVertices(i);
		}

		for(int i = 0; i < n; i++)

			graph.depthFirstSearch(i);
	}

}
