---
title: "Метод System::Buffer::BlockCopy"
linktitle: "BlockCopy"
second_title: "Aspose.Font для C++"
description: "Метод System::Buffer::BlockCopy. Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой в C++."
type: docs
weight: 100
url: /ru/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов исходного массива |
| TDst | Тип элементов целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Исходный массив |
| srcOffset | int | Смещение в байтах в исходном массиве, с которого начинается копирование |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Целевой массив |
| dstOffset | int | Смещение в байтах в целевом массиве, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов исходного массива |
| TDst | Тип элементов представления целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Исходный массив |
| srcOffset | int | Смещение в байтах в исходном массиве, с которого начинается копирование |
| dst | const System::Details::ArrayView\<TDst\>\& | Представление целевого массива |
| dstOffset | int | Смещение в байтах в представлении целевого массива, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов исходного массива |
| TDst | Тип элементов целевого стекового массива |
| ND | Размер целевого стекового массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Исходный массив |
| srcOffset | int | Смещение в байтах в исходном массиве, с которого начинается копирование |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Целевой стековый массив |
| dstOffset | int | Смещение в байтах в целевом стековом массиве, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов представления исходного массива |
| TDst | Тип элементов целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Представление исходного массива |
| srcOffset | int | Смещение в байтах в представлении исходного массива, с которого начинается копирование |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Целевой массив |
| dstOffset | int | Смещение в байтах в целевом массиве, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов представления исходного массива |
| TDst | Тип элементов представления целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Представление исходного массива |
| srcOffset | int | Смещение в байтах в представлении исходного массива, с которого начинается копирование |
| dst | const System::Details::ArrayView\<TDst\>\& | Представление целевого массива |
| dstOffset | int | Смещение в байтах в представлении целевого массива, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов исходного стекового массива |
| NS | Размер исходного стекового массива |
| TDst | Тип элементов целевого массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Исходный стековый массив |
| srcOffset | int | Смещение в байтах в исходном стековом массиве, с которого начинается копирование |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Целевой массив |
| dstOffset | int | Смещение в байтах в целевом массиве, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Интерпретирует два указанных типизированных массива как необработанные массивы байтов и копирует данные из одного в другой.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Параметр | Описание |
| --- | --- |
| TSrc | Тип элементов исходного стекового массива |
| NS | Размер исходного стекового массива |
| TDst | Тип элементов целевого стекового массива |
| ND | Размер целевого стекового массива |

| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Исходный стековый массив |
| srcOffset | int | Смещение в байтах в исходном стековом массиве, с которого начинается копирование |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Целевой стековый массив |
| dstOffset | int | Смещение в байтах в целевом стековом массиве, с которого начинается вставка данных |
| count | int | Количество байтов для копирования |

## См. также

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Копирует указанное количество байтов из исходного буфера в целевой буфер.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| src | const uint8_t * | Указатель на исходный буфер |
| srcOffset | int | Смещение в байтах в исходном буфере, с которого начинается копирование |
| dst | uint8_t * | Указатель на буфер назначения |
| dstOffset | int | Смещение в байтах в буфере назначения, с которого начинать вставку данных |
| count | int | Количество байтов для копирования |

## См. также

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
