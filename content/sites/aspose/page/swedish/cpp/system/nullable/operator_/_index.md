---
title: "System::Nullable::operator< metod"
linktitle: "operator<"
second_title: "Aspose.Page för C++"
description: "System::Nullable::operator< metod. Bestämmer om värdet som representeras av det aktuella objektet är mindre än värdet som representeras av det angivna Nullable‑objektet genom att tillämpa operator<() på dessa värden i C++."
type: docs
weight: 1600
url: /sv/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Bestämmer om värdet som representeras av det aktuella objektet är mindre än värdet som representeras av det angivna [Nullable](../)‑objektet genom att tillämpa [operator<()](./) på dessa värden.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Den underliggande typen av [Nullable](../)-objektet att jämföra med |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | En konstant referens till [Nullable](../)-objektet att jämföra med |

### ReturnValue

Sant om värdet som representeras av det aktuella objektet är mindre än värdet som representeras av det angivna [Nullable](../)‑objektet, annars - falskt

## Se även

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Bestämmer om värdet som representeras av det aktuella objektet är mindre än det angivna värdet genom att tillämpa [operator<()](./) på dessa värden.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Typen av värdet att jämföra med |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| annat | const T1\& | En konstant referens till värdet att jämföra med |

### ReturnValue

Sant om värdet som representeras av det aktuella objektet är mindre än det angivna värdet, annars - falskt

## Se även

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Returnerar alltid falskt.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Se även

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator> metod
länktitel: operator>
andra_titel: Aspose.Page för C++
description: 'System::Nullable::operator> metod. Bestämmer om värdet som representeras av det aktuella objektet är större än värdet som representeras av det angivna Nullable‑objektet genom att tillämpa operator>() på dessa värden i C++.'
typ: docs
weight: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Bestämmer om värdet som representeras av det aktuella objektet är större än värdet som representeras av det angivna [Nullable](../)‑objektet genom att tillämpa [operator>()](./) på dessa värden.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Den underliggande typen av [Nullable](../)-objektet att jämföra med |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | En konstant referens till [Nullable](../)-objektet att jämföra med |

### ReturnValue

Sant om värdet som representeras av det aktuella objektet är större än värdet som representeras av det angivna [Nullable](../)‑objektet, annars - falskt

## Se även

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Bestämmer om värdet som representeras av det aktuella objektet är större än det angivna värdet genom att tillämpa [operator>()](./) på dessa värden.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Typen av värdet att jämföra med |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| annat | const T1\& | En konstant referens till värdet att jämföra med |

### ReturnValue

Sant om värdet som representeras av det aktuella objektet är större än det angivna värdet, annars - falskt

## Se även

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Returnerar alltid falskt.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Se även

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
