---
title: "System::Collections::Generic::_net_binnary_search metode"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::_net_binnary_search metode. Mengimplementasikan pencarian biner dalam kontainer akses acak. Spesialisasi untuk penunjuk pintar. Menggunakan metode System::Object::CompareTo dalam C++."
type: docs
weight: 4900
url: /id/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Mengimplementasikan pencarian biner dalam kontainer akses acak. Spesialisasi untuk penunjuk pintar. Menggunakan metode System::Object::CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Deskripsi |
| --- | --- |
| containerT | Tipe templat kontainer bergaya STL dengan dua argumen templat: tipe elemen dan tipe alokator. |
| T | Tipe elemen. |
| Allocator | Tipe alokator. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kontainer | const containterT\<T, Allocator\>\& | Kontainer untuk pencarian. |
| indeks | int | Indeks awal rentang pencarian. |
| count | int | Panjang rentang pencarian. |
| value | T | Nilai yang dicari. |

### ReturnValue

Jika ditemukan, indeks elemen berikutnya; jika tidak, komplemen indeks tempat pencarian berhenti.

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Mengimplementasikan pencarian biner dalam kontainer akses acak. Spesialisasi untuk tipe nilai. Menggunakan metode CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Deskripsi |
| --- | --- |
| containerT | Tipe templat kontainer bergaya STL dengan dua argumen templat: tipe elemen dan tipe alokator. |
| T | Tipe elemen. |
| Allocator | Tipe alokator. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kontainer | const containterT\<T, Allocator\>\& | Kontainer untuk pencarian. |
| indeks | int | Indeks awal rentang pencarian. |
| count | int | Panjang rentang pencarian. |
| value | T | Nilai yang dicari. |

### ReturnValue

Jika ditemukan, indeks elemen berikutnya; jika tidak, komplemen indeks tempat pencarian berhenti.

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Mengimplementasikan pencarian biner dalam kontainer akses acak. Spesialisasi untuk tipe skalar. Membandingkan elemen menggunakan operator lebih besar dan lebih kecil.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Deskripsi |
| --- | --- |
| containerT | Tipe templat kontainer bergaya STL dengan dua argumen templat: tipe elemen dan tipe alokator. |
| T | Tipe elemen. |
| Allocator | Tipe alokator. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kontainer | const containterT\<T, Allocator\>\& | Kontainer untuk pencarian. |
| indeks | int | Indeks awal rentang pencarian. |
| count | int | Panjang rentang pencarian. |
| value | T | Nilai yang dicari. |

### ReturnValue

Jika ditemukan, indeks elemen berikutnya; jika tidak, komplemen indeks tempat pencarian berhenti.

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Mengimplementasikan pencarian biner dalam kontainer akses acak.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | Deskripsi |
| --- | --- |
| containerT | Tipe templat kontainer bergaya STL dengan dua argumen templat: tipe elemen dan tipe alokator. |
| T | Tipe elemen. |
| Allocator | Tipe alokator. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kontainer | const containterT\<T, Allocator\>\& | Kontainer untuk pencarian. |
| indeks | int | Indeks awal rentang pencarian. |
| count | int | Panjang rentang pencarian. |
| value | T | Nilai yang dicari. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | objek [Comparer](../comparer/). |

### ReturnValue

Jika ditemukan, indeks elemen berikutnya; jika tidak, komplemen indeks tempat pencarian berhenti.

## Lihat Juga

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
