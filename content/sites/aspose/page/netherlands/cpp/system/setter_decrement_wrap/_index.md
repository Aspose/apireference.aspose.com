---
title: "System::setter_decrement_wrap method"
linktitle: "setter_decrement_wrap"
second_title: "Aspose.Page voor C++"
description: "System::setter_decrement_wrap method. De vertaler vertaalt C#''s pre-decrement expressies die gericht zijn op de eigenschap van een instantie die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie (overload voor const getter) in C++."
type: docs
weight: 37100
url: /nl/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


De vertaler vertaalt C#'s pre-decrement expressies die gericht zijn op de eigenschap van een instantie die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie (overload voor const getter).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de eigenschap. |
| Host | - klasse van instantie die moet worden gewijzigd |
| HostConstGet | - Host zelf, of het basistype, waar de getter van de eigenschap is gedefinieerd |
| HostSet | - Host zelf, of het basistype, waar de setter van de eigenschap is gedefinieerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| host | Host *const | Instantie waarvoor getters en setters worden aangeroepen. |
| pGetter | T(HostConstGet::*)() const | Functie‑pointer die naar de getter‑functie van de eigenschap wijst |
| pSetter | void(HostSet::*)(T) | Functie‑pointer die naar de setter‑functie van de eigenschap wijst |

### ReturnValue

De waarde van de eigenschap vóór het verhogen

## Zie ook

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


De vertaler vertaalt C#'s pre-decrement expressies die gericht zijn op de eigenschap van een instantie die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie (overload voor non-const getter).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de eigenschap. |
| Host | - klasse van instantie die moet worden gewijzigd |
| HostGet | - Host zelf, of het basistype, waar de getter van de eigenschap is gedefinieerd |
| HostSet | - Host zelf, of het basistype, waar de setter van de eigenschap is gedefinieerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| host | Host *const | Instantie waarvoor getters en setters worden aangeroepen. |
| pGetter | T(HostGet::*)() | Functie‑pointer die naar de getter‑functie van de eigenschap wijst |
| pSetter | void(HostSet::*)(T) | Functie‑pointer die naar de setter‑functie van de eigenschap wijst |

### ReturnValue

De waarde van de eigenschap vóór het verhogen

## Zie ook

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


De vertaler vertaalt C#'s pre-decrement expressies die gericht zijn op de eigenschap van een klasse die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie.

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de eigenschap |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pGetter | T(*)() | Functie‑pointer die naar de vrije getter‑functie van de eigenschap wijst |
| pSetter | void(*)(T) | Functie‑pointer die naar de vrije setter‑functie van de eigenschap wijst |

### ReturnValue

De waarde van de eigenschap vóór het verhogen

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
