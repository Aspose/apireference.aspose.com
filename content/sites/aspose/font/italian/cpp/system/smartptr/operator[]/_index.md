---
title: "System::SmartPtr::operator[] metodo"
linktitle: "operator[]"
second_title: "Aspose.Font per C++"
description: "System::SmartPtr::operator[] metodo. Accessore per gli elementi dell'array. Compila solo se SmartPtr_ è una specializzazione di System::Array in C++."
type: docs
weight: 3000
url: /it/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


Accessore per gli elementi dell'array. Compila solo se [SmartPtr_](../smartptr_/) è una specializzazione di [System::Array](../../array/).

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| Parametro | Descrizione |
| --- | --- |
| IdxType | Tipo di indice (presunto intero). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| idx | IdxType | Indice nell'array. |

### ReturnValue

[Array](../../array/) value at idx position.

## Vedi anche

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
