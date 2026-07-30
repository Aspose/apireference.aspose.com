---
title: "System::Array::BinarySearch yöntemi"
linktitle: "BinarySearch"
second_title: "Aspose.Font için C++"
description: "System::Array::BinarySearch yöntemi. Sıralı dizi içinde ikili arama gerçekleştirir C++'da."
type: docs
weight: 4600
url: /tr/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Sıralı dizide ikili arama gerçekleştirir.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Arama yapılacak sıralı dizi |
| öğe | const T\& | Aranacak bir öğe |

### ReturnValue

Bulunan öğenin indeksi, eğer bulunursa; aksi takdirde, aranan öğeden daha büyük bir sonraki öğenin indeksinin bit düzeyinde tamamlayıcısı olan negatif bir tam sayı ya da daha büyük bir öğe yoksa dizideki öğe sayısının bit düzeyinde tamamlayıcısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


UYGULANMADI.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
