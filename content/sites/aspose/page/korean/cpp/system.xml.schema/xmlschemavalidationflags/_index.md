---
title: "System::Xml::Schema::XmlSchemaValidationFlags 열거형"
linktitle: "XmlSchemaValidationFlags"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidationFlags 열거형. C++에서 XmlSchemaValidator 및 XmlReader 클래스가 사용하는 스키마 검증 옵션을 지정합니다."
type: docs
weight: 7900
url: /ko/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


[XmlSchemaValidator](../xmlschemavalidator/) 및 [XmlReader](../../system.xml/xmlreader/) 클래스가 사용하는 스키마 검증 옵션을 지정합니다.

```cpp
enum class XmlSchemaValidationFlags
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 식별 제약 조건, 인라인 스키마, 스키마 위치 힌트를 처리하거나 스키마 검증 경고를 보고하지 않습니다. |
| ProcessInlineSchema | 1 | 검증 중에 발견된 인라인 스키마를 처리합니다. |
| ProcessSchemaLocation | 2 | 검증 중에 발견된 스키마 위치 힌트(**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**)를 처리합니다. |
| ReportValidationWarnings | 4 | 검증 중에 발생한 스키마 검증 경고를 보고합니다. |
| ProcessIdentityConstraints | 8 | 검증 중에 발견된 식별 제약 조건(**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**)을 처리합니다. |
| AllowXmlAttributes | 16 | 스키마에 정의되지 않았더라도 xml:* 속성을 허용합니다. 해당 속성은 데이터 유형을 기준으로 검증됩니다. |

## 또 보기

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
