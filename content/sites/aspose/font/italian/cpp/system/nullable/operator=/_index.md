---
title: "System::Nullable::operator= metodo"
linktitle: "operator="
second_title: "Aspose.Font per C++"
description: "System::Nullable::operator= metodo. Sostituisce il valore attualmente rappresentato dall'oggetto con quello specificato in C++."
type: docs
weight: 1800
url: /it/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Sostituisce il valore attualmente rappresentato dall'oggetto con quello specificato.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parametro | Descrizione |
| --- | --- |
| Il | tipo del nuovo valore da rappresentare nell'oggetto corrente |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | Il nuovo valore da rappresentare nell'oggetto corrente |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


Sostituisce il valore attualmente rappresentato dall'oggetto con quello specificato.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parametro | Descrizione |
| --- | --- |
| Il | tipo del nuovo valore da rappresentare nell'oggetto corrente |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const T1\& | Il nuovo valore da rappresentare nell'oggetto corrente |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Assegna un null all'oggetto corrente.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Un oggetto [Nullable](../) che rappresenta un valore null.

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
