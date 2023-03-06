---
title: IGeometry.GetConvexHull
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometrinin dışbükey gövdesini hesaplar.
type: docs
weight: 220
url: /tr/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

Bu geometrinin dışbükey gövdesini hesaplar.

```csharp
public IGeometry GetConvexHull()
```

### Geri dönüş değeri

Bu geometrinin dışbükey gövdesini temsil eden bir geometri. Bu geometrinin hiç noktası yoksa, sonuç şu şekildedir:[`Null`](../../geometry/null/) . Bu geometrinin sadece bir noktası varsa, sonuç bu noktadır. Bu geometrinin sadece iki noktası varsa, sonuç şu şekildedir:[`ILineString`](../../ilinestring/) points. Bu geometrinin üç veya daha fazla noktası varsa, sonuç şu şekildedir:[`ILinearRing`](../../ilinearring/) bu, tüm geometri noktalarının etrafındaki bir dışbükey gövdeyi temsil eder.

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


