---
title: Class CompoundSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem فصل. يوحد مركب SRS اثنين من SRS الأساسيين  ولا يمكن أن يكون أي منهما مركبًا.
type: docs
weight: 2060
url: /ar/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

يوحد مركب SRS اثنين من SRS الأساسيين ، ولا يمكن أن يكون أي منهما مركبًا.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## الخصائص

| اسم | وصف |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | إرجاع هذا . |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | إرجاع تحويل SRS هذا إلى[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | إرجاع التمثيل الجغرافي لهذا SRS. إذا كان هذا المركب SRS يمثل بالفعل SRS جغرافيًا ، فستكون النتيجة هي SRS الجغرافي ثلاثي الأبعاد (مع أبعاد خط الطول وخط العرض والارتفاع). وإلا سيتم طرح استثناء. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | إرجاع تحويل SRS هذا إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | إرجاع التمثيل المتوقع لـ SRS. إذا كان هذا المركب SRS يمثل بالفعل SRS مسقطًا ، فستكون النتيجة عبارة عن SRS مسقطة ثلاثية الأبعاد (بأبعاد X ، Y ، ارتفاع). وإلا سيتم طرح استثناء. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | إرجاع تحويل SRS هذا إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . استخدم[`Type`](../spatialreferencesystem/type/) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | عدد الأبعاد. بالنسبة إلى SRS المركب ، هذا مجموع عدد أبعاد SRS الأساسي. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | قم بإرجاع البيانات الجغرافية لهذا SRS. إذا كان كلاهما[`Head`](./head/) و[`Tail`](./tail/) لديك مسند جغرافي - قم بإرجاع البيانات الجغرافية للرأس . |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | يحتوي SRS المركب على بيانات جغرافية إذا كان أي من SRS الأساسي يحتوي على بيانات جغرافية. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | يحتوي SRS المركب على خط الزوال الرئيسي إذا كان أي من SRS الأساسي به خط زوال رئيسي. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | أول SRS ضمني . |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | معرّف هذا الكائن القابل للتحديد . |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | عوائد`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | نفس[`Validate`](../spatialreferencesystem/validate/) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | اسم هذا الكائن . |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | قم بإرجاع خط الطول الأولي لهذا SRS. إذا كان كلاهما[`Head`](./head/) و[`Tail`](./tail/) لديك خط الزوال الرئيسي - إرجاع خط الزوال الرئيسي للرأس. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | SRS الأساسي الثاني |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | نوع هذا المركب SRS. يمكن ان يكونGeographicif هذا المركب SRS هو مزيج من SRS الجغرافي والعمودي ، أوProjected if هذا المركب SRS هو مزيج من SRS المتوقّع والعمودي. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | احصل على[`Axis`](../axis/) الذي يصف البعد. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | احصل على[`Unit`](../unit/)البعد . |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | ينشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | تحديد ما إذا كان SRS هذا صالحًا. يرى[`Validate`](../spatialreferencesystem/validate/) لوصف الصلاحية. |

### أنظر أيضا

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


