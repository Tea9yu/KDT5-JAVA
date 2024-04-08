package Chap5_Recursive;
//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking

//모든 해가 나오는 버젼 만들기 
/*
* 체스판은 8 x 8
* 체스의 기물: king/가로세로대각선 1칸만 이동, queen/가로세로 대각선/같은 편의 기물을 넘을 수 없다,
*  Rook/가로,세로 이동/다른 기물을 넘을 수없다, bishop/대각선, knight/1-2칸 이동/다른 기물을 넘을 수 있다,
*  pawn/처음 이동은 2칸까지 가능, 그 후 한칸만 가능, 잡을 때는 대각선 가능
*  체스판 최대 배치 문제 : king/16, Queen/8, rook/8, bishop/?, knight/?
*  rook 2개/a, h, knight 2개/b, g, bishop 2개/c, f, queen 1개/black queen은 black 칸에, 폰 8개
*/

class Stack3 {
	private Point[] array;	//포인트를 저장하는 배열
	private int maxSize;	// 스택의 최대 크기
	private static int top;	// 최상위 요소의 인덱스
	
	// 스택 생성자: 주어진 크기로 스택을 초기화함
	public Stack3(int size) {
		maxSize = size;
		array =  new Point[maxSize];
		top = -1;
	}
	
	// 스택에 원소 추가
	public void push(Point p) {
		array[++top] = p;	//top을 증가시키고 해당 위치에 포인트를 추가
	}
	
	// 스택에서 원소 제거하고 반환
	public Point pop() {
		return array[top--];	// 최상위 원소를 반환하고 top를 감소시킴
	}
	
	// 스택이 비어있는지 여부를 반환
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// 최상위 원소의 인덱스 반환
	public int getTop() {
		return top;
	}
	
	// 스택의 배열 반환
	public Point[] getArray() {
		return array;
	}
	
	// 스택의 내용을 출력
	public static void dumpStack(Stack3 stack) {
		if (top <= 0)
			System.out.println("스택이 비어있습니다.'");
		else {
			for ( int i= 0; i <= stack.getTop(); i++) {
				System.out.println("[" + stack.getArray()[i].x + ", " + stack.getArray()[i].y + "]");
			}
			System.out.println("");
		}
	}
}

// x 및 y 좌표를 가지는 포인트를 나타내는 클래스
class Point {
	int x, y;
	
	// 좌표를 초기화하는 생성자
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

// 백트래킹을 사용하여 8-퀸 문젤르 해결하는 메인 클래스
public class Chap5_Test_QueenEight_4회차 {
	// 8-퀸 문제를 해결하는 메서드
	public static void solveQueen(int[][] d) {
		int count = 0;//퀸 배치 갯수
		int ix = 0, iy = 0;// 행 ix, 열 iy
		Stack3 st = new Stack3(100); //100개를 저장할 수 있는 스택을 만들고
		Point p = new Point(ix, iy);//현 위치를 객체로 만들고
		d[ix][iy] = 1;//현 위치에 queen을 넣었다는 표시를 하고
		count++;
		st.push(p);// 스택에 현 위치 객체를 push
		ix++;//ix는 행별로 퀸 배치되는 것을 말한다.
		int total = 0;
		while (true) {			
			if (count == 8) { //8개를 모두 배치하면
				// 8개의 퀸을 성공적으로 배치한 경우
				total++;
				System.out.println("case " + total + ":");
				showQueens(d);
				Point prevPoint = st.pop();
				ix--;	// 이전 행으로 이동
				count--;	// 퀸 수 감소
				d[prevPoint.x][prevPoint.y] = 0;	// 퀸 제거
				iy = prevPoint.y + 1;	// 이전 행의 다음 열로 이동
			} else if ((iy = nextMove(d, ix, iy)) == -1) {
				if (st.isEmpty()) {
					// 스택이 비어있으면 모든 가능성을 탐색했으므로 종료
					break;
				}
				// 현재 행에서 더 이상 유효한 이동이 없는 경우
				Point prevPoint = st.pop();
				ix--; 	// 이전 행으로 이동
				count--;	// 퀸 수 감소
				d[prevPoint.x][prevPoint.y] = 0;	// 퀸 제거
				iy = prevPoint.y + 1;	// 이전 행의 다음 열로 이동
			} else {
				// 유효한 이동이 있는 경우 퀸 배치
				p = new Point(ix, iy);
				d[ix][iy] = 1;
				count++;
				st.push(p);
				ix++;
				iy = 0;	//다음 행의 첫 열로 이동
			}

		}

	}
	
	// 주어진 행에 퀸을 배치할 수 있는 지 확인하는 메서드
	public static boolean checkRow(int[][] d, int crow) { //배열 d에서 행 crow에 퀸을 배치할 수 있는지 조사
		for ( int i = 0; i < d.length; i++) {
			if (crow < 0 || crow >= d.length) {
				// 행 인덱스가 배열 범위를 벗어나면 퀸을 배치할 수 없음
				return false;
			}
			if (d[crow][i] == 1) {
				// 해당 행에 이미 퀸이 배치되어 있으면 퀸을 배치할 수 없음
				return false;
			}
		}
		// 해당 행에 퀸이 배치되어 있지 않음
		return true;

	}
	
	// 주어진 열에 퀸을 배치할 수 있는 지 확인하는 메서드
	public static boolean checkCol(int[][] d, int ccol) {//배열 d에서 열 ccol에 퀸을 배치할 수 있는지 조사
		for (int i = 0; i < d.length; i++) {
			if ( d[i][ccol] == 1) {
				// 해당 열에 이미 퀸이 배치되어 있으면 퀸을 배치할 수 없음
				return false;
			}
		}
		// 해당 열에 퀸이 배치되어 있지 않음
		return true;

	}
	
	// 주어진 위치에 남서 방향 대각선에 퀸을 배치할 수 있는지 확인 하는 메서드
	//배열 d에서 행 cx, 열 cy에 퀸을 남서, 북동 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSW(int[][] d, int cx, int cy) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		int x = cx;
		int y = cy;
		
		// 남동 방향 대각선 확인
		while (x >= 0 && x < d.length && y >= 0 && y < d.length) {
			if (d[x][y] == 1)
				return false;
			x--;
			y++;
		}
		
		x =cx;
		y =cy;
		
		//북서 방향 대각선 확인
		while (x >= 0 && x < d.length && y >= 0 && y < d.length) {
			if (d[x][y] == 1)
				return false;
			x++;
			y--;
		}
		return true;

	}
	
	// 주어진 위치에서 남동 방향 대각선에 퀸을 배치할 수 있는 지 확인하는 메서드
	//배열 d에서 행 cx, 열 cy에 퀸을 남동, 북서 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--
		int x = cx;
		int y = cy;
		
		// 북서 방향 대각선 확인
		while (x >= 0 && x < d.length && y >= 0 && y < d.length) {
			if (d[x][y] == 1)
				return false;
			x--;
			y--;
		}
		
		x = cx;
		y = cy;
		
		// 남동 방향 대각선 확인
		while (x >= 0 && x < d.length && y >=0 && y < d.length) {
			if (d[x][y] == 1)
				return false;
			x++;
			y++;
		}
		return true;

	}
	
	// 주어진 위치에 퀸을 배치할 수 있는지 여부 확인
	//배열 d에서 (x,y)에 퀸을 배치할 수 있는지  조사
	public static boolean checkMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		return checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y);

	}
	
	// 다음 이동 가능한 열을 반환, 이동할 열이 없으면 -1 반환
	//배열 d에서 현재 위치(row,col)에 대하여 다음에 이동할 위치 nextCol을 반환, 이동이 가능하지 않으면 -1를 리턴
	public static int nextMove(int[][] d, int row, int col) {// 현재 row, col에 대하여 이동할 col을 return
		for (int nextCol = col; nextCol < d.length; nextCol++) {
			if (checkMove(d, row, nextCol)) {
				return nextCol;	// 다음 열로 이동 가능한 경우 해당 열 반환
			}
		}
		return - 1;	// 이동할 열이 더 이상 없는 경우

	}
	
	
	// 현재 상태에서의 퀸 배치를 출력하는 메서드
	static void showQueens(int[][] data) {//배열 출력
		for (int i = 0; i  <data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i][j] == 1) {
					System.out.print("Q ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int row = 8, col = 8;	// 체스보드의 크기
		int[][] data = new int[row][col];	// 체스보드를 나타내는 2D 배열
		
		// 모든 원소를 0으로 초기화
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;
		
		// 8-퀸 문제를 해결하고 해결책을 출력
		solveQueen(data);

	}
}
