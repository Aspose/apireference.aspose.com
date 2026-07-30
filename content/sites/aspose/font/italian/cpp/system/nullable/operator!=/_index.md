---
title: "System::Nullable::operator!= metodo"
linktitle: "operator!="
second_title: "Aspose.Font per C++"
description: "System::Nullable::operator!= metodo. Determina se il valore rappresentato dall'oggetto corrente non è uguale al valore rappresentato dall'oggetto Nullable specificato in C++."
type: docs
weight: 1000
url: /it/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


Determina se il valore rappresentato dall'oggetto corrente non è uguale al valore rappresentato dall'oggetto [Nullable](../) specificato.

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante dell'oggetto [Nullable](../) con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Un riferimento costante all'oggetto [Nullable](../) con cui confrontare |

### ReturnValue

True se il valore rappresentato dall'oggetto corrente non è uguale al valore rappresentato dall'oggetto [Nullable](../) specificato, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator!=(const T1\&) const method


Determina se il valore rappresentato dall'oggetto corrente non è uguale al valore specificato.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | Un riferimento costante al valore con cui confrontare |

### ReturnValue

True se il valore rappresentato dall'oggetto corrente non è uguale al valore specificato, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


Determina se il valore rappresentato dall'oggetto corrente non è null.

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

True se il valore rappresentato dall'oggetto corrente non è null, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
