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
	// 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
	//    Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
	//    при этом не используя дополнительный массив
	public static void task1() {
		int k = 4;
		// Создаем первый массив
		int n1 = 10;
		ArrayList arr1 = new ArrayList();
		for (int i = 0; i < n1; i++) {
			arr1.add((int)(Math.random()*100));
		}
		System.out.print("Задача 1. Первый массив: ");
		printArr(arr1, n1);
		// Создаем второй массив
		int n2 = 3;
		ArrayList arr2 = new ArrayList();
		for (int i = 0; i < n2; i++) {
			arr2.add((int)(Math.random()*100));
		}
		System.out.print("Задача 1. Второй массив: ");
		printArr(arr2, n2);	
		// Добавляем второй массив в первый с позиции k
		int x = 0;
		for (int i = k; i < (k+n2); i++ ) {
			arr1.add(i, arr2.get(x));
			x++;
		}
		System.out.print("Задача 1. Второй массив включен в первый с "+(k+1)+"-го элемента \n");
		System.out.print("Задача 1. Объединенный массив: ");
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
	// 2. Даны две последовательности. Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
	//    Примечание. Дополнительный массив не использовать. 
	public static void task2() {
		// Создаем первый массив
		ArrayList arr1 = createArr1(0);
		System.out.print("Задача 2. Первый массив: ");
		printArr(arr1, 5);
		// Создаем второй массив
		ArrayList arr2 = createArr2(5);
		System.out.print("Задача 2. Второй массив: ");
		printArr(arr2, 5);	
		// Добавляем второй массив в первый
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
		System.out.print("Задача 2. Объединенный массив: ");
		printArr(arr1, 10);
	}
	// 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= an. Требуется переставить элементы так, 
	//    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, 
	//    выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего. 
	//    Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором. 
	public static void task3() {
		int[] arr = {1, 3, 5, 7, 9, 9, 11, 13, 15, 17, 19, 21};
		System.out.print("Задача 3. Первоначальный массив: ");
		printArray(arr);
		arr = sortСhoice(arr);
		System.out.print("Задача 3. Отсортированный массив: ");
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
	public static int[] sortСhoice(int[] arr) {
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
	// 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= an. Требуется переставить числа в порядке возрастания. 
	//    Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка. 
	//    Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, 
	//    подсчитывая при этом количества перестановок.
	public static void task4() {
		int[] arr = {5, 6, 7, 7, 11, 12, 17, 25, 42, 99};
		System.out.print("Задача 4. Первоначальный массив: ");
		printArray(arr);
		arr = sortExchanges(arr);
		System.out.print("Задача 4. Отсортированный массив: ");
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
	// 5. Сортировка вставками. Дана последовательность чисел a1, a2,... an. Требуется переставить числа в порядке возрастания. 
	//    Делается это следующим образом. Пусть a1, a2,... an упорядоченная последовательность, т. е. a1 <= a2,... <= an. 
	//    Берется следующее число an+1 и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
	//    Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. 
	//    Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. 
	//    Двоичный поиск оформить в виде отдельной функции. 
	public static void task5() {
		int[] arr = {2, 10, 101, 42, -9, 8, 38, 17, 6, 0, 55, 1, 2, 1};
		System.out.print("Задача 5. Первоначальный массив: ");
		printArray(arr);
		ArrayList<Integer> list1 = new ArrayList<>();
		list1 = sortInsert(arr);
		
		System.out.print("Задача 5. Отсортированный массив: ");
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
	// 6.  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. 
	//     Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. 
	//     Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
	public static void task6() {
		int[] arr = {22, 46, 18, -5, 7, 38, -220, 67, 0, 11};
		System.out.print("Задача 6. Первоначальный массив: ");
		printArray(arr);
		arr = sortShell(arr);
		System.out.print("Задача 6. Отсортированный массив: ");
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
		// Создаем первый массив
		ArrayList arr1 = createArr1(0);
		System.out.print("Задача 7. Первый массив: ");
		printArr(arr1, 5);
		// Создаем второй массив
		ArrayList arr2 = createArr2(5);
		System.out.print("Задача 7. Второй массив: ");
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
		System.out.println("Задача 7. Объединенный массив должен иметь следующий порядок: ");
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
	// 8. Даны дроби (p, q - натуральные). Составить программу, которая приводит эти дроби к общему знаменателю и 
	//    упорядочивает их в порядке возрастания. 
	public static void task8() {
		int n = 10;
		int[] numerator = new int[n];
		int[] denominator = new int[n];
		numerator = fillRandom(numerator, 9);
		denominator = fillRandom(denominator, 9);
		System.out.print("Задача 8. Первоначальная последовательность дробей: ");
		printFraction(numerator, denominator);
		int commonDenominator = commonDenominator(denominator);
		int[] numeratorCD = numeratorCD(numerator, denominator, commonDenominator);
		System.out.print("Задача 8. Под общим знаменателем: ");
		printTask8(numeratorCD, commonDenominator);
		numeratorCD = sortShell(numeratorCD);
		System.out.print("Задача 8. Отсортированная: ");
		printTask8(numeratorCD, commonDenominator);
	}
	// Заполняем массив случайными числами
	public static int[] fillRandom(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*n+1);
		}
		return arr;
	}
	// Вывод дроби
	public static void printFraction(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (i == arr1.length-1) {
				System.out.print(arr1[i]+"/"+arr2[i]+"\n");
				continue;
			}
			System.out.print(arr1[i]+"/"+arr2[i]+", ");
		}
	}
	// Находим общий знаменатель
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
	// Приводим дроби к общему знаменателю
	public static int[] numeratorCD(int[] arr1, int[] arr2, int commDen) {
		int[] numeratorCD = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			numeratorCD[i] = arr1[i] * (commDen / arr2[i]);
		}
		return numeratorCD;
	}
	// Выводим результат задачи:
	public static void printTask8(int[] arr, int commDen) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.print(arr[i]+"/"+commDen+"\n");
				continue;
			}
			System.out.print(arr[i]+"/"+commDen+", ");
		}
	}
	// 9. Алгоритм фон Неймана. Упорядочить массив a1,a2,...,an по неубыванию с помощью алгоритма сортировки слияниями:
	//    1) каждая пара соседних элементов сливается в одну группу из двух элементов (последняя группа может состоять из одного элемента); 
	//    2) каждая пара соседних двухэлементных групп сливается в одну четырехэлементную группу и т. д. 
	//    При каждом слиянии новая укрупненная группа упорядочивается.
	public static void task9() {
		
	}
	
	
	
	
}
