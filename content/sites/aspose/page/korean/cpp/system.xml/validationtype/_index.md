---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::ValidationType 열거형. C++에서 수행할 검증 유형을 지정합니다."
type: docs
weight: 5500
url: /ko/cpp/system.xml/validationtype/
---
## ValidationType enum


수행할 검증 유형을 지정합니다.

```cpp
enum class ValidationType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 검증이 수행되지 않으며, 검증 오류도 발생하지 않습니다. 이 설정은 XML 1.0 호환 비검증 파서를 생성합니다. |
| 자동 | 1 | DTD 또는 스키마 정보가 발견되면 검증합니다. |
| DTD | 2 | DTD에 따라 검증합니다. |
| XDR | 3 | XML-Data Reduced (XDR) 스키마, 인라인 XDR 스키마를 포함하여 검증합니다. XDR 스키마는 **x-schema** 네임스페이스 접두사 또는 [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) 값을 사용하여 인식됩니다. |
| Schema | 4 | XML [Schema](../../system.xml.schema/) 정의 언어 (XSD) 스키마, 인라인 XML 스키마를 포함하여 검증합니다. XML 스키마는 **schemaLocation** 속성을 사용하거나 제공된 **Schemas**를 사용하여 네임스페이스 URI와 연결됩니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
