---
title: "System::Ref methode"
linktitle: "Ref"
second_title: "Aspose.Page voor C++"
description: "System::Ref methode. Wrapper om ervoor te zorgen dat Ref(std::ref(DynamicWeakPtr)) werkt in C++."
type: docs
weight: 36600
url: /nl/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Wrapper om ervoor te zorgen dat Ref(std::ref(DynamicWeakPtr)) werkt.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Gerefereerd type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| omslag | const std::reference_wrapper\<T\>\& | std-omslag om uit te pakken. |

### ReturnValue

Referentietype gedefinieerd in [System](../):: in plaats van in std.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Maakt een referentie naar een [DynamicWeakPtr](../dynamicweakptr/) object. Gebruikt door de vertaler bij het doorgeven van functie‑argumenten per referentie.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Pointee-type. |
| trunkMode | Modus van de slimme pointer zelf. |
| weakLeafs | Indexen van sjabloon‑argumenten waarvoor de SetTemplateWeakPtr‑methode moet worden aangeroepen. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Slimme pointer om een referentie naar te maken. |

### ReturnValue

Smart pointer-referentie.

## Zie ook

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


Helperfunctie om referenties naar objecten te verkrijgen. Gebruikt om te garanderen dat [System::DynamicWeakPtr](../dynamicweakptr/) het gerefereerde object bijwerkt na toewijzingen.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type om een referentie naar te maken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | T\& | Waarde om een referentie naar te maken. |

### ReturnValue

Referentie naar de waarde die aan deze functie is doorgegeven.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
