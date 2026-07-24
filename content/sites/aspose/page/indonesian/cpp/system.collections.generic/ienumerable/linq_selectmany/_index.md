---
title: "Metode System::Collections::Generic::IEnumerable::LINQ_SelectMany"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode LINQ_SelectMany dari kelas System::Collections::Generic::IEnumerable dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Memproyeksikan setiap elemen dari sebuah urutan dan menggabungkan urutan-urutan yang dihasilkan menjadi satu urutan.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Parameter | Deskripsi |
| --- | --- |
| ResultType | Tipe nilai yang dikembalikan oleh **selector**. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Fungsi transformasi. |

### ReturnValue

Sebuah [IEnumerable](../) yang berisi hasil pemanggilan fungsi proyeksi satu-ke-banyak pada setiap elemen dari urutan masukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
