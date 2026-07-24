---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "Aspose.Page für C++"
description: "System::Nullable::operator< method. Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert kleiner ist als der von dem angegebenen Nullable-Objekt, indem operator<() auf diese Werte in C++ angewendet wird."
type: docs
weight: 1600
url: /de/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert kleiner ist als der von dem angegebenen [Nullable](../)-Objekt, indem [operator<()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des [Nullable](../)-Objekts, mit dem verglichen werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf das [Nullable](../)-Objekt, mit dem verglichen wird. |

### ReturnValue

Wahr, wenn der von dem aktuellen Objekt dargestellte Wert kleiner ist als der von dem angegebenen [Nullable](../)-Objekt, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert kleiner ist als der angegebene Wert, indem [operator<()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des zu vergleichenden Wertes. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Eine konstante Referenz auf den zu vergleichenden Wert. |

### ReturnValue

Wahr, wenn der von dem aktuellen Objekt dargestellte Wert kleiner ist als der angegebene Wert, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Gibt immer false zurück.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
Titel: System::Nullable::operator> method
linktitle: operator>
second_title: Aspose.Page für C++
Beschreibung: 'System::Nullable::operator> method. Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer ist als der von dem angegebenen Nullable-Objekt, indem operator>() auf diese Werte in C++ angewendet wird.'
type: docs
Gewicht: 2000
URL: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer ist als der von dem angegebenen [Nullable](../)-Objekt, indem [operator>()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des [Nullable](../)-Objekts, mit dem verglichen werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf das [Nullable](../)-Objekt, mit dem verglichen wird. |

### ReturnValue

Wahr, wenn der von dem aktuellen Objekt dargestellte Wert größer ist als das angegebene [Nullable](../)-Objekt, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer ist als der angegebene Wert, indem [operator>()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des zu vergleichenden Wertes. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Eine konstante Referenz auf den zu vergleichenden Wert. |

### ReturnValue

True wenn der vom aktuellen Objekt dargestellte Wert größer als der angegebene Wert ist, andernfalls - false

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Gibt immer false zurück.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
