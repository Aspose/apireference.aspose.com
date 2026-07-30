---
title: "Aspose::Font::TtfTables::TtfMaxpTable 类"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfMaxpTable 类。表示 TTF 字体文件中 C++ 的 \"maxp\" 表。"
type: docs
weight: 1200
url: /zh/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


表示 TTF [Font](../../aspose.font/font/) 文件中的 "maxp" 表。

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | 获取 uint16 maxComponentContours，即复合字形中的轮廓数。 |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | 获取 uint16 maxComponentDepth，即递归层级数；如果字体仅包含简单字形，则设为 0。 |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | 获取 uint16 maxComponentElements，即顶层引用的字形数量。 |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | 获取 uint16 maxComponentPoints，即复合字形中的点数。 |
| [get_MaxContours](./get_maxcontours/)() const | 获取 uint16 maxContours，即非复合字形的轮廓数。 |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | 获取 uint16 maxFunctionDefs，即 FDEF 的数量。 |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | 获取 uint16 maxInstructionDefs 的 IDEF 数量。 |
| [get_MaxPoints](./get_maxpoints/)() const | 获取 uint16 maxPoints 在非复合字形中的点数。 |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | 获取 uint16 maxSizeOfInstructions 的字节计数，用于字形指令。 |
| [get_MaxStackElements](./get_maxstackelements/)() const | 获取 uint16 maxStackElements 的最大堆栈深度。 |
| [get_MaxStorage](./get_maxstorage/)() const | 获取 uint16 maxStorage 的存储区位置数量。 |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | 获取 uint16 maxTwilightPoints 在暮光区 (Z0) 中使用的点数。 |
| [get_MaxZones](./get_maxzones/)() const | 获取 uint16 maxZones，设置为 2。 |
| [get_NumGlyphs](./get_numglyphs/)() const | 获取 uint16 numGlyphs，即 [Font](../../aspose.font/font/) 中的字形数量。 |
| [get_TableVersion](./get_tableversion/)() const | 获取格式版本。使用对象 [Version16Dot16](../) 的属性 MajorNumber 和 MinorNUmber（十六进制表示）来检测使用的版本。 |
| static [get_Tag](./get_tag/)() | 获取表标签。 |
| [get_Version](./get_version/)() const | 获取固定版本 0x00010000（如果为版本 1.0）。已弃用，请改用 [TableVersion](../) 属性。 |
## 另见

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
