---
title: "Aspose::Page::Plugins::IOperationResult klasse"
linktitle: "IOperationResult"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::Plugins::IOperationResult klasse. Algemene interface voor operationele resultaten die gemeenschappelijke methoden definieert die concrete plug-in operationele resultaten moeten implementeren in C++."
type: docs
weight: 700
url: /nl/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Algemene interface voor operationele resultaten die gemeenschappelijke methoden definieert die een concreet plug‑in‑operationeel resultaat moet implementeren.

```cpp
class IOperationResult : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_Data](./get_data/)() | Haalt ruwe gegevens op. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Geeft aan of het resultaat een byte-array is. |
| virtual [get_IsFile](./get_isfile/)() | Geeft aan of het resultaat een pad naar een uitvoerbestand is. |
| virtual [get_IsStream](./get_isstream/)() | Geeft aan of het resultaat een uitvoerstream is. |
| virtual [get_IsString](./get_isstring/)() | Geeft aan of het resultaat een tekstreeks is. |
| virtual [ToFile](./tofile/)() | Probeert het resultaat naar het bestand te converteren. |
| virtual [ToStream](./tostream/)() | Probeert het resultaat naar het streamobject te converteren. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
