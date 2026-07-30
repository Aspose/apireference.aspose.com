---
title: "TtfHeadTable.CheckSumAdjustment"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfHeadTable 属性。获取 uint32 checkSumAdjustment。计算时先将其设为 0，计算 head 表的校验和并放入表目录，将整个字体作为 uint32 求和，然后存储 B1B0AFBA 之和。head 表的校验和不会错误，没问题。"
type: docs
weight: 10
url: /zh/net/aspose.font.ttftables/ttfheadtable/checksumadjustment/
---
## TtfHeadTable.CheckSumAdjustment property

获取 uint32 checkSumAdjustment。计算方法：将其设为 0，计算 'head' 表的校验和并放入表目录，按 uint32 对整个字体求和，然后存储 B1B0AFBA - sum。'head' 表的校验和不会错误。这样即可。

```csharp
public uint CheckSumAdjustment { get; }
```

### 另见

* class [TtfHeadTable](../)
* namespace [Aspose.Font.TtfTables](../../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../../)


