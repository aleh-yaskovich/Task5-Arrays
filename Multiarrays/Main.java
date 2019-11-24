package by.htp.multiarray.main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		task1();	
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		task9();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		
	}
	// 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран
	public static void task1 () {
		int[][] arr = new int[3][4];
		arr = fillArr(arr);
		printArr(arr);
 	}
	public static int[][] fillArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
			arr[i][(int)(Math.random()*arr[i].length)] = 1;
		}
		return arr;
	}
	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	// 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]
	public static void task2 () {
		int[][] arr = new int[2][3];
		arr = fillRandom(arr);
		printArr(arr);
	}
	public static int[][] fillRandom(int[][] arr) {
		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*9);
			}
		}
		return arr;
	}
	// 3. Дана матрица. Вывести на экран первый и последний столбцы
	public static void task3 () {
		int m = (int)(Math.random()*9);
		int n = (int)(Math.random()*9);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printColumnArr(arr, 0);
		printColumnArr(arr, n-1);
	}
	public static void printColumnArr (int[][] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][n]+" ");
		}
		System.out.print("\n");
	}
	// 4. Дана матрица. Вывести на экран первую и последнюю строки
	public static void task4 () {
		int m = (int)(Math.random()*9);
		int n = (int)(Math.random()*9);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printStringArr(arr, 0);
		printStringArr(arr, m-1);
	}
	public static void printStringArr (int[][] arr, int n) {
		for (int i = 0; i < arr[n].length; i++) {
			System.out.print(arr[n][i]+" ");
		}
		System.out.print("\n");
	}
	// 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами
	public static void task5 () {
		int m = (int)(Math.random()*9);
		int n = (int)(Math.random()*9);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printEvenString(arr);
	}
	public static void printEvenString (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i%2 == 0) {
				System.out.print("Строка №"+i+": ");
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
	// 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
	public static void task6 () {
		int[][] arr = new int[10][10];
		arr = fillRandom(arr);
		printDecisionTask6(arr);
	}
	public static void printDecisionTask6 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i%2 != 0 && arr[i][0] > arr[i][arr[i].length-1]) {
				System.out.print("Строка №"+i+": ");
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
	// 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов
	public static void task7 () {
		int[][] arr = new int[5][5];
		arr = fillPositiveNegative(arr);
		printArr(arr);
		printDecisionTask7(arr);
	}
	public static int[][] fillPositiveNegative(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int num = (int)(Math.random()*2);
				if (num%2 == 0) {
					arr[i][j] = (int)(Math.random()*9);
				} else {
					arr[i][j] = (int)(Math.random()*(-9));
				}
			}
		}
		return arr;
	}
	public static void printDecisionTask7 (int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0) {
					sum = sum + Math.abs(arr[i][j]);
				}
			}
		}
		System.out.println("Сумма модулей отрицательных нечетных элементов равна: "+sum);
	}
	// 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива. 
	public static void task8 () {
		int k = 7;
		int m = (int)(Math.random()*9);
		int n = (int)(Math.random()*9);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		printDecisionTask8(arr, k);
	}
	public static void printDecisionTask8(int[][] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == k) {
					count++;
				}
			}
		}
		System.out.println("Среди элементов массива число "+k+" встречается "+count+" раз");
	}
	// 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
	public static void task9 () {
		int k = (int)(Math.random()*5);
		int[][] arr = new int[k][k];
		arr = fillRandom(arr);
		printArr(arr);
		printDecisionTask9(arr);
	}
	public static void printDecisionTask9(int[][] arr) {
		System.out.print("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i]+" ");
		}
	}
	// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
	public static void task10 () {
		int m = (int)(Math.random()*9);
		int n = (int)(Math.random()*9);
		int randomString = (int)(Math.random()*m);
		int randomColumn = (int)(Math.random()*n);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		System.out.print((randomString+1)+"-я строка массива: ");
		printStringArr(arr, randomString);
		System.out.print((randomColumn+1)+"-й столбеца массива: ");
		printColumnArr(arr, randomColumn);
	}
	// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, 
	//     третья строка справа налево и так далее. 
	public static void task11 () {
		int m = (int)(Math.random()*9);
		int n = (int)(Math.random()*9);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		System.out.print("\n");
		printDecisionTask11(arr);
	}
	public static void printDecisionTask11 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i%2 == 0) {
				for (int j = (arr[i].length-1); j >= 0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.print("\n");
		}
	}
	// 12. Получить квадратную матрицу порядка n
	public static void task12 () {
		int k = (int)(Math.random()*10+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask12(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask12 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = i;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}
	// 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task13 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask13(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask13 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i%2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = j+1;
				} 
			} else {
				int k = arr[i].length;
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k;
					k--;
				}
			}
		}
		return arr;
	}
	// 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
	public static void task14 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask14(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask14 (int[][] arr) {
		int m = arr.length-1;
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == m) {
					arr[i][j] = n;
					m--;
					n++;
					continue;
				}
				arr[i][j] = 0;
			}
		}
		return arr;
	}
	// 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task15 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask15(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask15 (int[][] arr) {
		int m = arr.length;
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == n && j == n) {
					arr[i][j] = m;
					m--;
					n++;
					continue;
				}
				arr[i][j] = 0;
			}
		}
		return arr;
	}
	// 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task16 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask16(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask16 (int[][] arr) {
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = n * (n + 1);
					n++;
					continue;
				}
				arr[i][j] = 0;
			}
		}
		return arr;
	}
	// 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task17 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask17(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask17 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == (arr.length - 1)) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = 1;
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					if (j == 0 || j == (arr[i].length - 1)) {
						arr[i][j] = 1;
						continue;
					}
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}
	// 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task18 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask18(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask18 (int[][] arr) {
		int k = 1;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = k;
			}
			k++;
			n--;
		}
		return arr;
	}
	// 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task19 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask19(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask19 (int[][] arr) {
		int n = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j >= n && j <=  arr[i].length - 1 - n) {
					arr[i][j] = 1;
				}
			}
			n++;
		}
		n = 0;
		for (int i = arr.length-1; i >= arr.length / 2; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j >= n && j <=  arr[i].length - 1 - n) {
					arr[i][j] = 1;
				}
			}
			n++;
		}
		return arr;
	}
	// 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task20 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask20(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask20 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
		int n = 1;
		for (int i = 0; i < arr.length / 2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j >= n && j <=  arr[i].length - 1 - n) {
					arr[i][j] = 0;
				}
			}
			n++;
		}
		n = 1;
		for (int i = arr.length-1; i >= arr.length / 2; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j >= n && j <=  arr[i].length - 1 - n) {
					arr[i][j] = 0;
				}
			}
			n++;
		}
		return arr;
	}
	// 21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task21 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask21(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask21 (int[][] arr) {
		int n = arr.length;
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			int k = n;
			for (int j = 0; j < arr[i].length; j++) {
				if (j <= m) {
					arr[i][j] = k;
					k++;
				}
			}
			n--;
			m++;
		}
		return arr;
	}
	// 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
	public static void task22 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask22(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask22 (int[][] arr) {
		int n = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			int k = 1;
			for (int j = 0; j < arr[i].length; j++) {
				if (j <= n) {
					arr[i][j] = k;
					k++;
				}
			}
			n--;
		}
		return arr;
	}
	// 23. Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней
	public static void task23 () {
		int k = (int)(Math.random()*9+1);
		double[][] arr = new double[k][k];
		arr = printDecisionTask23(arr);
		printAnswerTask23(arr);
	}
	public static double[][] printDecisionTask23 (double[][] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (Math.sin((i*i - j*j)/n));
			}
		}
		return arr;
	}
	public static void printAnswerTask23 (double[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > 0) {
					count++;
				}
			}
		}
		System.out.println("Количество положительных элементов в массиве равно: "+ count);
	}
	// 24. Дан линейный массив x1, x2,... , xn. Получить действительную квадратную матрицу порядка n
	public static void task24 () {
		int[] arr1 = {1,2,3,4,5};
		int[][] arr2 = printDecisionTask24(arr1);
		printArr(arr2);
	}
	public static int[][] printDecisionTask24 (int[] arr) {
		int n = 1;
		int k = arr.length;
		int[][] arr2 = new int[k][k];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (int)(Math.pow(arr[j], n));
			}
			n++;
		} 
		return arr2;
	}
	// 25. Получить квадратную матрицу порядка n
	public static void task25 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = printDecisionTask25(arr);
		printArr(arr);
	}
	public static int[][] printDecisionTask25 (int[][] arr) {
		int k = 1;
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n*arr.length + k;
				k++;
			}
			k = 1;
			n++;
		}
		return arr;
	}
	// 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:  
	// а) вычислить сумму отрицательных элементов в каждой строке;  
	// б) определить максимальный элемент в каждой строке;  
	// в) переставить местами максимальный и минимальный элементы матрицы. 
	public static void task26 () {
		int m = enterIntNumber();
		int n = enterIntNumber();
		int[][] arr = new int[n][m];
		arr = fillPositiveNegative(arr);
		printArr(arr);
		sumNegativeInLine(arr);
		maxValue(arr);
		int[][] newArr = printDecisionTask26(arr);
		printArr(newArr);
	}
	public static int enterIntNumber () {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите целое положительное число: ");
        }
        int number = sc.nextInt();
        while (number <= 0) {
        	System.out.print("Введите целое положительное число: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите целое положительное число: ");
            }
            number = sc.nextInt();
        }
		return number;
	}
	public static void sumNegativeInLine (int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0) {
					sum = sum + arr[i][j];
				}
			}
			System.out.println("Сумма отрицательных элементов в строке "+(i+1)+" равна: "+sum);
			sum = 0;
		}
	}
	public static void maxValue (int[][] arr) {
		int maxValue;
		for (int i = 0; i < arr.length; i++) {
			maxValue = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (maxValue < arr[i][j]) {
					maxValue = arr[i][j];
				}
			}
			System.out.println("Mаксимальный элемент в строке "+(i+1)+" равен: "+maxValue);
		}
	}
	public static int[][] printDecisionTask26 (int[][] arr) {
		int maxValue = arr[0][0];
		int minValue = arr[0][0];
		int iMax = 0;
		int jMax = 0;
		int iMin = 0;
		int jMin = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxValue < arr[i][j]) {
					maxValue = arr[i][j];
					iMax = i;
					jMax = j;
				}
				if (minValue > arr[i][j]) {
					minValue = arr[i][j];
					iMin = i;
					jMin = j;
				}
			}
		}
		arr[iMax][jMax] = minValue;
		arr[iMin][jMin] = maxValue;
		return arr;
	}
	// 27. В числовой матрице поменять местами два столбца любых столбца, 
	//     т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. 
	//     Номера столбцов вводит пользователь с клавиатуры. 
	public static void task27 () {
		int[][] arr = new int[5][5];
		arr = fillRandom(arr);
		printArr(arr);
		int a = enterIntNumber04a();
		int b = enterIntNumber04b(a);
		int[][] newArr = swapColumns(arr, a, b);
		printArr(newArr);
	}
	public static int enterIntNumber04a () {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число от 0 до 4: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите целое число от 0 до 4: ");
        }
        int number = sc.nextInt();
        while (number < 0 || number > 4) {
        	System.out.print("Введите целое число от 0 до 4: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите целое число от 0 до 4: ");
            }
            number = sc.nextInt();
        }
		return number;
	}
	public static int enterIntNumber04b (int a) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите еще одно другое целое число от 0 до 4: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите еще одно другое целое число от 0 до 4: ");
        }
        int number = sc.nextInt();
        while (number < 0 || number > 4 || number == a) {
        	System.out.print("Введите еще одно другое целое число от 0 до 4: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите еще одно другое целое число от 0 до 4: ");
            }
            number = sc.nextInt();
        }
		return number;
	}
	public static int[][] swapColumns(int[][] arr, int a, int b) {
		int[] arrA = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrA[i] = arr[i][a];
		}
		int[] arrB = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrB[i] = arr[i][b];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i][a] = arrB[i];
			arr[i][b] = arrA[i];
		}
		return arr;
	}
	// 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
	//     Определить, какой столбец содержит максимальную сумму.
	public static void task28 () {
		int m = (int)(Math.random()*9+1);
		int n = (int)(Math.random()*9+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		int[] sumColumn = sumColumn(arr);
		maxSum(sumColumn);
	}
	public static int[] sumColumn (int[][] arr) {
		int[] sumColumn = new int[arr[0].length];
		int sum = 0;
		int j = 0;
		while (j < arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Сумма элементов в столбце "+(j+1)+" равна: "+sum);
			sumColumn[j] = sum;
			sum = 0;
			j++;
		}
		
		return sumColumn;
	}
	public static void maxSum (int[] arr) {
		int maxSum = arr[0];
		int iMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxSum < arr[i]) {
				maxSum = arr[i];
				iMax = i;
			}
		}
		System.out.println("Максимальная сумма элементов содержится в столбце "+(iMax + 1)+" и равна: " + maxSum);
	}
	// 29. Найти положительные элементы главной диагонали квадратной матрицы
	public static void task29 () {
		int k = (int)(Math.random()*9+1);
		int[][] arr = new int[k][k];
		arr = fillPositiveNegative(arr);
		printArr(arr);
		positiveElementsDiagonal(arr);
	}
	public static void positiveElementsDiagonal (int[][] arr) {
		System.out.print("Положительные элементы главной диагонали матрицы: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][i] > 0) {
				System.out.print(arr[i][i] + ", ");
			}
		}
		System.out.print("\n");
	}
	// 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, 
	//     в которых число 5 встречается три и более раз
	public static void task30 () {
		int[][] arr = new int[10][20];
		arr = fillRandom015(arr);
		printArr(arr);
		findFive(arr);
	}
	public static int[][] fillRandom015 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*15);
			}
		}
		return arr;
	}
	public static void findFive (int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println("Число 5 встречается три или более раза в строке: "+ (i+1));
			}
			count = 0;
		}
	}
	// 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней
	public static void task31 () {
		int m = (int)(Math.random()*20);
		int n = (int)(Math.random()*30);
		int[][] arr = new int[n][m];
		arr = fill999(arr);
		printArr(arr);
		countDoubleDigit(arr);
	}
	public static int[][] fill999 (int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*1000);
			}
		}
		return arr;
	}
	public static void countDoubleDigit (int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 9 && arr[i][j] <= 99) {
					count++;
				}
			}
		}
		System.out.println("Массив содержит "+count+" двузначных чисел");
	}
	// 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
	public static void task32 () {
		int m = (int)(Math.random()*5+1);
		int n = (int)(Math.random()*9+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		System.out.println("Массив с отсортированными по убыванию строками: ");
		int[][] newArrDecrease = sortLineToDecrease(arr, m ,n);
		printArr(newArrDecrease);
		System.out.println("Массив с отсортированными по возрастанию строками: ");
		int[][] newArrIncrease = sortLineToIncrease(arr, m ,n);
		printArr(newArrIncrease);
	}
	public static int[][] sortLineToDecrease (int[][] arr, int m, int n) {
		int[] arrForSort = new int[n];
		int[][] newArr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrForSort[j] = arr[i][j];
			}
			arrForSort = sortExchangesDecrease(arrForSort);
			for (int j = 0; j < arrForSort.length; j++) {
				newArr[i][j] = arrForSort[j];
			}
		}
		return newArr;
	}
	public static int[][] sortLineToIncrease (int[][] arr, int m, int n) {
		int[] arrForSort = new int[n];
		int[][] newArr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrForSort[j] = arr[i][j];
			}
			arrForSort = sortExchangesIncrease(arrForSort);
			for (int j = 0; j < arrForSort.length; j++) {
				newArr[i][j] = arrForSort[j];
			}
		}
		return newArr;
	}
	public static int[] sortExchangesDecrease(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] sortExchangesIncrease(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
	public static void task33 () {
		int m = (int)(Math.random()*8+1);
		int n = (int)(Math.random()*6+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		System.out.println("Массив с отсортированными по убыванию столбцами: ");
		int[][] newArrDecreaseColumn = sortLineToDecreaseColumn(arr, m ,n);
		printArr(newArrDecreaseColumn);
		System.out.println("Массив с отсортированными по возрастанию столбцами: ");
		int[][] newArrIncreaseColumn = sortLineToIncreaseColumn(arr, m ,n);
		printArr(newArrIncreaseColumn);
	}
	public static int[][] sortLineToDecreaseColumn (int[][] arr, int m, int n) {
		int[] arrForSort = new int[m];
		int[][] newArr = new int[m][n];
		int j = 0;
		while (j < n) {
			for (int i = 0; i < arr.length; i++) {
				arrForSort[i] = arr[i][j];
			}
			arrForSort = sortExchangesDecrease(arrForSort);
			for (int i = 0; i < arrForSort.length; i++) {
				newArr[i][j] = arrForSort[i];
			}
			j++;
		}
		return newArr;
	}
	public static int[][] sortLineToIncreaseColumn (int[][] arr, int m, int n) {
		int[] arrForSort = new int[m];
		int[][] newArr = new int[m][n];
		int j = 0;
		while (j < n) {
			for (int i = 0; i < arr.length; i++) {
				arrForSort[i] = arr[i][j];
			}
			arrForSort = sortExchangesIncrease(arrForSort);
			for (int i = 0; i < arrForSort.length; i++) {
				newArr[i][j] = arrForSort[i];
			}
			j++;
		}
		return newArr;
	}
	// 34.  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца
	public static void task34 () {
		int m = (int)(Math.random()*6+6);
		int n = (int)(Math.random()*6);
		int[][] arr = new int[m][n];
		arr = decisionTask34(arr);
		printArr(arr);
	}
	public static int[][] decisionTask34 (int[][] arr) {
		int lines = arr.length;
		int columns = arr[0].length;
		int j = 1;
		while (j < columns) {
			int numberCol = 1;
			while (numberCol <= j) {
				int a = (int)(Math.random()*lines);
				if (arr[a][j] == 1) {
					continue;
				} else {
					arr[a][j] = 1;
				}
				numberCol++;
			}
			j++;
		}
		return arr;
	}
	// 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
	public static void task35 () {
		int m = (int)(Math.random()*8+1);
		int n = (int)(Math.random()*15+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		int maxVal = maxVal(arr);
		System.out.println("Максимальный элемент матрицы равен: "+maxVal);
		arr = changeOddToMaxVal(arr, maxVal);
		printArr(arr);
	}
	public static int maxVal (int[][] arr) {
		int maxVal = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxVal < arr[i][j]) {
					maxVal = arr[i][j];
				}
			}
		}
		return maxVal;
	}
	public static int[][] changeOddToMaxVal (int[][] arr, int maxVal) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = maxVal;
				}
			}
		}
		return arr;
	}
	// 36.  Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается как 
	//      среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат сглаживания заданной матрицы
	public static void task36 () {
		int m = (int)(Math.random()*8+1);
		int n = (int)(Math.random()*15+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		System.out.println("Новый массив:");
		int[][] arrNew = answerTask36(arr, m, n);
		printArr(arrNew);
	}
	public static int[][] answerTask36 (int[][] arr, int m, int n) {
		int[][] arrNew = new int[m][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int tmp = 0;
				if (i == 0) {
					if (j == 0) {
						tmp = tmp + arr[i][j+1];
						tmp = tmp + arr[i+1][j];
						tmp = (int)(tmp / 2);
					} else if (j == arr[i].length-1) {
						tmp = tmp + arr[i][j-1];
						tmp = tmp + arr[i+1][j];
						tmp = (int)(tmp / 2);
					} else {
						tmp = tmp + arr[i][j-1];
						tmp = tmp + arr[i][j+1];
						tmp = tmp + arr[i+1][j];
						tmp = (int)(tmp / 3);
					}
				} else if (i == arr.length-1) {
					if (j == 0) {
						tmp = tmp + arr[i][j+1];
						tmp = tmp + arr[i-1][j];
						tmp = (int)(tmp / 2);
					} else if (j == arr[i].length-1) {
						tmp = tmp + arr[i][j-1];
						tmp = tmp + arr[i-1][j];
						tmp = (int)(tmp / 2);
					} else {
						tmp = tmp + arr[i][j-1];
						tmp = tmp + arr[i][j+1];
						tmp = tmp + arr[i-1][j];
						tmp = (int)(tmp / 3);
					} 
				} else {
					if (j == 0) {
						tmp = tmp + arr[i][j+1];
						tmp = tmp + arr[i-1][j];
						tmp = tmp + arr[i+1][j];
						tmp = (int)(tmp / 3);					
					} else if (j == arr[i].length-1) {
						tmp = tmp + arr[i][j-1];
						tmp = tmp + arr[i-1][j];
						tmp = tmp + arr[i+1][j];
						tmp = (int)(tmp / 3);
					} else {
						tmp = tmp + arr[i][j-1];
						tmp = tmp + arr[i][j+1];
						tmp = tmp + arr[i-1][j];
						tmp = tmp + arr[i+1][j];
						tmp = (int)(tmp / 4);
					}
				}
				arrNew[i][j] = tmp;
			}
		}   
		return arrNew;
	}
	// 37.  Переставить строки матрицы случайным образом
	public static void task37 () {
		int m = (int)(Math.random()*5+1);
		int n = (int)(Math.random()*8+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		printArr(arr);
		int[] newLines = randomLines(arr, m, n);
		printAnswerTask37(newLines, arr);
	}
	public static int[] randomLines (int[][] arr, int m, int n) {
		int[] newLines = new int[m];
		for (int i = 0; i < m; i++) {
			newLines[i] = -1;
		}
		int k = 0;
		while (k < m) {
			int rand = (int)(Math.random()*m);
			boolean check = true;
			for (int i = 0; i < m; i++) {
				if (newLines[i] == rand) {
					check = false;
				}
			}
			if (check) {
				newLines[k] = rand;
				k++;
			}
		}
		return newLines;
	}
	public static void printAnswerTask37 (int[] newLines, int[][] arr) {
		System.out.println("Новый массив:");
		for (int i = 0; i < newLines.length; i++) {
			int k = newLines[i];
			for (int j = 0; j < arr[k].length; j++) {
				System.out.print(arr[k][j]+" ");
			}
			System.out.print("\n");
		}
	}
	// 38. Найдите сумму двух матриц
	public static void task38 () {
		int[][] arr1 = createRandomArray();
		System.out.println("Матрица №1:");
		printArr(arr1);
		int[][] arr2 = createRandomArray();
		System.out.println("Матрица №2:");
		printArr(arr2);
		System.out.println("Сумма двух матриц:");
		int[][] arr3 = sumArrays(arr1, arr2);
		printArr(arr3);
	}
	public static int[][] createRandomArray () {
		int m = (int)(Math.random()*5+1);
		int n = (int)(Math.random()*8+1);
		int[][] arr = new int[m][n];
		arr = fillRandom(arr);
		return arr;
	}
	public static int[][] sumArrays (int[][] arr1, int[][] arr2) {
		int a1 = arr1.length;
		int a2 = arr2.length;
		int b1 = arr1[0].length;
		int b2 = arr2[0].length;
		int a, b;
		if (a1 >= a2) {
			a = a1;
		} else {
			a = a2;
		}
		if (b1 >= b2) {
			b = b1;
		} else {
			b = b2;
		}
		int[][] arr3 = new int[a][b];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = arr3[i][j] + arr1[i][j];
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr3[i][j] = arr3[i][j] + arr2[i][j];
			}
		}
		
		return arr3;
	}
	// 39.  Найдите произведение двух матриц
	public static void task39 () {
		int[][] arr1 = createRandomArray();
		System.out.println("Матрица №1:");
		printArr(arr1);
		int[][] arr2 = createRandomArray();
		System.out.println("Матрица №2:");
		printArr(arr2);
		System.out.println("Произведение двух матриц:");
		int[][] arr3 = multiplyArrays(arr1, arr2);
		printArr(arr3);
	}
	public static int[][] multiplyArrays (int[][] arr1, int[][] arr2) {
		int a1 = arr1.length;
		int a2 = arr2.length;
		int b1 = arr1[0].length;
		int b2 = arr2[0].length;
		int a, b;
		if (a1 >= a2) {
			a = a1;
		} else {
			a = a2;
		}
		if (b1 >= b2) {
			b = b1;
		} else {
			b = b2;
		}
		int[][] arr3 = new int[a][b];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = 1;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr3[i][j] = 1;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = arr3[i][j] * arr1[i][j];
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr3[i][j] = arr3[i][j] * arr2[i][j];
			}
		}
		
		return arr3;
	}
	// 40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2 так, 
	//     что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. 
	public static void task40 () {
		int n = 3;
		int[][] arr = new int[n][n];
		arr = magicArray(arr, n);
		printArr(arr);
	}
	public static int[][] magicArray (int[][] arr, int n) {
		int magicNum = n * (n*n +1) / 2;
		
		
		return arr;
	}
}
