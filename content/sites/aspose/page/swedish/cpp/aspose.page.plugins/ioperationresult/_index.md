---
title: "Aspose::Page::Plugins::IOperationResult-klass"
linktitle: "IOperationResult"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::Plugins::IOperationResult-klass. Allmänt gränssnitt för operationens resultat som definierar vanliga metoder som konkreta plugin‑operationsresultat ska implementera i C++."
type: docs
weight: 700
url: /sv/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Allmänt operationresultat‑gränssnitt som definierar gemensamma metoder som ett konkret plugin‑operationresultat ska implementera.

```cpp
class IOperationResult : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [get_Data](./get_data/)() | Hämtar rådata. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Anger om resultatet är en bytearray. |
| virtual [get_IsFile](./get_isfile/)() | Anger om resultatet är en sökväg till en utdatafil. |
| virtual [get_IsStream](./get_isstream/)() | Anger om resultatet är en utström. |
| virtual [get_IsString](./get_isstring/)() | Anger om resultatet är en textsträng. |
| virtual [ToFile](./tofile/)() | Försöker konvertera resultatet till filen. |
| virtual [ToStream](./tostream/)() | Försöker konvertera resultatet till strömobjektet. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
