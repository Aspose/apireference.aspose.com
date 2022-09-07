---
title: Curve
second_title: Aspose.GIS لمرجع .NET API
description: أCurve./curve عبارة عن سلسلة من النقاط.
type: docs
weight: 800
url: /ar/net/aspose.gis.geometries/curve/
---
## Curve class

أ[`Curve`](../curve) عبارة عن سلسلة من النقاط.

```csharp
public abstract class Curve : Geometry, ICurve
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | الحصول على عدد أبعاد الإحداثي لهذا[`Geometry`](../geometry) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | يحصل على البعد الطوبولوجي لهذا[`Geometry`](../geometry) . |
| abstract [EndPoint](../../aspose.gis.geometries/curve/endpoint) { get; } | إرجاع نسخة من نقطة نهاية المنحنى. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype) { get; } | يحصل على نوع الهندسة . |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه الهندسة عبارة عن هندسة منحنية (غير خطية) أو تحتوي عليها. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات M. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | الحصول على قيم تشير إلى ما إذا كان المنحنى مغلقًا. يتم إغلاق المنحنى إذا كانت نقطة بدايته تساوي نقطة نهايته. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل فارغًا. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثال بسيطًا من وجهة نظر SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل صالحًا. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem) { get; set; } | يحصل على نظام SpatialReference لهذا المثيل. يمكن أن تكون هذه الخاصية`null` ، هل SpatialReferenceSystem غير معروف . لن يؤدي تعيين SpatialReferenceSystem الجديد أي تحويل إحداثي ، سيتغير المرجع فقط. |
| abstract [StartPoint](../../aspose.gis.geometries/curve/startpoint) { get; } | إرجاع نسخة من نقطة البداية للمنحنى. |

## طُرق

| اسم | وصف |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone)() | استنساخ هذا المثال . |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة مغطاة بهندسة محددة. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | تحديد ما إذا كانت هذه الهندسة تغطي شكلًا هندسيًا محددًا. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي متقاطعًا مع الشكل الهندسي المحدد. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | يطرح هندسة محددة من هذه الهندسة . |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة منفصلة عن هندسة محددة. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | حساب مساحة هذه الهندسة . |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | حساب منطقة عازلة حول هذه الهندسة . |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | يحسب النقطه الوسطى لهذه الهندسة. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | يحسب الهيكل المحدب لهذه الهندسة. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | حساب وإرجاع مدى محيط لهذه الهندسة . |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | حساب طول هذه الهندسة . |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | يبني تقاطعًا بين هذه الهندسة وهندسة محددة. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة والهندسة المحددة تتقاطع. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | لتحديد ما إذا كانت مصفوفة تقاطع DE-9IM لهذه الهندسة والهندسة المحددة تتطابق مع النمط المقدم. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | الحصول على المضلعات ممثلة كخطوط لهذه الهندسة . |
| abstract [Reverse](../../aspose.gis.geometries/curve/reverse)() | يعكس هذا المنحنى . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | تنسق الجولات M لعدد محدد من الأرقام الكسرية. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | إحداثيات الدورتين X و Y لعدد محدد من الكسور. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | تنسق الجولات Z إلى عدد محدد من الأرقام الكسرية. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty)() | يجعل هذا[`Geometry`](../geometry) فارغ . |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة تحتوي مكانيًا على هندسة محددة. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | تحديد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة . |
| [ToEditable](../../aspose.gis.geometries/curve/toeditable#toeditable)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry#tolineargeometry_2)() | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تفاوت` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry#tolineargeometry_3)(double) | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تفاوت` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ولمسة هندسية محددة. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | يوحد هذه الهندسة والهندسة المحددة. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | لتحديد ما إذا كانت هذه الهندسة ضمن نطاق محدد. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ضمن هندسة محددة. |

### أنظر أيضا

* class [Geometry](../geometry)
* interface [ICurve](../icurve)
* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
