---
title: "التعداد TtfStatTable.AxisValueTableFlags"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "Aspose.Font.TtfTables.TtfStatTableAxisValueTableFlags enum. يحدد أعلام جدول قيم المحور"
type: docs
weight: 1340
url: /ar/net/aspose.font.ttftables/ttfstattable.axisvaluetableflags/
---
## TtfStatTable.AxisValueTableFlags enumeration

يحدد أعلام جدول قيمة المحور

```csharp
[Flags]
public enum AxisValueTableFlags : ushort
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| OlderSiblingFontAttribute | `1` | إذا تم تعيينه، يوفر جدول قيم المحور معلومات قيم المحور التي تنطبق على خطوط أخرى ضمن نفس عائلة الخط. يُستخدم هذا إذا تم إصدار الخطوط الأخرى في وقت سابق ولم تتضمن معلومات حول القيم لبعض المحاور. إذا كانت الإصدارات الأحدث من الخطوط الأخرى تتضمن المعلومات نفسها وتكون موجودة، يتم تجاهل هذا الجدول. |
| ElidableAxisValueName | `2` | إذا تم تعيينه، يشير إلى أن قيمة المحور تمثل القيمة “العادية” للمحور ويمكن حذفها عند تكوين سلاسل الأسماء. |
| Reserved | `FFFC` | محجوز للاستخدام المستقبلي |

### انظر أيضاً

* class [TtfStatTable](../ttfstattable/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


