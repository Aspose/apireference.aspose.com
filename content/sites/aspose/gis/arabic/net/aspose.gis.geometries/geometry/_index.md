---
title: Geometry
second_title: Aspose.GIS لمرجع .NET API
description: فئة الجذر المجردة للتسلسل الهرمي الهندسي.
type: docs
weight: 820
url: /ar/net/aspose.gis.geometries/geometry/
---
## Geometry class

فئة الجذر المجردة للتسلسل الهرمي الهندسي.

```csharp
public abstract class Geometry : IGeometry
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | الحصول على عدد أبعاد الإحداثي لهذا[`Geometry`](../geometry) . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension) { get; } | يحصل على البعد الطوبولوجي لهذا[`Geometry`](../geometry) . إذا كان البعد غير معروف (مثل GEOMETRYCOLLECTION فارغ)Point تم إرجاعه . |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype) { get; } | يحصل على نوع الهندسة . |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه الهندسة عبارة عن هندسة منحنية (غير خطية) أو تحتوي عليها. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات M. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل فارغًا. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثال بسيطًا من وجهة نظر SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل صالحًا. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem) { get; set; } | يحصل على نظام SpatialReference لهذا المثيل. يمكن أن تكون هذه الخاصية`null` ، هل SpatialReferenceSystem غير معروف . لن يؤدي تعيين SpatialReferenceSystem الجديد أي تحويل إحداثي ، سيتغير المرجع فقط. |
| static [Null](../../aspose.gis.geometries/geometry/null) { get; } | الحصول على مثيل للهندسة الخالية . |

## طُرق

| اسم | وصف |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary)() | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary#asbinary_1)(WkbVariant) | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext)() | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_1)(WktVariant) | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext#astext_2)(WktVariant, NumericFormat) | يترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
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
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects)(Extent) | لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects#intersects_1)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة والهندسة المحددة تتقاطع. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | لتحديد ما إذا كانت مصفوفة تقاطع DE-9IM لهذه الهندسة والهندسة المحددة تتطابق مع النمط المقدم. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | الحصول على المضلعات ممثلة كخطوط لهذه الهندسة . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | تنسق الجولات M لعدد محدد من الأرقام الكسرية. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | إحداثيات الدورتين X و Y لعدد محدد من الكسور. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | تنسق الجولات Z إلى عدد محدد من الأرقام الكسرية. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty)() | يجعل هذا[`Geometry`](../geometry) فارغ . |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة تحتوي مكانيًا على هندسة محددة. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | تحديد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة . |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable#toeditable)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable#toeditable_1)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry)() | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تفاوت` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry#tolineargeometry_1)(double) | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تفاوت` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ولمسة هندسية محددة. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | يوحد هذه الهندسة والهندسة المحددة. |
| [Within](../../aspose.gis.geometries/geometry/within#within)(Extent) | لتحديد ما إذا كانت هذه الهندسة ضمن نطاق محدد. |
| [Within](../../aspose.gis.geometries/geometry/within#within_1)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ضمن هندسة محددة. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary)(byte[]) | ينشئ شكلًا هندسيًا من تمثيله الثنائي المعروف جيدًا. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary#frombinary_1)(byte[], SpatialReferenceSystem) | ينشئ شكلًا هندسيًا من تمثيله الثنائي المعروف جيدًا. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext)(string) | ينشئ شكلًا هندسيًا من تمثيل النص المعروف جيدًا. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext#fromtext_1)(string, SpatialReferenceSystem) | ينشئ شكلًا هندسيًا من تمثيل النص المعروف جيدًا. |

### أنظر أيضا

* interface [IGeometry](../igeometry)
* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
