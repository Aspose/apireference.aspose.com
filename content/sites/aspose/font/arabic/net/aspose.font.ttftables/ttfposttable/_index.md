---
title: "الفئة TtfPostTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfPostTable. تمثّل جدول post لملف الخط TTF."
type: docs
weight: 1280
url: /ar/net/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class

يمثل جدول "post" لملف خط TTF.

```csharp
public class TtfPostTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [Format](../../aspose.font.ttftables/ttfposttable/format/) { get; } | يسترجع تنسيق ثابت (الإصدار) لهذا الجدول. مهجور، استخدم خاصية [`TableFormat`](./tableformat/). |
| [HasNoPostScriptNames](../../aspose.font.ttftables/ttfposttable/hasnopostscriptnames/) { get; } | يشير إلى عدم توفير معلومات اسم PostScript للرموز في ملف الخط هذا. |
| [IsFixedPitch](../../aspose.font.ttftables/ttfposttable/isfixedpitch/) { get; } | يسترجع uint32 isFixedPitch. 0 إذا كان الخط متباعدًا بنسبية، غير صفر إذا كان الخط غير متباعد بنسبية (أي ثابت العرض). |
| [ItalicAngle](../../aspose.font.ttftables/ttfposttable/italicangle/) { get; } | يسترجع قيمة ثابتة italicAngle. زاوية الميلان بالدرجات. |
| [MaxMemType1](../../aspose.font.ttftables/ttfposttable/maxmemtype1/) { get; } | يسترجع uint32 maxMemType1. الحد الأقصى لاستخدام الذاكرة عند تنزيل خط TrueType كخط Type 1. |
| [MaxMemType42](../../aspose.font.ttftables/ttfposttable/maxmemtype42/) { get; } | يسترجع uint32 maxMemType42. الحد الأقصى لاستخدام الذاكرة عند تنزيل خط TrueType كخط Type 42. |
| [MinMemType1](../../aspose.font.ttftables/ttfposttable/minmemtype1/) { get; } | يسترجع uint32 minMemType1. الحد الأدنى لاستخدام الذاكرة عند تنزيل خط TrueType كخط Type 1. |
| [MinMemType42](../../aspose.font.ttftables/ttfposttable/minmemtype42/) { get; } | يسترجع uint32 minMemType42. الحد الأدنى لاستخدام الذاكرة عند تنزيل خط TrueType كخط Type 42. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TableFormat](../../aspose.font.ttftables/ttfposttable/tableformat/) { get; } | يسترجع تنسيق ثابت (الإصدار) لهذا الجدول. استخدم الخصائص MajorNumber و MinorNUmber للكائن [`Version16Dot16`](../../aspose.font.ttfcommon/version16dot16/) في التدوين السداسي عشري لتحديد الإصدار المستخدم. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| [UnderlinePosition](../../aspose.font.ttftables/ttfposttable/underlineposition/) { get; } | يسترجع قيمة FWord underlinePosition. |
| [UnderlineThickness](../../aspose.font.ttftables/ttfposttable/underlinethickness/) { get; } | يسترجع قيمة FWord underlineThickness. |
| static [Tag](../../aspose.font.ttftables/ttfposttable/tag/) { get; } | يحصل على علامة الجدول. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [GetAllGlyphIndexesForGlyphName](../../aspose.font.ttftables/ttfposttable/getallglyphindexesforglyphname/)(string) | يسترجع مصفوفة مؤشرات الرموز حسب اسم الرمز. |
| [GetGlyphIndex](../../aspose.font.ttftables/ttfposttable/getglyphindex/)(string) | يسترجع مؤشر الرمز حسب اسم الرمز. |
| [GetGlyphName](../../aspose.font.ttftables/ttfposttable/getglyphname/)(uint) | يسترجع اسم الرمز حسب مؤشر الرمز. |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


