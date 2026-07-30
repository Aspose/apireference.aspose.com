---
title: "الفئة TtfMaxpTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfMaxpTable. تمثل جدول maxp لملف خط TTF."
type: docs
weight: 1170
url: /ar/net/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class

يمثل جدول "maxp" لملف خط TTF.

```csharp
public class TtfMaxpTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [MaxComponentContours](../../aspose.font.ttftables/ttfmaxptable/maxcomponentcontours/) { get; } | يحصل على عدد الخطوط المتصلة uint16 maxComponentContours في الحرف المركب. |
| [MaxComponentDepth](../../aspose.font.ttftables/ttfmaxptable/maxcomponentdepth/) { get; } | يحصل على مستويات الاستدعاء uint16 maxComponentDepth، تُضبط إلى 0 إذا كان الخط يحتوي فقط على حروف بسيطة. |
| [MaxComponentElements](../../aspose.font.ttftables/ttfmaxptable/maxcomponentelements/) { get; } | يحصل على عدد الحروف المرجعية uint16 maxComponentElements على المستوى الأعلى. |
| [MaxComponentPoints](../../aspose.font.ttftables/ttfmaxptable/maxcomponentpoints/) { get; } | يحصل على عدد النقاط uint16 maxComponentPoints في الحرف المركب. |
| [MaxContours](../../aspose.font.ttftables/ttfmaxptable/maxcontours/) { get; } | يحصل على عدد الخطوط المتصلة uint16 maxContours في الحرف غير المركب. |
| [MaxFunctionDefs](../../aspose.font.ttftables/ttfmaxptable/maxfunctiondefs/) { get; } | يحصل على عدد FDEFs uint16 maxFunctionDefs. |
| [MaxInstructionDefs](../../aspose.font.ttftables/ttfmaxptable/maxinstructiondefs/) { get; } | يحصل على عدد IDEFs uint16 maxInstructionDefs. |
| [MaxPoints](../../aspose.font.ttftables/ttfmaxptable/maxpoints/) { get; } | يحصل على عدد النقاط uint16 maxPoints في الحرف غير المركب. |
| [MaxSizeOfInstructions](../../aspose.font.ttftables/ttfmaxptable/maxsizeofinstructions/) { get; } | يحصل على عدد البايتات uint16 maxSizeOfInstructions لتعليمات الحرف. |
| [MaxStackElements](../../aspose.font.ttftables/ttfmaxptable/maxstackelements/) { get; } | يحصل على أقصى عمق للمكدس uint16 maxStackElements. |
| [MaxStorage](../../aspose.font.ttftables/ttfmaxptable/maxstorage/) { get; } | يحصل على عدد مواقع مساحة التخزين uint16 maxStorage. |
| [MaxTwilightPoints](../../aspose.font.ttftables/ttfmaxptable/maxtwilightpoints/) { get; } | يحصل على عدد النقاط uint16 maxTwilightPoints المستخدمة في منطقة الشفق (Z0). |
| [MaxZones](../../aspose.font.ttftables/ttfmaxptable/maxzones/) { get; } | يحصل على عدد المناطق uint16 maxZones ويُضبط إلى 2. |
| [NumGlyphs](../../aspose.font.ttftables/ttfmaxptable/numglyphs/) { get; } | يحصل على عدد الحروف uint16 numGlyphs في الخط. |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TableVersion](../../aspose.font.ttftables/ttfmaxptable/tableversion/) { get; } | يحصل على نسخة التنسيق. استخدم الخصائص MajorNumber و MinorNUmber للكائن [`Version16Dot16`](../../aspose.font.ttfcommon/version16dot16/) في التدوين السداسي عشري لتحديد النسخة المستخدمة. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| [Version](../../aspose.font.ttftables/ttfmaxptable/version/) { get; } | يحصل على النسخة الثابتة 0x00010000 إذا (النسخة 1.0). مهجور، استخدم الخاصية [`TableVersion`](./tableversion/) بدلاً من ذلك. |
| static [Tag](../../aspose.font.ttftables/ttfmaxptable/tag/) { get; } | يحصل على علامة الجدول. |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


