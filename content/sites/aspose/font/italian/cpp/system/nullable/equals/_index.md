---
title: "System::Nullable::Equals method"
linktitle: "Uguali"
second_title: "Aspose.Font per C++"
description: "System::Nullable::Equals method. Determina se il valore rappresentato dall'oggetto corrente è uguale al valore rappresentato dall'oggetto Nullable specificato in C++."
type: docs
weight: 200
url: /it/cpp/system/nullable/equals/
---
## Nullable::Equals method


Determina se il valore rappresentato dall'oggetto corrente è uguale al valore rappresentato dall'oggetto [Nullable](../) specificato.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante dell'oggetto [Nullable](../) con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const T1\& | Un riferimento costante all'oggetto [Nullable](../) con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è uguale al valore rappresentato dall'oggetto [Nullable](../) specificato, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
