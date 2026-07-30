---
title: "System::Build Methode"
linktitle: "Build"
second_title: "Aspose.Font für C++"
description: "System::Build Methode. Erstellen Sie ein Objekt mit direktem Besitz in C++."
type: docs
weight: 15100
url: /de/cpp/system/build/
---
## System::Build method


Erstellen Sie ein Objekt mit direktem Besitz.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des zu erstellenden Objekts |
| Argumente | Argumenttypen für die Objekterstellung |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Args\&&... | Argumente, die an den Objektkonstruktor weitergeleitet werden |

### ReturnValue

ObjectBuilder für die direkte Objekterstellung konfiguriert
## Hinweise



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
