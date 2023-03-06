---
title: Extent.Intersects
second_title: Aspose.GIS لمرجع .NET API
description: Extent طريقة. لتحديد ما إذا كان هذا الحد يتقاطع مع الوسيطة.
type: docs
weight: 190
url: /ar/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

لتحديد ما إذا كان هذا الحد يتقاطع مع الوسيطة.

```csharp
public bool Intersects(Extent extent)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| extent | Extent | مدى آخر. |

### قيمة الإرجاع

القيمة ، تشير إلى ما إذا كان هذا المدى يتقاطع مع الوسيطة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من هذا المدى والحجة كلاهما ليس كذلك`null` ولا تساوي بعضها البعض. |

### أنظر أيضا

* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

لتحديد ما إذا كان هذا الحد يتقاطع مع الوسيطة.

```csharp
public bool Intersects(IGeometry geometry)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| geometry | IGeometry | هندسة لاختبار التقاطع |

### قيمة الإرجاع

القيمة ، تشير إلى ما إذا كان هذا المدى يتقاطع مع الوسيطة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من هذا المدى والحجة كلاهما ليس كذلك`null` ولا تساوي بعضها البعض. |

### أنظر أيضا

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)


