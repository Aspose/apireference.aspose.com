---
title: "Метод System::Array::CopyTo"
linktitle: "CopyTo"
second_title: "Aspose.Font для C++"
description: "Метод System::Array::CopyTo. Копирует все элементы текущего массива в указанный целевой массив. Элементы вставляются в целевой массив, начиная с индекса, указанного аргументом arrayIndex, в C++."
type: docs
weight: 900
url: /ru/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Копирует все элементы текущего массива в указанный целевой массив. Элементы вставляются в целевой массив, начиная с индекса, указанного аргументом arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Целевой массив |
| arrayIndex | int | Индекс в целевом массиве, с которого начинается вставка скопированных элементов |

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Копирует все элементы текущего массива в указанный целевой массив. Элементы вставляются в целевой массив, начиная с индекса, указанного аргументом dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Параметр | Описание |
| --- | --- |
| DstType | Тип элементов в целевом массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Целевой массив |
| dstIndex | int64_t | Индекс в целевом массиве, с которого начинается вставка скопированных элементов |

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Копирует указанное количество элементов из текущего массива, начиная с указанной позиции, в указанный целевой массив. Элементы вставляются в целевой массив, начиная с индекса, указанного аргументом dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Параметр | Описание |
| --- | --- |
| DstType | Тип элементов в целевом массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Целевой массив |
| srcIndex | int64_t | Индекс в исходном массиве, с которого начинается копирование элементов |
| dstIndex | int64_t | Индекс в целевом массиве, с которого начинается вставка скопированных элементов |
| count | int64_t | Количество элементов для копирования |

## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Копирует все элементы текущего массива в указанное представление целевого массива. Элементы вставляются в представление целевого массива, начиная с индекса, указанного аргументом dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Параметр | Описание |
| --- | --- |
| DstType | Тип элементов в представлении целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Представление массива назначения |
| dstIndex | int64_t | Индекс в представлении массива назначения, с которого начинать вставку скопированных элементов |

## См. также

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Копирует указанное количество элементов из текущего массива, начиная с указанной позиции, в указанное представление целевого массива. Элементы вставляются в представление целевого массива, начиная с индекса, указанного аргументом dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Параметр | Описание |
| --- | --- |
| DstType | Тип элементов в представлении целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Представление массива назначения |
| srcIndex | int64_t | Индекс в исходном массиве, с которого начинается копирование элементов |
| dstIndex | int64_t | Индекс в представлении массива назначения, с которого начинать вставку скопированных элементов |
| count | int64_t | Количество элементов для копирования |

## См. также

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
