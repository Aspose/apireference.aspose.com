---
title: IGeometry.SymDifference
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometri ile belirtilen bir geometri arasında simetrik bir fark oluşturur.
type: docs
weight: 330
url: /tr/net/aspose.gis.geometries/igeometry/symdifference/
---
## IGeometry.SymDifference method

Bu geometri ile belirtilen bir geometri arasında simetrik bir fark oluşturur.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Simetrik farkı hesaplamak için bir geometri. |

### Geri dönüş değeri

Bu geometrinin simetrik farkını ve bir bağımsız değişkeni temsil eden bir geometri. Sonuç geometrisi, geometrilerden birinde bulunan ancak her ikisinde de bulunmayan nokta kümesini içerir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | *other* dır-dir`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


