---
title: Class FileDriver
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.FileDriver فصل. برنامج تشغيل خاص بتنسيق مستند إلى ملف .
type: docs
weight: 180
url: /ar/net/aspose.gis/filedriver/
---
## FileDriver class

برنامج تشغيل خاص بتنسيق مستند إلى ملف .

```csharp
public abstract class FileDriver : Driver
```

## الخصائص

| اسم | وصف |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | يحصل على قيمة تشير إلى ما إذا كان بإمكان برنامج التشغيل هذا إنشاء مجموعات بيانات. |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه إنشاء طبقات متجهة. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح مجموعات البيانات. |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح طبقات متجهة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | لإنشاء مجموعة بيانات . |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | يفتح طبقة للتحرير . |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | يفتح طبقة للتحرير . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | يفتح مجموعة البيانات . |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | يفتح الطبقة للقراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | يفتح الطبقة للقراءة . |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | يفتح الطبقة للقراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | يفتح الطبقة للقراءة . |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | تحديد ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل برنامج التشغيل. |

### أنظر أيضا

* class [Driver](../driver/)
* مساحة الاسم [Aspose.Gis](../../aspose.gis/)
* المجسم [Aspose.GIS](../../)


