---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags Methode"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags-Methode. Gibt einen Wert zurück, der die Schema‑Validierungseinstellungen angibt. Diese Einstellung gilt für XmlReader‑Objekte, die Schemata validieren (XmlReaderSettings::get_ValidationType‑Wert ist ValidationType::Schema) in C++."
type: docs
weight: 1800
url: /de/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Gibt einen Wert zurück, der die Schema‑Validierungseinstellungen angibt. Diese Einstellung gilt für [XmlReader](../../xmlreader/)‑Objekte, die Schemata validieren ([XmlReaderSettings::get_ValidationType](../get_validationtype/)‑Wert ist [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Eine bitweise Kombination von Aufzählungswerten, die Validierungsoptionen festlegen. XmlSchemaValidationFlags::ProcessIdentityConstraints und XmlSchemaValidationFlags::AllowXmlAttributes sind standardmäßig aktiviert. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation und XmlSchemaValidationFlags::ReportValidationWarnings sind standardmäßig deaktiviert.

## Siehe auch

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
