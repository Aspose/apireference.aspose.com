---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags 方法"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags 方法。返回一个指示模式验证设置的值。此设置适用于在 C++ 中验证模式的 XmlReader 对象（XmlReaderSettings::get_ValidationType 值为 ValidationType::Schema）。"
type: docs
weight: 1800
url: /zh/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


返回一个指示模式验证设置的值。此设置适用于验证模式的 [XmlReader](../../xmlreader/) 对象（[XmlReaderSettings::get_ValidationType](../get_validationtype/) 的值为 [ValidationType::Schema](../../validationtype/)）。

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

一个按位组合的枚举值，用于指定验证选项。默认启用 XmlSchemaValidationFlags::ProcessIdentityConstraints 和 XmlSchemaValidationFlags::AllowXmlAttributes。默认禁用 XmlSchemaValidationFlags::ProcessInlineSchema、XmlSchemaValidationFlags::ProcessSchemaLocation 和 XmlSchemaValidationFlags::ReportValidationWarnings。

## 另见

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
