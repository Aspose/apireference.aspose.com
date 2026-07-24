---
title: "System::Collections::Generic::IEnumerable::LINQ_Max method"
linktitle: "LINQ_Max"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode LINQ_Max dari kelas System::Collections::Generic::IEnumerable dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Lihat Juga

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Memanggil fungsi transformasi pada setiap elemen dari urutan generik dan mengembalikan nilai maksimum yang dihasilkan.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | Deskripsi |
| --- | --- |
| ResultType | Tipe nilai yang dikembalikan oleh selector. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Fungsi transformasi yang diterapkan pada setiap elemen. |

### ReturnValue

Nilai maksimum dalam urutan.

## Lihat Juga

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
