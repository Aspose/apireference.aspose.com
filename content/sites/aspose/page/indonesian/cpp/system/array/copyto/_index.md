---
title: "System::Array::CopyTo metode"
linktitle: "CopyTo"
second_title: "Aspose.Page untuk C++"
description: "System::Array::CopyTo metode. Menyalin semua elemen dari array saat ini ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai dari indeks yang ditentukan oleh argumen arrayIndex dalam C++."
type: docs
weight: 900
url: /id/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Menyalin semua elemen dari array saat ini ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai pada indeks yang ditentukan oleh argumen arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Array tujuan |
| arrayIndex | int | Indeks dalam array tujuan untuk memulai penyisipan item yang disalin |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Menyalin semua elemen dari array saat ini ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Deskripsi |
| --- | --- |
| DstType | Tipe elemen dalam array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Array tujuan |
| dstIndex | int64_t | Indeks dalam array tujuan untuk memulai penyisipan item yang disalin |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Menyalin sejumlah elemen yang ditentukan dari array saat ini mulai dari posisi yang ditentukan ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Deskripsi |
| --- | --- |
| DstType | Tipe elemen dalam array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Array tujuan |
| srcIndex | int64_t | Indeks dalam array sumber untuk memulai menyalin item |
| dstIndex | int64_t | Indeks dalam array tujuan untuk memulai penyisipan item yang disalin |
| count | int64_t | Jumlah elemen yang akan disalin |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Menyalin semua elemen dari array saat ini ke tampilan array tujuan yang ditentukan. Elemen dimasukkan ke dalam tampilan array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Deskripsi |
| --- | --- |
| DstType | Tipe elemen dalam tampilan array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Tampilan array tujuan |
| dstIndex | int64_t | Indeks dalam tampilan array tujuan untuk memulai menyisipkan item yang disalin |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Menyalin sejumlah elemen yang ditentukan dari array saat ini mulai dari posisi yang ditentukan ke tampilan array tujuan yang ditentukan. Elemen dimasukkan ke dalam tampilan array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Deskripsi |
| --- | --- |
| DstType | Tipe elemen dalam tampilan array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Tampilan array tujuan |
| srcIndex | int64_t | Indeks dalam array sumber untuk memulai menyalin item |
| dstIndex | int64_t | Indeks dalam tampilan array tujuan untuk memulai menyisipkan item yang disalin |
| count | int64_t | Jumlah elemen yang akan disalin |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
