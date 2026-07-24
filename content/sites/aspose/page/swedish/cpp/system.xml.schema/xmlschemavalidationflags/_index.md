---
title: "System::Xml::Schema::XmlSchemaValidationFlags enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags enum. Specificerar schema valideringsalternativ som används av XmlSchemaValidator och XmlReader-klasserna i C++."
type: docs
weight: 7900
url: /sv/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Specificerar schema valideringsalternativ som används av [XmlSchemaValidator](../xmlschemavalidator/) och [XmlReader](../../system.xml/xmlreader/) klasserna.

```cpp
enum class XmlSchemaValidationFlags
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| None | 0 | Bearbeta inte identitetsbegränsningar, inbäddade scheman, schemalokaliseringshintar eller rapportera varningar för schemavalidering. |
| ProcessInlineSchema | 1 | Bearbeta inbäddade scheman som påträffas under validering. |
| ProcessSchemaLocation | 2 | Bearbeta schemalokaliseringshintar (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) som påträffas under validering. |
| ReportValidationWarnings | 4 | Rapportera varningar för schemavalidering som påträffas under validering. |
| ProcessIdentityConstraints | 8 | Bearbeta identitetsbegränsningar (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) som påträffas under validering. |
| AllowXmlAttributes | 16 | Tillåt xml:*-attribut även om de inte är definierade i schemat. Attributen kommer att valideras baserat på deras datatyp. |

## Se även

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
