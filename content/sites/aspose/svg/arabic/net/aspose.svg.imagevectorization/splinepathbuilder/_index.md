---
title: Class SplinePathBuilder
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.ImageVectorization.SplinePathBuilder فصل. ملفSplinePathBuilder الطبقة هي المسؤولة عن بناء مقاطع المسارSVGPathSeg من قائمة نقاط التتبع . يعتمد منشئ المسار هذا على تطبيق خط CatmullRoma spline على مجموعة من نقاط المسار المصقولة والمقلصة ..
type: docs
weight: 2160
url: /ar/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

ملف`SplinePathBuilder` الطبقة هي المسؤولة عن بناء مقاطع المسار[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) من قائمة نقاط التتبع . يعتمد منشئ المسار هذا على تطبيق خط Catmull-Roma spline على مجموعة من نقاط المسار المصقولة والمقلصة ..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | يقوم بتهيئة مثيل جديد لملف`SplinePathBuilder` فئة . |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | يقوم بتهيئة مثيل جديد لملف`SplinePathBuilder` فئة . |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | يقوم بتهيئة مثيل جديد لملف`SplinePathBuilder` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | تؤثر قيمة التوترات على مدى حدة انحناء المنحنى عند نقاط التحكم (المقحمة) . يجب أن تكون في النطاق من 0 إلى 1. سيتم محاذاة أي قيم أعلى أو أدنى مع القيم الدنيا والحد الأقصى لهذا النطاق ، تبعا لذلك. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | الحصول على أو تعيين مبسط التتبع. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | الحصول على التتبع أو تعيينه بشكل أكثر سلاسة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | ينشئ مقاطع مسار من قائمة نقاط التتبع . |

### أنظر أيضا

* interface [IPathBuilder](../ipathbuilder/)
* مساحة الاسم [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* المجسم [Aspose.SVG](../../)


