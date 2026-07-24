---
title: "System::SmartPtr::operator[] metode"
linktitle: "operator[]"
second_title: "Aspose.Page untuk C++"
description: "System::SmartPtr::operator[] metode. Akses untuk elemen array. Hanya dapat dikompilasi jika SmartPtr_ adalah spesialisasi dari System::Array dalam C++."
type: docs
weight: 3000
url: /id/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Akses untuk elemen array. Hanya dapat dikompilasi jika [SmartPtr_](../smartptr_/) adalah spesialisasi dari [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parameter | Deskripsi |
| --- | --- |
| IdxType | Tipe indeks (diasumsikan integral). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| idx | IdxType | Indeks dalam array. |

### ReturnValue

[Array](../../array/) value at idx position.

## Lihat Juga

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
