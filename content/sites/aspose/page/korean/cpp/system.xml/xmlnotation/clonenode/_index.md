---
title: "System::Xml::XmlNotation::CloneNode 메서드"
linktitle: "CloneNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNotation::CloneNode 메서드. 이 노드의 복제본을 생성합니다. Notation 노드는 복제할 수 없습니다. XmlNotation 객체에서 이 메서드를 호출하면 C++에서 예외가 발생합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


이 노드의 복제본을 생성합니다. Notation 노드는 복제할 수 없습니다. [XmlNotation](../) 객체에서 이 메서드를 호출하면 예외가 발생합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| deep | bool | 지정된 노드 아래의 하위 트리를 재귀적으로 복제하려면 **true**, 노드 자체만 복제하려면 **false**. |

### ReturnValue

메서드가 호출된 노드의 [XmlNode](../../xmlnode/) 복사본.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
