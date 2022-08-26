---
title: ShapefileDriver
second_title: Aspose.GIS لمرجع .NET API
description: برنامج تشغيل للتنسيق Shapefile .
type: docs
weight: 590
url: /ar/net/aspose.gis.formats.shapefile/shapefiledriver/
---
## ShapefileDriver class

برنامج تشغيل للتنسيق Shapefile .

```csharp
public class ShapefileDriver : FileDriver
```

## الخصائص

| اسم | وصف |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatedatasets) { get; } | يحصل على قيمة تشير إلى ما إذا كان بإمكان برنامج التشغيل هذا إنشاء مجموعات بيانات. |
| override [CanCreateLayers](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatelayers) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه إنشاء طبقات متجهة. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح مجموعات البيانات. |
| override [CanOpenLayers](../../aspose.gis.formats.shapefile/shapefiledriver/canopenlayers) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح طبقات متجهة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | لإنشاء مجموعة بيانات . |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_3)(AbstractPath, ShapefileOptions) | ينشئ طبقة ويفتحها لإضافة معالم جديدة. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_9)(string, ShapefileOptions) | ينشئ طبقة ويفتحها لإضافة معالم جديدة. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| override [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها لإضافة معالم جديدة. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_4)(AbstractPath, ShapefileOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها لإضافة معالم جديدة. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| override [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer)(AbstractPath, DriverOptions) | يفتح طبقة للتحرير . |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_1)(AbstractPath, ShapefileOptions) | يفتح طبقة للتحرير . |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | يفتح طبقة للتحرير . |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_3)(string, ShapefileOptions) | يفتح طبقة للتحرير . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | يفتح مجموعة البيانات . |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | يفتح طبقة القراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | يفتح طبقة القراءة . |
| override [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | يفتح طبقة للقراءة . |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_2)(AbstractPath, ShapefileOptions) | يفتح طبقة للقراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | يفتح طبقة القراءة . |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_5)(string, ShapefileOptions) | يفتح طبقة للقراءة . |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.shapefile/shapefiledriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | يحدد ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل السائق. |

### أنظر أيضا

* class [FileDriver](../../aspose.gis/filedriver)
* مساحة الاسم [Aspose.Gis.Formats.Shapefile](../../aspose.gis.formats.shapefile)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
