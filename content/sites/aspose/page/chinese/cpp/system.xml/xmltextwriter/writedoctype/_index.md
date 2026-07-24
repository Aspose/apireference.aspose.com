---
title: "System::Xml::XmlTextWriter::WriteDocType 方法"
linktitle: "WriteDocType"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteDocType 方法。在 C++ 中写出具有指定名称和可选属性的 DOCTYPE 声明。"
type: docs
weight: 2500
url: /zh/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


写出带有指定名称和可选属性的 DOCTYPE 声明。

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | DOCTYPE 的名称。此名称不能为空。 |
| pubid | const String\& | 如果非空，它还会写入 PUBLIC \"pubid\" \"sysid\"，其中 **pubid** 和 **sysid** 将被给定参数的值替换。 |
| sysid | const String\& | 如果 **pubid** 为 null 且 **sysid** 为非空，则写入 SYSTEM \"sysid\"，其中 **sysid** 将被此参数的值替换。 |
| subset | const String\& | 如果非空，它会写入 [subset]，其中 subset 将被此参数的值替换。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
