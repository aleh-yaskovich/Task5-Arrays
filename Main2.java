package by.htp.task6.main;
import java.util.ArrayList;

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
	}
	// 1. ������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. 
	//    ���������� �� � ���� ������, ������� ������ ������ ����� k-� � (k+1) - � ���������� �������, 
	//    ��� ���� �� ��������� �������������� ������
	public static void task1() {
		int k = 4;
		// ������� ������ ������
		int n1 = 10;
		ArrayList arr1 = new ArrayList();
		for (int i = 0; i < n1; i++) {
			arr1.add((int)(Math.random()*100));
		}
		System.out.print("������ 1. ������ ������: ");
		printArr(arr1, n1);
		// ������� ������ ������
		int n2 = 3;
		ArrayList arr2 = new ArrayList();
		for (int i = 0; i < n2; i++) {
			arr2.add((int)(Math.random()*100));
		}
		System.out.print("������ 1. ������ ������: ");
		printArr(arr2, n2);	
		// ��������� ������ ������ � ������ � ������� k
		int x = 0;
		for (int i = k; i < (k+n2); i++ ) {
			arr1.add(i, arr2.get(x));
			x++;
		}
		System.out.print("������ 1. ������ ������ ������� � ������ � "+(k+1)+"-�� �������� \n");
		System.out.print("������ 1. ������������ ������: ");
		printArr(arr1, n1+n2);
	}
	public static void printArr(ArrayList arr, int n) {
		for (int i = 0; i < n; i++) {
			if (i == (n-1)) {
				System.out.print(arr.get(i)+"\n");
				continue;
			}
			System.out.print(arr.get(i)+", ");
		}
	}
	// 2. ���� ��� ������������������. ���������� �� ��� ����� ������������������ ����� ���, ����� ��� ���� ���� �����������. 
	//    ����������. �������������� ������ �� ������������. 
	public static void task2() {
		// ������� ������ ������
		ArrayList arr1 = createArr1(0);
		System.out.print("������ 2. ������ ������: ");
		printArr(arr1, 5);
		// ������� ������ ������
		ArrayList arr2 = createArr2(5);
		System.out.print("������ 2. ������ ������: ");
		printArr(arr2, 5);	
		// ��������� ������ ������ � ������
		int i = 0;
		while ( i < 5 ) {
			boolean res = true;
			for (int j = 0; j < 5; j++) {
				if ((int)arr1.get(j) >= (int)arr2.get(i)) {
					arr1.add(j, arr2.get(i));
					res = false;
					break;
				}
			}
			if (res) {
				arr1.add(arr2.get(i));
			}
			i++;
		}
		System.out.print("������ 2. ������������ ������: ");
		printArr(arr1, 10);
	}
	// 3. ���������� �������. ���� ������������������ ����� a1 <= a2 <= an. ��������� ����������� �������� ���, 
	//    ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, 
	//    ���������� ���������� ������� � �������� �� ������ �����, � ������ - �� ����� �����������. 
	//    �����, ������� �� �������, ��� ��������� �����������. �������� �������� ���������� �������. 
	public static void task3() {
		int[] arr = {1, 3, 5, 7, 9, 9, 11, 13, 15, 17, 19, 21};
		System.out.print("������ 3. �������������� ������: ");
		printArray(arr);
		arr = sort�hoice(arr);
		System.out.print("������ 3. ��������������� ������: ");
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]+"\n");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	public static int[] sort�hoice(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int max = arr[i];
			int k = i;
			for (int j = i+1; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
					k = j;
				}
			}
			int temp = arr[i];
			arr[i] = max;
			arr[k] = temp;
		}
		return arr;
	}
	// 4. ���������� ��������. ���� ������������������ ����� a1 <= a2 <= an. ��������� ����������� ����� � ������� �����������. 
	//    ��� ����� ������������ ��� �������� ����� ai � ai+1. ���� ai > ai+1, �� �������� ������������. 
	//    ��� ������������ �� ��� ���, ���� ��� �������� �� ������ ����������� � ������� �����������. ��������� �������� ����������, 
	//    ����������� ��� ���� ���������� ������������.
	public static void task4() {
		int[] arr = {5, 6, 7, 7, 11, 12, 17, 25, 42, 99};
		System.out.print("������ 4. �������������� ������: ");
		printArray(arr);
		arr = sortExchanges(arr);
		System.out.print("������ 4. ��������������� ������: ");
		printArray(arr);
	}
	public static int[] sortExchanges(int[] arr) {
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
	// 5. ���������� ���������. ���� ������������������ ����� a1, a2,... an. ��������� ����������� ����� � ������� �����������. 
	//    �������� ��� ��������� �������. ����� a1, a2,... an ������������� ������������������, �. �. a1 <= a2,... <= an. 
	//    ������� ��������� ����� an+1 � ����������� � ������������������ ���, ����� ����� ������������������ ���� ���� ������������. 
	//    ������� ������������ �� ��� ���, ���� ��� �������� �� i+1 �� n �� ����� ���������. 
	//    ����������. ����� ��������� ���������� �������� � ��������������� ����� ����������� � ������� ��������� ������. 
	//    �������� ����� �������� � ���� ��������� �������. 
	public static void task5() {
		int[] arr = {2, 10, 101, 42, -9, 8, 38, 17, 6, 0, 55, 1, 2, 1};
		System.out.print("������ 5. �������������� ������: ");
		printArray(arr);
		ArrayList<Integer> list1 = new ArrayList<>();
		list1 = sortInsert(arr);
		
		System.out.print("������ 5. ��������������� ������: ");
		printArr(list1, list1.size());
	}
	public static ArrayList sortInsert(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(Math.min(arr[0], arr[1]));
		list.add(Math.max(arr[0], arr[1]));
		int i = 2;
		while (i < arr.length) {
			boolean res = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] < list.get(j)) {
					list.add(j, arr[i]);
					res = false;
					break;
				}
			}
			if (res) {
				list.add(arr[i]);
			}
			i++;
		}
		return list;
	}
	// 6.  ���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������. 
	//     �������� ��� ��������� �������: ������������ ��� �������� �������� ai � ai+1. 
	//     ���� ai <= ai+1, �� ������������ �� ���� ������� ������. ���� ai > ai+1, �� ������������ ������������ � ���������� �� ���� ������� �����.
	public static void task6() {
		int[] arr = {22, 46, 18, -5, 7, 38, -220, 67, 0, 11};
		System.out.print("������ 6. �������������� ������: ");
		printArray(arr);
		arr = sortShell(arr);
		System.out.print("������ 6. ��������������� ������: ");
		printArray(arr);
	}
	public static int[] sortShell(int[] arr) {
		for (int d = arr.length / 2; d >= 1; d = d / 2) {
			for (int step = 0; step < d; step++) {
				int tmp;
		        for (int i = step; i < arr.length - 1; i = i + d) {
		        	for (int j = Math.min(i+d, arr.length-1); j-d >= 0; j = j-d) {
		        		if (arr[j - d] > arr[j])
		                {
		                    tmp = arr[j];
		                    arr[j] = arr[j-d];
		                    arr[j-d] = tmp;
		                }
		        	}   
		        }   
			}
		}
		
		return arr;
	}
	// 7.
	public static void task7() {
		// ������� ������ ������
		ArrayList arr1 = createArr1(0);
		System.out.print("������ 7. ������ ������: ");
		printArr(arr1, 5);
		// ������� ������ ������
		ArrayList arr2 = createArr2(5);
		System.out.print("������ 7. ������ ������: ");
		printArr(arr2, 5);	
		int i = 0;
		int n = 0;
		String str = "";
		while ( i < 5 ) {
			boolean res = true;
			for (int j = n; j < 5; j++) {
				if ((int)arr1.get(j) > (int)arr2.get(i)) {
					str = str + "arr2["+i+"]"+" + ";
					res = false;
					break;
				} else {
					n++;
					str = str + "arr1["+j+"]"+" + ";
				}
			}
			if (res) {
				str = str + "arr2["+i+"]"+" + ";
			} 
			i++;
		}
		str = str.substring(0, str.length()-2);
		System.out.println("������ 7. ������������ ������ ������ ����� ��������� �������: ");
		System.out.println(str);
	}
	public static ArrayList createArr1(int n1) {
		ArrayList arr1 = new ArrayList();
		for (int i = 0; i < 5; i++) {
			arr1.add(n1 + (int)(Math.random()*2));
			n1 = n1+2;
		}
		return arr1;
	}
	public static ArrayList createArr2(int n2) {
		ArrayList arr2 = new ArrayList();
		for (int i = 0; i < 5; i++) {
			arr2.add(n2 + (int)(Math.random()*6));
			n2 = n2 + 6;
		}
		return arr2;
	}
	// 8. ���� ����� (p, q - �����������). ��������� ���������, ������� �������� ��� ����� � ������ ����������� � 
	//    ������������� �� � ������� �����������. 
	public static void task8() {
		int n = 10;
		int[] numerator = new int[n];
		int[] denominator = new int[n];
		numerator = fillRandom(numerator, 9);
		denominator = fillRandom(denominator, 9);
		System.out.print("������ 8. �������������� ������������������ ������: ");
		printFraction(numerator, denominator);
		int commonDenominator = commonDenominator(denominator);
		int[] numeratorCD = numeratorCD(numerator, denominator, commonDenominator);
		System.out.print("������ 8. ��� ����� ������������: ");
		printTask8(numeratorCD, commonDenominator);
		numeratorCD = sortShell(numeratorCD);
		System.out.print("������ 8. ���������������: ");
		printTask8(numeratorCD, commonDenominator);
	}
	// ��������� ������ ���������� �������
	public static int[] fillRandom(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*n+1);
		}
		return arr;
	}
	// ����� �����
	public static void printFraction(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (i == arr1.length-1) {
				System.out.print(arr1[i]+"/"+arr2[i]+"\n");
				continue;
			}
			System.out.print(arr1[i]+"/"+arr2[i]+", ");
		}
	}
	// ������� ����� �����������
	public static int commonDenominator(int[] arr) {
		int commonDenominator = 1;
		boolean resComDen = false;
		while (resComDen == false) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (commonDenominator % arr[i] == 0) {
					count++;
				}
			}
			if (count == arr.length ) {
				resComDen = true;
				break;
			}
			commonDenominator++;
		}
		return commonDenominator;
	}
	// �������� ����� � ������ �����������
	public static int[] numeratorCD(int[] arr1, int[] arr2, int commDen) {
		int[] numeratorCD = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			numeratorCD[i] = arr1[i] * (commDen / arr2[i]);
		}
		return numeratorCD;
	}
	// ������� ��������� ������:
	public static void printTask8(int[] arr, int commDen) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.print(arr[i]+"/"+commDen+"\n");
				continue;
			}
			System.out.print(arr[i]+"/"+commDen+", ");
		}
	}
	// 9. �������� ��� �������. ����������� ������ a1,a2,...,an �� ���������� � ������� ��������� ���������� ���������:
	//    1) ������ ���� �������� ��������� ��������� � ���� ������ �� ���� ��������� (��������� ������ ����� �������� �� ������ ��������); 
	//    2) ������ ���� �������� �������������� ����� ��������� � ���� ����������������� ������ � �. �. 
	//    ��� ������ ������� ����� ����������� ������ ���������������.
	public static void task9() {
		
	}
	
	
	
	
}
