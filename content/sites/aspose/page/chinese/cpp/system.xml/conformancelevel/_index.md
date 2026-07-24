---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::ConformanceLevel enum。指定 XmlReader 和 XmlWriter 对象在 C++ 中执行的输入或输出检查的程度。"
type: docs
weight: 4600
url: /zh/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


指定 [XmlReader](../xmlreader/) 和 [XmlWriter](../xmlwriter/) 对象执行的输入或输出检查的程度。

```cpp
enum class ConformanceLevel
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Auto | 0 | [XmlReader](../xmlreader/) 或 [XmlWriter](../xmlwriter/) 对象会自动检测是应执行文档级别还是片段级别的检查，并进行相应的检查。如果您包装了另一个 [XmlReader](../xmlreader/) 或 [XmlWriter](../xmlwriter/) 对象，则外部对象不会进行任何额外的合规性检查。合规性检查由底层对象负责。 |
| Fragment | 1 | XML 数据是一个由 W3C 定义的 [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities)。此合规性级别表示可能没有根元素但仍然符合良好结构的 XML 文档。此级别的检查确保被读取或写入的流可以被任何处理器作为 [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) 使用。 |
| Document | 2 | XML 数据符合 W3C 定义的良好结构 [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) 的规则。此级别的检查确保被读取或写入的流可以被任何处理器作为 [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) 使用。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
