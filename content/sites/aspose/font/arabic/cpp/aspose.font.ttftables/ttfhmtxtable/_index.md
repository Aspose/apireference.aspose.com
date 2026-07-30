---
title: "Aspose::Font::TtfTables::TtfHmtxTable فئة"
linktitle: "TtfHmtxTable"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable فئة. يمثل جدول \"hmtx\" لملف الخط TTF في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.font.ttftables/ttfhmtxtable/
---
## TtfHmtxTable class


يمثل جدول "hmtx" لملف [Font](../../aspose.font/font/) الخط TTF.

```cpp
class TtfHmtxTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [LongHorMetric](./longhormetric/)
* Class [MetricList](./metriclist/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AdditionalAdvanceWidth](./get_additionaladvancewidth/)() | في جدول hmtx قد توجد حالات يكون فيها العدد الإجمالي للرموز غير مساوي لـ hhea.numberOfHMetrics. لهذه الحالات يحتوي جدول hmtx على مصفوفة إضافية 'leftSideBearing' التي تتوافق مع الخاصية [LeftSidebearings](../). لكن الرموز ذات الفهارس من hhea.numOfLongHorMetrics إلى maxp.numGlyphs لها أيضًا عرض. وهذه العروض وفقًا للمواصفة الخاصة بجدول hmtx لها القيم التالية: "هنا يُفترض أن يكون advanceWidth هو نفسه advanceWidth للمدخل الأخير أعلاه". |
| [get_HMetrics](./get_hmetrics/)() | يحصل على مقاييس أفقية. |
| [get_LeftSidebearings](./get_leftsidebearings/)() | يحصل على التحميلات الجانبية اليسرى. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
