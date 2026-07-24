---
title: "System::SmartPtr::operator[] μέθοδος"
linktitle: "operator[]"
second_title: "Aspose.Page για C++"
description: "System::SmartPtr::operator[] μέθοδος. Πρόσβαση στα στοιχεία του πίνακα. Συγκεντρώνεται μόνο εάν το SmartPtr_ είναι εξειδίκευση του System::Array σε C++."
type: docs
weight: 3000
url: /el/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Πρόσβαση στα στοιχεία του πίνακα. Συγκεντρώνεται μόνο εάν το [SmartPtr_](../smartptr_/) είναι εξειδίκευση του [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parameter | Περιγραφή |
| --- | --- |
| IdxType | Τύπος δείκτη (υποτίθεται ακέραιος). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| idx | IdxType | Δείκτης στον πίνακα. |

### ReturnValue

[Array](../../array/) value at idx position.

## Δείτε επίσης

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
