---
title: "طريقة System::Xml::XmlReaderSettings::get_ValidationFlags"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReaderSettings::get_ValidationFlags. تُرجع قيمة تشير إلى إعدادات التحقق من المخطط. ينطبق هذا الإعداد على كائنات XmlReader التي تتحقق من المخططات (قيمة XmlReaderSettings::get_ValidationType هي ValidationType::Schema) في C++."
type: docs
weight: 1800
url: /ar/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


تُرجع قيمة تشير إلى إعدادات التحقق من المخطط. ينطبق هذا الإعداد على كائنات [XmlReader](../../xmlreader/) التي تتحقق من المخططات (قيمة [XmlReaderSettings::get_ValidationType](../get_validationtype/) هي [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

تركيبة بتية من قيم التعداد التي تحدد خيارات التحقق. يتم تمكين XmlSchemaValidationFlags::ProcessIdentityConstraints و XmlSchemaValidationFlags::AllowXmlAttributes بشكل افتراضي. يتم تعطيل XmlSchemaValidationFlags::ProcessInlineSchema و XmlSchemaValidationFlags::ProcessSchemaLocation و XmlSchemaValidationFlags::ReportValidationWarnings بشكل افتراضي.

## انظر أيضًا

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
