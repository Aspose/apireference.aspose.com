---
title: Class CsvOptions
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Formats.Csv.CsvOptions فصل. خيارات خاصة ببرنامج التشغيل لتنسيق CSV .
type: docs
weight: 200
url: /ar/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

خيارات خاصة ببرنامج التشغيل لتنسيق CSV .

```csharp
public class CsvOptions : DriverOptions
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [CsvOptions](csvoptions/)() | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | تحديد ما إذا كان يتم إغلاق ملفLinearRing في كل هندسة. افتراضات إلى`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | الحصول على أو تحديد اسم العمود الذي يحتوي على قيمة إحداثيات M . الافتراضي هو`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | الحصول على اسم عمود أو تعيينه يحتوي على نص معروف جيدًا لتمثيل الهندسة . الإعداد الافتراضي هو`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | الحصول على أو تحديد اسم العمود الذي يحتوي على قيمة إحداثيات X. الافتراضي هو`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | الحصول على أو تحديد اسم العمود الذي يحتوي على قيمة الإحداثي Y الافتراضي هو`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | الحصول على أو تحديد اسم العمود الذي يحتوي على قيمة إحداثيات Z. الافتراضي هو`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | لتحديد ما إذا كان سيتم إضافة نقطة جديدة في المنتصف لكل مقطع هندسي. افتراضات إلى`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | تحديد ما إذا كان يتم حذف النقاط القريبة في كل شكل هندسي. افتراضات إلى`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | يحدد المسافة لـ[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . افتراضات إلى`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | الحصول على أو تعيين حرف يتم استخدامه كمحدد لفصل القيم . الافتراضي هو '،' . |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | الحصول على أو تعيين حرف يتم استخدامه كحرف هروب لعلامات الاقتباس المزدوجة. الإعداد الافتراضي هو "" . |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | تحديد ما إذا كان صف الرأس بأسماء السمات موجودًا. الافتراضي هو`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | تفاوت لاستخدامه في تحديد الأشكال الهندسية للمنحنى الخطي. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على M إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | لتحديد ما إذا كان سيتم حذف النقاط الموجودة على نفس المقطع في كل شكل هندسي. افتراضات إلى`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | يحدد المسافة لـ[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . افتراضات إلى`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | الحصول على أو تعيين رقم سطر على أساس الصفر والذي سيكون أولًا عند قراءة البيانات. القيمة الافتراضية هي 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | يحدد ما إذا كان يجب التحقق من صحة الأشكال الهندسية عند إضافتها إلى الطبقة. إذا تم التعيين على`true` و[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) يتم استدعاؤها لكل هندسة _ عند إضافتها إلى الطبقة ، وإذا فشل التحقق من الصحة ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) يكون`false` ) ،[`GisException`](../../aspose.gis/gisexception/) تم القيت . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | لتحديد ما إذا كان مسموحًا بتحويل المضلع أو متعدد الأضلاع إلى خط مستقيم. افتراضات إلى`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على إحداثيات X و Y عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على Z إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### أنظر أيضا

* class [DriverOptions](../../aspose.gis/driveroptions/)
* مساحة الاسم [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* المجسم [Aspose.GIS](../../)


