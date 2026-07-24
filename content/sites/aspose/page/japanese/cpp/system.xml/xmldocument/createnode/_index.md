---
title: "System::Xml::XmlDocument::CreateNode メソッド"
linktitle: "CreateNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::CreateNode メソッド。C++ で、指定されたノードタイプ、XmlDocument::get_Name、および XmlNode::get_NamespaceURI を使用して XmlNode を作成します。"
type: docs
weight: 1100
url: /ja/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


指定されたノードタイプ、[XmlDocument::get_Name](../get_name/)、および [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) を使用して [XmlNode](../../xmlnode/) を作成します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nodeTypeString | const String\& | 新しいノードの [XmlNodeType](../../xmlnodetype/) の [String](../../../system/string/) バージョン。このパラメーターは以下の表に列挙された値のいずれかでなければなりません。 |
| name | const String\& | 新しいノードの修飾名です。名前にコロンが含まれる場合、[XmlNode::get_Prefix](../../xmlnode/get_prefix/) と [XmlDocument::get_LocalName](../get_localname/) のコンポーネントに分割されます。 |
| namespaceURI | const String\& | 新しいノードの名前空間 URI。 |

### ReturnValue

新しい [XmlNode](../../xmlnode/)。
## 備考



**nodeTypeString** パラメーターは大文字小文字を区別し、以下の表の値のいずれかでなければなりません: |||
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

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


指定された[XmlNode](../../xmlnode/) を、指定された[XmlNodeType](../../xmlnodetype/)、[XmlDocument::get_Name](../get_name/) および [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) で作成します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XmlNodeType | 新しいノードの[XmlNodeType](../../xmlnodetype/)です。 |
| name | const String\& | 新しいノードの修飾名です。名前にコロンが含まれる場合、[XmlNode::get_Prefix](../../xmlnode/get_prefix/) と [XmlDocument::get_LocalName](../get_localname/) のコンポーネントに分割されます。 |
| namespaceURI | const String\& | 新しいノードの名前空間 URI。 |

### ReturnValue

新しい [XmlNode](../../xmlnode/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


指定された[XmlNodeType](../../xmlnodetype/)、[XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_Name](../get_name/) および [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) を使用して、[XmlNode](../../xmlnode/) を作成します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XmlNodeType | 新しいノードの[XmlNodeType](../../xmlnodetype/)です。 |
| prefix | const String\& | 新しいノードのプレフィックスです。 |
| name | const String\& | 新しいノードのローカル名です。 |
| namespaceURI | const String\& | 新しいノードの名前空間 URI。 |

### ReturnValue

新しい [XmlNode](../../xmlnode/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
