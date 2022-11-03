package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS_P1206 {
	// 방문 기록 저장 배열
	static boolean visited[];
	// 그래프 데이터 저장 인접 리스트
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 노드 개수 저장 변수에 값을 입력 받음
		int N = scan.nextInt();
		// 엣지 개수 저장 변수에 값 입력 받음
		int M = scan.nextInt();
		// 시작점 저장 변수에 값 입력 받음
		int Start = scan.nextInt();
		
		// 인접 리스트 초기화
		// N=1부터 입력하기 위해 크기를 N+1로 선언
		A = new ArrayList[N+1];
		
		// 각 리스트 index마다 ArrauList 초기화
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Integer>();
		}

		// 인접 리스트에 그래프 데이터 저장
		for(int i=0; i<M; i++) {
			// 노드 번호 저장할 변수에 입력 받음
			int S = scan.nextInt();
			// 인접 노드 번호 저장할 변수에 입력 받음
			int E = scan.nextInt();
			
			// 각 노드 번호에 인접 노드 입력
			A[S].add(E);
			A[E].add(S);
		}
		
		// 방문할 수 있는 노드가 여러개일 경우에는 번호가 작은 것을 먼저 방문하기 위해 정렬
		for(int i=1; i<=N; i++) {
			Collections.sort(A[i]);
		}
		
		// visited 배열 초기화
		visited = new boolean[N+1];
		// DFS 메소드 실헹
		DFS(Start);
		System.out.println();
		// visited 배열 초기화
		visited = new boolean[N+1];
		// BFS 메소드 실행
		BFS(Start);
		System.out.println();
	}
	
	// DFS 메소드
	public static void DFS(int Node) {
		// 현재 노드 출력
		System.out.print(Node + " ");
		// 현재 노드 방문 기록 저장
		visited[Node] = true;
		
		// 연결된 노드 중
		for (int i : A[Node]) {
			// 방문 하지 않은 노드로
			if(!visited[i]) {
				// DFS 메소드 실행
				DFS(i);
			}
		}
	}
	
	// BFS 메소드
	private static void BFS(int Node) {
		// 큐 자료 구조 초기화
		Queue<Integer> queue = new LinkedList<Integer>();
		// 큐 자료 구조에 시작 노드를 삽입
		queue.add(Node);
		// visited 배열에 현재 노드 방문 기록
		visited[Node] = true;
		
		// 큐가 비어있을 때까지
		while (!queue.isEmpty()) {
			// 큐에서 노드 데이터 가지고 오기
			int now_Node = queue.poll();
			// 가져온 노드 출력
			System.out.print(now_Node + " ");
			
			// 현재 노드의 연결 노드 중
			for (int i : A[now_Node]) {
				// 방문하지 않은 노드를
				if(!visited[i]) {
					// 방문 배열에 기록
					visited[i] = true;
					// 큐의 삽입
					queue.add(i);
				}
			}
		}
	}
}
