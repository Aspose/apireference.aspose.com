---
title: "System::Xml::XmlEntity::CloneNode 메서드"
linktitle: "CloneNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlEntity::CloneNode 메서드. 이 노드의 복제본을 생성합니다. 엔터티 노드는 복제할 수 없습니다. XmlEntity 객체에 대해 이 메서드를 호출하면 C++에서 예외가 발생합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


이 노드의 복제본을 생성합니다. 엔터티 노드는 복제할 수 없습니다. [XmlEntity](../) 객체에 대해 이 메서드를 호출하면 예외가 발생합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| deep | bool | 지정된 노드 아래의 하위 트리를 재귀적으로 복제하려면 **true**, 노드 자체만 복제하려면 **false**. |

### ReturnValue

메서드가 호출된 [XmlNode](../../xmlnode/)의 복사본입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
