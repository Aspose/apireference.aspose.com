---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::ValidationType enum. Specificeert het type validatie dat moet worden uitgevoerd in C++."
type: docs
weight: 5500
url: /nl/cpp/system.xml/validationtype/
---
## ValidationType enum


Specificeert het type validatie dat moet worden uitgevoerd.

```cpp
enum class ValidationType
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Er wordt geen validatie uitgevoerd en er worden geen validatiefouten gegenereerd. Deze instelling maakt een XML 1.0‑conforme niet‑validerende parser. |
| Auto | 1 | Valideert als DTD‑ of schemainformatie wordt gevonden. |
| DTD | 2 | Valideert volgens de DTD. |
| XDR | 3 | Valideer volgens XML-Data Reduced (XDR) schema's, inclusief inline XDR schema's. XDR schema's worden herkend met het **x-schema** namespace‑voorvoegsel of de [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/)‑waarde. |
| Schema | 4 | Valideer volgens de XML [Schema](../../system.xml.schema/) definitietaal (XSD) schema's, inclusief inline XML‑schema's. XML‑schema's worden gekoppeld aan namespace‑URI's door gebruik te maken van het **schemaLocation**‑attribuut of de opgegeven **Schemas**. |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
