---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS for .NET API Referansı
description: SpatialReferenceSystemTransformation yöntem. Geometriyi kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürür.
type: docs
weight: 40
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Geometriyi kaynak uzamsal referans sisteminden hedef uzamsal referans sistemine dönüştürür.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| geometry | IGeometry | Dönüşüm için geometri. |

### Geri dönüş değeri

Hedef uzamsal referans sisteminde yeni geometri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | geometri`null` . |
| ArgumentException | Geometriler[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) değil`null` ve ile eşdeğer değildir[`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Dönüşüm başarısız oldu. |

### Ayrıca bakınız

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* toplantı [Aspose.GIS](../../../)


