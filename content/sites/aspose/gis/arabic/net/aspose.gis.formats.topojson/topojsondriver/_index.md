---
title: Class TopoJsonDriver
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.Formats.TopoJson.TopoJsonDriver فصل. برنامج تشغيل لتنسيق TopoJSON .
type: docs
weight: 700
url: /ar/net/aspose.gis.formats.topojson/topojsondriver/
---
## TopoJsonDriver class

برنامج تشغيل لتنسيق TopoJSON .

```csharp
public class TopoJsonDriver : FileDriver
```

## الخصائص

| اسم | وصف |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.topojson/topojsondriver/cancreatedatasets/) { get; } | يحصل على قيمة تشير إلى ما إذا كان بإمكان برنامج التشغيل هذا إنشاء مجموعات بيانات. |
| override [CanCreateLayers](../../aspose.gis.formats.topojson/topojsondriver/cancreatelayers/) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه إنشاء طبقات متجهة. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح مجموعات البيانات. |
| override [CanOpenLayers](../../aspose.gis.formats.topojson/topojsondriver/canopenlayers/) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح طبقات متجهة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | لإنشاء مجموعة بيانات . |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_3)(AbstractPath, TopoJsonOptions) | ينشئ طبقة ويفتحها لإضافة معالم جديدة . |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_9)(string, TopoJsonOptions) | ينشئ طبقة ويفتحها لإضافة معالم جديدة . |
| override [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها لإضافة معالم جديدة . |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_4)(AbstractPath, TopoJsonOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها لإضافة معالم جديدة . |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | يفتح طبقة للتحرير . |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | يفتح طبقة للتحرير . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | يفتح مجموعة البيانات . |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | يفتح الطبقة للقراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | يفتح الطبقة للقراءة . |
| override [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | يفتح طبقة للقراءة . |
| [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer/#openlayer_2)(AbstractPath, TopoJsonOptions) | يفتح طبقة للقراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | يفتح الطبقة للقراءة . |
| [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer/#openlayer_5)(string, TopoJsonOptions) | يفتح طبقة للقراءة . |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | تحديد ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل برنامج التشغيل. |

### أنظر أيضا

* class [FileDriver](../../aspose.gis/filedriver/)
* مساحة الاسم [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson/)
* المجسم [Aspose.GIS](../../)


