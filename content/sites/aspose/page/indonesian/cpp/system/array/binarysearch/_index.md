---
title: "System::Array::BinarySearch metode"
linktitle: "BinarySearch"
second_title: "Aspose.Page untuk C++"
description: "System::Array::BinarySearch method. Melakukan pencarian biner pada array yang terurut dalam C++."
type: docs
weight: 4600
url: /id/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Melakukan pencarian biner pada array yang sudah diurutkan.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Array terurut untuk melakukan pencarian |
| item | const T\& | Sebuah item untuk dicari |

### ReturnValue

Indeks dari item yang dicari jika ditemukan, jika tidak, sebuah bilangan bulat negatif yang merupakan komplemen bitwise dari indeks item berikutnya yang lebih besar dari item yang dicari atau, jika tidak ada item yang lebih besar, komplemen bitwise dari jumlah elemen dalam array.

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


BELUM DIIMPLEMENTASIKAN.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
