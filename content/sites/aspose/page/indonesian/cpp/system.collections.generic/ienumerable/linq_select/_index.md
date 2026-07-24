---
title: "System::Collections::Generic::IEnumerable::LINQ_Select metode"
linktitle: "LINQ_Select"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode LINQ_Select dari kelas System::Collections::Generic::IEnumerable dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Mengubah setiap elemen dari sebuah urutan menjadi bentuk baru dengan memasukkan indeks elemen.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parameter | Deskripsi |
| --- | --- |
| ResultType | Tipe nilai yang dikembalikan oleh **selector**. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Fungsi transformasi. |

### ReturnValue

Sebuah [IEnumerable](../) yang berisi elemen yang dikembalikan oleh fungsi **selector**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Mengubah elemen-elemen dari sebuah urutan.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parameter | Deskripsi |
| --- | --- |
| ResultType | Tipe nilai yang dikembalikan oleh **selector**. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Fungsi transformasi. |

### ReturnValue

Sebuah [IEnumerable](../) yang berisi elemen yang dikembalikan oleh fungsi **selector**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
