---
title: "类 TtfCMapTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfCMapTable 类。表示 TTF 字体文件的 cmap 表"
type: docs
weight: 1000
url: /zh/net/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class

表示 TTF 字体文件的 "cmap" 表。

```csharp
public class TtfCMapTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| static [Tag](../../aspose.font.ttftables/ttfcmaptable/tag/) { get; } | 获取表标签。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [FindUnicodeTable](../../aspose.font.ttftables/ttfcmaptable/findunicodetable/)() | 搜索并返回 Unicode CMap。如果存在 ucs-4 CMap，则首先返回它；否则返回找到的任何 Unicode CMap。 |
| [GetAllSubtables](../../aspose.font.ttftables/ttfcmaptable/getallsubtables/)() | 返回 CMap 表中的所有子表。 |
| [GetPlatformTables](../../aspose.font.ttftables/ttfcmaptable/getplatformtables/)(ushort, ushort) | 返回针对 planformId 和 platformSpecificId 的 CMap 子表。 |

## 其他成员

| 名称 | 描述 |
| --- | --- |
| abstract class [TtfCMapSubtableDescription](../../aspose.font.ttftables/ttfcmaptable.ttfcmapsubtabledescription) | 提供关于 CMap 子表的简要信息。 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


