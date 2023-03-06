---
title: Class FileGdbOptions
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Formats.FileGdb.FileGdbOptions فصل. خيارات خاصة ببرنامج التشغيل لتنسيق FileGDB .
type: docs
weight: 270
url: /ar/net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

خيارات خاصة ببرنامج التشغيل لتنسيق FileGDB .

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [FileGdbOptions](filegdboptions/)() | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | تحديد ما إذا كان يتم إغلاق ملفLinearRing في كل هندسة. افتراضات إلى`false` . |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid/) { get; set; } | شبكة تنسيق دقيقة لاستخدامها في طبقة جديدة. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | لتحديد ما إذا كان سيتم إضافة نقطة جديدة في المنتصف لكل مقطع هندسي. افتراضات إلى`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | تحديد ما إذا كان يتم حذف النقاط القريبة في كل شكل هندسي. افتراضات إلى`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | يحدد المسافة لـ[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . افتراضات إلى`0` . |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/) { get; set; } | ما إذا كان يجب أن تكون الإحداثيات في نطاق صالح . |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/) { get; set; } | اسم حقل الهندسة . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | تفاوت لاستخدامه في تحديد الأشكال الهندسية للمنحنى الخطي. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على M إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance/) { get; set; } | M التسامح الانجذاب . |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/) { get; set; } | اسم حقل معرف الكائن . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | لتحديد ما إذا كان سيتم حذف النقاط الموجودة على نفس المقطع في كل شكل هندسي. افتراضات إلى`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | يحدد المسافة لـ[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . افتراضات إلى`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | يحدد ما إذا كان يجب التحقق من صحة الأشكال الهندسية عند إضافتها إلى الطبقة. إذا تم التعيين على`true` و[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) يتم استدعاؤها لكل هندسة _ عند إضافتها إلى الطبقة ، وإذا فشل التحقق من الصحة ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) يكون`false` ) ،[`GisException`](../../aspose.gis/gisexception/) تم القيت . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | لتحديد ما إذا كان مسموحًا بتحويل المضلع أو متعدد الأضلاع إلى خط مستقيم. افتراضات إلى`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على إحداثيات X و Y عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance/) { get; set; } | التسامح X و Y التقاط . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على Z إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance/) { get; set; } | تسامح Z الانجذاب . |

### أنظر أيضا

* class [DriverOptions](../../aspose.gis/driveroptions/)
* مساحة الاسم [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* المجسم [Aspose.GIS](../../)


