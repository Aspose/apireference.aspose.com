---
title: "System::Build methode"
linktitle: "Build"
second_title: "Aspose.Page voor C++"
description: "System::Build methode. Maak een object met directe eigendom in C++."
type: docs
weight: 15000
url: /nl/cpp/system/build/
---
## System::Build method


Maak een object met directe eigendom.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type object om te bouwen |
| Argumenten | Argumenttypen voor objectconstructie |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| args | Args\&&... | Argumenten om door te geven aan de objectconstructor |

### ReturnValue

ObjectBuilder geconfigureerd voor directe objectconstructie
## Opmerkingen



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
