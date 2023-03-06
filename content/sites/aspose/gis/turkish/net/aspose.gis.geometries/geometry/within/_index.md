---
title: Geometry.Within
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometrinin belirli bir kapsam içinde olup olmadığını belirler.
type: docs
weight: 440
url: /tr/net/aspose.gis.geometries/geometry/within/
---
## Within(Extent) {#within}

Bu geometrinin belirli bir kapsam içinde olup olmadığını belirler.

```csharp
public bool Within(Extent extent)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| extent | Extent | kapsam. |

### Geri dönüş değeri

`true` bu geometri kapsam içindeyse;`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |

### Ayrıca bakınız

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Bu geometrinin belirli bir geometri içinde olup olmadığını belirler.

```csharp
public bool Within(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` eğer bu geometri başka bir geometrinin "mekansal olarak içindeyse".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından bir geometrinin diğerinin içinde olup olmadığını test eder. Bir geometri, geometrinin her noktasını içeriyorsa ve geometriler içleri kesişiyorsa, bir geometri diğerinin içindedir. Bu yöntem şuna eşdeğerdir: DE-9IM ve "uzaysal olarak" ilişkisi hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

```csharp
this.Relate(other, "T*F**F***");
```

### Ayrıca bakınız

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


