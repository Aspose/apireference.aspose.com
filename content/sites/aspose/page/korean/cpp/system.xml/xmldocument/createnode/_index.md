---
title: "System::Xml::XmlDocument::CreateNode 메서드"
linktitle: "CreateNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::CreateNode 메서드. 지정된 노드 유형, XmlDocument::get_Name 및 XmlNode::get_NamespaceURI를 사용하여 C++에서 XmlNode를 생성합니다."
type: docs
weight: 1100
url: /ko/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


지정된 노드 유형, [XmlDocument::get_Name](../get_name/), 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)를 사용하여 [XmlNode](../../xmlnode/)를 생성합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| nodeTypeString | const String\& | 새 노드의 [XmlNodeType](../../xmlnodetype/)에 대한 [String](../../../system/string/) 버전입니다. 이 매개변수는 아래 표에 나열된 값 중 하나여야 합니다. |
| name | const String\& | 새 노드의 정규화된 이름입니다. 이름에 콜론이 포함된 경우, [XmlNode::get_Prefix](../../xmlnode/get_prefix/)와 [XmlDocument::get_LocalName](../get_localname/) 구성 요소로 구문 분석됩니다. |
| namespaceURI | const String\& | 새 노드의 네임스페이스 URI입니다. |

### ReturnValue

새로운 [XmlNode](../../xmlnode/)입니다.
## 비고



**nodeTypeString** 매개변수는 대소문자를 구분하며, 다음 표에 있는 값 중 하나여야 합니다: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| document | Document |
| documentfragment | DocumentFragment |
| documenttype | DocumentType |
| element | Element |
| entityreference | EntityReference |
| processinginstruction | ProcessingInstruction |
| significantwhitespace | SignificantWhitespace |
| text | Text |
| whitespace | Whitespace |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


지정된 [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)을 사용하여 [XmlNode](../../xmlnode/)를 생성합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XmlNodeType | 새 노드의 [XmlNodeType](../../xmlnodetype/)입니다. |
| name | const String\& | 새 노드의 정규화된 이름입니다. 이름에 콜론이 포함된 경우 [XmlNode::get_Prefix](../../xmlnode/get_prefix/)와 [XmlDocument::get_LocalName](../get_localname/) 구성 요소로 구문 분석됩니다. |
| namespaceURI | const String\& | 새 노드의 네임스페이스 URI입니다. |

### ReturnValue

새로운 [XmlNode](../../xmlnode/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


지정된 [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)을 사용하여 [XmlNode](../../xmlnode/)를 생성합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XmlNodeType | 새 노드의 [XmlNodeType](../../xmlnodetype/)입니다. |
| 접두사 | const String\& | 새 노드의 접두사입니다. |
| name | const String\& | 새 노드의 로컬 이름입니다. |
| namespaceURI | const String\& | 새 노드의 네임스페이스 URI입니다. |

### ReturnValue

새로운 [XmlNode](../../xmlnode/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
