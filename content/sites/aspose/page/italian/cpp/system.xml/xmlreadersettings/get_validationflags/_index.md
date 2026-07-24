---
title: "Metodo System::Xml::XmlReaderSettings::get_ValidationFlags"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlReaderSettings::get_ValidationFlags. Restituisce un valore che indica le impostazioni di convalida dello schema. Questa impostazione si applica agli oggetti XmlReader che convalidano gli schemi (il valore di XmlReaderSettings::get_ValidationType è ValidationType::Schema) in C++."
type: docs
weight: 1800
url: /it/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Restituisce un valore che indica le impostazioni di convalida dello schema. Questa impostazione si applica agli oggetti [XmlReader](../../xmlreader/) che convalidano gli schemi (il valore di [XmlReaderSettings::get_ValidationType](../get_validationtype/) è [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Una combinazione bitwise di valori di enumerazione che specificano le opzioni di convalida. XmlSchemaValidationFlags::ProcessIdentityConstraints e XmlSchemaValidationFlags::AllowXmlAttributes sono abilitati per impostazione predefinita. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation e XmlSchemaValidationFlags::ReportValidationWarnings sono disabilitati per impostazione predefinita.

## Vedi anche

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
