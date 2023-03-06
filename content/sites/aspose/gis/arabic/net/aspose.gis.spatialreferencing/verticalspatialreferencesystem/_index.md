---
title: Class VerticalSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.VerticalSpatialReferenceSystem فصل. SRS العمودي عبارة عن SRS أحادي البعد يصف إحداثيات الارتفاع.
type: docs
weight: 2310
url: /ar/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

SRS العمودي عبارة عن SRS أحادي البعد يصف إحداثيات الارتفاع.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | إرجاع تحويل SRS هذا إلى[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . استخدم[`IsCompound`](../spatialreferencesystem/iscompound/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | إرجاع تحويل SRS هذا إلى[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | إرجاع تحويل SRS هذا إلى[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | إرجاع تحويل SRS هذا إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | إرجاع تحويل SRS هذا إلى[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical/) { get; } | إرجاع SRS. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount/) { get; } | إرجاع 1 ، نظرًا لأن SRS الرأسي دائمًا أحادي البعد. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum/) { get; } | رمياتInvalidOperationException ، نظرًا لأن Vertical SRS لا يحتوي على بيانات جغرافية. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum/) { get; } | عوائد`false` ، نظرًا لأن Vertical SRS لا يحتوي على بيانات جغرافية. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian/) { get; } | عوائد`false` ، نظرًا لأن Vertical SRS لا يحتوي على خط الزوال الأولي. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | معرّف هذا الكائن القابل للتحديد . |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | إرجاع ما إذا كان SRS مركبًا (اتحاد اثنين من SRS) . تعتبر مجموعات SRS التالية في SRS المركب صالحة: Geographic SRS + Vertical SRS ، في هذه الحالة سيكون نوع SRS المركبGeographic . SRS + عمودي SRS ، في هذه الحالة سيكون نوع SRS المركبProjected . إذا اختلفت مجموعة SRS ، فسيكون نوع SRS المركبUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | نفس[`Validate`](../spatialreferencesystem/validate/) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | اسم هذا الكائن . |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian/) { get; } | رمياتInvalidOperationException ، نظرًا لأن Vertical SRS لا يحتوي على خط الزوال الأولي. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type/) { get; } | عودةVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum/) { get; } | المسند المستخدم في SRS. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit/) { get; } | الوحدة المستخدمة في SRS. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis/)(int) | احصل على[`Axis`](../axis/) الذي يصف البعد. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit/)(int) | احصل على[`Unit`](../unit/)البعد . |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate/)(out string) | تحديد ما إذا كان SRS هذا صالحًا. يرى[`Validate`](../spatialreferencesystem/validate/) لوصف الصلاحية. |

### أنظر أيضا

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


