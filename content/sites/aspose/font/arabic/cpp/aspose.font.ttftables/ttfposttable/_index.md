---
title: "Aspose::Font::TtfTables::TtfPostTable فئة"
linktitle: "TtfPostTable"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfPostTable فئة. يمثل جدول \"post\" لملف الخط TTF في C++."
type: docs
weight: 1500
url: /ar/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


يمثل جدول "post" لملف [Font](../../aspose.font/font/) الخط TTF.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Format](./get_format/)() | يحصل على تنسيق ثابت (الإصدار) لهذا الجدول. مهجور، استخدم الخاصية [TableFormat](../). |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | يشير إلى عدم توفير معلومات اسم PostScript للرموز في ملف الخط هذا. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | يحصل على uint32 isFixedPitch. 0 إذا كان الخط متباعدًا بنسبة، غير صفر إذا كان الخط غير متباعد بنسبة (أي ثابت العرض). |
| [get_ItalicAngle](./get_italicangle/)() | يحصل على italicAngle ثابت. زاوية الميلان بالدرجات. |
| [get_MaxMemType1](./get_maxmemtype1/)() | يحصل على uint32 maxMemType1 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كـ Type 1 [Font](../../aspose.font/font/). |
| [get_MaxMemType42](./get_maxmemtype42/)() | يحصل على uint32 maxMemType42 الحد الأقصى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كـ Type 42 [Font](../../aspose.font/font/). |
| [get_MinMemType1](./get_minmemtype1/)() | يحصل على uint32 minMemType1 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كـ Type 1 [Font](../../aspose.font/font/). |
| [get_MinMemType42](./get_minmemtype42/)() | يحصل على uint32 minMemType42 الحد الأدنى لاستخدام الذاكرة عندما يتم تنزيل خط TrueType كـ Type 42 [Font](../../aspose.font/font/). |
| [get_TableFormat](./get_tableformat/)() | يحصل على تنسيق ثابت (الإصدار) لهذا الجدول. استخدم الخصائص MajorNumber و MinorNUmber للكائن [Version16Dot16](../) في الترميز السداسي عشري لتحديد الإصدار المستخدم. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
| [get_UnderlinePosition](./get_underlineposition/)() | يحصل على قيمة FWord underlinePosition. |
| [get_UnderlineThickness](./get_underlinethickness/)() | يحصل على قيمة FWord underlineThickness. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | يحصل على مصفوفة فهارس glyphs حسب اسم glyph. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | يحصل على فهرس glyph حسب اسم glyph. |
| [GetGlyphName](./getglyphname/)(uint32_t) | يحصل على اسم glyph حسب فهرس glyph. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
