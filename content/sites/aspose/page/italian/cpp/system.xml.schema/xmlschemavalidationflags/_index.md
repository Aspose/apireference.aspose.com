---
title: "System::Xml::Schema::XmlSchemaValidationFlags enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags enum. Specifica le opzioni di convalida dello schema utilizzate dalle classi XmlSchemaValidator e XmlReader in C++."
type: docs
weight: 7900
url: /it/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Specifica le opzioni di convalida dello schema utilizzate dalle classi [XmlSchemaValidator](../xmlschemavalidator/) e [XmlReader](../../system.xml/xmlreader/).

```cpp
enum class XmlSchemaValidationFlags
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Non elaborare i vincoli di identità, gli schemi inline, i suggerimenti di posizione dello schema o segnalare gli avvisi di convalida dello schema. |
| ProcessInlineSchema | 1 | Elabora gli schemi inline incontrati durante la convalida. |
| ProcessSchemaLocation | 2 | Elabora i suggerimenti di posizione dello schema (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) incontrati durante la convalida. |
| ReportValidationWarnings | 4 | Segnala gli avvisi di convalida dello schema incontrati durante la convalida. |
| ProcessIdentityConstraints | 8 | Elabora i vincoli di identità (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) incontrati durante la convalida. |
| AllowXmlAttributes | 16 | Consenti gli attributi xml:* anche se non sono definiti nello schema. Gli attributi saranno convalidati in base al loro tipo di dati. |

## Vedi anche

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
