---
title: Class MultiCurve
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Geometries.MultiCurve فصل. أMultiCurve هو بعد واحدGeometryCollection التي تكون عناصرهاCurve s.
type: docs
weight: 1140
url: /ar/net/aspose.gis.geometries/multicurve/
---
## MultiCurve class

أ`MultiCurve` هو بعد واحد[`GeometryCollection`](../geometrycollection/) التي تكون عناصرها[`Curve`](../curve/) s.

```csharp
public class MultiCurve : GeometryCollection, IMultiCurve
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [MultiCurve](multicurve/)() | يقوم بتهيئة مثيل جديد لملف`MultiCurve` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | الحصول على عدد أبعاد الإحداثي لهذا[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/geometrycollection/count/) { get; } | الحصول على عدد الأشكال الهندسية في هذه المجموعة. |
| [Dimension](../../aspose.gis.geometries/multicurve/dimension/) { get; } | يحصل على البعد الطوبولوجي لهذا[`Geometry`](../geometry/) . |
| override [GeometryType](../../aspose.gis.geometries/multicurve/geometrytype/) { get; } | يحصل على نوع الهندسة . |
| override [HasCurveGeometry](../../aspose.gis.geometries/geometrycollection/hascurvegeometry/) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه الهندسة عبارة عن هندسة منحنية (غير خطية) أو تحتوي عليها. |
| override [HasM](../../aspose.gis.geometries/geometrycollection/hasm/) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات M. |
| override [HasZ](../../aspose.gis.geometries/geometrycollection/hasz/) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات Z. |
| virtual [IsClosed](../../aspose.gis.geometries/multicurve/isclosed/) { get; } | لتحديد ما إذا كان هذا المنحنى مغلقًا. |
| override [IsEmpty](../../aspose.gis.geometries/geometrycollection/isempty/) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل فارغًا. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثال بسيطًا من وجهة نظر SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل صالحًا. |
| [Item](../../aspose.gis.geometries/geometrycollection/item/) { get; } | يحصل على أ[`IGeometry`](../igeometry/) في الفهرس المحدد. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/geometrycollection/spatialreferencesystem/) { get; set; } | يحصل على نظام SpatialReference لهذا المثيل. يمكن أن تكون هذه الخاصية`null` ، هل SpatialReferenceSystem غير معروف . لن يؤدي تعيين SpatialReferenceSystem الجديد أي تحويل إحداثي ، سيتغير المرجع فقط. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.gis.geometries/geometrycollection/add/)(IGeometry) | يضيف الشكل الهندسي المحدد إلى المجموعة. |
| [AddRange](../../aspose.gis.geometries/geometrycollection/addrange/)(IEnumerable&lt;IGeometry&gt;) | إضافة الأشكال الهندسية المحددة إلى المجموعة. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| override [Clone](../../aspose.gis.geometries/multicurve/clone/)() | استنساخ هذا المثال . |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة مغطاة بهندسة محددة. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | تحديد ما إذا كانت هذه الهندسة تغطي شكلًا هندسيًا محددًا. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | تحديد ما إذا كانت هذه الهندسة مع تقاطع هندسي محدد. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | يطرح هندسة محددة من هذه الهندسة . |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة منفصلة عن هندسة محددة. |
| [Equals](../../aspose.gis.geometries/geometrycollection/equals/)(IGeometryCollection) | يشير إلى ما إذا كان الكائن الحالي يساوي كائنًا آخر من نفس النوع. |
| override [Equals](../../aspose.gis.geometries/geometrycollection/equals/)(object) | يحدد ما إذا كان الكائن المحدد مساويًا للكائن الحالي. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | حساب مساحة هذه الهندسة . |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | حساب منطقة عازلة حول هذه الهندسة . |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | يحسب النقطه الوسطى لهذه الهندسة. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | يحسب الهيكل المحدب لهذه الهندسة. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة. |
| [GetEnumerator](../../aspose.gis.geometries/geometrycollection/getenumerator/)() | إرجاع عداد يتكرر خلال المجموعة. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | حساب وإرجاع مدى محيط لهذه الهندسة . |
| override [GetHashCode](../../aspose.gis.geometries/geometrycollection/gethashcode/)() | بمثابة وظيفة التجزئة الافتراضية. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | حساب طول هذه الهندسة . |
| [GetPointOnSurface](../../aspose.gis.geometries/geometrycollection/getpointonsurface/)() | البحث عن نقطة مضمونة أن تكون على أحد الأسطح في هذه المجموعة . |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | يبني تقاطعًا بين هذه الهندسة وهندسة محددة. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة والهندسة المحددة تتقاطع. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | لتحديد ما إذا كانت مصفوفة تقاطع DE-9IM لهذه الهندسة والأشكال الهندسية المحددة تتطابق مع النمط المقدم. |
| [RemoveAt](../../aspose.gis.geometries/geometrycollection/removeat/)(int) | يزيل الشكل الهندسي المحدد من المجموعة. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometrycollection/replacepolygonsbylines/)() | الحصول على المضلعات ممثلة كخطوط لهذه الهندسة . (2 methods) |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | تنسق الجولات M لعدد محدد من الأرقام الكسرية. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | إحداثيات الدورتين X و Y لعدد محدد من الكسور. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | تنسق الجولات Z إلى عدد محدد من الأرقام الكسرية. |
| override [SetEmpty](../../aspose.gis.geometries/geometrycollection/setempty/)() | يجعل هذا[`Geometry`](../geometry/) فارغ . |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة تحتوي مكانيًا على هندسة محددة. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | يحدد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة . |
| [ToEditable](../../aspose.gis.geometries/multicurve/toeditable/#toeditable_2)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToLinearGeometry](../../aspose.gis.geometries/multicurve/tolineargeometry/#tolineargeometry_4)() | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` . (3 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/multicurve/tolineargeometry/#tolineargeometry_5)(double) | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` . (3 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ولمسة هندسية محددة. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | يوحد هذه الهندسة والهندسة المحددة. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | لتحديد ما إذا كانت هذه الهندسة ضمن نطاق محدد. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ضمن هندسة محددة. |

### أنظر أيضا

* class [GeometryCollection](../geometrycollection/)
* interface [IMultiCurve](../imulticurve/)
* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* المجسم [Aspose.GIS](../../)


