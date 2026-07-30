---
title: "System::Nullable::operator= Methode"
linktitle: "operator="
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator= Methode. Ersetzt den derzeit vom Objekt dargestellten Wert durch den angegebenen in C++."
type: docs
weight: 1800
url: /de/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Ersetzt den vom Objekt derzeit dargestellten Wert durch den angegebenen.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parameter | Beschreibung |
| --- | --- |
| Der | Typ des neuen Wertes, der vom aktuellen Objekt dargestellt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | Der neue Wert, der vom aktuellen Objekt dargestellt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


Ersetzt den vom Objekt derzeit dargestellten Wert durch den angegebenen.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parameter | Beschreibung |
| --- | --- |
| Der | Typ des neuen Wertes, der vom aktuellen Objekt dargestellt werden soll |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const T1\& | Der neue Wert, der vom aktuellen Objekt dargestellt werden soll |

### ReturnValue

Eine Referenz auf das aktuelle Objekt

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Weist dem aktuellen Objekt einen Nullwert zu.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Ein [Nullable](../) Objekt, das einen Nullwert darstellt.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
