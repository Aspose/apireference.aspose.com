---
title: Class XpsPathGeometry
second_title: Aspose.Page لمرجع NET API
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry فصل. فئة تتضمن ميزات عنصر خاصية PathGeometry . يحتوي هذا العنصر على مجموعة من أرقام المسار المحددة إما باستخدام سمة Figures أو مع عنصر PathFigure تابع.
type: docs
weight: 3280
url: /ar/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

فئة تتضمن ميزات عنصر خاصية PathGeometry . يحتوي هذا العنصر على مجموعة من أرقام المسار المحددة إما باستخدام سمة Figures أو مع عنصر PathFigure تابع.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | إرجاع / تعيين القيمة التي تحدد كيفية دمج المناطق المتقاطعة للأشكال الهندسية لتشكيل منطقة. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | إرجاع قائمة بأرقام المسار الفرعي . |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | إرجاع / تعيين مصفوفة التحويل التابعة لإنشاء تحويل المصفوفة المحلية الذي يتم تطبيقه على جميع العناصر الفرعية والتابعة لهندسة المسار قبل استخدامه للتعبئة أو القص أو التمسيد. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | يضيف مقطع مسار إلى قائمة المقاطع الفرعية لأخر رقم pah. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | استنساخ هندسة المسار هذه. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | يُدرج مقطع مسار إلى قائمة المقاطع الفرعية لـ آخر رقم مسار في*index* الموضع . |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | يزيل مقطع مسار من قائمة المقاطع الفرعية لشكل المسار الأخير. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | يزيل مقطع مسار من قائمة المقاطع الفرعية لـ آخر شكل مسار في*index* الموضع . |

### أنظر أيضا

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* مساحة الاسم [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* المجسم [Aspose.Page](../../)


