---
title: "System::Xml::ValidationType Enum"
linktitle: "ValidationType"
second_title: "Aspose.Font für C++"
description: "System::Xml::ValidationType Enum. Gibt den Typ der Validierung an, der in C++ durchgeführt werden soll."
type: docs
weight: 5500
url: /de/cpp/system.xml/validationtype/
---
## ValidationType enum


Gibt den Typ der durchzuführenden Validierung an.

```cpp
enum class ValidationType
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Keine | 0 | Es wird keine Validierung durchgeführt und es werden keine Validierungsfehler ausgelöst. Diese Einstellung erzeugt einen XML‑1.0‑konformen nicht‑validierenden Parser. |
| Auto | 1 | Validiert, wenn DTD- oder Schema-Informationen gefunden werden. |
| DTD | 2 | Validiert gemäß der DTD. |
| XDR | 3 | Validiert gemäß XML-Data Reduced (XDR)-Schemata, einschließlich eingebetteter XDR-Schemata. XDR‑Schemata werden anhand des **x-schema**-Namespace‑Präfixes oder des Werts von [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) erkannt. |
| Schema | 4 | Validiert gemäß der XML [Schema](../../system.xml.schema/)-Definitionssprache (XSD)-Schemata, einschließlich eingebetteter XML‑Schemata. XML‑Schemata werden mit Namespace‑URIs entweder über das **schemaLocation**‑Attribut oder die bereitgestellten **Schemas** verknüpft. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
