---
title: "Methode System::Build"
linktitle: "Build"
second_title: "Aspose.Page für C++"
description: "Methode System::Build. Erstellt ein Objekt mit direktem Besitz in C++."
type: docs
weight: 15000
url: /de/cpp/system/build/
---
## System::Build method


Erstellt ein Objekt mit direktem Besitz.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des zu erstellenden Objekts |
| Argumente | Argumenttypen für die Objekterstellung |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Args\&&... | Argumente, die an den Objektkonstruktor weitergeleitet werden sollen |

### ReturnValue

ObjectBuilder für die direkte Objekterstellung konfiguriert
## Hinweise



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
