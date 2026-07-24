---
title: "System::setter_wrap methode"
linktitle: "setter_wrap"
second_title: "Aspose.Page voor C++"
description: "System::setter_wrap methode. Overload voor instantie‑setterfuncties met typeconversie in C++."
type: docs
weight: 38200
url: /nl/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Overload voor instantie‑setterfuncties met typeconversie.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde‑type. |
| T2 | Type verwacht door setter‑functie. |
| Host | Instantietype. |
| HostSet | - Host zelf, of het basistype ervan, waar de setter van de eigenschap is gedefinieerd. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| host | Host *const | [Object](../object/) om setter‑functie voor aan te roepen. |
| pSetter | void(HostSet::*)(T2) | Referentie naar setter‑functie. |
| value | T | Waarde om in te stellen. |

### ReturnValue

waarde instellen.

## Zie ook

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Overload voor statische setterfuncties met typeconversie.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Waarde‑type. |
| T2 | Type verwacht door setter‑functie. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pSetter | void(*)(T2) | Referentie naar statische setter‑functie. |
| value | T | Waarde om in te stellen. |

### ReturnValue

waarde instellen.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
