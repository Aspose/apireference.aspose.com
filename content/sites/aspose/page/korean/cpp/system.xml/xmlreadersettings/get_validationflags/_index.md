---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags 메서드"
linktitle: "get_ValidationFlags"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags 메서드. 스키마 검증 설정을 나타내는 값을 반환합니다. 이 설정은 C++에서 스키마를 검증하는 XmlReader 객체에 적용됩니다 (XmlReaderSettings::get_ValidationType 값이 ValidationType::Schema인 경우)."
type: docs
weight: 1800
url: /ko/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


스키마 검증 설정을 나타내는 값을 반환합니다. 이 설정은 스키마를 검증하는 [XmlReader](../../xmlreader/) 객체에 적용됩니다 ([XmlReaderSettings::get_ValidationType](../get_validationtype/) 값이 [ValidationType::Schema](../../validationtype/)인 경우).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

검증 옵션을 지정하는 열거값들의 비트별 조합입니다. XmlSchemaValidationFlags::ProcessIdentityConstraints와 XmlSchemaValidationFlags::AllowXmlAttributes는 기본적으로 활성화됩니다. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation 및 XmlSchemaValidationFlags::ReportValidationWarnings는 기본적으로 비활성화됩니다.

## 또 보기

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
