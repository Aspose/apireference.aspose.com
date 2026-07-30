---
title: "System::Xml::XmlTextWriter::WriteProcessingInstruction 方法"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteProcessingInstruction 方法。以如下形式在 C++ 中写出处理指令，在名称和文本之间留有空格：<?name text?>。"
type: docs
weight: 3300
url: /zh/cpp/system.xml/xmltextwriter/writeprocessinginstruction/
---
## XmlTextWriter::WriteProcessingInstruction method


写出一条处理指令，在名称和文本之间留有空格，如下所示： **<?name text?>**。

```cpp
void System::Xml::XmlTextWriter::WriteProcessingInstruction(String name, String text) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 处理指令的名称。 |
| text | String | [Text](../../../system.text/) 用于包含在处理指令中。 |
## 备注



此方法用于在已调用 [XmlTextWriter::WriteStartDocument](../writestartdocument/) 之后创建 XML 声明。
## 另见

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
