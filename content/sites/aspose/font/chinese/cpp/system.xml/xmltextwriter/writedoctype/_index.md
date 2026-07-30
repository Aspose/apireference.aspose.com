---
title: "System::Xml::XmlTextWriter::WriteDocType 方法"
linktitle: "WriteDocType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextWriter::WriteDocType 方法。以 C++ 写出带有指定名称和可选属性的 DOCTYPE 声明。"
type: docs
weight: 2500
url: /zh/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


使用指定的名称和可选属性写出 DOCTYPE 声明。

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | DOCTYPE 的名称。此名称不能为空。 |
| pubid | const String\& | 如果非空，它还会写入 PUBLIC "pubid" "sysid"，其中 **pubid** 和 **sysid** 将被给定参数的值替换。 |
| sysid | const String\& | 如果 **pubid** 为 null 且 **sysid** 为非 null，它写入 SYSTEM "sysid"，其中 **sysid** 被替换为此参数的值。 |
| subset | const String\& | 如果非 null，它写入 [subset]，其中 subset 被替换为此参数的值。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
