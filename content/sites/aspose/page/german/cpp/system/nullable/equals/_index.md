---
title: "System::Nullable::Equals Methode"
linktitle: "Gleich"
second_title: "Aspose.Page für C++"
description: "System::Nullable::Equals Methode. Bestimmt, ob der vom aktuellen Objekt dargestellte Wert dem vom angegebenen Nullable-Objekt dargestellten Wert in C++ entspricht."
type: docs
weight: 200
url: /de/cpp/system/nullable/equals/
---
## Nullable::Equals method


Bestimmt, ob der vom aktuellen Objekt dargestellte Wert gleich dem vom angegebenen [Nullable](../)-Objekt ist.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des [Nullable](../)-Objekts, mit dem verglichen werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const T1\& | Eine konstante Referenz auf das [Nullable](../)-Objekt, mit dem verglichen wird. |

### ReturnValue

True wenn der vom aktuellen Objekt dargestellte Wert gleich dem vom angegebenen [Nullable](../)-Objekt ist, andernfalls - false

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
