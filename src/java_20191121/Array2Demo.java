package java_20191121;

public class Array2Demo {
	public static void main(String[] args) {

//1)
		int[][] a = new int[3][2]; //3개 배열안에 2개씩 들어있음
		//첫번째 []는 a.length / 두번째는 []의 첫번째 []는 a[0].length ...
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		int[][] b =  {{10, 20}, {30, 40}, {50, 60}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");				
			}
			System.out.println();
		}
		
//2)		
		int[][] c = {{1}, {2, 3}, {4, 5, 6}};
		//2차원 배열의 동적 생성
		int[][] d = new int[3][];
		d[0] = new int[1];
		d[1] = new int[2];
		d[2] = new int[3];
		d[0][0] = 1;
		d[1][0] = 2;
		d[1][1] = 3;
		d[2][0] = 4;
		d[2][1] = 5;
		d[2][2] = 6;
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}

//		3)
		int[] aa = {1, 2, 3};
		int[] bb = aa;
		bb[1] = 200;
		System.out.println(aa[1]);		//200
		int[] cc = new int[6];

		
		
	}
}