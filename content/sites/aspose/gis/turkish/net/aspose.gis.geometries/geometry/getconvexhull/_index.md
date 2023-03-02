---
title: Geometry.GetConvexHull
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometrinin dışbükey gövdesini hesaplar.
type: docs
weight: 230
url: /tr/net/aspose.gis.geometries/geometry/getconvexhull/
---
## Geometry.GetConvexHull method

Bu geometrinin dışbükey gövdesini hesaplar.

```csharp
public IGeometry GetConvexHull()
```

### Geri dönüş değeri

Bu geometrinin dışbükey gövdesini temsil eden bir geometri. Bu geometrinin hiç noktası yoksa, sonuç şu şekildedir:[`Null`](../null/) . Bu geometrinin sadece bir noktası varsa, sonuç bu noktadır. Bu geometrinin sadece iki noktası varsa, sonuç şu şekildedir:[`ILineString`](../../ilinestring/) points. Bu geometrinin üç veya daha fazla noktası varsa, sonuç şu şekildedir:[`ILinearRing`](../../ilinearring/) bu, tüm geometri noktalarının etrafındaki bir dışbükey gövdeyi temsil eder.

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


