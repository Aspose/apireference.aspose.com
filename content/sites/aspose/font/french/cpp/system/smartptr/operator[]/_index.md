---
title: "System::SmartPtr::operator[] méthode"
linktitle: "operator[]"
second_title: "Aspose.Font pour C++"
description: "System::SmartPtr::operator[] méthode. Accesseur des éléments du tableau. Ne compile que si SmartPtr_ est une spécialisation de System::Array en C++."
type: docs
weight: 3000
url: /fr/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Accesseur des éléments du tableau. Ne compile que si [SmartPtr_](../smartptr_/) est une spécialisation de [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Paramètre | Description |
| --- | --- |
| IdxType | Type d'index (supposé entier). |

| Paramètre | Type | Description |
| --- | --- | --- |
| idx | IdxType | Index dans le tableau. |

### ReturnValue

[Array](../../array/) value at idx position.

## Voir aussi

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
