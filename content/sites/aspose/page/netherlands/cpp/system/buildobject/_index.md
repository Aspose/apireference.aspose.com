---
title: "System::BuildObject methode"
linktitle: "BuildObject"
second_title: "Aspose.Page voor C++"
description: "System::BuildObject methode. Bouw een object met gedeeld eigendom in C++."
type: docs
weight: 15200
url: /nl/cpp/system/buildobject/
---
## System::BuildObject method


Bouw een object met gedeeld eigendom.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type object om te bouwen |
| Argumenten | Argumenttypen voor objectconstructie |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| args | Args\&&... | Argumenten om door te geven aan de objectconstructor |

### ReturnValue

ObjectBuilder geconfigureerd voor constructie van gedeelde pointers
## Opmerkingen



Creëert een [SharedPtr<T>](../sharedptr/) en retourneert een builder ervoor
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
