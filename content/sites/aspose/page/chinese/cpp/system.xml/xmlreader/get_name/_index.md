---
title: "System::Xml::XmlReader::get_Name 方法"
linktitle: "get_Name"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::get_Name 方法。当在派生类中重写时，获取当前节点的限定名称（在 C++ 中）。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


在派生类中重写时，获取当前节点的限定名称。

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

当前节点的限定名称。例如，**Name** 对于元素 **<bk:book>** 为 **bk:book**。
## 备注



返回的名称取决于节点的 [XmlReader::get_NodeType](../get_nodetype/) 值。以下节点类型返回列出的值。所有其他节点类型返回空字符串。 |||
|-|-|
| 节点类型 | 名称 |
| Attribute | 属性的名称。 |
| DocumentType | 文档类型的名称。 |
| Element | 标签名称。 |
| EntityReference | 被引用实体的名称。 |
| ProcessingInstruction | 处理指令的目标。 |
| XmlDeclaration | 字面字符串 xml。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
