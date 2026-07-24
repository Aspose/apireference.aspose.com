---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags metode"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags metode. Mengembalikan nilai yang menunjukkan pengaturan validasi skema. Pengaturan ini berlaku untuk objek XmlReader yang memvalidasi skema (nilai XmlReaderSettings::get_ValidationType adalah ValidationType::Schema) dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Mengembalikan nilai yang menunjukkan pengaturan validasi skema. Pengaturan ini berlaku untuk objek [XmlReader](../../xmlreader/) yang memvalidasi skema (nilai [XmlReaderSettings::get_ValidationType](../get_validationtype/) adalah [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Kombinasi bitwise dari nilai enumerasi yang menentukan opsi validasi. XmlSchemaValidationFlags::ProcessIdentityConstraints dan XmlSchemaValidationFlags::AllowXmlAttributes diaktifkan secara default. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation, dan XmlSchemaValidationFlags::ReportValidationWarnings dinonaktifkan secara default.

## Lihat Juga

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
