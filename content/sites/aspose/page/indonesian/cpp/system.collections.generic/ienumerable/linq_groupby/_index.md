---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy metode"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode LINQ_GroupBy dari kelas System::Collections::Generic::IEnumerable dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Mengelompokkan elemen-elemen dalam sebuah urutan.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parameter | Deskripsi |
| --- | --- |
| Kunci | Tipe kunci yang dikembalikan oleh keyPredicate |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Sebuah fungsi untuk mengekstrak kunci bagi setiap elemen. |

### ReturnValue

Sebuah [IEnumerable](../) yang berisi urutan objek dan sebuah kunci

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
