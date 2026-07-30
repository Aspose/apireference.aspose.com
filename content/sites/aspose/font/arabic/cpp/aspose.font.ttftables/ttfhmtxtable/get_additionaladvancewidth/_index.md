---
title: "طريقة Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth"
linktitle: "get_AdditionalAdvanceWidth"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth. قد تكون هناك حالات في جدول hmtx عندما لا يكون العدد الإجمالي للرموز (glyphs) مساويًا لـ hhea.numberOfHMetrics. لهذه الحالات يحتوي جدول hmtx على مصفوفة إضافية ''leftSideBearing'' التي تتطابق مع الخاصية LeftSidebearings. لكن الرموز ذات الفهارس من hhea.numOfLongHorMetrics إلى maxp.numGlyphs لها أيضًا عرض. وهذه العروض وفقًا للمواصفة الخاصة بجدول hmtx لها القيم التالية: \"Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above\" في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


في جدول hmtx قد توجد حالات يكون فيها العدد الإجمالي للرموز غير مساوي لـ hhea.numberOfHMetrics. لهذه الحالات يحتوي جدول hmtx على مصفوفة إضافية 'leftSideBearing' التي تتوافق مع الخاصية [LeftSidebearings](../). لكن الرموز ذات الفهارس من hhea.numOfLongHorMetrics إلى maxp.numGlyphs لها أيضًا عرض. وهذه العروض وفقًا للمواصفة الخاصة بجدول hmtx لها القيم التالية: "هنا يُفترض أن يكون advanceWidth هو نفسه advanceWidth للمدخل الأخير أعلاه".

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## انظر أيضًا

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
