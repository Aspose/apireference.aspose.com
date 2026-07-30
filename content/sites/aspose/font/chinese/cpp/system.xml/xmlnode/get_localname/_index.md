---
title: "System::Xml::XmlNode::get_LocalName 方法"
linktitle: "get_LocalName"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::get_LocalName 方法。返回节点的本地名称（在派生类中重写时）（C++）。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


在派生类中重写时，返回节点的本地名称。

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

删除前缀后的节点名称。例如，**LocalName** 对于元素 **<bk:book>** 为 **book**。
## 备注



返回的名称取决于节点的 [XmlNode::get_NodeType](../get_nodetype/)：|||
|-|-|
| 类型 | 名称 |
| Attribute | 属性的本地名称。 |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | 文档类型名称。 |
| Element | 元素的本地名称。 |
| Entity | 实体的名称。 |
| EntityReference | 引用的实体名称。 |
| Notation | 符号名称。 |
| ProcessingInstruction | 处理指令的目标。 |
| Text | #text |
| Whitespace | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## 另见

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
