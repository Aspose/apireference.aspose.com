---
title: "System::setter_post_increment_wrap‑metod"
linktitle: "setter_post_increment_wrap"
second_title: "Aspose.Page för C++"
description: "System::setter_post_increment_wrap‑metod. Översättaren översätter C#''s post‑inkrement‑uttryck som riktar sig mot en instans''s egenskap som har både setter och getter definierade, till ett anrop av denna funktion (överladdning för konstant getter) i C++."
type: docs
weight: 37900
url: /sv/cpp/system/setter_post_increment_wrap/
---
## System::setter_post_increment_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Översättaren översätter C#'s post‑inkrement‑uttryck som riktar sig mot en instans' egenskap som har både setter och getter definierade, till ett anrop av denna funktion (överladdning för konstant getter).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av egenskapen. |
| Host | - klass för instansen som ska modifieras |
| HostConstGet | - Host själv, eller dess basklass, där egenskapens getter är definierad |
| HostSet | - Host själv, eller dess basklass, där egenskapens setter är definierad |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| host | Host *const | Instans för att anropa getters och setters för. |
| pGetter | T(HostConstGet::*)() const | Funktionspekare som pekar på egenskapens getter‑funktion |
| pSetter | void(HostSet::*)(T) | Funktionspekare som pekar på egenskapens setter-funktion |

### ReturnValue

Värdet på egenskapen före inkrementering

## Se även

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Översättaren översätter C#-s postinkrementuttryck som riktar sig mot en instans egenskap som har setter och getter definierade, till anrop av denna funktion (överladdning för icke‑konstant getter).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av egenskapen. |
| Host | - klass för instansen som ska modifieras |
| HostGet | - Host själv, eller dess basklass, där egenskapens getter är definierad |
| HostSet | - Host själv, eller dess basklass, där egenskapens setter är definierad |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| host | Host *const | Instans för att anropa getters och setters för. |
| pGetter | T(HostGet::*)() | Funktionspekare som pekar på egenskapens getter‑funktion |
| pSetter | void(HostSet::*)(T) | Funktionspekare som pekar på egenskapens setter-funktion |

### ReturnValue

Värdet på egenskapen före inkrementering

## Se även

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_increment_wrap(T(*)(), void(*)(T)) method


Översättaren översätter C#-s postinkrementuttryck som riktar sig mot klassens egenskap som har setter och getter definierade, till anrop av denna funktion.

```cpp
template<typename T> T System::setter_post_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av egenskapen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| pGetter | T(*)() | Funktionspekare som pekar på egenskapens getter-fri funktion |
| pSetter | void(*)(T) | Funktionspekare som pekar på egenskapens setter-fri funktion |

### ReturnValue

Värdet på egenskapen före inkrementering

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
