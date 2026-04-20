---
title: "Aspose::Font::TtfTables::TtfStatTable فئة"
linktitle: "TtfStatTable"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfStatTable class. يمثل جدول سمات النمط (STAT) لخط OpenType في C++."
type: docs
weight: 1700
url: /ar/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


يمثل جدول Style Attributes Table(STAT) لخط OpenType.

```cpp
class TtfStatTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [AxisRecord](./axisrecord/)
* Class [AxisValue](./axisvalue/)
* Class [AxisValueTableBase](./axisvaluetablebase/)
* Class [AxisValueTableFormat1](./axisvaluetableformat1/)
* Class [AxisValueTableFormat2](./axisvaluetableformat2/)
* Class [AxisValueTableFormat3](./axisvaluetableformat3/)
* Class [AxisValueTableFormat4](./axisvaluetableformat4/)
## Enums

| تعداد | الوصف |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | يحدد أعلام جدول قيم المحور. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | يضيف بنية سجل المحور إلى الجدول. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | يضيف بنية جدول قيم المحور إلى الجدول. |
| [ClearAxisRecords](./clearaxisrecords/)() | يزيل جميع سجلات المحور من الجدول. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | يزيل جميع جداول قيم المحور من الجدول. |
| [get_AxisRecords](./get_axisrecords/)() | يعيد مصفوفة محاور التصميم. مصفوفة المحاور هي مصفوفة من البُنى من نوع سجل المحور. ملاحظة: سجل المحور يوفر معلومات حول محور تصميم واحد. |
| [get_AxisValueCount](./get_axisvaluecount/)() | يعيد عدد جداول قيم المحور. |
| [get_AxisValueTables](./get_axisvaluetables/)() | يعيد مصفوفة من جداول قيم المحور. ملاحظة: جداول قيم المحور توفر تفاصيل حول قيمة سمة نمط معينة على محور محدد من تباين التصميم، أو مجموعة من قيم محاور تباين التصميم، والعلاقة بين تلك القيم والملصقات المستخدمة كعناصر في أسماء الفروع. |
| [get_DesignAxisCount](./get_designaxiscount/)() | يعيد عدد سجلات المحور. ملاحظة: في خط يحتوي على جدول 'fvar'، يجب أن تكون هذه القيمة أكبر من أو تساوي قيمة axisCount في جدول 'fvar'. في جميع الخطوط، يجب أن تكون أكبر من الصفر إذا كان axisValueCount أكبر من الصفر. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | ملاحظة: الاسم المستخدم كاحتياطي عندما ينتج إسقاط الأسماء في نموذج خط معين اسم فرعي يحتوي فقط على عناصر قابلة للحذف. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | ملاحظة: معرف الاسم المستخدم كاحتياطي عندما ينتج إسقاط الأسماء في نموذج خط معين اسم فرعي يحتوي فقط على عناصر قابلة للحذف. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
