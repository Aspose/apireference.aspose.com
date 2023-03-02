---
title: IGeometry.Overlaps
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometrinin belirtilen bir geometri ile örtüşüp örtüşmediğini belirler.
type: docs
weight: 280
url: /tr/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

Bu geometrinin belirtilen bir geometri ile örtüşüp örtüşmediğini belirler.

```csharp
public bool Overlaps(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` bu geometri başka bir geometriyle "uzaysal olarak örtüşüyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından geometrilerin örtüşüp örtüşmediğini test eder. İki geometri, iç noktaların tamamı olmasa da bazılarına sahipse ve geometrilerin kesişimi , geometrilerin kendileriyle aynı boyuta sahipse örtüşür. iki kişilikPoint geometriler veya ikiSurface geometriler this yöntemi şuna eşdeğerdir: iki kişilikLine Bu yöntemin eşdeğer olduğu geometriler: Eşit olmayan iki geometri için[`Dimension`](../dimension/) bu yöntem her zaman döndürür`false`. DE-9IM ve "uzaysal örtüşmeler" ilişkisi hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


