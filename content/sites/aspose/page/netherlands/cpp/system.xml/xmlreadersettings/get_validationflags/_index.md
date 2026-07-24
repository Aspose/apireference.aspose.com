---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags methode"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags methode. Retourneert een waarde die de schema-validatie-instellingen aangeeft. Deze instelling is van toepassing op XmlReader-objecten die schema's valideren (XmlReaderSettings::get_ValidationType waarde is ValidationType::Schema) in C++."
type: docs
weight: 1800
url: /nl/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Retourneert een waarde die de schema-validatie-instellingen aangeeft. Deze instelling is van toepassing op [XmlReader](../../xmlreader/) objecten die schema's valideren ([XmlReaderSettings::get_ValidationType](../get_validationtype/) waarde is [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Een bitwise combinatie van enumeratiewaarden die validatieopties specificeren. XmlSchemaValidationFlags::ProcessIdentityConstraints en XmlSchemaValidationFlags::AllowXmlAttributes zijn standaard ingeschakeld. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation en XmlSchemaValidationFlags::ReportValidationWarnings zijn standaard uitgeschakeld.

## Zie ook

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
