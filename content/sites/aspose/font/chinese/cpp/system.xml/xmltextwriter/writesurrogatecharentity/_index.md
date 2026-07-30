---
title: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity 方法"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity 方法。生成并写出代理字符对的代理字符实体，在 C++ 中。"
type: docs
weight: 4000
url: /zh/cpp/system.xml/xmltextwriter/writesurrogatecharentity/
---
## XmlTextWriter::WriteSurrogateCharEntity method


生成并写入代理字符对的代理字符实体。

```cpp
void System::Xml::XmlTextWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| lowChar | char16_t | 低位代理。它必须是介于 **0xDC00** 和 **0xDFFF** 之间的值。 |
| highChar | char16_t | 高位代理。它必须是介于 **0xD800** 和 **0xDBFF** 之间的值。 |

## 另见

* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
