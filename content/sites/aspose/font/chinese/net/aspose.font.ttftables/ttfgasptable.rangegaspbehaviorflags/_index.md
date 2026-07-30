---
title: "枚举 TtfGaspTable.RangeGaspBehaviorFlags"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfGaspTableRangeGaspBehaviorFlags 枚举。描述所需光栅化行为的标志。"
type: docs
weight: 1070
url: /zh/net/aspose.font.ttftables/ttfgasptable.rangegaspbehaviorflags/
---
## TtfGaspTable.RangeGaspBehaviorFlags enumeration

描述所需光栅化行为的标志。

```csharp
[Flags]
public enum RangeGaspBehaviorFlags : ushort
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| neither | `0` | 可选用于非常大的尺寸，通常 ppem&gt;2048 |
| GASP_GRIDFIT | `1` | 使用网格拟合 |
| GASP_DOGRAY | `2` | 使用灰度渲染 |
| GASP_SYMMETRIC_GRIDFIT | `4` | 使用带 ClearType 对称平滑的网格拟合，仅在版本 1 的 'gasp' 中受支持 |
| GASP_SYMMETRIC_SMOOTHING | `8` | 使用 ClearType® 多轴平滑，仅在版本 1 的 'gasp' 中受支持 |
| Reserved | `FFF0` | 保留标志 — 设置为 0 |

### 另见

* class [TtfGaspTable](../ttfgasptable/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


