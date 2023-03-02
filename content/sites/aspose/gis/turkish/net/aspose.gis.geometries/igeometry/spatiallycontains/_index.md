---
title: IGeometry.SpatiallyContains
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler.
type: docs
weight: 310
url: /tr/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true`bu geometri başka bir geometriyi "uzaysal olarak içeriyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından bir geometrinin diğerini içerip içermediğini test eder. Bu yöntem şuna eşdeğerdir:

```csharp
other.Within(this);
```

### Ayrıca bakınız

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


