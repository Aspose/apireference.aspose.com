---
title: "System::Xml::XmlNodeReader::get_Name 方法"
linktitle: "get_Name"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeReader::get_Name 方法。返回当前节点的限定名称，适用于 C++。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


返回当前节点的限定名称。

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

当前节点的限定名称。例如，**Name** 为 **bk:book**，对应元素 **<bk:book>**。
## 备注



返回的名称取决于节点的 [XmlNodeReader::get_NodeType](../get_nodetype/) 值。以下节点类型返回列出的值。所有其他节点类型返回空字符串。 |||
|-|-|
| 节点类型 | 名称 |
| Attribute | 属性的名称。 |
| DocumentType | 文档类型名称。 |
| Element | 标签名称。 |
| EntityReference | 引用的实体名称。 |
| ProcessingInstruction | 处理指令的目标。 |
| XmlDeclaration | 字面字符串 xml。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
