---
title: "System::SmartPtr::operator[] methode"
linktitle: "operator[]"
second_title: "Aspose.Page voor C++"
description: "System::SmartPtr::operator[] methode. Toegangsmethode voor array‑elementen. Compileert alleen als SmartPtr_ een specialisatie is van System::Array in C++."
type: docs
weight: 3000
url: /nl/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Toegangsmethode voor array‑elementen. Compileert alleen als [SmartPtr_](../smartptr_/) een specialisatie is van [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parameter | Beschrijving |
| --- | --- |
| IdxType | Type van index (aangenomen integraal). |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| idx | IdxType | Index in array. |

### ReturnValue

[Array](../../array/) value at idx position.

## Zie ook

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
