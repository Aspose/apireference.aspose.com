---
title: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity 方法"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity 方法。生成并写入代理字符对的代理字符实体，在 C++ 中。"
type: docs
weight: 4000
url: /zh/cpp/system.xml/xmltextwriter/writesurrogatecharentity/
---
## XmlTextWriter::WriteSurrogateCharEntity method


为代理字符对生成并写出代理字符实体。

```cpp
void System::Xml::XmlTextWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| lowChar | char16_t | 低位代理字符。它的值必须在 **0xDC00** 与 **0xDFFF** 之间。 |
| highChar | char16_t | 高位代理字符。它的值必须在 **0xD800** 与 **0xDBFF** 之间。 |

## 另见

* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
