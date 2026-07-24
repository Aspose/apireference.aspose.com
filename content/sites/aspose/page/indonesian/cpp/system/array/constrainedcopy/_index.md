---
title: "System::Array::ConstrainedCopy metode"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page untuk C++"
description: "System::Array::ConstrainedCopy metode. Menyalin rentang elemen dari sebuah System.Array yang dimulai pada sumber yang ditentukan dalam C++."
type: docs
weight: 4700
url: /id/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Menyalin rentang elemen dari sebuah [System.Array](../) yang dimulai pada sumber yang ditentukan.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Deskripsi |
| --- | --- |
| SrcType | Tipe elemen dalam array sumber |
| DstType | Tipe elemen dalam array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array sumber |
| srcIndex | int64_t | Indeks dalam array sumber yang menunjukkan awal rentang item yang akan disalin |
| dstArray | const ArrayPtr\<DstType\>\& | Array tujuan |
| dstIndex | int64_t | Indeks dalam array tujuan untuk memulai penyisipan item yang disalin |
| count | int64_t | Jumlah elemen yang akan disalin |
## Catatan


IMPLEMENTASI RAW SEMENTARA TANPA PERBAIKAN APAPUN!
## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
