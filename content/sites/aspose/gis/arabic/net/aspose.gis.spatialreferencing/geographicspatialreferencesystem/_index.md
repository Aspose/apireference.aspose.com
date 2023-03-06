---
title: Class GeographicSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.GeographicSpatialReferenceSystem فصل. SRS الجغرافي هو SRS الذي يعتمد على خطوط الطول والعرض . يمكن أن يكون SRS الجغرافي ثنائي الأبعاد أو ثلاثي الأبعاد . إذا كان SRS الجغرافي ثلاثي الأبعاد  فهو في الواقع SRS مركب ثنائي الأبعاد SRS و SRS عمودي.
type: docs
weight: 2130
url: /ar/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

SRS الجغرافي هو SRS الذي يعتمد على خطوط الطول والعرض . يمكن أن يكون SRS الجغرافي ثنائي الأبعاد أو ثلاثي الأبعاد . إذا كان SRS الجغرافي ثلاثي الأبعاد ، فهو في الواقع SRS مركب ثنائي الأبعاد SRS و SRS عمودي.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## الخصائص

| اسم | وصف |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit/) { get; } | وحدة ، تستخدم للأبعاد الزاوية ، في SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | إرجاع تحويل SRS هذا إلى[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . استخدم[`IsCompound`](../spatialreferencesystem/iscompound/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | إرجاع تحويل SRS هذا إلى[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic/) { get; } | إرجاع هذا . |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | إرجاع تحويل SRS هذا إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | إرجاع تحويل SRS هذا إلى[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | إرجاع تحويل SRS هذا إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder/) { get; } | ترتيب المحاور في SRS. إذا لم يكن SRS هذا صالحًا وله اتجاهات محاور خاطئة ،Invalid تم إرجاعه . |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount/) { get; } | يتم حساب أبعاد المرتجعات في SRS. بالنسبة إلى SRS الجغرافي ، يمكن أن يكون هذا: اثنان - إذا كان هذا SRS جغرافيًا واحدًا . ثلاثة - إذا كان هذا هو SRS المركب ، والذي يتكون من SRS الفردي ، والثنائي الأبعاد ، والجغرافي SRS ، والذي يضيف بعدًا ثالثًا. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | إرجاع البيانات الجغرافية لهذا SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum/) { get; } | عوائد`true` ، نظرًا لأن SRS الجغرافي يحتوي دائمًا على خط الزوال الرئيسي. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian/) { get; } | عوائد`true` ، نظرًا لأن SRS الجغرافي يحتوي دائمًا على خط الزوال الرئيسي. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | معرّف هذا الكائن القابل للتحديد . |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | إرجاع ما إذا كان SRS مركبًا (اتحاد اثنين من SRS) . تعتبر مجموعات SRS التالية في SRS المركب صالحة: Geographic SRS + Vertical SRS ، في هذه الحالة سيكون نوع SRS المركبGeographic . SRS + عمودي SRS ، في هذه الحالة سيكون نوع SRS المركبProjected . إذا اختلفت مجموعة SRS ، فسيكون نوع SRS المركبUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | نفس[`Validate`](../spatialreferencesystem/validate/) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | اسم هذا الكائن . |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | إرجاع خط الطول الأولي لهذا SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type/) { get; } | عوائدGeographic . |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | احصل على[`Axis`](../axis/) الذي يصف البعد. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | احصل على[`Unit`](../unit/)البعد . |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | تحديد ما إذا كان SRS هذا صالحًا. |

### أنظر أيضا

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


