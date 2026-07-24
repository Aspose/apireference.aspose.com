---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Page voor C++"
description: "System::Xml::DtdProcessing enum. Specificeert de opties voor het verwerken van DTD's. De DtdProcessing-enumeratie wordt gebruikt door de XmlReaderSettings-klasse in C++."
type: docs
weight: 4700
url: /nl/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Specificeert de opties voor het verwerken van DTD's. De [DtdProcessing](./) enumeratie wordt gebruikt door de [XmlReaderSettings](../xmlreadersettings/) klasse.

```cpp
enum class DtdProcessing
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Prohibit | 0 | Specificeert dat wanneer een DTD wordt aangetroffen, er een [XmlException](../xmlexception/) wordt gegooid met een bericht dat aangeeft dat DTD's verboden zijn. Dit is het standaardgedrag. |
| Ignore | 1 | Veroorzaakt dat het DOCTYPE-element wordt genegeerd. Er vindt geen DTD-verwerking plaats, en de DTD/DOCTYPE gaat verloren bij de uitvoer. |
| Parse | 2 | Gebruikt voor het parseren van DTD's. |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
