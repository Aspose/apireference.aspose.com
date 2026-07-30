---
title: "System::Nullable::operator+ method"
linktitle: "operator+"
second_title: "Aspose.Font per C++"
description: "System::Nullable::operator+ method. Somma valori nullable in C++."
type: docs
weight: 1200
url: /it/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Somma valori nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo dell'operando destro. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const Nullable\<T1\>\& | valore da aggiungere. |

### ReturnValue

Risultato della somma.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(const T1\&) const method


Somma valori nullable e non-nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo dell'operando destro. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | valore da aggiungere. |

### ReturnValue

Risultato della somma.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Restituisce un'istanza costruita di default della classe Nullable<T>.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
