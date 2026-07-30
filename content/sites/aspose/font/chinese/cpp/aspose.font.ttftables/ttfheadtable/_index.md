---
title: "Aspose::Font::TtfTables::TtfHeadTable 类"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfHeadTable 类。表示 C++ 中 TTF 字体文件的 \"head\" 表。"
type: docs
weight: 700
url: /zh/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


表示 TTF [Font](../../aspose.font/font/) 文件的 "head" 表。

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | 获取 uint32 checkSumAdjustment。计算方法：先将其设为 0，计算 'head' 表的校验和并放入表目录，按 uint32 对整个字体求和，然后存储 B1B0AFBA - sum。'head' 表的校验和不会出错。这样即可。 |
| [get_Created](./get_created/)() const | 获取 longDateTime 创建的国际日期。 |
| [get_Flags](./get_flags/)() const | 获取 uint16 flags。 |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | 获取 int16 fontDirectionHint。0 混合方向字形；1 仅强左到右字形；2 同 1，但也包含中性字形；-1 仅强右到左字形；-2 同 -1，但也包含中性字形。 |
| [get_FontRevision](./get_fontrevision/)() const | 获取 由字体制造商设置的 fixed fontRevision。 |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | 获取 int16 glyphDataFormat，0 表示当前格式。 |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | 获取 int16 indexToLocFormat，0 表示短偏移，1 表示长偏移。 |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | 获取 uint16 lowestRecPPEM，像素单位的最小可读尺寸。 |
| [get_MacStyle](./get_macstyle/)() const | 获取 uint16 macStyle。 |
| [get_MagicNumber](./get_magicnumber/)() const | 获取 uint32 magicNumber，设置为 0x5F0F3CF5。 |
| [get_Modified](./get_modified/)() const | 获取 longDateTime 修改的国际日期。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
| [get_UnitsPerEM](./get_unitsperem/)() const | 获取 uint16 unitsPerEm，范围为 64 到 16384。 |
| [get_Version](./get_version/)() const | 固定版本 0x00010000（如果为版本 1.0）。 |
| [get_XMax](./get_xmax/)() const | 获取所有字形包围盒的 FWord xMax。 |
| [get_XMin](./get_xmin/)() const | 获取所有字形包围盒的 FWord xMin。 |
| [get_YMax](./get_ymax/)() const | 获取所有字形包围盒的 FWord yMax。 |
| [get_YMin](./get_ymin/)() const | 获取所有字形包围盒的 FWord yMin。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
