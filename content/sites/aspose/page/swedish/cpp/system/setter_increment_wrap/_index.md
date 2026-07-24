---
title: "System::setter_increment_wrap metod"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page för C++"
description: "System::setter_increment_wrap metod. Översättaren översätter C#''s inkrementuttryck som riktar sig mot class'' egenskap som har setter och getter definierade, till anrop av denna funktion i C++."
type: docs
weight: 37400
url: /sv/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Översättaren översätter C#'s inkrementuttryck som riktar sig mot class' egenskap som har setter och getter definierade, till anrop av denna funktion.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av egenskapen |
| Host | - klass för instansen som ska modifieras |
| HostGet | - Host själv, eller dess basklass, där egenskapens getter är definierad |
| HostSet | - Host själv, eller dess basklass, där egenskapens setter är definierad |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| host | Host *const | En pekare till ett objekt vars egenskap ska inkrementeras |
| pGetter | T(HostGet::*)() | Funktionspekare som pekar på egenskapens getter‑metod |
| pSetter | void(HostSet::*)(T) | Funktionspekare som pekar på egenskapens setter‑metod |

### ReturnValue

Det inkrementerade värdet av egenskapen

## Se även

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Översättaren översätter C#'s inkrementuttryck som riktar sig mot class' egenskap som har setter och getter definierade, till anrop av denna funktion.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av egenskapen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| pGetter | T(*)() | Funktionspekare som pekar på egenskapens getter-fri funktion |
| pSetter | void(*)(T) | Funktionspekare som pekar på egenskapens setter-fri funktion |

### ReturnValue

Det inkrementerade värdet av egenskapen

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
