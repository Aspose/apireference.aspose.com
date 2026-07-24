---
title: "System::Xml::XmlDocumentType::CloneNode 메서드"
linktitle: "CloneNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocumentType::CloneNode 메서드. C++에서 이 노드의 복제본을 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmldocumenttype/clonenode/
---
## XmlDocumentType::CloneNode method


이 노드의 복제본을 생성합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDocumentType::CloneNode(bool deep) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| deep | bool | **true**: 지정된 노드 아래의 하위 트리를 재귀적으로 복제합니다; **false**: 노드 자체만 복제합니다. 문서 유형 노드의 경우, 매개변수 설정에 관계없이 복제된 노드는 항상 하위 트리를 포함합니다. |

### ReturnValue

복제된 노드입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocumentType](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
