---
title: "System::setter_increment_wrap methode"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page voor C++"
description: "System::setter_increment_wrap methode. Vertaler vertaalt C#''s incrementeer‑expressies die zich richten op de eigenschap van een klasse die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie in C++."
type: docs
weight: 37400
url: /nl/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Vertaler vertaalt C#'s incrementeer‑expressies die zich richten op de eigenschap van een klasse die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de eigenschap |
| Host | - klasse van instantie die moet worden gewijzigd |
| HostGet | - Host zelf, of het basistype, waar de getter van de eigenschap is gedefinieerd |
| HostSet | - Host zelf, of het basistype, waar de setter van de eigenschap is gedefinieerd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| host | Host *const | Een pointer naar een object waarvan de eigenschap moet worden geïncrementeerd |
| pGetter | T(HostGet::*)() | Functie‑pointer die naar de getter‑methode van de eigenschap wijst |
| pSetter | void(HostSet::*)(T) | Functie‑pointer die naar de setter‑methode van de eigenschap wijst |

### ReturnValue

De geïncrementeerde waarde van de eigenschap

## Zie ook

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Vertaler vertaalt C#'s incrementeer‑expressies die zich richten op de eigenschap van een klasse die een setter en getter heeft gedefinieerd, naar een aanroep van deze functie.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de eigenschap |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pGetter | T(*)() | Functie‑pointer die naar de vrije getter‑functie van de eigenschap wijst |
| pSetter | void(*)(T) | Functie‑pointer die naar de vrije setter‑functie van de eigenschap wijst |

### ReturnValue

De geïncrementeerde waarde van de eigenschap

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
