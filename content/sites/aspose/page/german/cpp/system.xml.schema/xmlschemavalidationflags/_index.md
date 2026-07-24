---
title: "System::Xml::Schema::XmlSchemaValidationFlags-Enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags-Enum. Gibt die Optionen zur Schemagültigkeitsprüfung an, die von den Klassen XmlSchemaValidator und XmlReader in C++ verwendet werden."
type: docs
weight: 7900
url: /de/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Gibt die Optionen zur Schemagültigkeitsprüfung an, die von den Klassen [XmlSchemaValidator](../xmlschemavalidator/) und [XmlReader](../../system.xml/xmlreader/) verwendet werden.

```cpp
enum class XmlSchemaValidationFlags
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| None | 0 | Verarbeite keine Identitätsbeschränkungen, Inline-Schemata, Schema-Standorthinweise oder melde keine Warnungen zur Schemagültigkeitsprüfung. |
| ProcessInlineSchema | 1 | Verarbeite während der Validierung gefundene Inline-Schemata. |
| ProcessSchemaLocation | 2 | Verarbeite während der Validierung gefundene Schema-Standorthinweise (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**). |
| ReportValidationWarnings | 4 | Melde während der Validierung gefundene Warnungen zur Schemagültigkeitsprüfung. |
| ProcessIdentityConstraints | 8 | Verarbeite während der Validierung gefundene Identitätsbeschränkungen (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**). |
| AllowXmlAttributes | 16 | Erlaube xml:*-Attribute, selbst wenn sie im Schema nicht definiert sind. Die Attribute werden basierend auf ihrem Datentyp validiert. |

## Siehe auch

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
