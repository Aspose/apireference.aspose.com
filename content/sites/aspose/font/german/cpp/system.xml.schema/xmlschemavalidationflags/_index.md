---
title: "System::Xml::Schema::XmlSchemaValidationFlags Aufzählung"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags Aufzählung. Gibt die Schema‑Validierungsoptionen an, die von den Klassen XmlSchemaValidator und XmlReader in C++ verwendet werden."
type: docs
weight: 7900
url: /de/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Gibt die Schema‑Validierungsoptionen an, die von den Klassen [XmlSchemaValidator](../xmlschemavalidator/) und [XmlReader](../../system.xml/xmlreader/) verwendet werden.

```cpp
enum class XmlSchemaValidationFlags
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Keine | 0 | Verarbeite keine Identitäts‑Constraints, Inline‑Schemas, Schema‑Standort‑Hinweise oder melde keine Schema‑Validierungswarnungen. |
| ProcessInlineSchema | 1 | Verarbeite Inline‑Schemas, die während der Validierung gefunden werden. |
| ProcessSchemaLocation | 2 | Verarbeite Schema-Standort-Hinweise (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) die während der Validierung aufgetreten sind. |
| ReportValidationWarnings | 4 | Melde Schema-Validierungswarnungen, die während der Validierung aufgetreten sind. |
| ProcessIdentityConstraints | 8 | Verarbeite Identitätsbeschränkungen (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) die während der Validierung aufgetreten sind. |
| AllowXmlAttributes | 16 | Erlaube xml:*-Attribute, selbst wenn sie im Schema nicht definiert sind. Die Attribute werden basierend auf ihrem Datentyp validiert. |

## Siehe auch

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
