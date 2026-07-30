---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "Aspose.Font per C++"
description: "System::Nullable::operator< method. Determina se il valore rappresentato dall'oggetto corrente è inferiore al valore rappresentato dall'oggetto Nullable specificato applicando operator<() a questi valori in C++."
type: docs
weight: 1600
url: /it/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Determina se il valore rappresentato dall'oggetto corrente è inferiore al valore rappresentato dall'oggetto [Nullable](../) specificato applicando [operator<()](./) a questi valori.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante dell'oggetto [Nullable](../) con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Un riferimento costante all'oggetto [Nullable](../) con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è inferiore al valore rappresentato dall'oggetto [Nullable](../) specificato, altrimenti - falso

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(const T1\&) const method


Determina se il valore rappresentato dall'oggetto corrente è inferiore al valore specificato applicando [operator<()](./) a questi valori.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | Un riferimento costante al valore con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è inferiore al valore specificato, altrimenti - falso.

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Restituisce sempre false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator> metodo
titoloLink: operator>
second_title: Aspose.Font for C++
description: 'System::Nullable::operator> metodo. Determina se il valore rappresentato dall'oggetto corrente è maggiore del valore rappresentato dall'oggetto Nullable specificato applicando operator>() a questi valori in C++.'
type: docs
peso: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Determina se il valore rappresentato dall'oggetto corrente è maggiore del valore rappresentato dall'oggetto [Nullable](../) specificato applicando [operator>()](./) a questi valori.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante dell'oggetto [Nullable](../) con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Un riferimento costante all'oggetto [Nullable](../) con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è maggiore del valore rappresentato dall'oggetto [Nullable](../) specificato, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(const T1\&) const method


Determina se il valore rappresentato dall'oggetto corrente è maggiore del valore specificato applicando [operator>()](./) a questi valori.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | Un riferimento costante al valore con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è maggiore del valore specificato, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Restituisce sempre false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
