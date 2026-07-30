---
title: "System::BuildObject method"
linktitle: "BuildObject"
second_title: "Aspose.Font für C++"
description: "System::BuildObject method. Erstelle ein Objekt mit gemeinsamem Besitz in C++."
type: docs
weight: 15300
url: /de/cpp/system/buildobject/
---
## System::BuildObject method


Erstelle ein Objekt mit gemeinsamem Besitz.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des zu erstellenden Objekts |
| Argumente | Argumenttypen für die Objekterstellung |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | Args\&&... | Argumente, die an den Objektkonstruktor weitergeleitet werden |

### ReturnValue

ObjectBuilder konfiguriert für die Konstruktion von Shared-Pointer
## Hinweise



Erstellt ein [SharedPtr<T>](../sharedptr/) und gibt einen Builder dafür zurück
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
