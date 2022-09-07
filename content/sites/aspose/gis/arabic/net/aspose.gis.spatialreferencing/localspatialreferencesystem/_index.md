---
title: LocalSpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: إحداثيات محلية ذات صلة بـ SRS لبعض الأشياء  وليس الأرض.
type: docs
weight: 2080
url: /ar/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

إحداثيات محلية ذات صلة بـ SRS لبعض الأشياء ، وليس الأرض.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | إرجاع هذه SRS المحولة إلى[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . استخدم[`IsCompound`](../spatialreferencesystem/iscompound) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | إرجاع هذه SRS المحولة إلى[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | إرجاع هذه SRS المحولة إلى[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal) { get; } | إرجاع هذا . |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | إرجاع هذه SRS المحولة إلى[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | إرجاع هذه SRS المحولة إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . استخدم[`Type`](../spatialreferencesystem/type) لمعرفة ما إذا كان التحويل ممكنًا. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount) { get; } | عدد الأبعاد في SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum) { get; } | رمياتInvalidOperationException، نظرًا لأن خدمة SRS المحلية لا تحتوي على بيانات جغرافية. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum) { get; } | عوائد`false`، نظرًا لأن خدمة SRS المحلية لا تحتوي على بيانات جغرافية. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian) { get; } | عوائد`false` ، نظرًا لأن SRS المحلي لا يحتوي على خط الطول الأولي. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | معرف هذا الكائن الذي يمكن التعرف عليه . |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | إرجاع ما إذا كان SRS مركبًا (اتحاد اثنين من SRS) . تعتبر مجموعات SRS التالية في SRS المركب صالحة: Geographic SRS + Vertical SRS ، في هذه الحالة سيكون نوع SRS المركبGeographic . SRS + عمودي SRS ، في هذه الحالة سيكون نوع SRS المركبProjected . إذا اختلفت مجموعة SRS ، فسيكون نوع SRS المركبUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | نفس[`Validate`](../spatialreferencesystem/validate) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum) { get; } | Datum ، الذي يصف طريقة القياسات . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | اسم هذا الكائن . |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian) { get; } | رمياتInvalidOperationException ، نظرًا لأن SRS المحلي لا يحتوي على خط الطول الأولي. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type) { get; } | عودةLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit) { get; } | وحدة SRS. |

## طُرق

| اسم | وصف |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | يُنشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis)(int) | احصل على[`Axis`](../axis) الذي يصف البعد. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit)(int) | احصل على[`Unit`](./unit)البعد . |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | يُنشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate)(out string) | تحديد ما إذا كان SRS هذا صالحًا. نرى[`Validate`](../spatialreferencesystem/validate) لوصف الصلاحية. |

### أنظر أيضا

* class [SpatialReferenceSystem](../spatialreferencesystem)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
