---
title: "System::Nullable::operator<= Methode"
linktitle: "operator<="
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator<= Methode. Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem vom angegebenen Nullable-Objekt ist, indem operator<=() auf diese Werte in C++ angewendet wird."
type: docs
weight: 1700
url: /de/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem vom angegebenen [Nullable](../) Objekt ist, indem [operator<=()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des [Nullable](../) Objekts, mit dem verglichen werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf das [Nullable](../) Objekt, mit dem verglichen wird |

### ReturnValue

Wahr, wenn der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem vom angegebenen [Nullable](../) Objekt ist, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem angegebenen Wert ist, indem [operator<=()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des zu vergleichenden Wertes |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Eine konstante Referenz auf den zu vergleichenden Wert |

### ReturnValue

Wahr, wenn der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem angegebenen Wert ist, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Gibt immer false zurück.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator>= Methode
linktitle: operator>=
second_title: Aspose.Font für C++
description: 'System::Nullable::operator>= Methode. Bestimmt, ob der vom aktuellen Objekt dargestellte Wert größer oder gleich dem Wert des angegebenen Nullable-Objekts ist, indem operator>=() auf diese Werte in C++ angewendet wird.'
type: docs
weight: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Bestimmt, ob der vom aktuellen Objekt dargestellte Wert größer oder gleich dem Wert des angegebenen [Nullable](../)-Objekts ist, indem [operator>=()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des [Nullable](../) Objekts, mit dem verglichen werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf das [Nullable](../) Objekt, mit dem verglichen wird |

### ReturnValue

Wahr, wenn der vom aktuellen Objekt dargestellte Wert größer oder gleich dem Wert des angegebenen [Nullable](../)-Objekts ist, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Bestimmt, ob der vom aktuellen Objekt dargestellte Wert größer oder gleich dem Wert des angegebenen Objekts ist, indem [operator>=()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des Werts, mit dem der vom aktuellen Objekt dargestellte Wert verglichen wird |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Eine konstante Referenz auf ein Objekt, mit dem das aktuelle Objekt verglichen wird |

### ReturnValue

Wahr, wenn der vom aktuellen Objekt dargestellte Wert größer oder gleich dem Wert des angegebenen Objekts ist, sonst - falsch

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Gibt immer false zurück.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Immer - falsch

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator|= Methode
linktitle: operator|=
second_title: Aspose.Font für C++
description: 'System::Nullable::operator|= Methode. Wendet operator|=() auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als Rechtsargument in C++.'
type: docs
weight: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Wendet [operator|=()](./) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als Rechtsargument.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Template-Parameter, um SFINAE zum Funktionieren zu bringen. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | bool | Ein boolescher Wert, der als Rechtswert des [operator | =()](./) angewendet auf den vom aktuellen Objekt dargestellten Wert. |

### ReturnValue

Eine Referenz auf das aktuelle Objekt.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
