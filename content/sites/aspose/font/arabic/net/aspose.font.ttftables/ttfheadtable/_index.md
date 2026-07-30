---
title: "الفئة TtfHeadTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfHeadTable. يمثل جدول head لملف خط TTF"
type: docs
weight: 1090
url: /ar/net/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class

يمثل جدول "head" لملف خط TTF.

```csharp
public class TtfHeadTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [CheckSumAdjustment](../../aspose.font.ttftables/ttfheadtable/checksumadjustment/) { get; } | يحصل على uint32 checkSumAdjustment. لحسابه: اضبطه على 0، احسب المجموع الاختباري لجدول 'head' وضعه في دليل الجداول، اجمع الخط بأكمله كـ uint32، ثم خزن B1B0AFBA - المجموع. المجموع الاختباري لجدول 'head' لن يكون خاطئًا. هذا مقبول. |
| [Created](../../aspose.font.ttftables/ttfheadtable/created/) { get; } | يحصل على longDateTime تاريخ الإنشاء الدولي. |
| [Flags](../../aspose.font.ttftables/ttfheadtable/flags/) { get; } | يحصل على uint16 flags. |
| [FontDirectionHint](../../aspose.font.ttftables/ttfheadtable/fontdirectionhint/) { get; } | يحصل على int16 fontDirectionHint. 0 رموز مختلطة الاتجاه؛ 1 فقط رموز ذات اتجاه قوي من اليسار إلى اليمين؛ 2 مثل 1 ولكن يحتوي أيضًا على محايدات؛ -1 فقط رموز ذات اتجاه قوي من اليمين إلى اليسار؛ -2 مثل -1 ولكن يحتوي أيضًا على محايدات. |
| [FontRevision](../../aspose.font.ttftables/ttfheadtable/fontrevision/) { get; } | يحصل على fixed fontRevision المحدد من قبل صانع الخط. |
| [GlyphDataFormat](../../aspose.font.ttftables/ttfheadtable/glyphdataformat/) { get; } | يحصل على int16 glyphDataFormat 0 للتنسيق الحالي. |
| [IndexToLocFormat](../../aspose.font.ttftables/ttfheadtable/indextolocformat/) { get; } | يحصل على int16 indexToLocFormat 0 للإزاحات القصيرة، 1 للإزاحات الطويلة. |
| [LowestRecPPEM](../../aspose.font.ttftables/ttfheadtable/lowestrecppem/) { get; } | يحصل على uint16 lowestRecPPEM أصغر حجم قابل للقراءة بالبكسل. |
| [MacStyle](../../aspose.font.ttftables/ttfheadtable/macstyle/) { get; } | يحصل على uint16 macStyle. |
| [MagicNumber](../../aspose.font.ttftables/ttfheadtable/magicnumber/) { get; } | يحصل على uint32 magicNumber المحدد إلى 0x5F0F3CF5. |
| [Modified](../../aspose.font.ttftables/ttfheadtable/modified/) { get; } | يحصل على longDateTime تاريخ التعديل الدولي. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| [UnitsPerEM](../../aspose.font.ttftables/ttfheadtable/unitsperem/) { get; } | يحصل على uint16 unitsPerEm النطاق من 64 إلى 16384. |
| [Version](../../aspose.font.ttftables/ttfheadtable/version/) { get; } | الإصدار الثابت 0x00010000 إذا (الإصدار 1.0). |
| [XMax](../../aspose.font.ttftables/ttfheadtable/xmax/) { get; } | يحصل على FWord xMax لجميع مربعات حدود الرموز. |
| [XMin](../../aspose.font.ttftables/ttfheadtable/xmin/) { get; } | يحصل على FWord xMin لجميع مربعات حدود الرموز. |
| [YMax](../../aspose.font.ttftables/ttfheadtable/ymax/) { get; } | يحصل على FWord yMax لجميع مربعات حدود الرموز. |
| [YMin](../../aspose.font.ttftables/ttfheadtable/ymin/) { get; } | يحصل على FWord yMin لجميع مربعات حدود الرموز. |
| static [Tag](../../aspose.font.ttftables/ttfheadtable/tag/) { get; } | يحصل على علامة الجدول. |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


