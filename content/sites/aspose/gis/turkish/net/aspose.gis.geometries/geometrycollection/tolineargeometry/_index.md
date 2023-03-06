---
title: GeometryCollection.ToLinearGeometry
second_title: Aspose.GIS for .NET API Referansı
description: GeometryCollection yöntem. Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alırhata payı .
type: docs
weight: 220
url: /tr/net/aspose.gis.geometries/geometrycollection/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` .

```csharp
public IGeometryCollection ToLinearGeometry()
```

### Geri dönüş değeri

Eğri geometrisi olmayan bir geometri. bu eşdeğerdir[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) with varsayılan`hata payı` . Varsayılan`hata payı` s değeri bağlıdır[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) Bu geometrinin 'si:  Öngörülen SRS Toleransı için 0,001 metredir (SRS birimlerinde) Coğrafi SRS Toleransı için`1e-5` derece (SRS birimlerinde) Bilinmeyen SRS Toleransı için`1e-5` Hangi dönüşümlerin uygulandığına ilişkin daha fazla ayrıntı için bkz.[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) belirtim.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* ad alanı [Aspose.Gis.Geometries](../../geometrycollection/)
* toplantı [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` .

```csharp
public IGeometryCollection ToLinearGeometry(double tolerance)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| tolerance | Double | `hata payı`kullanmak. Sonucun şundan daha az olması garanti edilir:`hata payı` the kavisli geometriden uzağa. |

### Geri dönüş değeri

Eğri geometrisi olmayan bir geometri. Aşağıdaki dönüşümler uygulanır: CircularString s doğrusallaştırılır (şuna dönüştürülür:LineString s ile belirtilen*tolerance* )CompoundCurve s birleştirilir`SatırDizesi` SCurvePolygon s dönüştürülürPolygon SMultiCurve s dönüştürülürMultiCurve SMultiSurface s dönüştürülürMultiPolygon S Sonuç olarak,[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) çıkış geometrisinin`false` .

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | `hata payı` küçüktür veya eşittir`0` . |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* ad alanı [Aspose.Gis.Geometries](../../geometrycollection/)
* toplantı [Aspose.GIS](../../../)


