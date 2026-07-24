---
title: "System::Array::LastIndexOf метод"
linktitle: "LastIndexOf"
second_title: "Aspose.Page для C++"
description: "System::Array::LastIndexOf метод. Определяет индекс последнего вхождения указанного элемента в диапазоне элементов массива, заданном стартовым индексом и количеством элементов в диапазоне, в C++."
type: docs
weight: 5500
url: /ru/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Определяет индекс последнего вхождения указанного элемента в диапазоне элементов массива, заданном начальным индексом и количеством элементов в диапазоне.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Параметр | Описание |
| --- | --- |
| ArrayType | Тип элементов в целевом массиве |
| ValueType | тип элемента, который нужно искать в массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) для поиска указанного элемента в |
| value | const ValueType\& | Индекс элемента, который необходимо определить |
| startIndex | int | Индекс, с которого начинается поиск |
| count | int | Количество элементов диапазона, в котором производится поиск |

### ReturnValue

Индекс последнего вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Определяет индекс последнего вхождения указанного элемента в массив.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Параметр | Описание |
| --- | --- |
| ArrayType | Тип элементов в целевом массиве |
| ValueType | тип элемента, который нужно искать в массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) для поиска указанного элемента в |
| value | const ValueType\& | Индекс элемента, который необходимо определить |

### ReturnValue

Индекс последнего вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Определяет индекс последнего вхождения указанного элемента в массив, начиная с указанного индекса.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Параметр | Описание |
| --- | --- |
| ArrayType | Тип элементов в целевом массиве |
| ValueType | тип элемента, который нужно искать в массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) для поиска указанного элемента в |
| value | const ValueType\& | Индекс элемента, который необходимо определить |
| startIndex | int | Индекс, с которого начинается поиск |

### ReturnValue

Индекс последнего вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
