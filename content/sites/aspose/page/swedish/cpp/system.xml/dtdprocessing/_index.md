---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Page för C++"
description: "System::Xml::DtdProcessing enum. Anger alternativen för bearbetning av DTD:er. DtdProcessing‑enumerationen används av klassen XmlReaderSettings i C++."
type: docs
weight: 4700
url: /sv/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Anger alternativen för bearbetning av DTD:er. [DtdProcessing](./)-enumerationen används av klassen [XmlReaderSettings](../xmlreadersettings/).

```cpp
enum class DtdProcessing
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Prohibit | 0 | Anger att när en DTD påträffas, kastas ett [XmlException](../xmlexception/) med ett meddelande som säger att DTD:er är förbjudna. Detta är standardbeteendet. |
| Ignorera | 1 | Gör så att DOCTYPE‑elementet ignoreras. Ingen DTD‑bearbetning sker, och DTD/DOCTYPE går förlorad i utdata. |
| Analysera | 2 | Används för att analysera DTD:er. |

## Se även

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
