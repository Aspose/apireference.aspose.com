---
title: "System::Xml::XmlWriter::WriteDocType 方法"
linktitle: "WriteDocType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::WriteDocType 方法。当在派生类中被重写时，使用指定的名称和可选属性写入 DOCTYPE 声明（C++）。"
type: docs
weight: 1700
url: /zh/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


在派生类中重写时，使用指定的名称和可选属性写入 DOCTYPE 声明。

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | DOCTYPE 的名称。此名称不能为空。 |
| pubid | const String\& | 如果非空，它还会写入 PUBLIC "pubid" "sysid"，其中 **pubid** 和 **sysid** 将被给定参数的值替换。 |
| sysid | const String\& | 如果 **pubid** 为 **nullptr** 且 **sysid** 为非空，它会写入 SYSTEM \"sysid\"，其中 **sysid** 将被此参数的值替换。 |
| subset | const String\& | 如果非 null，它写入 [subset]，其中 subset 被替换为此参数的值。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
