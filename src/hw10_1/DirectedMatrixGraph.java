//***************************
 // 파일명: DirectedMatrixGraphTest.java
 // 작성자: 황현기
 // 작성일: 20181129
 // 프로그램 설명:인접행렬을 이용하여 방향그래프의 깊이우선탐색하기
 //***************************
package hw10_1;

public class DirectedMatrixGraph {
	private int[][] matrix;
	private int n;
	private boolean[] visited;

	public DirectedMatrixGraph(int n){
		matrix=new int[n][n];
		this.n=n;
		visited =new boolean[n];
	}
	public boolean hasEdge(int v1, int v2) {


		if(matrix[v1][v2]==1) {

			return true;

		}

		return false;
	}
	public void addEdge(int v1, int v2) {
		if(v1<0 || v1>n-1 || v2<0 || v2>n-1) {
			System.out.print("간선 삽입 오류-");
			System.out.println("잘못된 정점 번호입니다"+"<"+v1+" "+v2+">");
		}
		else if(hasEdge(v1,v2)) {
			System.out.print("간선 삽입 오류-");
			System.out.println("이미 존재하는 간선입니다"+"<"+v1+" "+v2+">");
		}
		else {
			matrix[v1][v2]=1;

		}
	}
	public void printAdjacentVertices(int v) {

		for(int i=0; i<n ; i++) {

			if(matrix[v][i]==1)
				System.out.print(i+" ");


		}
		System.out.println();
	}
	public void depthFirstSearch(int v) {
		if(v<0 || v>n-1) {
			System.out.println("잘못된 정점 입니다");
		}
		else {
			for(int i=0 ; i<n; i++) {
				visited[i]=false;
			}
			System.out.print("시작정점"+v+"의 깊이우선탐색:"+v);
			DFS(v);
			System.out.println();
		}
	}
	private void DFS(int v) {

		visited[v]=true;
		for(int i=0; i<n; i++) {
			if(visited[i]==false && matrix[v][i]==1) {
				System.out.print(" "+i);
				DFS(i);
			}

		}

	}

}
