---
title: "System::SmartPtr::operator[] Methode"
linktitle: "operator[]"
second_title: "Aspose.Font für C++"
description: "System::SmartPtr::operator[] Methode. Zugriff auf Array‑Elemente. Kompiliert nur, wenn SmartPtr_ eine Spezialisierung von System::Array in C++ ist."
type: docs
weight: 3000
url: /de/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Zugriff auf Array‑Elemente. Kompiliert nur, wenn [SmartPtr_](../smartptr_/) eine Spezialisierung von [System::Array](../../array/) ist.

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parameter | Beschreibung |
| --- | --- |
| IdxType | Typ des Index (angenommen ganzzahlig). |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| idx | IdxType | Index im Array. |

### ReturnValue

[Array](../../array/) value at idx position.

## Siehe auch

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
