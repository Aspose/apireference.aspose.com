---
title: "System::Xml::XmlReader::MoveToContent 方法"
linktitle: "MoveToContent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::MoveToContent 方法。检查当前节点是否为内容节点（非空白文本、CDATA、元素、结束元素、实体引用或结束实体）。如果节点不是内容节点，读取器会跳过到下一个内容节点或文件结束。它会跳过以下类型的节点：ProcessingInstruction、DocumentType、Comment、Whitespace 或 SignificantWhitespace（C++）。"
type: docs
weight: 3300
url: /zh/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


检查当前节点是否为内容节点（非空白文本、**CDATA**、**Element**、**EndElement**、**EntityReference** 或 **EndEntity**）。如果节点不是内容节点，读取器将跳过到下一个内容节点或文件结束。它会跳过以下类型的节点：**ProcessingInstruction**、**DocumentType**、**Comment**、**Whitespace** 或 **SignificantWhitespace**。

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

该方法找到的当前节点的 [XmlReader::get_NodeType](../get_nodetype/) 值，或者如果读取器已到达输入流的末尾，则为 [XmlNodeType::None](../../xmlnodetype/)。

## 另见

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
