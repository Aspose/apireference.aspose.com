---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending metode"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode LINQ_OrderByDescending dari kelas System::Collections::Generic::IEnumerable dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Mengurutkan elemen-elemen urutan secara turun berdasarkan nilai kunci yang dipilih oleh keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parameter | Deskripsi |
| --- | --- |
| keySelector | Fungsi untuk mengekstrak kunci dari sebuah elemen. |

### ReturnValue

Sebuah IOrderedEnumerable yang elemennya diurutkan secara menurun berdasarkan kunci

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
