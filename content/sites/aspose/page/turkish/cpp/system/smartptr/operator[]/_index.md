---
title: "System::SmartPtr::operator[] yöntemi"
linktitle: "operator[]"
second_title: "Aspose.Page için C++"
description: "System::SmartPtr::operator[] yöntemi. Dizi elemanlarına erişim sağlayıcı. Yalnızca SmartPtr_ C++'ta System::Array'nin bir özelleştirmesi ise derlenir."
type: docs
weight: 3000
url: /tr/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Dizi elemanlarına erişim sağlayıcı. Yalnızca [SmartPtr_](../smartptr_/) [System::Array](../../array/) özelleştirmesi ise derlenir.

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parameter | Açıklama |
| --- | --- |
| IdxType | Dizin tipi (tam sayı varsayılır). |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| idx | IdxType | Dizideki indeks. |

### ReturnValue

[Array](../../array/) value at idx position.

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
