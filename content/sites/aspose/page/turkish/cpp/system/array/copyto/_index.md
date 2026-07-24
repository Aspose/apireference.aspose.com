---
title: "System::Array::CopyTo yöntemi"
linktitle: "CopyTo"
second_title: "Aspose.Page için C++"
description: "System::Array::CopyTo yöntemi. Mevcut dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, C++'ta arrayIndex argümanı tarafından belirtilen indeksten başlayarak hedef diziye eklenir."
type: docs
weight: 900
url: /tr/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Geçerli dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, arrayIndex argümanı ile belirtilen indeksten başlayarak hedef diziye eklenir.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Hedef dizi |
| arrayIndex | int | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizideki indeks |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Geçerli dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef diziye eklenir.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Açıklama |
| --- | --- |
| DstType | Hedef dizideki öğelerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizideki indeks |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Geçerli diziden belirtilen konumda başlayan belirtilen sayıda öğeyi belirtilen hedef diziye kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef diziye eklenir.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Açıklama |
| --- | --- |
| DstType | Hedef dizideki öğelerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| srcIndex | int64_t | Öğelerin kopyalanmaya başlanacağı kaynak dizideki indeks |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizideki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Geçerli dizinin tüm öğelerini belirtilen hedef dizi görünümüne kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef dizi görünümüne eklenir.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Açıklama |
| --- | --- |
| DstType | Hedef dizi görünümündeki öğelerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Hedef dizi görünümü |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizi görünümündeki indeks |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Geçerli diziden belirtilen konumda başlayan belirtilen sayıda öğeyi belirtilen hedef dizi görünümüne kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef dizi görünümüne eklenir.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Açıklama |
| --- | --- |
| DstType | Hedef dizi görünümündeki öğelerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Hedef dizi görünümü |
| srcIndex | int64_t | Öğelerin kopyalanmaya başlanacağı kaynak dizideki indeks |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizi görünümündeki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
