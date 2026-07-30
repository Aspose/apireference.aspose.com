---
title: "System::SmartPtr::operator[] metodu"
linktitle: "operator[]"
second_title: "Aspose.Font için C++"
description: "System::SmartPtr::operator[] metodu. Dizi elemanlarına erişim sağlayıcı. Sadece SmartPtr_ C++'ta System::Array'in bir özelleştirmesi ise derlenir."
type: docs
weight: 3000
url: /tr/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Dizi elemanlarına erişim sağlayıcı. Sadece [SmartPtr_](../smartptr_/) [System::Array](../../array/) özelleştirmesi ise derlenir.

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parametre | Açıklama |
| --- | --- |
| IdxType | İndeks tipi (tam sayı varsayılır). |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| idx | IdxType | Dizideki indeks. |

### ReturnValue

[Array](../../array/) value at idx position.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
