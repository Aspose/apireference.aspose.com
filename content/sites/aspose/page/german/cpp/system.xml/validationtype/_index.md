---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page für C++"
description: "System::Xml::ValidationType enum. Gibt den Typ der Validierung an, die in C++ durchgeführt werden soll."
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
| None | 0 | Es wird keine Validierung durchgeführt, und es werden keine Validierungsfehler ausgelöst. Diese Einstellung erstellt einen XML‑1.0‑konformen nicht‑validierenden Parser. |
| Automatisch | 1 | Validiert, wenn DTD‑ oder Schemainformationen gefunden werden. |
| DTD | 2 | Validiert gemäß der DTD. |
| XDR | 3 | Validieren Sie gemäß XML‑Data‑Reduced (XDR)‑Schemata, einschließlich eingebetteter XDR‑Schemata. XDR‑Schemata werden anhand des **x-schema**‑Namensraumpräfixes oder des Werts von [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) erkannt. |
| Schema | 4 | Validieren Sie gemäß der XML‑[Schema](../../system.xml.schema/)-Definitionssprache (XSD)‑Schemata, einschließlich eingebetteter XML‑Schemata. XML‑Schemata werden mit Namensraum‑URIs verknüpft, entweder über das Attribut **schemaLocation** oder die bereitgestellten **Schemas**. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
