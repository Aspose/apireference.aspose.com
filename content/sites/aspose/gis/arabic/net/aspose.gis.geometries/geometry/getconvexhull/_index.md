---
title: Geometry.GetConvexHull
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. يحسب الهيكل المحدب لهذه الهندسة.
type: docs
weight: 230
url: /ar/net/aspose.gis.geometries/geometry/getconvexhull/
---
## Geometry.GetConvexHull method

يحسب الهيكل المحدب لهذه الهندسة.

```csharp
public IGeometry GetConvexHull()
```

### قيمة الإرجاع

شكل هندسي يمثل بدنًا محدبًا لهذه الهندسة . إذا لم يكن لهذه الهندسة أية نقاط ، فإن النتيجة هي[`Null`](../null/) . إذا كانت هذه الهندسة تحتوي على نقطة واحدة فقط ، فإن النتيجة هي هذه النقطة . إذا كانت هذه الهندسة تحتوي على نقطتين فقط ، فإن النتيجة هي[`ILineString`](../../ilinestring/) بالنقاط . إذا كانت هذه الهندسة تحتوي على ثلاث نقاط أو أكثر ، تكون النتيجة[`ILinearRing`](../../ilinearring/) يمثل هيكل محدب حول جميع النقاط الهندسية.

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


