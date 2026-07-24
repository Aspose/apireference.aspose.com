---
title: "System::InitObject methode"
linktitle: "InitialiseerObject"
second_title: "Aspose.Page voor C++"
description: "System::InitObject methode. Start de initialisatie van een object met gedeelde eigendom in C++."
type: docs
weight: 21800
url: /nl/cpp/system/initobject/
---
## System::InitObject method


Start de initialisatie van een object met gedeeld eigendom.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van het te initialiseren object |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) om te initialiseren |

### ReturnValue

ObjectBuilder geconfigureerd voor constructie van gedeelde pointers
## Opmerkingen



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
