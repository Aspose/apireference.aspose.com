---
title: "Metodo System::Nullable::operator-="
linktitle: "operator-="
second_title: "Aspose.Font per C++"
description: "Metodo System::Nullable::operator-=. Applica operator-=() al valore rappresentato dall'oggetto corrente usando il valore rappresentato dall'oggetto Nullable specificato come argomento a destra in C++."
type: docs
weight: 1500
url: /it/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Applica [operator-=()](./) al valore rappresentato dall'oggetto corrente usando il valore rappresentato dall'oggetto [Nullable](../) specificato come argomento a destra.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo sottostante di un oggetto [Nullable](../) il cui valore rappresentato è usato come argomento a destra di [operator-=()](./) |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Un riferimento costante a un oggetto [Nullable](../) il cui valore rappresentato è usato come argomento a destra del [operator-=()](./) applicato al valore rappresentato dall'oggetto corrente. |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(const T1\&) method


Applica [operator-=()](./) al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore usato come valore a destra di [operator-=()](./) |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| other | const T1\& | Un riferimento costante al valore che è usato come valore a destra del [operator-=()](./) applicato al valore rappresentato dall'oggetto corrente. |

### ReturnValue

Un riferimento a se stesso

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(T1) method


Restituisce un'istanza della classe [Nullable](../) che rappresenta un valore nullo.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Vedi anche

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
