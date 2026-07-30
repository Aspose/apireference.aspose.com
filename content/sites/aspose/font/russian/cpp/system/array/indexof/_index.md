---
title: "System::Array::IndexOf метод"
linktitle: "IndexOf"
second_title: "Aspose.Font для C++"
description: "System::Array::IndexOf метод. Определяет индекс первого вхождения указанного элемента в массиве в C++."
type: docs
weight: 2900
url: /ru/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Определяет индекс первого вхождения указанного элемента в массив.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| элемент | const T\& | Индекс элемента, который необходимо определить |

### ReturnValue

Индекс первого вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Определяет индекс первого вхождения указанного элемента в массив.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Параметр | Описание |
| --- | --- |
| ArrayType | Тип элементов в целевом массиве |
| ValueType | тип элемента для поиска в массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) для поиска указанного элемента в |
| значение | const ValueType\& | Индекс элемента, который необходимо определить |

### ReturnValue

Индекс первого вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Определяет индекс первого вхождения указанного элемента в массив, начиная с указанного индекса.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| Параметр | Описание |
| --- | --- |
| ArrayType | Тип элементов в целевом массиве |
| ValueType | тип элемента для поиска в массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) для поиска указанного элемента в |
| значение | const ValueType\& | Индекс элемента, который необходимо определить |
| startIndex | int | Индекс, с которого начинается поиск |

### ReturnValue

Индекс первого вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Определяет индекс первого вхождения указанного элемента в диапазоне элементов массива, заданного начальным индексом и количеством элементов в диапазоне.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Параметр | Описание |
| --- | --- |
| ArrayType | Тип элементов в целевом массиве |
| ValueType | тип элемента для поиска в массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) для поиска указанного элемента в |
| значение | const ValueType\& | Индекс элемента, который необходимо определить |
| startIndex | int | Индекс, с которого начинается поиск |
| count | int | Количество элементов диапазона, в котором производится поиск |

### ReturnValue

Индекс первого вхождения указанного элемента, если элемент найден, иначе -1

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
