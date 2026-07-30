---
title: "System::Xml::XmlDocument::CreateNode 方法"
linktitle: "CreateNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::CreateNode 方法。在 C++ 中创建具有指定节点类型、XmlDocument::get_Name 和 XmlNode::get_NamespaceURI 的 XmlNode。"
type: docs
weight: 1100
url: /zh/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


使用指定的节点类型、[XmlDocument::get_Name](../get_name/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 创建一个 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nodeTypeString | const String\& | [String](../../../system/string/) 表示新节点的 [XmlNodeType](../../xmlnodetype/)。此参数必须是下表列出的值之一。 |
| name | const String\& | 新节点的限定名称。如果名称包含冒号，则会解析为 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 和 [XmlDocument::get_LocalName](../get_localname/) 组件。 |
| namespaceURI | const String\& | 新节点的命名空间 URI。 |

### ReturnValue

新的 [XmlNode](../../xmlnode/)。
## 备注



参数 **nodeTypeString** 区分大小写，必须是下表中的某个值： |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| 文档 | Document |
| 文档片段 | DocumentFragment |
| 文档类型 | DocumentType |
| 元素 | Element |
| 实体引用 | EntityReference |
| 处理指令 | ProcessingInstruction |
| 显著空白 | SignificantWhitespace |
| 文本 | Text |
| 空白 | Whitespace |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


使用指定的[XmlNodeType](../../xmlnodetype/)、[XmlDocument::get_Name](../get_name/)和[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)创建一个[XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type | XmlNodeType | 新节点的[XmlNodeType](../../xmlnodetype/)。 |
| name | const String\& | 新节点的限定名称。如果名称包含冒号，则会解析为[XmlNode::get_Prefix](../../xmlnode/get_prefix/)和[XmlDocument::get_LocalName](../get_localname/)组件。 |
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
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


使用指定的[XmlNodeType](../../xmlnodetype/)、[XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_Name](../get_name/)和[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)创建一个[XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type | XmlNodeType | 新节点的[XmlNodeType](../../xmlnodetype/)。 |
| 前缀 | const String\& | 新节点的前缀。 |
| 名称 | const String\& | 新节点的本地名称。 |
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
* Library [Aspose.Font for C++](../../../)
