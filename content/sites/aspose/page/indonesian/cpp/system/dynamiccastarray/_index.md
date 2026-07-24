---
title: "metode System::DynamicCastArray"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page untuk C++"
description: "metode System::DynamicCastArray. Melakukan casting elemen array yang ditentukan ke tipe yang berbeda dalam C++."
type: docs
weight: 17900
url: /id/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Melakukan casting elemen array yang ditentukan ke tipe yang berbeda.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Parameter | Deskripsi |
| --- | --- |
| Ke | Tipe yang akan menjadi target casting elemen array yang ditentukan |
| From | Tipe elemen dari array yang elemennya akan di-cast |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dari | const SharedPtr\<Array\<From\>\>\& | Shared pointer ke array yang berisi elemen-elemen yang akan di-cast |

### ReturnValue

Pointer ke array baru yang berisi elemen dengan tipe **To** yang setara dengan elemen **from**

## Deprecated
Ditambahkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
