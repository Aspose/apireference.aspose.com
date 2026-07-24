---
title: "System::setter_wrap metod"
linktitle: "setter_wrap"
second_title: "Aspose.Page för C++"
description: "System::setter_wrap metod. Överlagring för instans‑setter‑funktioner med typkonvertering i C++."
type: docs
weight: 38200
url: /sv/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Överlagring för instans‑setter‑funktioner med typkonvertering.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Värdetyp. |
| T2 | Typ som förväntas av setter‑funktionen. |
| Host | Instanstyp. |
| HostSet | - Host själv, eller dess basklass, där egenskapens setter är definierad. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| host | Host *const | [Object](../object/) för att anropa setter-funktionen för. |
| pSetter | void(HostSet::*)(T2) | Referens till setter-funktion. |
| value | T | Värde att sätta. |

### ReturnValue

sätt värde.

## Se även

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Överlagring för statiska setter-funktioner med typkonvertering.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Värdetyp. |
| T2 | Typ som förväntas av setter‑funktionen. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| pSetter | void(*)(T2) | Referens till statisk setter-funktion. |
| value | T | Värde att sätta. |

### ReturnValue

sätt värde.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
