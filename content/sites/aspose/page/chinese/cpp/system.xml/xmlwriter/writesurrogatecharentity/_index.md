---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity method"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity 方法。当在派生类中重写时，在 C++ 中生成并写入代理字符对的代理字符实体。"
type: docs
weight: 3400
url: /zh/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


在派生类中被重写时，生成并写入代理字符对的代理字符实体。

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| lowChar | char16_t | 低位代理。其值必须在 0xDC00 到 0xDFFF 之间。 |
| highChar | char16_t | 高位代理。其值必须在 0xD800 到 0xDBFF 之间。 |

## 另见

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
