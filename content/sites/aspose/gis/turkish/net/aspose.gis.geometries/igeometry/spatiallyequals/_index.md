---
title: IGeometry.SpatiallyEquals
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler.
type: docs
weight: 320
url: /tr/net/aspose.gis.geometries/igeometry/spatiallyequals/
---
## IGeometry.SpatiallyEquals method

Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` bu geometri belirtilen geometriye "uzaysal olarak eşitse".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, eşitliği DE-9IM kesişim matrisi açısından test eder. Bileşenlerin order (örneğin çokgendeki iç halkaların sırası), Z ve M değerlerine bağlı değildir. Temel olarak, iki boyutlu uzaya yansıtıldığında iki geometrinin aynı "boşluğu" işgal ettiğini test eder . Bu yöntem şuna eşdeğerdir: DE-9IM. hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


