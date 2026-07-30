---
title: "System::Nullable::operator== Methode"
linktitle: "operator=="
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator== method. Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert gleich dem von dem angegebenen Nullable-Objekt dargestellten Wert in C++ ist."
type: docs
weight: 1900
url: /de/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert gleich dem von dem angegebenen [Nullable](../)-Objekt dargestellten Wert ist.

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der zugrunde liegende Typ des [Nullable](../) Objekts, mit dem verglichen werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Eine konstante Referenz auf das [Nullable](../) Objekt, mit dem verglichen wird |

### ReturnValue

Wahr, wenn der von dem aktuellen Objekt dargestellte Wert gleich dem von dem angegebenen [Nullable](../)-Objekt dargestellten Wert ist, andernfalls - falsch

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(const T1\&) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert dem angegebenen Wert entspricht.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des zu vergleichenden Wertes |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Eine konstante Referenz auf den zu vergleichenden Wert |

### ReturnValue

Wahr, wenn der von dem aktuellen Objekt dargestellte Wert gleich dem angegebenen Wert ist, andernfalls - falsch

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert null ist.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

Wahr, wenn der von dem aktuellen Objekt dargestellte Wert null ist, andernfalls - falsch

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
