---
title: "System::Xml::XmlSignificantWhitespace::CloneNode 메서드"
linktitle: "CloneNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlSignificantWhitespace::CloneNode 메서드. C++에서 이 노드의 복제본을 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


이 노드의 복제본을 생성합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| deep | bool | **true**는 지정된 노드 아래의 서브트리를 재귀적으로 복제하고; **false**는 노드 자체만 복제합니다. 중요한 공백 노드의 경우, 매개변수 설정과 관계없이 복제된 노드는 항상 데이터 값을 포함합니다. |

### ReturnValue

복제된 노드입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
