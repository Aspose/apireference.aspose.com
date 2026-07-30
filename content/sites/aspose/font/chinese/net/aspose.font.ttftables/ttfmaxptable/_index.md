---
title: "类 TtfMaxpTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfMaxpTable 类。表示 TTF 字体文件的 maxp 表"
type: docs
weight: 1170
url: /zh/net/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class

表示 "maxp" 表的 TTF 字体文件。

```csharp
public class TtfMaxpTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [MaxComponentContours](../../aspose.font.ttftables/ttfmaxptable/maxcomponentcontours/) { get; } | 获取 uint16 maxComponentContours 复合字形中的轮廓数。 |
| [MaxComponentDepth](../../aspose.font.ttftables/ttfmaxptable/maxcomponentdepth/) { get; } | 获取 uint16 maxComponentDepth 递归层级数，如果字体仅包含简单字形则设为 0。 |
| [MaxComponentElements](../../aspose.font.ttftables/ttfmaxptable/maxcomponentelements/) { get; } | 获取 uint16 maxComponentElements 顶层引用的字形数量。 |
| [MaxComponentPoints](../../aspose.font.ttftables/ttfmaxptable/maxcomponentpoints/) { get; } | 获取 uint16 maxComponentPoints 复合字形中的点数。 |
| [MaxContours](../../aspose.font.ttftables/ttfmaxptable/maxcontours/) { get; } | 获取 uint16 maxContours 非复合字形中的轮廓数。 |
| [MaxFunctionDefs](../../aspose.font.ttftables/ttfmaxptable/maxfunctiondefs/) { get; } | 获取 uint16 maxFunctionDefs FDEF 的数量。 |
| [MaxInstructionDefs](../../aspose.font.ttftables/ttfmaxptable/maxinstructiondefs/) { get; } | 获取 uint16 maxInstructionDefs IDEF 的数量。 |
| [MaxPoints](../../aspose.font.ttftables/ttfmaxptable/maxpoints/) { get; } | 获取 uint16 maxPoints 非复合字形中的点数。 |
| [MaxSizeOfInstructions](../../aspose.font.ttftables/ttfmaxptable/maxsizeofinstructions/) { get; } | 获取 uint16 maxSizeOfInstructions 字形指令的字节计数。 |
| [MaxStackElements](../../aspose.font.ttftables/ttfmaxptable/maxstackelements/) { get; } | 获取 uint16 maxStackElements 最大堆栈深度。 |
| [MaxStorage](../../aspose.font.ttftables/ttfmaxptable/maxstorage/) { get; } | 获取 uint16 maxStorage 存储区位置的数量。 |
| [MaxTwilightPoints](../../aspose.font.ttftables/ttfmaxptable/maxtwilightpoints/) { get; } | 获取 uint16 maxTwilightPoints 在暮光区 (Z0) 中使用的点数。 |
| [MaxZones](../../aspose.font.ttftables/ttfmaxptable/maxzones/) { get; } | 获取 uint16 maxZones，设为 2。 |
| [NumGlyphs](../../aspose.font.ttftables/ttfmaxptable/numglyphs/) { get; } | 获取 uint16 numGlyphs 字体中的字形数量。 |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TableVersion](../../aspose.font.ttftables/ttfmaxptable/tableversion/) { get; } | 获取格式版本。使用对象 [`Version16Dot16`](../../aspose.font.ttfcommon/version16dot16/) 的属性 MajorNumber 和 MinorNUmber，以十六进制表示法检测使用的版本。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| [Version](../../aspose.font.ttftables/ttfmaxptable/version/) { get; } | 获取固定版本 0x00010000（如果为版本 1.0）。已弃用，请改用 [`TableVersion`](./tableversion/) 属性。 |
| static [Tag](../../aspose.font.ttftables/ttfmaxptable/tag/) { get; } | 获取表标签。 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


