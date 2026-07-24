---
title: "System::Nullable::Equals metod"
linktitle: "Lika"
second_title: "Aspose.Page för C++"
description: "System::Nullable::Equals metod. Avgör om värdet som representeras av det aktuella objektet är lika med värdet som representeras av det angivna Nullable-objektet i C++."
type: docs
weight: 200
url: /sv/cpp/system/nullable/equals/
---
## Nullable::Equals method


Avgör om värdet som representeras av det aktuella objektet är lika med värdet som representeras av det angivna [Nullable](../)-objektet.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Den underliggande typen av [Nullable](../)-objektet att jämföra med |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| other | const T1\& | En konstant referens till [Nullable](../)-objektet att jämföra med |

### ReturnValue

Sant om värdet som representeras av det aktuella objektet är lika med värdet som representeras av det angivna [Nullable](../)-objektet, annars - falskt

## Se även

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
