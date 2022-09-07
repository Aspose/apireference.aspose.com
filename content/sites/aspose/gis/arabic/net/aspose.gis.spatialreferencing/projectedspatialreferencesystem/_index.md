---
title: ProjectedSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: SRS المتوقع هو نتيجة لتطبيق إسقاط على SRS الجغرافي . يمكن أن يكون SRS المسقط ثنائي الأبعاد أو ثلاثي الأبعاد . إذا كان SRS المسقط ثلاثي الأبعاد  فهو في الواقع SRS مركب من ثنائي الأبعاد مسقط SRS وبُعد رأسي واحد الأبعاد SRS.
type: docs
weight: 2120
url: /ar/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

SRS المتوقع هو نتيجة لتطبيق إسقاط على SRS الجغرافي . يمكن أن يكون SRS المسقط ثنائي الأبعاد أو ثلاثي الأبعاد . إذا كان SRS المسقط ثلاثي الأبعاد ، فهو في الواقع SRS مركب من ثنائي الأبعاد مسقط SRS وبُعد رأسي واحد الأبعاد SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## الخصائص

| اسم | وصف |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit) { get; } | وحدة ، تُستخدم للقيم الزاوية في SRS وللمعلمات الزاوية لـ[`Projection`](./projection) . تطابق الوحدة الزاوية من[`Base`](./base) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | إرجاع هذه SRS المحولة إلى[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . استخدم[`IsCompound`](../spatialreferencesystem/iscompound) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | إرجاع هذه SRS المحولة إلى[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | إرجاع هذه SRS المحولة إلى[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | إرجاع هذه SRS المحولة إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected) { get; } | إرجاع هذا . |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | إرجاع هذه SRS المحولة إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder) { get; } | ترتيب المحاور في SRS. إذا لم يكن SRS هذا صالحًا وله اتجاهات محاور خاطئة ،Invalid تم إرجاعه . |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base) { get; } | جغرافي SRS إليها[`Projection`](./projection) تم تطبيقه للحصول على SRS. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount) { get; } | يتم حساب أبعاد المرتجعات في SRS. بالنسبة إلى SRS المتوقع ، يمكن أن يكون هذا: اثنان - إذا كان هذا هو SRS الإسقاط الفردي . ثلاثة - إذا كان هذا هو SRS المركب ، والذي يتكون من SRS أحادي وثنائي الأبعاد ومتوقع SRS وعمودي ، يضيف بعدًا ثالثًا. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | إرجاع البيانات الجغرافية لهذا SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum) { get; } | العوائد صحيحة ، نظرًا لأن SRS المتوقع لها دائمًا خط الزوال الأولي. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian) { get; } | العوائد صحيحة ، نظرًا لأن SRS المتوقع لها دائمًا خط الزوال الأولي. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | معرف هذا الكائن الذي يمكن التعرف عليه . |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | إرجاع ما إذا كان SRS مركبًا (اتحاد اثنين من SRS) . تعتبر مجموعات SRS التالية في SRS المركب صالحة: Geographic SRS + Vertical SRS ، في هذه الحالة سيكون نوع SRS المركبGeographic . SRS + عمودي SRS ، في هذه الحالة سيكون نوع SRS المركبProjected . إذا اختلفت مجموعة SRS ، فسيكون نوع SRS المركبUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | نفس[`Validate`](../spatialreferencesystem/validate) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit) { get; } | وحدة ، تُستخدم للأبعاد الخطية في SRS وللمعلمات الخطية لـ[`Projection`](./projection) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | اسم هذا الكائن . |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | إرجاع خط الزوال الأولي لهذا SRS. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection) { get; } | الإسقاط الذي تم تطبيقه عليه[`Base`](./base) للحصول على هذا SRS. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type) { get; } | عوائدProjected . |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | يُنشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | احصل على[`Axis`](../axis) الذي يصف البعد. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | احصل على[`Unit`](../unit)البعد . |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | يُنشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | تحديد ما إذا كان SRS هذا صالحًا. |

### أنظر أيضا

* class [SpatialReferenceSystem](../spatialreferencesystem)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
