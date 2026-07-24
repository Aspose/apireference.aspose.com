---
title: "System::BuildObject metod"
linktitle: "BuildObject"
second_title: "Aspose.Page för C++"
description: "System::BuildObject metod. Bygg ett objekt med delat ägande i C++."
type: docs
weight: 15200
url: /sv/cpp/system/buildobject/
---
## System::BuildObject method


Bygg ett objekt med delat ägande.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ av objekt att bygga |
| Argument | Argumenttyper för objektkonstruktion |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | Args\&&... | Argument att vidarebefordra till objektkonstruktorn |

### ReturnValue

ObjectBuilder konfigurerad för konstruktion av delad pekare
## Anmärkningar



Skapar en [SharedPtr<T>](../sharedptr/) och returnerar en byggare för den
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
