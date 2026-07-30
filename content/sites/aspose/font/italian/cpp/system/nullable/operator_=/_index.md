---
title: "System::Nullable::operator<= metodo"
linktitle: "operator<="
second_title: "Aspose.Font per C++"
description: "System::Nullable::operator<= metodo. Determina se il valore rappresentato dall'oggetto corrente è minore o uguale al valore rappresentato dall'oggetto Nullable specificato applicando operator<=() a questi valori in C++."
type: docs
weight: 1700
url: /it/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Determina se il valore rappresentato dall'oggetto corrente è minore o uguale al valore rappresentato dall'oggetto [Nullable](../) specificato applicando [operator<=()](./) a questi valori.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante dell'oggetto [Nullable](../) con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Un riferimento costante all'oggetto [Nullable](../) con cui confrontare |

### ReturnValue

True se il valore rappresentato dall'oggetto corrente è minore o uguale al valore rappresentato dall'oggetto [Nullable](../) specificato, altrimenti - false

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Determina se il valore rappresentato dall'oggetto corrente è minore o uguale al valore specificato applicando [operator<=()](./) a questi valori.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | Un riferimento costante al valore con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è minore o uguale al valore specificato, altrimenti - falso

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Restituisce sempre false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
titolo: System::Nullable::operator>= metodo
linktitle: operator>=
second_title: Aspose.Font for C++
description: 'System::Nullable::operator>= metodo. Determina se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto Nullable specificato applicando operator>=() a questi valori in C++.'
type: docs
peso: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Determina se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto [Nullable](../) specificato applicando [operator>=()](./) a questi valori.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante dell'oggetto [Nullable](../) con cui confrontare |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Un riferimento costante all'oggetto [Nullable](../) con cui confrontare |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto [Nullable](../) specificato, altrimenti - falso

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Determina se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto specificato applicando [operator>=()](./) a questi valori.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo di base del valore con cui confrontare il valore rappresentato dall'oggetto corrente |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | Un riferimento costante a un oggetto con cui confrontare l'oggetto corrente |

### ReturnValue

Vero se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto specificato, altrimenti - falso

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Restituisce sempre false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Sempre - falso

## Vedi anche

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
titolo: System::Nullable::operator|= metodo
titolo collegamento: operator|=
second_title: Aspose.Font for C++
description: 'System::Nullable::operator|= metodo. Applica operator|=() al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra in C++.'
type: docs
peso: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Applica [operator|=()](./) al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il parametro template per far funzionare SFINAE. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | bool | Un valore booleano che è usato come valore a destra dell'[operator | =()](./) applicato al valore rappresentato dall'oggetto corrente. |

### ReturnValue

Un riferimento a se stesso.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
