---
title: "System::Nullable::operator- method"
linktitle: "operator-"
second_title: "Aspose.Font per C++"
description: "System::Nullable::operator- method. Sottrae valori nullable in C++."
type: docs
weight: 1400
url: /it/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Sottrae valori nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo dell'operando destro. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const Nullable\<T1\>\& | valore da sottrarre. |

### ReturnValue

Risultato della sottrazione.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(const T1\&) const method


Sottrae valori nullable e non-nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo dell'operando destro. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| altro | const T1\& | valore da sottrarre. |

### ReturnValue

Risultato della sottrazione.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(T1) const method


Sottrae valori nullable e valori puntati a null.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo dell'operando destro, dovrebbe essere nullptr_t. |

### ReturnValue

Oggetto [Nullable](../) vuoto.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
