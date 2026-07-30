---
title: "System::Array::Copy method"
linktitle: "Kopyala"
second_title: "Aspose.Font için C++"
description: "System::Array::Copy yöntemi. Belirtilen sayıda öğeyi kaynak diziden hedef diziye C++'ta kopyalar."
type: docs
weight: 4900
url: /tr/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Belirtilen sayıda öğeyi kaynak diziden hedef diziye kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Belirtilen indeksten başlayarak kaynak diziden belirtilen sayıda öğeyi hedef dizide belirtilen konuma kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Kaynak dizideki öğelerin türü |
| DstType | Hedef dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| srcIndex | int64_t | Kaynak dizide kopyalanacak öğe aralığının başlangıcını belirten indeks |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| dstIndex | int64_t | Hedef dizide kopyalanan öğelerin eklenmeye başlanacağı indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Belirtilen indeksten başlayarak kaynak diziden belirtilen sayıda öğeyi hedef dizi görünümünde belirtilen konuma kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Kaynak dizideki öğelerin türü |
| DstType | Hedef dizi görünümündeki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| srcIndex | int64_t | Kaynak dizide kopyalanacak öğe aralığının başlangıcını belirten indeks |
| dstArray | System::Details::ArrayView\<DstType\> | Hedef dizi görünümü |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizi görünümündeki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


Belirtilen indeksten başlayarak kaynak diziden, belirtilen sayıda öğeyi yığında bulunan hedef dizide belirtilen konuma kopyalar.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Kaynak dizideki öğelerin türü |
| DstType | Yığın üzerindeki hedef dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| srcIndex | int64_t | Kaynak dizide kopyalanacak öğe aralığının başlangıcını belirten indeks |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Yığın üzerindeki hedef dizi |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı yığın üzerindeki hedef dizideki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


Belirtilen sayıda öğeyi kaynak diziden hedef dizi görünümüne kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| dstArray | System::Details::ArrayView\<DstType\> | Hedef dizi görünümü |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


Kaynak diziden yığında bulunan hedef diziye belirtilen sayıda öğeyi kopyalar.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Yığın üzerindeki hedef dizi |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Kaynak dizi görünümünden, belirtilen indeksten başlayarak, belirtilen sayıda öğeyi yığında bulunan hedef dizide belirtilen konuma kopyalar.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Yığın üzerindeki kaynak dizideki öğelerin türü |
| DstType | Yığın üzerindeki hedef dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | Kaynak dizi görünümü |
| srcIndex | int64_t | Kopyalanacak öğeler aralığının başlangıcını belirten kaynak dizi görünümündeki indeks |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Yığın üzerindeki hedef dizi |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı yığın üzerindeki hedef dizideki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


Belirtilen sayıda öğeyi kaynak dizi görünümünden hedef diziye kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Kaynak dizi görünümü |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Belirtilen indeksten başlayarak kaynak dizi görünümünden belirtilen sayıda öğeyi hedef dizide belirtilen konuma kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Kaynak dizi görünümündeki öğelerin türü |
| DstType | Hedef dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Kaynak dizi görünümü |
| srcIndex | int64_t | Kopyalanacak öğeler aralığının başlangıcını belirten kaynak dizi görünümündeki indeks |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| dstIndex | int64_t | Hedef dizide kopyalanan öğelerin eklenmeye başlanacağı indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Belirtilen indeksten başlayarak kaynak dizi görünümünden belirtilen sayıda öğeyi hedef dizi görünümünde belirtilen konuma kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Kaynak dizi görünümündeki öğelerin türü |
| DstType | Hedef dizi görünümündeki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Kaynak dizi görünümü |
| srcIndex | int64_t | Kopyalanacak öğeler aralığının başlangıcını belirten kaynak dizi görünümündeki indeks |
| dstArray | System::Details::ArrayView\<DstType\> | Hedef dizi görünümü |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizi görünümündeki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


Belirtilen sayıda öğeyi kaynak dizi görünümünden hedef dizi görünümüne kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Kaynak dizi görünümü |
| dstArray | System::Details::ArrayView\<DstType\> | Hedef dizi görünümü |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Yığında bulunan kaynak diziden hedef diziye belirtilen sayıda öğeyi kopyalar.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Yığın üzerindeki kaynak dizi |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Yığında bulunan kaynak diziden, belirtilen indeksten başlayarak, belirtilen sayıda öğeyi hedef dizide belirtilen konuma kopyalar.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Yığın üzerindeki kaynak dizideki öğelerin türü |
| DstType | Hedef dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Yığın üzerindeki kaynak dizi |
| srcIndex | int64_t | Kopyalanacak öğeler aralığının başlangıcını belirten yığın üzerindeki kaynak dizideki indeks |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| dstIndex | int64_t | Hedef dizide kopyalanan öğelerin eklenmeye başlanacağı indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Yığında bulunan kaynak diziden, belirtilen indeksten başlayarak, belirtilen sayıda öğeyi yığında bulunan hedef dizide belirtilen konuma kopyalar.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametre | Açıklama |
| --- | --- |
| SrcType | Yığın üzerindeki kaynak dizideki öğelerin türü |
| DstType | Yığın üzerindeki hedef dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Yığın üzerindeki kaynak dizi |
| srcIndex | int64_t | Kopyalanacak öğeler aralığının başlangıcını belirten yığın üzerindeki kaynak dizideki indeks |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Yığın üzerindeki hedef dizi |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı yığın üzerindeki hedef dizideki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


Yığında bulunan kaynak diziden yığında bulunan hedef diziye belirtilen sayıda öğeyi kopyalar.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Yığın üzerindeki kaynak dizi |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Yığın üzerindeki hedef dizi |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
