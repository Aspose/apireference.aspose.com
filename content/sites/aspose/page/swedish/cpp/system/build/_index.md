---
title: "Metoden System::Build"
linktitle: "Build"
second_title: "Aspose.Page för C++"
description: "Metoden System::Build. Bygg ett objekt med direkt ägarskap i C++."
type: docs
weight: 15000
url: /sv/cpp/system/build/
---
## System::Build method


Bygg ett objekt med direkt ägarskap.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typ av objekt att bygga |
| Argument | Argumenttyper för objektkonstruktion |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | Args\&&... | Argument att vidarebefordra till objektkonstruktorn |

### ReturnValue

ObjectBuilder konfigurerad för direkt objektkonstruktion
## Anmärkningar



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
