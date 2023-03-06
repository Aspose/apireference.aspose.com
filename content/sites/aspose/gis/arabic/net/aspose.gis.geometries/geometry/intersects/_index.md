---
title: Geometry.Intersects
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين.
type: docs
weight: 280
url: /ar/net/aspose.gis.geometries/geometry/intersects/
---
## Intersects(Extent) {#intersects}

لتحديد ما إذا كانت هذه الهندسة تتقاطع مع حد معين.

```csharp
public bool Intersects(Extent extent)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| extent | Extent | المدى. |

### قيمة الإرجاع

`true` إذا كانت هذه الهندسة تتقاطع مع المدى ؛`false` خلاف ذلك.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |

### أنظر أيضا

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

لتحديد ما إذا كانت هذه الهندسة والهندسة المحددة تتقاطع.

```csharp
public bool Intersects(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة. |

### قيمة الإرجاع

`true` إذا كانت هذه الهندسة "تتقاطع مكانيًا" مع هندسة أخرى.`false` خلاف ذلك.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### ملاحظات

هذه الطريقة تعادل: هذا هو نفي[`Disjoint`](../../igeometry/disjoint/) . يرى[`Disjoint`](../../igeometry/disjoint/) لمزيد من التفاصيل.

```csharp
!this.Disjoint(other);
```

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


