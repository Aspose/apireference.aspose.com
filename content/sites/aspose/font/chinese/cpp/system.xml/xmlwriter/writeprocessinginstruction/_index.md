---
title: "System::Xml::XmlWriter::WriteProcessingInstruction 方法"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction 方法。 当在派生类中被重写时，会输出带有名称和文本之间空格的处理指令，如下所示： <?name text?>（C++）。"
type: docs
weight: 2700
url: /zh/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


在派生类中重写时，写出处理指令，名称和文本之间有一个空格，如下所示： **<?name text?>**。

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 处理指令的名称。 |
| 文本 | String | 要包含在处理指令中的文本。 |
## 备注



此方法用于在已调用 [XmlWriter::WriteStartDocument](../writestartdocument/) 之后创建 XML 声明。
## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
