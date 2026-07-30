---
title: "类 TtfHeadTable"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfTables.TtfHeadTable 类。表示 TTF 字体文件的 head 表。"
type: docs
weight: 1090
url: /zh/net/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class

表示 TTF 字体文件的 "head" 表。

```csharp
public class TtfHeadTable : TtfTableBase
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [CheckSumAdjustment](../../aspose.font.ttftables/ttfheadtable/checksumadjustment/) { get; } | 获取 uint32 checkSumAdjustment。计算方法：将其设为 0，计算 'head' 表的校验和并放入表目录，按 uint32 对整个字体求和，然后存储 B1B0AFBA - sum。'head' 表的校验和不会错误。这样即可。 |
| [Created](../../aspose.font.ttftables/ttfheadtable/created/) { get; } | 获取 longDateTime 创建的国际日期。 |
| [Flags](../../aspose.font.ttftables/ttfheadtable/flags/) { get; } | 获取 uint16 flags。 |
| [FontDirectionHint](../../aspose.font.ttftables/ttfheadtable/fontdirectionhint/) { get; } | 获取 int16 fontDirectionHint。0 混合方向字形；1 仅强左到右字形；2 同 1，但也包含中性字形；-1 仅强右到左字形；-2 同 -1，但也包含中性字形。 |
| [FontRevision](../../aspose.font.ttftables/ttfheadtable/fontrevision/) { get; } | 获取由字体制造商设置的 fixed fontRevision。 |
| [GlyphDataFormat](../../aspose.font.ttftables/ttfheadtable/glyphdataformat/) { get; } | 获取 int16 glyphDataFormat，0 表示当前格式。 |
| [IndexToLocFormat](../../aspose.font.ttftables/ttfheadtable/indextolocformat/) { get; } | 获取 int16 indexToLocFormat，0 表示短偏移，1 表示长偏移。 |
| [LowestRecPPEM](../../aspose.font.ttftables/ttfheadtable/lowestrecppem/) { get; } | 获取 uint16 lowestRecPPEM，最小可读像素尺寸。 |
| [MacStyle](../../aspose.font.ttftables/ttfheadtable/macstyle/) { get; } | 获取 uint16 macStyle。 |
| [MagicNumber](../../aspose.font.ttftables/ttfheadtable/magicnumber/) { get; } | 获取 uint32 magicNumber，设置为 0x5F0F3CF5。 |
| [Modified](../../aspose.font.ttftables/ttfheadtable/modified/) { get; } | 获取 longDateTime 修改的国际日期。 |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | 获取 sfnt 开始处的偏移。 |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | 对 TTF 表仓库的引用。 |
| [UnitsPerEM](../../aspose.font.ttftables/ttfheadtable/unitsperem/) { get; } | 获取 uint16 unitsPerEm，范围为 64 到 16384。 |
| [Version](../../aspose.font.ttftables/ttfheadtable/version/) { get; } | 固定版本 0x00010000（如果版本为 1.0）。 |
| [XMax](../../aspose.font.ttftables/ttfheadtable/xmax/) { get; } | 获取所有字形边界框的 FWord xMax。 |
| [XMin](../../aspose.font.ttftables/ttfheadtable/xmin/) { get; } | 获取所有字形边界框的 FWord xMin。 |
| [YMax](../../aspose.font.ttftables/ttfheadtable/ymax/) { get; } | 获取所有字形边界框的 FWord yMax。 |
| [YMin](../../aspose.font.ttftables/ttfheadtable/ymin/) { get; } | 获取所有字形边界框的 FWord yMin。 |
| static [Tag](../../aspose.font.ttftables/ttfheadtable/tag/) { get; } | 获取表标签。 |

### 另见

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


