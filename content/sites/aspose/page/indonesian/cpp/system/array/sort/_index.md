---
title: "System::Array::Sort metode"
linktitle: "Urutkan"
second_title: "Aspose.Page untuk C++"
description: "System::Array::Sort metode. Mengurutkan dua array, satu berisi kunci dan yang lainnya berisi item yang sesuai, berdasarkan nilai array yang berisi kunci, elemen-elemennya dibandingkan menggunakan operator< dalam C++."
type: docs
weight: 5800
url: /id/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Mengurutkan dua array, satu berisi kunci dan yang lainnya berisi item yang sesuai, berdasarkan nilai array yang berisi kunci, elemen-elemennya dibandingkan menggunakan operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe elemen dalam array **keys** |
| TValue | tipe elemen dalam array **items** |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) yang berisi nilai kunci |
| items | const ArrayPtr\<TValue\>\& | [Array](../) yang berisi item yang dipetakan ke nilai kunci dalam array **keys** |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Mengurutkan dua array, satu berisi kunci dan yang lainnya berisi item yang sesuai, berdasarkan nilai array yang berisi kunci, elemen-elemennya dibandingkan menggunakan pembanding default.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe elemen dalam array **keys** |
| TValue | tipe elemen dalam array **items** |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) yang berisi nilai kunci |
| items | const ArrayPtr\<TValue\>\& | [Array](../) yang berisi item yang dipetakan ke nilai kunci dalam array **keys** |
| indeks | int | Indeks yang menunjukkan awal rentang yang akan diurutkan |
| length | int | Jumlah elemen dalam rentang yang akan diurutkan |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Mengurutkan elemen dalam array yang ditentukan menggunakan pembanding default.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Array target |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Mengurutkan elemen dalam array yang ditentukan menggunakan pembanding yang ditentukan.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Array target |
| pembanding | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | Objek IComparer<T> yang digunakan untuk membandingkan elemen-elemen dalam array |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


BELUM DIIMPLEMENTASIKAN.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Mengurutkan rentang elemen dalam array yang ditentukan menggunakan pembanding default.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Array target |
| startIndex | int | Indeks yang menunjukkan awal rentang elemen yang akan diurutkan |
| count | int | Ukuran rentang elemen yang akan diurutkan |

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
