---
title: "System::Xml::XmlNode::get_ParentNode 메서드"
linktitle: "get_ParentNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode::get_ParentNode 메서드. C++에서 이 노드의 부모를 반환합니다(부모를 가질 수 있는 노드의 경우)."
type: docs
weight: 2100
url: /ko/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


이 노드의 부모를 반환합니다(부모가 있을 수 있는 노드의 경우).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

현재 노드의 부모인 [XmlNode](../).
## 비고



노드가 방금 생성되어 아직 트리에 추가되지 않았거나 트리에서 제거된 경우, 부모는 **nullptr**입니다. 다른 모든 노드에 대해 반환값은 해당 노드의 [XmlNode::get_NodeType](../get_nodetype/)에 따라 달라집니다. 다음 표는 **get_NodeType** 메서드에 대한 가능한 반환값을 설명합니다. |||
|-|-|
| 노드 유형 | ParentNode의 반환 값 |
| Attribute, Document, DocumentFragment, Entity, Notation | nullptr를 반환합니다; 이러한 노드에는 부모가 없습니다. |
| CDATA | CDATA 섹션을 포함하는 요소 또는 엔터티 참조를 반환합니다. |
| Comment | 주석을 포함하는 요소, 엔터티 참조, 문서 유형 또는 문서를 반환합니다. |
| DocumentType | 문서 노드를 반환합니다. |
| Element | 요소의 부모 노드를 반환합니다. 요소가 트리의 루트 노드인 경우, 부모는 문서 노드입니다. |
| EntityReference | 엔터티 참조를 포함하는 요소, 속성 또는 엔터티 참조를 반환합니다. |
| ProcessingInstruction | 처리 명령을 포함하는 문서, 요소, 문서 유형 또는 엔터티 참조를 반환합니다. |
| Text | 텍스트 노드를 포함하는 부모 요소, 속성 또는 엔터티 참조를 반환합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
