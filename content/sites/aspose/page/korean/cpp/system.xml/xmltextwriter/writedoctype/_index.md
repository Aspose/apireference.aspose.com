---
title: "System::Xml::XmlTextWriter::WriteDocType 메서드"
linktitle: "WriteDocType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteDocType 메서드. C++에서 지정된 이름과 선택적 속성을 사용하여 DOCTYPE 선언을 작성합니다."
type: docs
weight: 2500
url: /ko/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


지정된 이름과 선택적 속성을 사용하여 DOCTYPE 선언을 기록합니다.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | DOCTYPE의 이름입니다. 비어 있을 수 없습니다. |
| pubid | const String\& | null이 아닌 경우, PUBLIC "pubid" "sysid" 를 작성하며, 여기서 **pubid**와 **sysid**는 제공된 인수의 값으로 대체됩니다. |
| sysid | const String\& | **pubid**가 null이고 **sysid**가 null이 아닌 경우, SYSTEM "sysid" 를 작성하며, 여기서 **sysid**는 이 인수의 값으로 대체됩니다. |
| subset | const String\& | null이 아닌 경우, [subset] 를 작성하며, 여기서 subset은 이 인수의 값으로 대체됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
