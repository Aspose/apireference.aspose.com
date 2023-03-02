---
title: Geometry.Covers
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. تحديد ما إذا كانت هذه الهندسة تغطي شكلًا هندسيًا محددًا.
type: docs
weight: 160
url: /ar/net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

تحديد ما إذا كانت هذه الهندسة تغطي شكلًا هندسيًا محددًا.

```csharp
public bool Covers(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة. |

### قيمة الإرجاع

`true` إذا كانت هذه الهندسة "تغطي مكانيًا" هندسة أخرى.`false` خلاف ذلك.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### ملاحظات

تختبر هذه الطريقة ما إذا كانت إحدى الأشكال الهندسية تغطي أخرى من حيث مصفوفة تقاطع DE-9IM.[`SpatiallyContains`](../../igeometry/spatiallycontains/) ، ولكن يعود`true` في كثير من الأحيان ، لأنه لا يميز بين النقاط الداخلية والحدودية. لذلك ، إذا كانت الهندسة A تقع على حد geometry B ،[`SpatiallyContains`](../../igeometry/spatiallycontains/) عائدات`false` ، بينما ترجع هذه الطريقة`true`. هذه الطريقة تعادل:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### أنظر أيضا

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


