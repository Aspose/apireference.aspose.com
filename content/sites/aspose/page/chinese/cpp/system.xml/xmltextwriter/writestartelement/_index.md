---
title: "System::Xml::XmlTextWriter::WriteStartElement 方法"
linktitle: "WriteStartElement"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteStartElement 方法。写入指定的起始标签，并在 C++ 中将其与给定的命名空间和前缀关联。"
type: docs
weight: 3800
url: /zh/cpp/system.xml/xmltextwriter/writestartelement/
---
## XmlTextWriter::WriteStartElement method


写出指定的起始标签，并将其关联到给定的命名空间和前缀。

```cpp
void System::Xml::XmlTextWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 元素的命名空间前缀。 |
| localName | const String\& | 元素的本地名称。 |
| ns | const String\& | 要与元素关联的命名空间 URI。如果此命名空间已经在作用域中并且已有关联的前缀，则写入器会自动写出该前缀。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
