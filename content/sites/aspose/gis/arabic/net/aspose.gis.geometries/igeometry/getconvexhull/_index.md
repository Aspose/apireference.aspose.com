---
title: IGeometry.GetConvexHull
second_title: Aspose.GIS لمرجع .NET API
description: IGeometry طريقة. يحسب الهيكل المحدب لهذه الهندسة.
type: docs
weight: 220
url: /ar/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

يحسب الهيكل المحدب لهذه الهندسة.

```csharp
public IGeometry GetConvexHull()
```

### قيمة الإرجاع

شكل هندسي يمثل بدنًا محدبًا لهذه الهندسة . إذا لم يكن لهذه الهندسة أية نقاط ، فإن النتيجة هي[`Null`](../../geometry/null/) . إذا كانت هذه الهندسة تحتوي على نقطة واحدة فقط ، فإن النتيجة هي هذه النقطة . إذا كانت هذه الهندسة تحتوي على نقطتين فقط ، فإن النتيجة هي[`ILineString`](../../ilinestring/) بالنقاط . إذا كانت هذه الهندسة تحتوي على ثلاث نقاط أو أكثر ، تكون النتيجة[`ILinearRing`](../../ilinearring/) يمثل هيكل محدب حول جميع النقاط الهندسية.

### أنظر أيضا

* interface [IGeometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../igeometry/)
* المجسم [Aspose.GIS](../../../)


