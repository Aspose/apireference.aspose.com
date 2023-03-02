---
title: Geometry.FromText
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. ينشئ شكلًا هندسيًا من تمثيل النص المعروف جيدًا.
type: docs
weight: 470
url: /ar/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

ينشئ شكلًا هندسيًا من تمثيل النص المعروف جيدًا.

```csharp
public static IGeometry FromText(string wkt)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| wkt | String | تمثيل نصي معروف بشكل هندسي. |

### قيمة الإرجاع

تمثل الحجة الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الوسيطة باطلة. |
| NotSupportedException | تمثل الوسيطة شكلًا هندسيًا لنوع غير مدعوم. |
| FormatException | الوسيطة ليست نصًا معروفًا جيدًا. |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

ينشئ شكلًا هندسيًا من تمثيل النص المعروف جيدًا.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| wkt | String | تمثيل نصي معروف بشكل هندسي. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني المراد تخصيصه للهندسة. |

### قيمة الإرجاع

تمثل الحجة الهندسة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الوسيطة باطلة. |
| NotSupportedException | تمثل الوسيطة شكلًا هندسيًا لنوع غير مدعوم. |
| FormatException | الوسيطة ليست نصًا معروفًا جيدًا. |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


