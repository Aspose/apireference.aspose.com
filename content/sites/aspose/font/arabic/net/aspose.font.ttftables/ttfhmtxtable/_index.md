---
title: "الفئة TtfHmtxTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfHmtxTable. تمثل جدول hmtx لملف الخط TTF"
type: docs
weight: 1110
url: /ar/net/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class

يمثل جدول "hmtx" لملف خط TTF.

```csharp
public class TtfHmtxTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AdditionalAdvanceWidth](../../aspose.font.ttftables/ttfhmtxtable/additionaladvancewidth/) { get; } | في جدول hmtx قد توجد حالات يكون فيها إجمالي عدد الأحرف غير مساوي لـ hhea.numberOfHMetrics. لهذه الحالات يحتوي جدول hmtx على مصفوفة إضافية 'leftSideBearing' التي تتطابق مع الخاصية [`LeftSidebearings`](./leftsidebearings/). لكن الأحرف ذات الفهارس من hhea.numOfLongHorMetrics إلى maxp.numGlyphs لها أيضًا عرض. وهذه العروض وفقًا للمواصفة الخاصة بجدول hmtx لها القيم التالية: \"هنا يُفترض أن يكون advanceWidth هو نفسه advanceWidth للمدخل الأخير أعلاه\". |
| [HMetrics](../../aspose.font.ttftables/ttfhmtxtable/hmetrics/) { get; } | يحصل على المقاييس الأفقية. |
| [LeftSidebearings](../../aspose.font.ttftables/ttfhmtxtable/leftsidebearings/) { get; } | يسترجع المسافات الجانبية اليسرى. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| static [Tag](../../aspose.font.ttftables/ttfhmtxtable/tag/) { get; } | يحصل على علامة الجدول. |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


