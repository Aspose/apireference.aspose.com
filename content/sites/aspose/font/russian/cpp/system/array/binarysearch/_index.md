---
title: "System::Array::BinarySearch method"
linktitle: "BinarySearch"
second_title: "Aspose.Font для C++"
description: "System::Array::BinarySearch method. Выполняет бинарный поиск в отсортированном массиве в C++."
type: docs
weight: 4600
url: /ru/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Выполняет бинарный поиск в отсортированном массиве.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Отсортированный массив для выполнения поиска |
| элемент | const T\& | Элемент для поиска |

### ReturnValue

Индекс найденного элемента, если он найден; в противном случае — отрицательное целое число, являющееся побитовым дополнением индекса следующего элемента, большего найденного, или, если большего элемента нет, побитовым дополнением количества элементов в массиве.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


НЕ РЕАЛИЗОВАНО.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
