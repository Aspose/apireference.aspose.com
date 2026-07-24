---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "C++용 Aspose.Page"
description: "System::Xml::ConformanceLevel enum. C++에서 XmlReader 및 XmlWriter 객체가 수행하는 입력 또는 출력 검사량을 지정합니다."
type: docs
weight: 4600
url: /ko/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


[XmlReader](../xmlreader/) 및 [XmlWriter](../xmlwriter/) 객체가 수행하는 입력 또는 출력 검사량을 지정합니다.

```cpp
enum class ConformanceLevel
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Auto | 0 | [XmlReader](../xmlreader/) 또는 [XmlWriter](../xmlwriter/) 객체는 문서 수준 검사 또는 조각 수준 검사를 수행해야 하는지를 자동으로 감지하고 적절한 검사를 수행합니다. 다른 [XmlReader](../xmlreader/) 또는 [XmlWriter](../xmlwriter/) 객체를 래핑하는 경우, 외부 객체는 추가적인 적합성 검사를 수행하지 않습니다. 적합성 검사는 기본 객체에 맡겨집니다. |
| Fragment | 1 | XML 데이터는 W3C에서 정의한 [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities)입니다. 이 적합성 수준은 루트 요소가 없을 수 있지만 그 외에는 올바르게 형성된 XML 문서를 나타냅니다. 이 수준의 검사는 읽거나 쓰는 스트림이 모든 프로세서에 의해 [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities)로 처리될 수 있도록 보장합니다. |
| Document | 2 | XML 데이터는 W3C에서 정의한 올바르게 형성된 [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed)의 규칙을 준수합니다. 이 수준의 검사는 읽거나 쓰는 스트림이 모든 프로세서에 의해 [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed)로 처리될 수 있도록 보장합니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
