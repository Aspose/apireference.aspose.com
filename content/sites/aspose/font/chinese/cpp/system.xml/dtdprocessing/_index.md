---
title: "System::Xml::DtdProcessing 枚举"
linktitle: "DtdProcessing"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::DtdProcessing 枚举。指定处理 DTD 的选项。C++ 中的 XmlReaderSettings 类使用 DtdProcessing 枚举。"
type: docs
weight: 4700
url: /zh/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


指定处理 DTD 的选项。[DtdProcessing](./) 枚举由 [XmlReaderSettings](../xmlreadersettings/) 类使用。

```cpp
enum class DtdProcessing
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Prohibit | 0 | 指定当遇到 DTD 时，会抛出 [XmlException](../xmlexception/)，其消息说明 DTD 被禁止。这是默认行为。 |
| Ignore | 1 | 导致 DOCTYPE 元素被忽略。不进行 DTD 处理，输出时 DTD/DOCTYPE 将丢失。 |
| 解析 | 2 | 用于解析 DTD。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
