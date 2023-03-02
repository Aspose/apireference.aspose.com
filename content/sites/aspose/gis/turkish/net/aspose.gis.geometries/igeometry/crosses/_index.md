---
title: IGeometry.Crosses
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler.
type: docs
weight: 160
url: /tr/net/aspose.gis.geometries/igeometry/crosses/
---
## IGeometry.Crosses method

Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler.

```csharp
public bool Crosses(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` eğer bu geometri başka bir geometriyi "uzamsal olarak kesiyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından geometrilerin çapraz olup olmadığını test eder. Tüm iç noktaları olmasa da bazı ortak iç noktaları varsa iki geometri birbirini keser ve kesişimin boyutu en az birinin boyutundan küçükse geometriler. Yani: iki[`LineString`](../../linestring/) s çapraz, eğer bir 'X' harfi, bir LineString ve bir[`Polygon`](../../polygon/) LineString bir Poligonun içinden geçerse kesişir. DE-9IM ve "uzaysal olarak kesişir" ilişkisi hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


