```
function combSort(arr, order)
    // Определяем длину массива и коэффициент сжатия
    gap = length of arr
    shrinkFactor = 1.3
    sorted = false

    // Выполняем сортировку, пока gap не станет 1 и массив не отсортирован
    while gap > 1 or not sorted
        // Уменьшаем разрыв (gap) с учетом коэффициента сжатия
        gap = max(1, floor(gap / shrinkFactor))
        sorted = true

        // Проходим по массиву с текущим gap
        for i from 0 to length of arr - gap
            if order is ASC and arr[i] > arr[i + gap]
                // Меняем местами элементы
                swap(arr[i], arr[i + gap])
                sorted = false
            else if order is DESC and arr[i] < arr[i + gap]
                // Меняем местами элементы в порядке убывания
                swap(arr[i], arr[i + gap])
                sorted = false

    return arr
```