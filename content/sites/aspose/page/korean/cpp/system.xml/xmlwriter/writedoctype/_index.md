---
title: "System::Xml::XmlWriter::WriteDocType 메서드"
linktitle: "WriteDocType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::WriteDocType 메서드. 파생 클래스에서 재정의될 경우, 지정된 이름과 선택적 속성을 사용하여 DOCTYPE 선언을 C++에서 씁니다."
type: docs
weight: 1700
url: /ko/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


파생 클래스에서 재정의될 때, 지정된 이름과 선택적 속성을 사용하여 DOCTYPE 선언을 출력합니다.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | DOCTYPE의 이름입니다. 비어 있을 수 없습니다. |
| pubid | const String\& | null이 아닌 경우, PUBLIC "pubid" "sysid" 를 작성하며, 여기서 **pubid**와 **sysid**는 제공된 인수의 값으로 대체됩니다. |
| sysid | const String\& | 만약 **pubid**가 **nullptr**이고 **sysid**가 null이 아니면, **sysid**를 이 인수의 값으로 대체한 뒤 SYSTEM \"sysid\"를 씁니다. |
| subset | const String\& | null이 아닌 경우, [subset] 를 작성하며, 여기서 subset은 이 인수의 값으로 대체됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
