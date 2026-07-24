---
title: "System::Xml::XmlNode::get_Name method"
linktitle: "get_Name"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode::get_Name 메서드. 파생 클래스에서 재정의될 경우 C++에서 노드의 정규화된 이름을 반환합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


파생 클래스에서 재정의된 경우, 노드의 정규화된 이름을 반환합니다.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

노드의 정규화된 이름.
## 비고



반환된 이름은 노드의 [XmlNode::get_NodeType](../get_nodetype/)에 따라 달라집니다: |||
|-|-|
| 형식 | 이름 |
| Attribute | 속성의 정규화된 이름. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | 문서 유형 이름입니다. |
| Element | 요소의 정규화된 이름. |
| Entity | 엔터티의 이름입니다. |
| EntityReference | 참조된 엔터티의 이름입니다. |
| Notation | 표기법 이름. |
| ProcessingInstruction | 처리 지시문의 대상입니다. |
| Text | #text |
| Whitespace | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
