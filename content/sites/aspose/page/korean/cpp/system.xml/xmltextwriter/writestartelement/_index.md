---
title: "System::Xml::XmlTextWriter::WriteStartElement 메서드"
linktitle: "WriteStartElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteStartElement 메서드. 지정된 시작 태그를 작성하고 C++에서 해당 네임스페이스와 접두사와 연결합니다."
type: docs
weight: 3800
url: /ko/cpp/system.xml/xmltextwriter/writestartelement/
---
## XmlTextWriter::WriteStartElement method


지정된 시작 태그를 기록하고, 이를 주어진 네임스페이스와 접두사에 연결합니다.

```cpp
void System::Xml::XmlTextWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | const String\& | 요소의 네임스페이스 접두사입니다. |
| localName | const String\& | 요소의 로컬 이름입니다. |
| ns | const String\& | 요소와 연결할 네임스페이스 URI입니다. 이 네임스페이스가 이미 범위 내에 있고 연결된 접두사가 있는 경우, 작성기가 해당 접두사도 자동으로 출력합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
