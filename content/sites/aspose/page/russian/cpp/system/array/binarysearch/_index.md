---
title: "System::Array::BinarySearch метод"
linktitle: "BinarySearch"
second_title: "Aspose.Page для C++"
description: "System::Array::BinarySearch метод. Выполняет бинарный поиск в отсортированном массиве в C++."
type: docs
weight: 4600
url: /ru/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Выполняет двоичный поиск в отсортированном массиве.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Отсортированный массив, в котором выполняется поиск |
| item | const T\& | Элемент для поиска |

### ReturnValue

Индекс найденного элемента, если он найден, иначе отрицательное целое число, которое является побитовым дополнением индекса следующего элемента, большего найденного элемента, или, если большего элемента нет, побитовым дополнением количества элементов в массиве.

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
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
* Library [Aspose.Page for C++](../../../)
