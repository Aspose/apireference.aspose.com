---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags 枚举"
linktitle: "AxisValueTableFlags"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags 枚举。指定轴值表标志（C++）。"
type: docs
weight: 1200
url: /zh/cpp/aspose.font.ttftables/ttfstattable/axisvaluetableflags/
---
## AxisValueTableFlags enum


指定轴值表标志。

```cpp
enum class AxisValueTableFlags : uint16_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| OlderSiblingFontAttribute | n/a | 如果设置，此轴值表提供适用于同一字体系列中其他字体的轴值信息。如果其他字体较早发布且未包含某些轴的值信息，则使用此表。如果其他字体的更新版本已包含这些信息并且存在，则此表将被忽略。 |
| ElidableAxisValueName | n/a | 如果设置，它表示该轴值是轴的“正常”值，在组合名称字符串时可以省略。 |
| Reserved | n/a | 保留供将来使用。 |

## 另见

* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
