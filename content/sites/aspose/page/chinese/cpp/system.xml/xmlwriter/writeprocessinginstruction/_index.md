---
title: "System::Xml::XmlWriter::WriteProcessingInstruction 方法"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction 方法。 当在派生类中被重写时，以 C++ 写出处理指令，名称和文本之间有一个空格，格式如下：<?name text?>。"
type: docs
weight: 2700
url: /zh/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


当在派生类中被重写时，写出如下带有名称和文本之间空格的处理指令： **<?name text?>**。

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 处理指令的名称。 |
| text | 字符串 | 要包含在处理指令中的文本。 |
## 备注



此方法用于在已调用 [XmlWriter::WriteStartDocument](../writestartdocument/) 后创建 XML 声明。
## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
