---
title: IGeometry
second_title: Aspose.GIS لمرجع .NET API
description: فئة جذر الواجهة للتسلسل الهرمي للهندسات
type: docs
weight: 900
url: /ar/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

فئة جذر الواجهة للتسلسل الهرمي للهندسات

```csharp
public interface IGeometry
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension) { get; } | يحصل على البعد الطوبولوجي لهذا[`IGeometry`](../igeometry) . إذا كان البعد غير معروف (مثل GEOMETRYCOLLECTION فارغ)Point تم إرجاعه . |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype) { get; } | يحصل على نوع الهندسة . |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه الهندسة عبارة عن هندسة منحنية (غير خطية) أو تحتوي عليها. |
| [HasM](../../aspose.gis.geometries/igeometry/hasm) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات M. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات Z. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثال فارغًا (يمثل مجموعة النقاط الفارغة) . |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثال بسيطًا من وجهة نظر SFA. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل صالحًا. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem) { get; } | يحصل على نظام SpatialReference لهذا المثيل. يمكن أن تكون هذه الخاصية`null` ، إذا كان نظام SpatialReferenceSystem غير معروف. |

## طُرق

| اسم | وصف |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary)() | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary#asbinary_1)(WkbVariant) | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext)() | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_1)(WktVariant) | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/igeometry/astext#astext_2)(WktVariant, NumericFormat) | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [Clone](../../aspose.gis.geometries/igeometry/clone)() | استنساخ هذا المثال . |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة مغطاة بهندسة محددة. |
| [Covers](../../aspose.gis.geometries/igeometry/covers)(IGeometry) | تحديد ما إذا كانت هذه الهندسة تغطي شكلًا هندسيًا محددًا. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي متقاطعًا مع الشكل الهندسي المحدد. |
| [Difference](../../aspose.gis.geometries/igeometry/difference)(IGeometry) | يطرح هندسة محددة من هذه الهندسة . |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة منفصلة عن هندسة محددة. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea)() | حساب مساحة هذه الهندسة . |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer)(double, int) | حساب منطقة عازلة حول هذه الهندسة . |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid)() | يحسب النقطه الوسطى لهذه الهندسة. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull)() | يحسب الهيكل المحدب لهذه الهندسة. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto)(IGeometry) | حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent)() | حساب وإرجاع مدى محيط لهذه الهندسة . |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength)() | حساب طول هذه الهندسة . |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection)(IGeometry) | يبني تقاطعًا بين هذه الهندسة وهندسة محددة. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects)(Extent) | لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects#intersects_1)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة والهندسة المحددة تتقاطع. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد. |
| [Relate](../../aspose.gis.geometries/igeometry/relate)(IGeometry, string) | لتحديد ما إذا كانت مصفوفة تقاطع DE-9IM لهذه الهندسة والهندسة المحددة تتطابق مع النمط المقدم. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines)() | الحصول على المضلعات ممثلة كخطوط لهذه الهندسة . |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة تحتوي مكانيًا على هندسة محددة. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals)(IGeometry) | تحديد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference)(IGeometry) | يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة . |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable#toeditable)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable#toeditable_1)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry)() | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تفاوت` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry#tolineargeometry_1)(double) | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تفاوت` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ولمسة هندسية محددة. |
| [Union](../../aspose.gis.geometries/igeometry/union)(IGeometry) | يوحد هذه الهندسة والهندسة المحددة. |
| [Within](../../aspose.gis.geometries/igeometry/within#within)(Extent) | لتحديد ما إذا كانت هذه الهندسة ضمن نطاق محدد. |
| [Within](../../aspose.gis.geometries/igeometry/within#within_1)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ضمن هندسة محددة. |

### أنظر أيضا

* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
