---
title: "System::Nullable::operator+= Methode"
linktitle: "operator+="
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator+= Methode. Wendet operator+=() auf den vom aktuellen Objekt dargestellten Wert an und verwendet den vom angegebenen Nullable-Objekt dargestellten Wert als Rechtsargument in C++."
type: docs
weight: 1300
url: /de/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


Wendet [operator+=()](./) auf den durch das aktuelle Objekt repräsentierten Wert an und verwendet den durch das angegebene [Nullable](../)-Objekt repräsentierten Wert als Rechtsargument.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ eines [Nullable](../)-Objekts, dessen dargestellter Wert als Rechtsargument von [operator+=()](./) verwendet wird. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf ein [Nullable](../)-Objekt, dessen dargestellter Wert als Rechtsargument des [operator+=()](./) verwendet wird, das auf den durch das aktuelle Objekt dargestellten Wert angewendet wird. |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(const T1\&) method


Wendet [operator+=()](./) auf den durch das aktuelle Objekt dargestellten Wert an und verwendet den angegebenen Wert als Rechtsargument.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des als Rechtswert von [operator+=()](./) verwendeten Wertes. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const T1\& | Eine konstante Referenz auf den Wert, der als Rechtswert des [operator+=()](./) verwendet wird, das auf den durch das aktuelle Objekt dargestellten Wert angewendet wird. |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


Setzt das aktuelle Objekt zurück, sodass es einen Nullwert darstellt.

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

Eine Kopie des Objekts selbst.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
