---
title: "枚举 TtfStatTable.AxisValueTableFlags"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfStatTableAxisValueTableFlags 枚举。指定轴值表标志"
type: docs
weight: 1340
url: /zh/net/aspose.font.ttftables/ttfstattable.axisvaluetableflags/
---
## TtfStatTable.AxisValueTableFlags enumeration

指定轴值表标志

```csharp
[Flags]
public enum AxisValueTableFlags : ushort
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| OlderSiblingFontAttribute | `1` | 如果设置，此轴值表提供适用于同一字体系列中其他字体的轴值信息。如果其他字体较早发布且未包含某些轴的值信息，则使用此表。如果其他字体的较新版本已自行包含该信息并且存在，则此表将被忽略。 |
| ElidableAxisValueName | `2` | 如果设置，它表示该轴值为轴的“正常”值，在组合名称字符串时可以省略。 |
| Reserved | `FFFC` | 保留供将来使用 |

### 另见

* class [TtfStatTable](../ttfstattable/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


