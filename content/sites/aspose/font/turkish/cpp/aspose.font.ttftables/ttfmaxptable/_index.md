---
title: "Aspose::Font::TtfTables::TtfMaxpTable sınıfı"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfMaxpTable sınıfı. C++'da TTF Font dosyasının \"maxp\" tablosunu temsil eder."
type: docs
weight: 1200
url: /tr/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


TTF [Font](../../aspose.font/font/) dosyasının "maxp" tablosunu temsil eder.

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | Bileşik glifteki konturların sayısı olan uint16 maxComponentContours değerini alır. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | Yineleme seviyelerinin sayısı olan uint16 maxComponentDepth değerini alır, font sadece basit glifler içeriyorsa 0 olarak ayarlanır. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | Üst seviyede referans verilen glif sayısı olan uint16 maxComponentElements değerini alır. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | Bileşik glifteki nokta sayısı olan uint16 maxComponentPoints değerini alır. |
| [get_MaxContours](./get_maxcontours/)() const | Bileşik olmayan glifteki kontur sayısı olan uint16 maxContours değerini alır. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | FDEF sayısı olan uint16 maxFunctionDefs değerini alır. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | uint16 maxInstructionDefs IDEF sayısını alır. |
| [get_MaxPoints](./get_maxpoints/)() const | uint16 maxPoints, bileşik olmayan glifteki noktaları alır. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | uint16 maxSizeOfInstructions, glif talimatları için bayt sayısını alır. |
| [get_MaxStackElements](./get_maxstackelements/)() const | uint16 maxStackElements, maksimum yığın derinliğini alır. |
| [get_MaxStorage](./get_maxstorage/)() const | uint16 maxStorage, Depolama Alanı konumlarının sayısını alır. |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | uint16 maxTwilightPoints, Alacakaranlık Bölgesi (Z0)'de kullanılan noktaları alır. |
| [get_MaxZones](./get_maxzones/)() const | uint16 maxZones, 2 olarak ayarlanır. |
| [get_NumGlyphs](./get_numglyphs/)() const | uint16 numGlyphs, [Font](../../aspose.font/font/) içindeki glif sayısını alır. |
| [get_TableVersion](./get_tableversion/)() const | Biçim sürümünü alır. Kullanılan sürümü tespit etmek için [Version16Dot16](../) nesnesinin MajorNumber ve MinorNUmber özelliklerini onaltılık gösterimde kullanın. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
| [get_Version](./get_version/)() const | Sürüm 1.0 ise sabit sürüm 0x00010000 değerini alır. Kullanımdan kaldırıldı, bunun yerine [TableVersion](../) özelliğini kullanın. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
