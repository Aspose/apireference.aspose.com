---
title: "System::Xml::DtdProcessing 枚举"
linktitle: "DtdProcessing"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::DtdProcessing 枚举。指定处理 DTD 的选项。DtdProcessing 枚举在 C++ 中由 XmlReaderSettings 类使用。"
type: docs
weight: 4700
url: /zh/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


指定处理 DTD 的选项。 [DtdProcessing](./) 枚举由 [XmlReaderSettings](../xmlreadersettings/) 类使用。

```cpp
enum class DtdProcessing
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Prohibit | 0 | 指定当遇到 DTD 时，会抛出带有说明 DTD 被禁止的消息的 [XmlException](../xmlexception/)。这是默认行为。 |
| 忽略 | 1 | 导致 DOCTYPE 元素被忽略。不进行 DTD 处理，且在输出时 DTD/DOCTYPE 丢失。 |
| 解析 | 2 | 用于解析 DTD。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
