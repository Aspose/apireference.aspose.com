---
title: "الفئة TtfCMapTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfCMapTable. تمثّل جدول cmap لملف الخط TTF"
type: docs
weight: 1000
url: /ar/net/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class

يمثل جدول "cmap" لملف خط TTF.

```csharp
public class TtfCMapTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| static [Tag](../../aspose.font.ttftables/ttfcmaptable/tag/) { get; } | يحصل على علامة الجدول. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [FindUnicodeTable](../../aspose.font.ttftables/ttfcmaptable/findunicodetable/)() | يبحث ويعيد خريطة Unicode CMap. إذا كان هناك خريطة ucs-4 CMap - يعيدها أولاً؛ وإلا - يعيد أي خريطة Unicode يمكنه العثور عليها. |
| [GetAllSubtables](../../aspose.font.ttftables/ttfcmaptable/getallsubtables/)() | يعيد جميع الجداول الفرعية من جدول CMap. |
| [GetPlatformTables](../../aspose.font.ttftables/ttfcmaptable/getplatformtables/)(ushort, ushort) | يعيد جداول CMap الفرعية للمعرف planformId والمعرف platformSpecificId. |

## الأعضاء الآخرون

| الاسم | الوصف |
| --- | --- |
| abstract class [TtfCMapSubtableDescription](../../aspose.font.ttftables/ttfcmaptable.ttfcmapsubtabledescription) | توفر معلومات مختصرة عن جدول فرعي CMap. |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


