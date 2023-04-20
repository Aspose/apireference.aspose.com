---
title: Class BezierPathBuilder
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.ImageVectorization.BezierPathBuilder فصل. ملفSplinePathBuilder الطبقة هي المسؤولة عن بناء مقاطع المسارSVGPathSeg من قائمة نقاط التتبع . يعتمد منشئ المسار هذا على استخدام طريقة المربعات الصغرى للعثور على نقاط تحكم بيزير لتتبع النقاط.
type: docs
weight: 2080
url: /ar/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

ملف[`SplinePathBuilder`](../splinepathbuilder/) الطبقة هي المسؤولة عن بناء مقاطع المسار[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) من قائمة نقاط التتبع . يعتمد منشئ المسار هذا على استخدام طريقة المربعات الصغرى للعثور على نقاط تحكم بيزير لتتبع النقاط.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | يقوم بتهيئة مثيل جديد لملف`BezierPathBuilder` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | الحصول على أو تعيين حد الخطأ . تحدد هذه المعلمة أقصى انحراف للنقاط إلى المنحنى المناسب. بشكل افتراضي 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | الحصول على أو تعيين حد الخطأ . تحدد هذه المعلمة عدد التكرار لطريقة تقريب المربعات الصغرى. بشكل افتراضي 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | الحصول على التتبع أو تعيينه بشكل أكثر سلاسة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | ينشئ مقاطع مسار من قائمة نقاط التتبع . |

### أنظر أيضا

* interface [IPathBuilder](../ipathbuilder/)
* مساحة الاسم [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* المجسم [Aspose.SVG](../../)


