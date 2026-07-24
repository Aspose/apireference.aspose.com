---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags メソッド"
linktitle: "get_ValidationFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags メソッド。スキーマ検証設定を示す値を返します。この設定は C++ でスキーマを検証する XmlReader オブジェクト（XmlReaderSettings::get_ValidationType の値が ValidationType::Schema）に適用されます。"
type: docs
weight: 1800
url: /ja/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


スキーマ検証設定を示す値を返します。この設定はスキーマを検証する [XmlReader](../../xmlreader/) オブジェクト（[XmlReaderSettings::get_ValidationType](../get_validationtype/) の値が [ValidationType::Schema](../../validationtype/)）に適用されます。

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

検証オプションを指定する列挙値のビット単位の組み合わせです。XmlSchemaValidationFlags::ProcessIdentityConstraints と XmlSchemaValidationFlags::AllowXmlAttributes はデフォルトで有効です。XmlSchemaValidationFlags::ProcessInlineSchema、XmlSchemaValidationFlags::ProcessSchemaLocation、XmlSchemaValidationFlags::ReportValidationWarnings はデフォルトで無効です。

## 参照

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
