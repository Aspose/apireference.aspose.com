---
title: Class CompoundCurve
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Geometries.CompoundCurve فصل. منحنى يمثل سلسلة من المنحنيات المتجاورة بحيث يتم ضم المنحنيات المجاورة عند نقاط نهايتها.
type: docs
weight: 890
url: /ar/net/aspose.gis.geometries/compoundcurve/
---
## CompoundCurve class

منحنى يمثل سلسلة من المنحنيات المتجاورة بحيث يتم ضم المنحنيات المجاورة عند نقاط نهايتها.

```csharp
public class CompoundCurve : Curve, ICompoundCurve
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [CompoundCurve](compoundcurve/#constructor)() | يقوم بتهيئة مثيل جديد لملف`CompoundCurve` فئة . |
| [CompoundCurve](compoundcurve/#constructor_1)(ICompoundCurve) | يقوم بتهيئة مثيل جديد لملف`CompoundCurve` فئة . |
| [CompoundCurve](compoundcurve/#constructor_2)(IEnumerable&lt;ICurve&gt;) | يقوم بتهيئة مثيل جديد لملف`CompoundCurve` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | الحصول على عدد أبعاد الإحداثي لهذا[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/compoundcurve/count/) { get; } | الحصول على عدد المنحنيات في ملف[`ICompoundCurve`](../icompoundcurve/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | يحصل على البعد الطوبولوجي لهذا[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/compoundcurve/endpoint/) { get; } | إرجاع نسخة من نقطة نهاية المنحنى. |
| override [GeometryType](../../aspose.gis.geometries/compoundcurve/geometrytype/) { get; } | يحصل على نوع الهندسة . |
| override [HasCurveGeometry](../../aspose.gis.geometries/compoundcurve/hascurvegeometry/) { get; } | الحصول على قيمة تشير إلى ما إذا كانت هذه الهندسة عبارة عن هندسة منحنية (غير خطية) أو تحتوي عليها. |
| [HasM](../../aspose.gis.geometries/compoundcurve/hasm/) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات M. |
| [HasZ](../../aspose.gis.geometries/compoundcurve/hasz/) { get; set; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على إحداثيات Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | الحصول على قيم تشير إلى ما إذا كان المنحنى مغلقًا. يتم إغلاق المنحنى إذا كانت نقطة بدايته مساوية لنقطة النهاية. |
| override [IsEmpty](../../aspose.gis.geometries/compoundcurve/isempty/) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل فارغًا. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثال بسيطًا من وجهة نظر SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل صالحًا. |
| [Item](../../aspose.gis.geometries/compoundcurve/item/) { get; } | يحصل على ملف[`ICurve`](../icurve/) في الفهرس المحدد. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/compoundcurve/spatialreferencesystem/) { get; set; } | يحصل على نظام SpatialReference لهذا المثيل. يمكن أن تكون هذه الخاصية`null` ، إذا لم يتم ضبط SpatialReferenceSystem . لن يؤدي تعيين SpatialReferenceSystem جديد أي تحويل إحداثي ، سيتغير المرجع فقط. |
| override [StartPoint](../../aspose.gis.geometries/compoundcurve/startpoint/) { get; } | إرجاع نسخة من نقطة البداية للمنحنى. |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddCurve](../../aspose.gis.geometries/compoundcurve/addcurve/)(ICurve) | يضيف منحنى إلى نهاية هذا`CompoundCurve` . |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | تترجم هذه الهندسة إلى تمثيلها الثنائي المعروف جيدًا. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | قم بتصدير هذه الهندسة إلى تمثيل صورة . |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | تترجم هذه الهندسة إلى تمثيلها النصي المعروف جيدًا. |
| override [Clone](../../aspose.gis.geometries/compoundcurve/clone/)() | استنساخ هذا المثال . |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة مغطاة بهندسة محددة. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | تحديد ما إذا كانت هذه الهندسة تغطي شكلًا هندسيًا محددًا. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | تحديد ما إذا كانت هذه الهندسة مع تقاطع هندسي محدد. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | يطرح هندسة محددة من هذه الهندسة . |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة منفصلة عن هندسة محددة. |
| [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals)(ICompoundCurve) | يشير إلى ما إذا كان الكائن الحالي يساوي كائنًا آخر من نفس النوع. |
| override [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals_1)(object) | يحدد ما إذا كان الكائن المحدد مساويًا للكائن الحالي. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | حساب مساحة هذه الهندسة . |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | حساب منطقة عازلة حول هذه الهندسة . |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | يحسب النقطه الوسطى لهذه الهندسة. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | يحسب الهيكل المحدب لهذه الهندسة. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | حساب الحد الأدنى للمسافة بين هذه الهندسة والهندسة المحددة. |
| [GetEnumerator](../../aspose.gis.geometries/compoundcurve/getenumerator/)() | إرجاع عداد يتكرر خلال المجموعة. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | حساب وإرجاع مدى محيط لهذه الهندسة . |
| override [GetHashCode](../../aspose.gis.geometries/compoundcurve/gethashcode/)() | بمثابة وظيفة التجزئة الافتراضية. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | حساب طول هذه الهندسة . |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | يبني تقاطعًا بين هذه الهندسة وهندسة محددة. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة والهندسة المحددة تتقاطع. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | لتحديد ما إذا كانت مصفوفة تقاطع DE-9IM لهذه الهندسة والأشكال الهندسية المحددة تتطابق مع النمط المقدم. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | الحصول على المضلعات ممثلة كخطوط لهذه الهندسة . |
| override [Reverse](../../aspose.gis.geometries/compoundcurve/reverse/)() | يعكس ذلك`CompoundCurve` . أي - ترتيب عكسي للمنحنيات وكل منحنى داخل هذا المنحنى المركب. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | تنسق الجولات M لعدد محدد من الأرقام الكسرية. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | إحداثيات الدورتين X و Y لعدد محدد من الكسور. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | تنسق الجولات Z إلى عدد محدد من الأرقام الكسرية. |
| override [SetEmpty](../../aspose.gis.geometries/compoundcurve/setempty/)() | يجعل هذا[`Geometry`](../geometry/) فارغ . |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة تحتوي مكانيًا على هندسة محددة. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | يحدد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | يُنشئ فرقًا متماثلًا بين هذه الهندسة والهندسة المحددة . |
| [ToEditable](../../aspose.gis.geometries/compoundcurve/toeditable/#toeditable)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | الحصول على نسخة قابلة للتحرير من هذه الهندسة. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ولمسة هندسية محددة. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | يوحد هذه الهندسة والهندسة المحددة. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | لتحديد ما إذا كانت هذه الهندسة ضمن نطاق محدد. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | لتحديد ما إذا كانت هذه الهندسة ضمن هندسة محددة. |
| [operator ==](../../aspose.gis.geometries/compoundcurve/op_equality/) | تنفيذ عامل التشغيل == . |
| [operator !=](../../aspose.gis.geometries/compoundcurve/op_inequality/) | تنفذ عامل التشغيل! = . |

### ملاحظات

لا يمكن أن يحتوي المنحنى المركب على منحنيات مركبة أخرى.

### أنظر أيضا

* class [Curve](../curve/)
* interface [ICompoundCurve](../icompoundcurve/)
* مساحة الاسم [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* المجسم [Aspose.GIS](../../)


