---
title: "System::Xml::XmlWriter::WriteProcessingInstruction 메서드"
linktitle: "WriteProcessingInstruction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::WriteProcessingInstruction 메서드. 파생 클래스에서 재정의될 경우, 이름과 텍스트 사이에 공백을 두고 다음과 같이 처리 지시문을 출력합니다: <?name text?> (C++)."
type: docs
weight: 2700
url: /ko/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


파생 클래스에서 재정의될 때, 이름과 텍스트 사이에 공백을 두고 다음과 같이 처리 지시문을 출력합니다: **<?name text?>**.

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 처리 명령의 이름. |
| text | String | 처리 지시문에 포함할 텍스트. |
## 비고



이 메서드는 [XmlWriter::WriteStartDocument](../writestartdocument/)가 이미 호출된 후 XML 선언을 생성하는 데 사용됩니다.
## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
