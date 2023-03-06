---
title: IGeometry.CoveredBy
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometrinin belirli bir geometri tarafından kapsanıp kapsanmadığını belirler.
type: docs
weight: 140
url: /tr/net/aspose.gis.geometries/igeometry/coveredby/
---
## IGeometry.CoveredBy method

Bu geometrinin belirli bir geometri tarafından kapsanıp kapsanmadığını belirler.

```csharp
public bool CoveredBy(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true`bu geometri başka bir geometri tarafından "uzaysal olarak kapsanıyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından bir geometrinin bir başkası tarafından kapsanıp kapsanmadığını test eder. Bu yöntem şuna eşdeğerdir:

```csharp
other.Covers(this);
```

### Ayrıca bakınız

* method [SpatiallyContains](../spatiallycontains/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


