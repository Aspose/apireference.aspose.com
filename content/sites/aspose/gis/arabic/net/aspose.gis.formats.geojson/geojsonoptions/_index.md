---
title: Class GeoJsonOptions
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions فصل. خيارات خاصة ببرنامج التشغيل لتنسيق GeoJSON .
type: docs
weight: 310
url: /ar/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

خيارات خاصة ببرنامج التشغيل لتنسيق GeoJSON .

```csharp
public class GeoJsonOptions : DriverOptions
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | ما إذا كان سيتم عرض مصفوفات JSon للسلاسل أو الأعداد الصحيحة أو القيم الحقيقية كسلسلة. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | يتحكم في ترجمة السمات: نعم - تخطي جميع السمات |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | إنشاء المعرفات تلقائيًا |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | تحديد ما إذا كان يتم إغلاق ملفLinearRing في كل هندسة. افتراضات إلى`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | لتحديد ما إذا كان سيتم إضافة نقطة جديدة في المنتصف لكل مقطع هندسي. افتراضات إلى`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | ما إذا كان سيتم عرض تاريخ / وقت / تاريخ - وقت JSon كسلسلة. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | تحديد ما إذا كان يتم حذف النقاط القريبة في كل شكل هندسي. افتراضات إلى`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | يحدد المسافة لـ[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . افتراضات إلى`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | الوصف على مستوى مجموعة المعالم (لإنشاء الطبقة) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | ترجمة التحكم في الأشكال الهندسية: نعم - التفاف الهندسات باستخدام GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | تفاوت لاستخدامه في تحديد الأشكال الهندسية للمنحنى الخطي. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على M إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | الاسم على مستوى مجموعة المعالم (لإنشاء الطبقة) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | الحصول على سلسلة أو تعيينها لفصل مكونات السمات المتداخلة. القيمة الافتراضية "_" . |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | يحدد ما إذا كان يجب قراءة المربعات المحيطة ("bbox") على أنها سمات تحمل اسم "bbox_0" أو "bbox_1" وما إلى ذلك القيمة الافتراضية هي`false` . ملف[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) السلسلة المستخدمة في bbox_0 ، bbox_1 ، .. الأسماء . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | لتحديد ما إذا كان سيتم حذف النقاط الموجودة على نفس المقطع في كل شكل هندسي. افتراضات إلى`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | يحدد المسافة لـ[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . افتراضات إلى`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | يحدد ما إذا كان يجب التحقق من صحة الأشكال الهندسية عند إضافتها إلى الطبقة. إذا تم التعيين على`true` و[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) يتم استدعاؤها لكل هندسة _ عند إضافتها إلى الطبقة ، وإذا فشل التحقق من الصحة ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) يكون`false` ) ،[`GisException`](../../aspose.gis/gisexception/) تم القيت . |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | يحدد ما إذا كان يجب تضمين معلومات كائنات GeoJSON في النطاق الإحداثي لأشكاله الهندسية . إذا تم الضبط على`true` ، يتم إنشاء عضو "bbox" لكل شكل هندسي (ليس فارغًا) عند إضافته إلى الطبقة . القيمة الافتراضية هي`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | لتحديد ما إذا كان مسموحًا بتحويل المضلع أو متعدد الأضلاع إلى خط مستقيم. افتراضات إلى`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | ما إذا كان سيتم كتابة سمات غير محددة عن طريق إضافة قيمة "خالية" _ |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على إحداثيات X و Y عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | أ[`PrecisionModel`](../../aspose.gis/precisionmodel/) التي سيتم تطبيقها على Z إحداثيات عند إضافة الأشكال الهندسية إلى[`VectorLayer`](../../aspose.gis/vectorlayer/) أو عندما يتم قراءتها من[`VectorLayer`](../../aspose.gis/vectorlayer/) . القيمة الافتراضية هي[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### أنظر أيضا

* class [DriverOptions](../../aspose.gis/driveroptions/)
* مساحة الاسم [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* المجسم [Aspose.GIS](../../)


