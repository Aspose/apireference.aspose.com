---
title: "Aspose::Font::TtfTables::TtfPostTable sınıfı"
linktitle: "TtfPostTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfPostTable sınıfı. C++'da TTF Font dosyasının \"post\" tablosunu temsil eder."
type: docs
weight: 1500
url: /tr/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


TTF [Font](../../aspose.font/font/) dosyasının "post" tablosunu temsil eder.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Format](./get_format/)() | Bu tablonun sabit biçimini (versiyon) alır. Kullanımdan kaldırıldı, [TableFormat](../) özelliğini kullanın. |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | Bu font dosyasındaki glifler için PostScript adı bilgisinin sağlanmadığını gösterir. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | uint32 isFixedPitch değerini alır. Font orantılı aralıklı ise 0, orantılı aralıklı değilse (yani monospaced) sıfır olmayan bir değer döner. |
| [get_ItalicAngle](./get_italicangle/)() | Sabit italicAngle değerini alır. Italic açısı derece cinsindendir. |
| [get_MaxMemType1](./get_maxmemtype1/)() | TrueType fontu Type 1 [Font](../../aspose.font/font/) olarak indirildiğinde maksimum bellek kullanımını gösteren uint32 maxMemType1 değerini alır. |
| [get_MaxMemType42](./get_maxmemtype42/)() | TrueType fontu Type 42 [Font](../../aspose.font/font/) olarak indirildiğinde maksimum bellek kullanımını gösteren uint32 maxMemType42 değerini alır. |
| [get_MinMemType1](./get_minmemtype1/)() | TrueType fontu Type 1 [Font](../../aspose.font/font/) olarak indirildiğinde minimum bellek kullanımını gösteren uint32 minMemType1 değerini alır. |
| [get_MinMemType42](./get_minmemtype42/)() | TrueType fontu Type 42 [Font](../../aspose.font/font/) olarak indirildiğinde minimum bellek kullanımını gösteren uint32 minMemType42 değerini alır. |
| [get_TableFormat](./get_tableformat/)() | Bu tablonun sabit biçimini (versiyon) alır. Kullanılan sürümü tespit etmek için [Version16Dot16](../) nesnesinin MajorNumber ve MinorNUmber özelliklerini onaltılık gösterimde kullanın. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
| [get_UnderlinePosition](./get_underlineposition/)() | FWord underlinePosition değerini alır. |
| [get_UnderlineThickness](./get_underlinethickness/)() | FWord underlineThickness değerini alır. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | Glif adlarına göre glif indekslerinin dizisini alır. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | Glif adına göre glif indeksini alır. |
| [GetGlyphName](./getglyphname/)(uint32_t) | Glif indeksine göre glif adını alır. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
