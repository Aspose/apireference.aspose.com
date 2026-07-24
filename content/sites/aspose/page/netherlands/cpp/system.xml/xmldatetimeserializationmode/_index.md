---
title: "System::Xml::XmlDateTimeSerializationMode enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Geeft aan hoe de tijdwaarde moet worden behandeld bij het converteren tussen string en DateTime in C++."
type: docs
weight: 5800
url: /nl/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Geeft aan hoe de tijdwaarde moet worden behandeld bij het converteren tussen string en [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Local | 0 | Behandel als lokale tijd. Als het [DateTime](../../system/datetime/) object een Coordinated Universal Time (UTC) vertegenwoordigt, wordt het omgezet naar de lokale tijd. |
| Utc | 1 | Behandel als UTC. Als het [DateTime](../../system/datetime/) object een lokale tijd vertegenwoordigt, wordt het omgezet naar UTC. |
| Unspecified | 2 | Behandel als lokale tijd als een [DateTime](../../system/datetime/) wordt geconverteerd naar een string. Als een string wordt geconverteerd naar [DateTime](../../system/datetime/), converteer dan naar lokale tijd als een tijdzone is opgegeven. |
| RoundtripKind | 3 | Tijdzone-informatie moet behouden blijven bij het converteren. |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
