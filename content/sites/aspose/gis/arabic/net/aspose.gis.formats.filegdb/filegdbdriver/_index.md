---
title: FileGdbDriver
second_title: Aspose.GIS لمرجع .NET API
description: برنامج تشغيل لتنسيق قاعدة البيانات الجغرافية لملف ESRI.
type: docs
weight: 230
url: /ar/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

برنامج تشغيل لتنسيق قاعدة البيانات الجغرافية لملف ESRI.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## الخصائص

| اسم | وصف |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets) { get; } | يحصل على قيمة تشير إلى ما إذا كان بإمكان برنامج التشغيل هذا إنشاء مجموعات بيانات. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه إنشاء طبقات متجهة. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح مجموعات البيانات. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers) { get; } | يحصل على قيمة تشير إلى ما إذا كان برنامج التشغيل هذا يمكنه فتح طبقات متجهة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | لإنشاء مجموعة بيانات . |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_1)(AbstractPath, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_2)(AbstractPath, FileGdbOptions) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | لإنشاء مجموعة بيانات . |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_5)(string, FileGdbOptions) | لإنشاء مجموعة بيانات . |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_8)(string, FileGdbOptions) | ينشئ طبقة ويفتحها لإضافة معالم جديدة. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | ينشئ طبقة ويفتحها للإلحاق. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | يفتح طبقة للتحرير . |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | يفتح طبقة للتحرير . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | يفتح مجموعة البيانات . |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_1)(AbstractPath, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_2)(AbstractPath, FileGdbOptions) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | يفتح مجموعة البيانات . |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_5)(string, FileGdbOptions) | يفتح مجموعة البيانات . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | يفتح طبقة القراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | يفتح طبقة القراءة . |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | يفتح طبقة للقراءة . |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_2)(AbstractPath, FileGdbOptions) | يفتح طبقة للقراءة . |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | يفتح طبقة القراءة . |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_5)(string, FileGdbOptions) | يفتح طبقة للقراءة . |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | يحدد ما إذا كان نظام الإسناد المكاني المحدد مدعومًا من قبل السائق. |

### أنظر أيضا

* class [FileDriver](../../aspose.gis/filedriver)
* مساحة الاسم [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
