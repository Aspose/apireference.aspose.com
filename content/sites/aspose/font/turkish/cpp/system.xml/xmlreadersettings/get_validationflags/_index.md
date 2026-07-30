---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags metodu"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags yöntemi. Şema doğrulama ayarlarını gösteren bir değer döndürür. Bu ayar, şemaları doğrulayan XmlReader nesnelerine (XmlReaderSettings::get_ValidationType değeri ValidationType::Schema) C++'ta uygulanır."
type: docs
weight: 1800
url: /tr/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Şema doğrulama ayarlarını gösteren bir değer döndürür. Bu ayar, şemaları doğrulayan [XmlReader](../../xmlreader/) nesnelerine ([XmlReaderSettings::get_ValidationType](../get_validationtype/) değeri [ValidationType::Schema](../../validationtype/)) uygulanır.

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Doğrulama seçeneklerini belirten enum değerlerinin bit düzeyinde bir birleşimidir. XmlSchemaValidationFlags::ProcessIdentityConstraints ve XmlSchemaValidationFlags::AllowXmlAttributes varsayılan olarak etkindir. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation ve XmlSchemaValidationFlags::ReportValidationWarnings varsayılan olarak devre dışıdır.

## Ayrıca Bakınız

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
