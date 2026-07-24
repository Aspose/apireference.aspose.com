---
title: "System::Xml::XmlDocument::CreateNode 方法"
linktitle: "CreateNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlDocument::CreateNode 方法。 在 C++ 中创建一个 XmlNode，使用指定的节点类型、XmlDocument::get_Name 和 XmlNode::get_NamespaceURI。"
type: docs
weight: 1100
url: /zh/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


使用指定的节点类型、[XmlDocument::get_Name](../get_name/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 创建一个 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| nodeTypeString | const String\& | 新节点的 [XmlNodeType](../../xmlnodetype/) 的 [String](../../../system/string/) 版本。此参数必须是下表列出的值之一。 |
| name | const String\& | 新节点的限定名称。如果名称包含冒号，它将被解析为 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 和 [XmlDocument::get_LocalName](../get_localname/) 组件。 |
| namespaceURI | const String\& | 新节点的命名空间 URI。 |

### ReturnValue

新的 [XmlNode](../../xmlnode/)。
## 备注



参数 **nodeTypeString** 区分大小写，且必须是下表中的某个值： |||
|-|-|
| nodeTypeString | XmlNodeType |
| 属性 | Attribute |
| CDATA 区段 | CDATA |
| 注释 | Comment |
| 文档 | Document |
| 文档片段 | DocumentFragment |
| 文档类型 | DocumentType |
| 元素 | Element |
| 实体引用 | EntityReference |
| 处理指令 | ProcessingInstruction |
| 显著空白 | SignificantWhitespace |
| text | Text |
| 空白 | Whitespace |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


创建一个具有指定 [XmlNodeType](../../xmlnodetype/)、[XmlDocument::get_Name](../get_name/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 的 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type | XmlNodeType | 新节点的 [XmlNodeType](../../xmlnodetype/)。 |
| name | const String\& | 新节点的限定名称。如果名称包含冒号，则会被解析为 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 和 [XmlDocument::get_LocalName](../get_localname/) 组件。 |
| namespaceURI | const String\& | 新节点的命名空间 URI。 |

### ReturnValue

新的 [XmlNode](../../xmlnode/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


创建一个具有指定 [XmlNodeType](../../xmlnodetype/)、[XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_Name](../get_name/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 的 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type | XmlNodeType | 新节点的 [XmlNodeType](../../xmlnodetype/)。 |
| prefix | const String\& | 新节点的前缀。 |
| name | const String\& | 新节点的本地名称。 |
| namespaceURI | const String\& | 新节点的命名空间 URI。 |

### ReturnValue

新的 [XmlNode](../../xmlnode/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
