---
title: "System::setter_wrap-Methode"
linktitle: "setter_wrap"
second_title: "Aspose.Font für C++"
description: "System::setter_wrap-Methode. Überladung für Instanz-Setter-Funktionen mit Typkonvertierung in C++."
type: docs
weight: 38300
url: /de/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Überladung für Instanz-Setter-Funktionen mit Typkonvertierung.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp. |
| T2 | Typ, der von der Setter-Funktion erwartet wird. |
| Host | Instanztyp. |
| HostSet | - Der Host selbst oder sein Basistyp, in dem der Setter der Eigenschaft definiert ist. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| host | Host *const | [Object](../object/) zum Aufrufen der Setter-Funktion für. |
| pSetter | void(HostSet::*)(T2) | Referenz auf Setter-Funktion. |
| Wert | T | Wert zum Setzen. |

### ReturnValue

Wert setzen.

## Siehe auch

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Überladung für statische Setter-Funktionen mit Typkonvertierung.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Werttyp. |
| T2 | Typ, der von der Setter-Funktion erwartet wird. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pSetter | void(*)(T2) | Referenz auf statische Setter-Funktion. |
| Wert | T | Wert zum Setzen. |

### ReturnValue

Wert setzen.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
