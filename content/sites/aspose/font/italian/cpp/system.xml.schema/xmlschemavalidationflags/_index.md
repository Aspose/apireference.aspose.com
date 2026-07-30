---
title: "System::Xml::Schema::XmlSchemaValidationFlags enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags enum. Specifica le opzioni di validazione dello schema utilizzate dalle classi XmlSchemaValidator e XmlReader in C++."
type: docs
weight: 7900
url: /it/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Specifica le opzioni di validazione dello schema utilizzate dalle classi [XmlSchemaValidator](../xmlschemavalidator/) e [XmlReader](../../system.xml/xmlreader/).

```cpp
enum class XmlSchemaValidationFlags
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Non elaborare i vincoli di identità, gli schemi inline, i suggerimenti di posizione dello schema o segnalare gli avvisi di validazione dello schema. |
| ProcessInlineSchema | 1 | Elabora gli schemi inline incontrati durante la validazione. |
| ProcessSchemaLocation | 2 | Elabora suggerimenti di posizione dello schema (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) riscontrati durante la convalida. |
| ReportValidationWarnings | 4 | Segnala avvisi di convalida dello schema riscontrati durante la convalida. |
| ProcessIdentityConstraints | 8 | Elabora vincoli di identità (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) riscontrati durante la convalida. |
| AllowXmlAttributes | 16 | Consenti attributi xml:* anche se non sono definiti nello schema. Gli attributi saranno convalidati in base al loro tipo di dato. |

## Vedi anche

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
