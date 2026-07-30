---
title: "System::Nullable::operator-= Methode"
linktitle: "operator-="
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator-= Methode. Wendet operator-=() auf den vom aktuellen Objekt dargestellten Wert an, wobei der Wert des angegebenen Nullable-Objekts als Rechtsargument in C++ verwendet wird."
type: docs
weight: 1500
url: /de/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Wendet [operator-=()](./) auf den vom aktuellen Objekt dargestellten Wert an, wobei der Wert des angegebenen [Nullable](../)-Objekts als Rechtsargument verwendet wird.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ eines [Nullable](../)-Objekts, dessen dargestellter Wert als Rechtsargument von [operator-=()](./) verwendet wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf ein [Nullable](../)-Objekt, dessen dargestellter Wert als Rechtsargument des [operator-=()](./) verwendet wird, das auf den vom aktuellen Objekt dargestellten Wert angewendet wird. |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(const T1\&) method


Wendet [operator-=()](./) auf den vom aktuellen Objekt dargestellten Wert an, wobei der angegebene Wert als Rechtsargument verwendet wird.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des Werts, der als Rechtswert von [operator-=()](./) verwendet wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const T1\& | Eine konstante Referenz auf den Wert, der als Rechtswert des [operator-=()](./) verwendet wird, das auf den vom aktuellen Objekt dargestellten Wert angewendet wird. |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(T1) method


Gibt eine Instanz der [Nullable](../)-Klasse zurück, die einen Nullwert darstellt.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
