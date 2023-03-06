---
title: Class GeographicDatum
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.GeographicDatum فصل. المسند الجغرافي يربط خطوط الطول والعرض بمكان معين على الأرض.
type: docs
weight: 2120
url: /ar/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

المسند الجغرافي يربط خطوط الطول والعرض بمكان معين على الأرض.

```csharp
public class GeographicDatum : IdentifiableObject
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | إنشاء مثيل جديد . |

## الخصائص

| اسم | وصف |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 datum . |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | مرجع OSGB 1936 . |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 datum. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 datum. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoid ، تُستخدم في هذا المرجع لتقريب الأرض. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | إذا كان معرف الكائنات هذا هو معرف EPSG - قم بإرجاع الكود الخاص به. خلاف ذلك - إرجاع -1 . |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | معرّف هذا الكائن القابل للتحديد . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | اسم هذا الكائن . |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters التي يمكن استخدامها لتحويل الإحداثيات في هذا المرجع إلى إحداثيات في WGS84 datum. |

## طُرق

| اسم | وصف |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | تحديد ما إذا كان اثنان من المساند متكافئين. نفس الإحداثيات لمعلومات معادلة تتطابق مع نفس المكان على الأرض . يمكن أن تكون بعض معلمات البيانات المكافئة مختلفة ، على سبيل المثال[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | إرجاع سلسلة تمثل الكائن الحالي. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | تحديد ما إذا كان اثنان من المساند متكافئين. نفس الإحداثيات لمعلومات معادلة تتطابق مع نفس المكان على الأرض . يمكن أن تكون بعض معلمات البيانات المكافئة مختلفة ، على سبيل المثال[`Name`](../identifiableobject/name/) . |

### أنظر أيضا

* class [IdentifiableObject](../identifiableobject/)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


