---
title: "System::Xml::Schema::XmlSeverityType 열거형"
linktitle: "XmlSeverityType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSeverityType 열거형. C++에서 검증 이벤트의 심각도를 나타냅니다."
type: docs
weight: 8100
url: /ko/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


검증 이벤트의 심각도를 나타냅니다.

```cpp
enum class XmlSeverityType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Error | 0 | 인스턴스 문서를 검증할 때 검증 오류가 발생했음을 나타냅니다. 이는 문서 유형 정의(DTD) 및 XML [Schema](../) 정의 언어 (XSD) 스키마에 적용됩니다. World Wide [Web](../../system.web/) Consortium (W3C)의 유효성 제약은 오류로 간주됩니다. 검증 이벤트 핸들러가 생성되지 않은 경우, 오류는 예외를 발생시킵니다. |
| Warning | 1 | 오류가 아닌 검증 이벤트가 발생했음을 나타냅니다. DTD가 없거나 특정 요소나 속성을 검증할 XML [Schema](../)이 없을 때 일반적으로 경고가 발행됩니다. 오류와 달리, 경고는 검증 이벤트 핸들러가 없을 경우 예외를 발생시키지 않습니다. |

## 또 보기

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
