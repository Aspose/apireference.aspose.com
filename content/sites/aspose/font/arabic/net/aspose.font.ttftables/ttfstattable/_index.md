---
title: "الفئة TtfStatTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfStatTable. تمثل جدول سمات النمط STAT لخط OpenType"
type: docs
weight: 1300
url: /ar/net/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class

يمثل جدول خصائص النمط (STAT) لخط OpenType.

```csharp
public class TtfStatTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [AxisRecords](../../aspose.font.ttftables/ttfstattable/axisrecords/) { get; } | يعيد مصفوفة محاور التصميم. مصفوفة المحاور هي مصفوفة من الهياكل من النوع Axis Record. المواصفة: سجل المحور يوفر معلومات حول محور تصميم واحد. |
| [AxisValueCount](../../aspose.font.ttftables/ttfstattable/axisvaluecount/) { get; } | يعيد عدد جداول قيم المحور. |
| [AxisValueTables](../../aspose.font.ttftables/ttfstattable/axisvaluetables/) { get; } | يعيد مصفوفة من جداول قيم المحور. المواصفة: جداول قيم المحور توفر تفاصيل حول قيمة سمة نمط محددة على محور معين من تباين التصميم، أو مجموعة من قيم محاور تباين التصميم، والعلاقة بين تلك القيم والملصقات المستخدمة كعناصر في أسماء الفروع. |
| [DesignAxisCount](../../aspose.font.ttftables/ttfstattable/designaxiscount/) { get; } | يعيد عدد سجلات المحور. المواصفة: في خط يحتوي على جدول 'fvar'، يجب أن تكون هذه القيمة أكبر من أو تساوي قيمة axisCount في جدول 'fvar'. في جميع الخطوط، يجب أن تكون أكبر من الصفر إذا كان axisValueCount أكبر من الصفر. |
| [ElidedFallbackName](../../aspose.font.ttftables/ttfstattable/elidedfallbackname/) { get; } | المواصفة: الاسم المستخدم كبديل عندما ينتج إسقاط الأسماء في نموذج خط معين اسم فرعي يحتوي على عناصر قابلة للحذف فقط. |
| [ElidedFallbackNameId](../../aspose.font.ttftables/ttfstattable/elidedfallbacknameid/) { get; } | المواصفة: معرف الاسم المستخدم كبديل عندما ينتج إسقاط الأسماء في نموذج خط معين اسم فرعي يحتوي على عناصر قابلة للحذف فقط. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| static [Tag](../../aspose.font.ttftables/ttfstattable/tag/) { get; } | يحصل على علامة الجدول. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [AddAxisRecord](../../aspose.font.ttftables/ttfstattable/addaxisrecord/)(AxisRecord) | يضيف بنية Axis Record إلى الجدول. |
| [AddAxisValueTable](../../aspose.font.ttftables/ttfstattable/addaxisvaluetable/)(AxisValueTableBase) | يضيف بنية جدول قيمة المحور إلى الجدول. |
| [ClearAxisRecords](../../aspose.font.ttftables/ttfstattable/clearaxisrecords/)() | يزيل جميع سجلات المحور من الجدول. |
| [ClearAxisValueTables](../../aspose.font.ttftables/ttfstattable/clearaxisvaluetables/)() | يزيل جميع جداول قيم المحور من الجدول. |

## الأعضاء الآخرون

| الاسم | الوصف |
| --- | --- |
| class [AxisRecord](../../aspose.font.ttftables/ttfstattable.axisrecord) | يمثل بنية Axis Record. المواصفة: سجل المحور يوفر معلومات حول محور تصميم واحد. |
| class [AxisValue](../../aspose.font.ttftables/ttfstattable.axisvalue) | يمثل سجل AxisValue. |
| abstract class [AxisValueTableBase](../../aspose.font.ttftables/ttfstattable.axisvaluetablebase) | الفئة الأساسية لبنية جدول قيمة المحور. المواصفة: جداول قيم المحور توفر تفاصيل حول قيمة سمة نمط محددة على محور معين من تباين التصميم، أو مجموعة من قيم محاور تباين التصميم، والعلاقة بين تلك القيم والملصقات المستخدمة كعناصر في أسماء الفروع. |
| [Flags] enum [AxisValueTableFlags](../../aspose.font.ttftables/ttfstattable.axisvaluetableflags) | يحدد أعلام جدول قيمة المحور |
| class [AxisValueTableFormat1](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat1) | يمثل تنسيق جدول قيمة المحور 1 |
| class [AxisValueTableFormat2](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat2) | يمثل تنسيق جدول قيمة المحور 2 |
| class [AxisValueTableFormat3](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat3) | تمثّل تنسيق جدول قيمة المحور 3 |
| class [AxisValueTableFormat4](../../aspose.font.ttftables/ttfstattable.axisvaluetableformat4) | يمثل تنسيق جدول قيمة المحور 4 |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


