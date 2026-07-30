---
title: "System::Xml::ConformanceLevel 枚举"
linktitle: "ConformanceLevel"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::ConformanceLevel 枚举。指定 XmlReader 和 XmlWriter 对象在 C++ 中执行的输入或输出检查的程度。"
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
| Auto | 0 | 该 [XmlReader](../xmlreader/) 或 [XmlWriter](../xmlwriter/) 对象会自动检测是应执行文档级别还是片段级别的检查，并进行相应的检查。如果您正在包装另一个 [XmlReader](../xmlreader/) 或 [XmlWriter](../xmlwriter/) 对象，则外部对象不会进行任何额外的符合性检查。符合性检查由底层对象负责。 |
| Fragment | 1 | 该 XML 数据是一个符合 W3C 定义的 [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities)，此符合性级别表示一个可能没有根元素但其他方面符合规范的 XML 文档。此检查级别确保被读取或写入的流可以被任何处理器作为 [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) 消费。 |
| Document | 2 | 该 XML 数据符合 W3C 定义的符合规范的 [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) 的规则。此检查级别确保被读取或写入的流可以被任何处理器作为 [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) 消费。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
