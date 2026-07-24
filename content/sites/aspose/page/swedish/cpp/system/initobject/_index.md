---
title: "System::InitObject-metod"
linktitle: "InitieraObjekt"
second_title: "Aspose.Page för C++"
description: "System::InitObject-metod. Påbörjar initiering av ett objekt med delat ägande i C++."
type: docs
weight: 21800
url: /sv/cpp/system/initobject/
---
## System::InitObject method


Påbörjar initiering av ett objekt med delat ägande.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ av objekt att initiera |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) att initiera |

### ReturnValue

ObjectBuilder konfigurerad för konstruktion av delad pekare
## Anmärkningar



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
