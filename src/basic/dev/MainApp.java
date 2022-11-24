package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// 12.1.Viết chương trình tính tổng các sốtừ1 đến 100
		int ketQua = 0;
		for (int i = 1; i <= 100; i++) {
			ketQua += i;
		}
		System.out.println(ketQua);
		System.out.println("----");
		/**
		 * 12.2.Viết chương tình nhập vào một sốtựnhiên n. Tính tổng các
		 * sốchia hết cho 3 béhơn n.
		 **/
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		int tong = 0;
		for (int d = 1; d < n; d++) {
			if (d % 3 == 0) {
				tong += d;
			}
		}
		System.out.println(tong);
		System.out.println("----");

		// 12.3.Viết chương trình in ra 100sốFibonacciđầu tiên.
		int c = 100;
		long f0 = 0, f1 = 1, fn = 0;
		for (int a = 0; a <= c; a++) {
			if (a < 2) {
				System.out.print(a + " ");
			} else {
				fn = f0 + f1;
				f0 = f1;
				f1 = fn;
				System.out.print(fn + " ");

			}
		}
		System.out.println();
		/**
		 * 12.5.Viết chương trình liệt kê các sốtừ100 đến 999 cótổng các
		 * chữsốchia hết cho 3. Vídụ: 263cótổng: 2 + 6 + 3 = 9 chia hết cho 3,
		 * 135có1 + 3 + 5 = 9 chia hết cho 3
		 */
		int ketQua2;
		for (int j = 1; j <= 9; j++) {
			for (int j2 = 0; j2 <= 9; j2++)
				for (int j3 = 0; j3 <= 9; j3++) {
					ketQua2 = j + j2 + j3;
					if (ketQua2 % 3 == 0) {
						System.out.print(ketQua2 + " ");
					}
				}
		}
	}

}
