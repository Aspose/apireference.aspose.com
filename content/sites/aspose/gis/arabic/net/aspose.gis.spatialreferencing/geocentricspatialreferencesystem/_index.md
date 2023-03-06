---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem فصل. إن مركزية الأرض SRS عبارة عن SRS ديكارتية ثلاثية الأبعاد أصلها في مركز الأرض.
type: docs
weight: 2090
url: /ar/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

إن مركزية الأرض SRS عبارة عن SRS ديكارتية ثلاثية الأبعاد أصلها في مركز الأرض.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | إرجاع تحويل SRS هذا إلى[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . استخدم[`IsCompound`](../spatialreferencesystem/iscompound/) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | إرجاع هذا . |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | إرجاع تحويل SRS هذا إلى[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | إرجاع تحويل SRS هذا إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | إرجاع تحويل SRS هذا إلى[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | إرجاع تحويل SRS هذا إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | ترتيب المحاور في SRS. إذا لم يكن SRS هذا صالحًا وله اتجاهات محاور خاطئة ،Invalid تم إرجاعه . |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | إرجاع 3 ، نظرًا لأن SRS هو دائمًا ثلاثي الأبعاد. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | إرجاع البيانات الجغرافية لهذا SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | عودة`true` ، نظرًا لأن SRS المتمركز حول الأرض يحتوي دائمًا على بيانات جغرافية. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | عودة`true` ، نظرًا لأن SRS مركزية الأرض يكون دائمًا خط الزوال الرئيسي. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | معرّف هذا الكائن القابل للتحديد . |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | إرجاع ما إذا كان SRS مركبًا (اتحاد اثنين من SRS) . تعتبر مجموعات SRS التالية في SRS المركب صالحة: Geographic SRS + Vertical SRS ، في هذه الحالة سيكون نوع SRS المركبGeographic . SRS + عمودي SRS ، في هذه الحالة سيكون نوع SRS المركبProjected . إذا اختلفت مجموعة SRS ، فسيكون نوع SRS المركبUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | نفس[`Validate`](../spatialreferencesystem/validate/) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | الوحدة المستخدمة في SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | اسم هذا الكائن . |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | إرجاع خط الزوال الأولي لهذا SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | عودةGeocentric . |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | احصل على[`Axis`](../axis/) الذي يصف البعد. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | احصل على[`Unit`](../unit/)البعد . |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | تحديد ما إذا كان SRS هذا صالحًا. يرى[`Validate`](../spatialreferencesystem/validate/) لوصف الصلاحية. |

### أنظر أيضا

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


