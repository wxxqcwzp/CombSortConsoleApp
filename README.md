function combSort(arr, order)
    // Определяем длину массива и коэффициент сжатия
    gap = length of arr  // O(1)
    shrinkFactor = 1.3   // O(1)
    sorted = false       // O(1)
    // Выполняем сортировку, пока gap не станет 1 и массив не отсортирован
    while gap > 1 or not sorted  // O(log(n)) — количество итераций уменьшается пропорционально логарифму от длины массива
        // Уменьшаем разрыв (gap) с учетом коэффициента сжатия
        gap = max(1, floor(gap / shrinkFactor))  // O(1)
        sorted = true  // O(1)
        // Проходим по массиву с текущим gap
        for i from 0 to length of arr - gap  // O(n) — каждый элемент массива просматривается один раз за итерацию цикла
            // Сравниваем элементы с учетом порядка сортировки
            if order is ASC and arr[i] > arr[i + gap]  // O(1)
                // Меняем местами элементы, если они не в нужном порядке
                swap(arr[i], arr[i + gap])  // O(1)
                sorted = false  // O(1)
            else if order is DESC and arr[i] < arr[i + gap]  // O(1)
                // Меняем местами элементы для убывающего порядка
                swap(arr[i], arr[i + gap])  // O(1)
                sorted = false  // O(1)
    // В итоге сложность работы цикла будет O(n * log(n)), так как мы уменьшаем gap логарифмически
    return arr  // O(1)
