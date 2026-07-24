---
title: "System::Xml::XmlWhitespace::CloneNode 메서드"
linktitle: "CloneNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWhitespace::CloneNode 메서드. C++에서 이 노드의 복제본을 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlwhitespace/clonenode/
---
## XmlWhitespace::CloneNode method


이 노드의 복제본을 생성합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlWhitespace::CloneNode(bool deep) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| deep | bool | **true**는 지정된 노드 아래의 하위 트리를 재귀적으로 복제합니다; **false**는 노드 자체만 복제합니다. 공백 노드의 경우, 복제된 노드는 매개변수 설정에 관계없이 항상 데이터 값을 포함합니다. |

### ReturnValue

복제된 노드입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
