---
title: Geometry.Touches
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometri ile belirli bir geometrinin birbirine değip değmediğini belirler.
type: docs
weight: 420
url: /tr/net/aspose.gis.geometries/geometry/touches/
---
## Geometry.Touches method

Bu geometri ile belirli bir geometrinin birbirine değip değmediğini belirler.

```csharp
public bool Touches(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` eğer bu geometri başka bir geometriye "uzaysal olarak dokunuyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından geometrilerin birbirine değip değmediğini test eder. İki geometri, en az bir ortak sınır noktasına sahiplerse, ancak iç noktaları yoksa birbirine temas eder. Yani: iki[`LineString`](../../linestring/)s, bir uç noktayı paylaşıyorlarsa, ancak bir parçayı paylaşmıyorlarsa, birbirine dokunun, iki çokgen, dış veya iç halkanın bir kısmını paylaşıyorlarsa, ancak içleri çakışmıyorsa, birbirine dokunun. Bu yöntem şuna eşdeğerdir: DE-9IM ve "uzaysal dokunuşlar" ilişkisi hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


