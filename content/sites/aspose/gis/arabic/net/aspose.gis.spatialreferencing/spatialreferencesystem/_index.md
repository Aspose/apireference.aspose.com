---
title: SpatialReferenceSystem
second_title: Aspose.GIS لمرجع .NET API
description: إحداثيات خرائط نظام الإسناد المكاني إلى أماكن على الأرض . هناك أنواع مختلفة من SRS  راجعType./spatialreferencesystem/type . ما هو أكثر من ذلك  إذا كان نوع SRS هوGeographic أو Projected يمكن أن تكون SRS مركبة أو مفردة  انظرIsCompound./spatialreferencesystem/iscompound .
type: docs
weight: 2150
url: /ar/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

إحداثيات خرائط نظام الإسناد المكاني إلى أماكن على الأرض . هناك أنواع مختلفة من SRS ، راجع[`Type`](./type) . ما هو أكثر من ذلك ، إذا كان نوع SRS هوGeographic أو Projected، يمكن أن تكون SRS مركبة أو مفردة ، انظر[`IsCompound`](./iscompound) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | إرجاع هذه SRS المحولة إلى[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . استخدم[`IsCompound`](./iscompound) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | إرجاع هذه SRS المحولة إلى[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . استخدم[`Type`](./type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | إرجاع هذه SRS المحولة إلى[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . استخدم[`Type`](./type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | إرجاع هذه SRS المحولة إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . استخدم[`Type`](./type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | إرجاع هذه SRS المحولة إلى[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . استخدم[`Type`](./type) لمعرفة ما إذا كان التحويل ممكنًا. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | إرجاع هذه SRS المحولة إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . استخدم[`Type`](./type) لمعرفة ما إذا كان التحويل ممكنًا. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount) { get; } | إرجاع عدد الأبعاد في SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | إرجاع البيانات الجغرافية لهذا SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum) { get; } | تحديد ما إذا كان SRS يحتوي على بيانات جغرافية. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian) { get; } | إرجاع ما إذا كان SRS يحتوي على خط طول أولي. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | معرف هذا الكائن الذي يمكن التعرف عليه . |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | إرجاع ما إذا كان SRS مركبًا (اتحاد اثنين من SRS) . تعتبر مجموعات SRS التالية في SRS المركب صالحة: Geographic SRS + Vertical SRS ، في هذه الحالة سيكون نوع SRS المركبGeographic . SRS + عمودي SRS ، في هذه الحالة سيكون نوع SRS المركبProjected . إذا اختلفت مجموعة SRS ، فسيكون نوع SRS المركبUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | إرجاع ما إذا كانت SRS هذه مفردة (وليست اتحادًا بين اثنين من SRS) . |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | نفس[`Validate`](./validate) ، ولكن لا تقم بإرجاع رسالة الخطأ. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | اسم هذا الكائن . |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | إرجاع خط الزوال الأولي لهذا SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type) { get; } | يحصل على نوع SRS هذا ، انظر[`SpatialReferenceSystemType`](../spatialreferencesystemtype) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89) { get; } | ETRS 89 (EPSG: 4258) نظام الإسناد المكاني. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea) { get; } | نظام الإسناد المكاني ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG: 3035). |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG: 3034) نظام الإسناد المكاني. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83) { get; } | NAD 83 (EPSG: 4269) نظام الإسناد المكاني. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36) { get; } | OSGB 36 (EPSG: 4277) نظام الإسناد المكاني. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid) { get; } | OSGB 36 / الشبكة الوطنية البريطانية (EPSG: 27700) نظام الإسناد المكاني. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator) { get; } | Web Mercator (EPSG: 3857) نظام الإسناد المكاني. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72) { get; } | WGS 72 (EPSG: 4322) نظام الإسناد المكاني. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84) { get; } | WGS 84 (EPSG: 4326) نظام الإسناد المكاني. |

## طُرق

| اسم | وصف |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg)(int) | إنشاء نظام إسناد مكاني يعتمد على كود EPSG المحدد. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt)(string) | ينشئ ملفًا جديدًا`نظام المرجع المكاني` استنادًا إلى سلسلة WKT (نص معروف جيدًا). |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | يُنشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | إرجاع تمثيل SRS كسلسلة WKT. ستطابق سلسلة WKT الناتجة مواصفات OGC 01-009 ، والتي تسمى عادةً "WKT1" . |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | احصل على[`Axis`](../axis) الذي يصف البعد. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | احصل على[`Unit`](../unit)البعد . |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | يكتشف ما إذا كان هذا SRS مكافئًا لـ SRS الأخرى. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | إرجاع سلسلة تمثل الكائن الحالي. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | يُنشئ التحول من هذا`نظام المرجع المكاني` إلى آخر`نظام المرجع المكاني` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | تحديد ما إذا كان SRS هذا صالحًا. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | إنشاء SRS مركب . |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | إنشاء SRS مركزية الأرض من المعلمات المخصصة. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | إنشاء SRS الجغرافي من المعلمات المخصصة . |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | إنشاء SRS محلي . |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | إنشاء SRS المتوقعة من المعلمات المخصصة . |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | إنشاء SRS عمودي . |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | يحدد ما إذا كان اثنان من SRS متكافئين. نفس الإحداثيات من SRS المكافئة تتطابق مع نفس المكان على الأرض . يمكن أن تكون بعض معلمات SRS المكافئة مختلفة ، على سبيل المثال[`Name`](../identifiableobject/name) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg)(int, out SpatialReferenceSystem) | إنشاء نظام إسناد مكاني يعتمد على كود EPSG المحدد. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt)(string, out SpatialReferenceSystem) | ينشئ ملفًا جديدًا`نظام المرجع المكاني` استنادًا إلى سلسلة WKT (نص معروف جيدًا). |

### أنظر أيضا

* class [IdentifiableObject](../identifiableobject)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* المجسم [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
