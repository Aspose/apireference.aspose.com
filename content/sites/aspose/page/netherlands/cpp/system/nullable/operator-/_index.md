---
title: "System::Nullable::operator- methode"
linktitle: "operator-"
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator- methode. Trekt nullable‑waarden af in C++."
type: docs
weight: 1400
url: /nl/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Trekt nullable waarden af.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van de rechter operand. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const Nullable\<T1\>\& | waarde om af te trekken. |

### ReturnValue

Resultaat van de aftrekking.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


Trekt nullable en niet-nullable waarden af.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van de rechter operand. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | waarde om af te trekken. |

### ReturnValue

Resultaat van de aftrekking.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


Trekt nullable en null-gerichte waarden af.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van de rechter operand, moet nullptr_t zijn. |

### ReturnValue

Leeg [Nullable](../) object.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
