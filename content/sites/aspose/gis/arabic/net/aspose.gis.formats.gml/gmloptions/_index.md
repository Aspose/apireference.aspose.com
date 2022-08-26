---
title: GmlOptions
second_title: Aspose.GIS لمرجع .NET API
description: خيارات خاصة ببرنامج التشغيل لتنسيق GML .
type: docs
weight: 300
url: /ar/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

خيارات خاصة ببرنامج التشغيل لتنسيق GML .

```csharp
public class GmlOptions : DriverOptions
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [GmlOptions](gmloptions)() | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | تحديد ما إذا كان يتم إغلاق ملفLinearRing في كل هندسة. افتراضات إلى`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | لتحديد ما إذا كان سيتم إضافة نقطة جديدة في المنتصف لكل مقطع هندسي. افتراضات إلى`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | تحديد ما إذا كان يتم حذف النقاط القريبة في كل شكل هندسي. افتراضات إلى`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | يحدد المسافة لـ[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . افتراضات إلى`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | تفاوت لاستخدامه في تحديد الأشكال الهندسية للمنحنى الخطي. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet) { get; set; } | تحديد ما إذا كان Aspose.GIS مسموحًا به لتحميل مخطط XML من الإنترنت. إذا تم التعيين على`false` ، لن يتم تحميل المخططات ذات URIs المطلقة التي لا تبدأ بـ "file: //" . الافتراضي هو`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel) التي سيتم تطبيقها على M إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator) { get; set; } | الحصول على سلسلة أو تعيينها لفصل مكونات السمات المتداخلة. القيمة الافتراضية "_" . |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema) { get; set; } | تحديد ما إذا كان Aspose.GIS مسموحًا به لتحليل السمات في ملف Gml حيث مخطط XML مفقود أو لا يمكن تحميله. إذا تم التعيين على`true` ، لا يتطلب قارئ Aspose.GIS وجود مخطط XML . الافتراضي هو`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation) { get; set; } | قائمة مفصولة بمسافة لأزواج URI. أول URI في كل زوج هو URI لمساحة الاسم ، والثاني URI هو مسار إلى مخطط XML لمساحة الاسم . إذا تم التعيين على`null` و[`GmlDriver`](../gmldriver) سيحاول قراءة schemaLocation من العنصر الجذر للمستند. الافتراضي هو`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | لتحديد ما إذا كان سيتم حذف النقاط الموجودة على نفس المقطع في كل شكل هندسي. افتراضات إلى`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | يحدد المسافة لـ[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . افتراضات إلى`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | يحدد ما إذا كان يجب التحقق من صحة الأشكال الهندسية عند إضافتها إلى الطبقة. إذا تم التعيين على`true` و[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)يتم استدعاؤها لكل هندسة عند إضافتها إلى الطبقة ، وإذا فشل التحقق من الصحة ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) هو`false` ) ،[`GisException`](../../aspose.gis/gisexception) تم القيت . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | لتحديد ما إذا كان مسموحًا بتحويل المضلع أو متعدد الأضلاع إلى خط مستقيم. افتراضات إلى`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver) { get; set; } | أ[`XmlResolver`](./xmlresolver) تستخدم لحل الموارد الخارجية. الافتراضي هوXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel)التي سيتم تطبيقها على إحداثيات X و Y عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel) التي سيتم تطبيقها على Z إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### أنظر أيضا

* class [DriverOptions](../../aspose.gis/driveroptions)
* مساحة الاسم [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
