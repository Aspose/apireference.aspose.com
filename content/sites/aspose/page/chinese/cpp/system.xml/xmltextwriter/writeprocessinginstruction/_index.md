---
title: "System::Xml::XmlTextWriter::WriteProcessingInstruction 方法"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteProcessingInstruction 方法。以空格分隔名称和文本写出处理指令，如下所示：<?name text?>（C++）。"
type: docs
weight: 3300
url: /zh/cpp/system.xml/xmltextwriter/writeprocessinginstruction/
---
## XmlTextWriter::WriteProcessingInstruction method


写出一个处理指令，在名称和文本之间留有空格，如下所示： **<?name text?>**。

```cpp
void System::Xml::XmlTextWriter::WriteProcessingInstruction(String name, String text) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 处理指令的名称。 |
| text | String | [Text](../../../system.text/) 用于包含在处理指令中。 |
## 备注



此方法在已调用 [XmlTextWriter::WriteStartDocument](../writestartdocument/) 之后，用于创建 XML 声明。
## 另见

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
