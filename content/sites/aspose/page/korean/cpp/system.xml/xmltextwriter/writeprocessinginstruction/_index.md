---
title: "System::Xml::XmlTextWriter::WriteProcessingInstruction 메서드"
linktitle: "WriteProcessingInstruction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteProcessingInstruction 메서드. 이름과 텍스트 사이에 공백을 두고 다음과 같이 처리 지시문을 작성합니다: <?name text?> (C++)."
type: docs
weight: 3300
url: /ko/cpp/system.xml/xmltextwriter/writeprocessinginstruction/
---
## XmlTextWriter::WriteProcessingInstruction method


다음과 같이 이름과 텍스트 사이에 공백이 있는 처리 지시문을 **<?name text?>** 형태로 기록합니다.

```cpp
void System::Xml::XmlTextWriter::WriteProcessingInstruction(String name, String text) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 처리 지시문의 이름. |
| text | String | [Text](../../../system.text/) 를 처리 지시문에 포함합니다. |
## 비고



이 메서드는 [XmlTextWriter::WriteStartDocument](../writestartdocument/)이 이미 호출된 후 XML 선언을 생성하는 데 사용됩니다.
## 또 보기

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
