---
title: "System::Xml::XmlEntityReference::CloneNode 메서드"
linktitle: "CloneNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlEntityReference::CloneNode 메서드. C++에서 이 노드의 복제본을 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


이 노드의 복제본을 생성합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| deep | bool | **true**는 지정된 노드 아래의 하위 트리를 재귀적으로 복제합니다; **false**는 노드 자체만 복제합니다. [XmlEntityReference](../) 노드의 경우, 이 메서드는 항상 자식이 없는 엔터티 참조 노드를 반환합니다. 교체 텍스트는 노드가 부모에 삽입될 때 설정됩니다. |

### ReturnValue

복제된 노드입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
