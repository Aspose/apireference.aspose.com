---
title: "System::Nullable::operator- Methode"
linktitle: "operator-"
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator- Methode. Subtrahiert nullable Werte in C++."
type: docs
weight: 1400
url: /de/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Subtrahiert nullable Werte.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des rechten Operanden. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const Nullable\<T1\>\& | Wert zum Subtrahieren. |

### ReturnValue

Subtraktionsergebnis.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(const T1\&) const method


Subtrahiert nullable und nicht-nullable Werte.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des rechten Operanden. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Wert zum Subtrahieren. |

### ReturnValue

Subtraktionsergebnis.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(T1) const method


Subtrahiert nullable und null‑gezeigte Werte.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des rechten Operanden, sollte nullptr_t sein. |

### ReturnValue

Leeres [Nullable](../)-Objekt.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
