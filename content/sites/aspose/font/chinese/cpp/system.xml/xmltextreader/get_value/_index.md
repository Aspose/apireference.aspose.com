---
title: "System::Xml::XmlTextReader::get_Value 方法"
linktitle: "get_Value"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader::get_Value 方法。返回当前节点的文本值（C++）。"
type: docs
weight: 2900
url: /zh/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


返回当前节点的文本值。

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

返回的值取决于节点的 [XmlTextReader::get_NodeType](../get_nodetype/) 值。
## 备注



下表列出了具有可返回值的节点类型。所有其他节点类型返回 [String::Empty](../../../system/string/empty/)。 |||
|-|-|
| 节点类型 | 值 |
| Attribute | 属性的值。 |
| CDATA | CDATA 区段的内容。 |
| Comment | 注释的内容。 |
| DocumentType | 内部子集。 |
| ProcessingInstruction | 整个内容，目标除外。 |
| SignificantWhitespace | xml:space='preserve' 范围内的空白字符。 |
| Text | 文本节点的内容。 |
| Whitespace | 标记之间的空白。 |
| XmlDeclaration | 声明的内容。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
