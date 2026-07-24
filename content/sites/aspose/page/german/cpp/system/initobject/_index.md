---
title: "System::InitObject Methode"
linktitle: "ObjektInitialisieren"
second_title: "Aspose.Page für C++"
description: "System::InitObject Methode. Startet die Initialisierung eines Objekts mit gemeinsamem Besitz in C++."
type: docs
weight: 21800
url: /de/cpp/system/initobject/
---
## System::InitObject method


Startet die Initialisierung eines Objekts mit gemeinsamem Besitz.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des zu initialisierenden Objekts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) zum Initialisieren |

### ReturnValue

ObjectBuilder konfiguriert für die Konstruktion von Shared‑Pointer
## Hinweise



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
