package by.htp.task5.main;

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
	}
	// 1.  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
	public static void task1() {
		int k = 8;
		int[] arr = new int[100];
		arr = fillRandom(arr, 100);
		int[] multiple = multipleSearch(arr, k);
		int sum = sumNumbersArr(multiple);
		System.out.println("Задача 1. Сумма элементов массива, которые кратны "+k+" равна "+sum);
	}
	// Заполняем массив случайными числами
	public static int[] fillRandom(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*n);
		}
		return arr;
	}
	// Вычисляем кратное
	public static int[] multipleSearch(int[] arr, int k) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				str = str + arr[i] + "-";
			}
		}
		String[] strArr = stringToArray(str);
		int[] multipleSearch = strArrToIntArr(strArr);
		return multipleSearch;
	}
	// Превращаем строку в массив
	public static String[] stringToArray(String str) {
		String[] strArr = str.split("-");
		return strArr;
	}
	// Превращаем массив String в массив int
	public static int[] strArrToIntArr(String[] strArr) {
		int[] intArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		return intArr;
	}
	public static int sumNumbersArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	// 2.  В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов
	public static void task2() {
		int[] sequence = new int[100];
		sequence = fillRandom(sequence, 10);
		int[] zeroElements = searchZeroElements(sequence);
		printTask2(zeroElements);
	}
	public static int[] searchZeroElements(int[] arr) {
		int[] zeroElements;
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				str = str + i + "-";
			}
		}
		if (str.length() > 0) {
			String[] strArr = stringToArray(str);
			zeroElements = strArrToIntArr(strArr);
		} else {
			zeroElements = new int[0];
		}
		return zeroElements;
	}
	public static void printTask2(int[] arr) {
		System.out.print("Задача 2. Из нулевых элементов целочисленной последовательности создан массив, состоящий из "+
				arr.length+" элементов");
		if (arr.length > 0) {
			System.out.print(": ");
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length-1) {
					System.out.print(arr[i]);
					break;
				}
				System.out.print(arr[i]+", ");
			}
			System.out.print("\n");
		}
	}
	// 3. Дана последовательность целых чисел а1 а2,..., аn. Выяснить, какое число встречается раньше - положительное или отрицательное
	public static void task3() {
		int[] sequence = {0, 0, -3, 25, 1, -99, 14, 22, 38, 42};
		int i = 0;
		while (i >= 0) {
			if (sequence[i] > 0) {
				System.out.println("Задача 3. Раньше встречается положительное число");
				break;
			} else if (sequence[i] < 0) {
				System.out.println("Задача 3. Раньше встречается отрицательное число");
				break;
			}
			i++;
		 }
	}
	// 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей
	public static void task4() {
		int[] sequence = {-6, 0, 3, 6, 25, 100, 199};
		boolean res = true;
		for (int i = 0; i < sequence.length-1; i++) {
			if (sequence[i] >= sequence[i+1]) {
				res = false;
			}
		}
		if (res) {
			System.out.println("Задача 4. Последовательность действительных чисел является возрастающей");
		} else {
			System.out.println("Задача 4. Последовательность действительных чисел не является возрастающей");
		}
	}
	// 5.  Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. 
	//     Если таких чисел нет, то вывести сообщение об этом факте
	public static void task5() {
		int[] sequence = {6, 0, 3, 6, 25, 100, 199, 42, 43, 1988};
		int[] sarchEven = sarchEven(sequence);
		printTask5(sarchEven);
	}
	public static int[] sarchEven(int[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				str = str + arr[i] + "-";
			}
		}
		String[] strArr = stringToArray(str);
		int[] sarchEven = strArrToIntArr(strArr);
		return sarchEven;
	}
	public static void printTask5(int[] arr) {
		System.out.print("Задача 5. ");
		if (arr.length == 0) {
			System.out.print("Последовательность не содержит четных чисел");
		} else {
			System.out.print("Последовательность содержит четные числа: ");
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length-1) {
					System.out.print(arr[i]+"\n");
				} else {
					System.out.print(arr[i]+", ");
				}
			}
		}
	}
	// 6.  Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа
	public static void task6() {
		int[] sequence = new int[10];
		sequence = fillRandom(sequence, 100);
		System.out.print("Задача 6. Начальная последовательность чисел: ");
		startSequence(sequence);
		sequence = sort(sequence);
		int numAxisLength = sequence[0] - sequence[sequence.length-1];
		System.out.println("Задача 6. Наименьшая длина числовой оси равна "+numAxisLength);
	}
	public static void startSequence(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]+"\n");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
	// Сортировка от большего к меньшему
	public static int[] sort(int[] arr) {
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
	// 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
	//    Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
	public static void task7() {
		int numZ = 50;
		int[] sequence = new int[10];
		sequence = fillRandom(sequence, 100);
		System.out.print("Задача 7. Начальная последовательность чисел: ");
		startSequence(sequence);
		replaceNumZ(sequence, numZ);
	}
	public static void replaceNumZ(int[] arr, int num) {
		int[] replaceNumZ = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				replaceNumZ[i] = num;
				count++;
				continue;
			}
			replaceNumZ[i] = arr[i];
		}
		System.out.print("Задача 7. Все числа больше "+num+" заменены на "+num+": ");
		startSequence(replaceNumZ);
		System.out.println("Задача 7. Количество замен: "+count);
	}
	// 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов
	/**
	 * 
	 */
	public static void task8() {
		int[] sequence = {6, -14, 0, 3, 6, -88, 25, 100, 199, 0, 42, 43, -1, 1988};
		System.out.print("Задача 8. Начальная последовательность чисел: ");
		startSequence(sequence);
		int searchNegative = searchNegative(sequence);
		System.out.println("Задача 8. Массив содержит отрицательных элементов: " + searchNegative);
		int searchPositive = searchPositive(sequence);
		System.out.println("Задача 8. Массив содержит положительных элементов: " + searchPositive);
		int searchZero = searchZero(sequence);
		System.out.println("Задача 8. Массив содержит нулевых элементов: " + searchZero);
	}
	// Считаем количество отрицательных элементов
	public static int searchNegative(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}
		}
		return count;
	}
	// Считаем количество положительных элементов
	public static int searchPositive(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
	}
	// Считаем количество нулевых элементов
	public static int searchZero(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		return count;
	}
	// 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
	public static void task9() {
		int[] sequence = {61, -34, 0, 4, 5, -18, 777, 199, 0, 42, 43, -1, 198, -99, -55};
		System.out.print("Задача 9. Начальная последовательность чисел: ");
		startSequence(sequence);
		sequence = replaceMaxMin(sequence);
		System.out.print("Задача 9. Конечная последовательность чисел: ");
		startSequence(sequence);
	}
	public static int[] replaceMaxMin(int[] arr) {
		int[] replaceMaxMin = new int[arr.length];
		int max = arr[0];
		int min = arr[0];
		int idMax = 0;
		int idMin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				idMax = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				idMin = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == idMax) {
				replaceMaxMin[i] = min;
				continue;
			} else if (i == idMin) {
				replaceMaxMin[i] = max;
				continue;
			}
			replaceMaxMin[i] = arr[i];
		}
		return replaceMaxMin;
	}
	// 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
	public static void task10() {
		int[] arr = new int[20];
		arr = fillRandom(arr, 20);
		System.out.print("Задача 10. Начальная последовательность чисел: ");
		startSequence(arr);
		String str = resTask10(arr);
		System.out.println("Задача 10. Числа массива, значение которых больше их порядкового номера: "+ str);
	}
	public static String resTask10(int[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				str = str + arr[i] + ", ";
			}
		}
		str = str.substring(0, (str.length()-2));
		return str;
	}
	// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1)
	public static void task11() {
		int numM = 3;
		int[] arr = new int[20];
		arr = fillRandom(arr, 100);
		System.out.print("Задача 11. Начальная последовательность чисел: ");
		startSequence(arr);
		String str = resTask11(arr, numM);
		System.out.println("Задача 11. Числа массива, у которых остаток от деления на "+numM+" равен L (0<L<"+(numM-1)+"): "+ str);
	}
	public static String resTask11(int[] arr, int num) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			int ostatok = arr[i] % num;
			if (ostatok > 0 && ostatok < (num - 1)) {
				str = str + arr[i] + ", ";
			}
		}
		str = str.substring(0, (str.length()-2));
		return str;
	}
	// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами
	public static void task12() {
		int[] arr = new int[10];
		arr = fillRandom(arr, 10);
		int res = resTask12(arr);
		System.out.println("Задача 12. Сумма чисел, порядковые номера которых являются простыми числами, равна "+res);
	}
	public static int resTask12(int[] arr) {
		int res;
		if (arr.length >= 3) {
			res = arr[2];
			for (int i = 3; i < arr.length; i++) {
				boolean bool = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						bool = false;
					}
				}
				if (bool) {
					res = res + arr[i];
				}
			}
		} else {
			res = 0;
		}
		return res;
	}
	// 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N
	public static void task13() {
		int multiple = 3;
		int minValue = 7;
		int maxValue = 55;
		int[] arr = new int[20];
		arr = fillRandom(arr, 100);
		System.out.print("Задача 13. Последовательность чисел: ");
		startSequence(arr);
		resTask13(arr, multiple, minValue, maxValue);
	}
	public static void resTask13(int[] arr, int multiple, int minValue, int maxValue) {
		String str = "";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= minValue && arr[i] <= maxValue && arr[i] % multiple == 0) {
				count++;
				str = str + arr[i] + ", ";
			}
		}
		if (str.length() > 2) {
			str = str.substring(0, (str.length()-2));
		}
		System.out.println("Задача 13. Количество элементов последовательности, кратных "+multiple
								+" и заключенных в промежутке от "+minValue+" до "+maxValue+" равно "+count+": "+ str);
	}
	// 14. Дан одномерный массив A[N]. Найти: максимальное среди четных + минимальное среди нечетных номеров элементов
	public static void task14() {
		int[] arr = new int[20];
		arr = fillRandom(arr, 100);
		System.out.print("Задача 14. Последовательность чисел: ");
		startSequence(arr);
		int[] arrOdd = arrEvenOdd(arr, 0);
		int[] arrEven = arrEvenOdd(arr, 1);
		int minOdd = minOdd(arrOdd);
		int maxEven = maxEven(arrEven);
		System.out.println("Задача 14. Сумма максимального значения среди четных элементов массива ("+maxEven
				+") и минимального значения среди нечетных элементов массива ("+minOdd+") равна " + (maxEven+minOdd));
	}
	public static int[] arrEvenOdd(int[] arr, int num) {
		int[] arrEvenOdd = new int[arr.length / 2];
		int k = 0;
		for (int i = num; i < arr.length; i = i + 2) {
			arrEvenOdd[k] = arr[i];
			k++;
		}
		return arrEvenOdd;
	}
	public static int minOdd(int[] arr) {
		int minOdd = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minOdd) {
				minOdd = arr[i];
			}
		}
		return minOdd;
	}
	public static int maxEven(int[] arr) {
		int maxEven = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxEven) {
				maxEven = arr[i];
			}
		}
		return maxEven;
	}
	// 15. Дана последовательность действительных чисел n a1, a2 ... an. Указать те ее элементы, которые принадлежат отрезку [с, d]. 
	public static void task15() {
		int min = 10;
		int max = 40;
		int[] arr = new int[20];
		arr = fillRandom(arr, 100);
		System.out.print("Задача 15. Последовательность чисел: ");
		startSequence(arr);
		String str = resTask15(arr, min, max);
		System.out.println("Задача 15. Элементы массива, принадлежащие отрезку ["+min+", "+max+"]: "+ str);
	}
	public static String resTask15(int[] arr, int min, int max) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min && arr[i] < max) {
				str = str + arr[i] + ", ";
			}
		}
		if (str.length() > 2) {
			str = str.substring(0, (str.length()-2));
		} else {
			str = "таких элементов нет";
		}
		
		return str;
	}
	// 16. Даны действительные числа. Найти max(a1+an,a2+an-1...)
	public static void task16() {
		int[] arr = new int[20];
		arr = fillRandom(arr, 100);
		System.out.print("Задача 16. Последовательность чисел: ");
		startSequence(arr);
		int[] newArr = newArr(arr);
		int max = maxEven(newArr);
		System.out.print("Задача 16. Максимальное значение нового массива "+max+". Новый массив: ");
		startSequence(newArr);
	}
	public static int[] newArr(int[] arr) {
		int[] newArr = new int[arr.length / 2];
		int n = 0;
		int k = arr.length - 1;
		int i = 0;
		while (i < newArr.length) {
			newArr[i] = arr[n] + arr[k];
			n++;
			k--;
			i++;
		}
		return newArr;
	}
	// 17. Дана последовательность целых чисел. Образовать новую последовательность, выбросив из исходной те члены, которые равны min() 
	public static void task17() {
		int[] arr = new int[20];
		arr = fillRandom(arr, 10);
		System.out.print("Задача 17. Исходная последовательность чисел ("+arr.length+"): ");
		startSequence(arr);
		int minElement = minOdd(arr);
		int minElementCount = minElementCount(arr, minElement);
		int[] newArr = newArr(arr, minElement, minElementCount);
		System.out.print("Задача 17. Новая последовательность чисел ("+newArr.length+"): ");
		startSequence(newArr);
	}
	public static int minElementCount(int[] arr, int minElement) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == minElement)
				count++;
		}
		return count;
	}
	public static int[] newArr(int[] arr, int minElement, int count) {
		int[] newArr = new int[arr.length - count];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == minElement) {
				continue;
			}
			newArr[k] = arr[i];
			k++;
		}
		return newArr;
	}
	// 18.  «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить игральные кубики. 
	//      Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. 
	//      (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая разгадывает код замка при условии, 
	//      что два кубика уже вставлены в ячейки.
	public static void task18() {
		int[] lock = new int[10];
		int rand1 = (int)(Math.random()*10);
		int rand2 = rand1;
		while (rand2 == rand1) {
			rand2 = (int)(Math.random()*10);
		}
		lock[rand1] = (int)(Math.random()*6 + 1);
		lock[rand2] = (int)(Math.random()*6 + 1);
		System.out.print("Задача 18. Исходная последовательность чисел: ");
		startSequence(lock);
		int[] selection = selectionCode(lock);
		// startSequence(selection);
	}
	public static int[] selectionCode(int[] arr) {
		int[] selection = new int[arr.length];
		return selection;
	}
	// 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
	//     Если таких чисел несколько, то определить наименьшее из них
	public static void task19() {
		int n = 10;
		int[] arr = new int[20];
		arr = fillRandom(arr, n);
		System.out.print("Задача 19. Исходная последовательность чисел: ");
		startSequence(arr);
		int[] countArr = new int[n];
		countArr = countElements(arr);
		int res = resTask19(countArr);
		System.out.println("Задача 19. В массиве чаще всего встречается число "+ res);
		
	}
	public static int[] countElements(int[] arr) {
		int[] countElements = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			countElements[arr[i]]++;
		}
		return countElements;
	}
	public static int resTask19(int[] arr) {
		int res = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				res = i;
			}
		}
		return res;
	}
	// 20.  Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент 
	//      (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
	public static void task20() {
		int n = 10;
		int[] arr = new int[20];
		arr = fillRandom(arr, n);
		System.out.print("Задача 20. Исходная последовательность чисел: ");
		startSequence(arr);
		arr = squeeze(arr);
		System.out.print("Задача 20. Новая последовательность чисел: ");
		startSequence(arr);
	}
	public static int[] squeeze(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = 0;
			}
		}
		return arr;
	}
	
}
