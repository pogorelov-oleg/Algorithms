public class HeapSort {

    public static void main(String[] args) {
        int[] array = {6,3,9,1,0,4,23,14,64,74,13};
        printArray(array);

        heapSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение кучи (преобразование массива в двоичную кучу)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Извлечение элементов из кучи по одному и упорядочивание
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень (наибольший элемент) в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify для уменьшения размера кучи и восстановления свойства кучи
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Если правый потомок больше корня
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Если наибольший элемент не является корнем
        if (largest != i) {
            // Меняем местами корень и наибольший элемент
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Рекурсивно вызываем heapify для затронутой подкучи
            heapify(array, n, largest);
        }
    }
}