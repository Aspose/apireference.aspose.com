---
title: IGeometry.ToLinearGeometry
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alırhata payı .
type: docs
weight: 350
url: /tr/net/aspose.gis.geometries/igeometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` .

```csharp
public IGeometry ToLinearGeometry()
```

### Geri dönüş değeri

Eğri geometrisi olmayan bir geometri. bu eşdeğerdir`ToLinearGeometry` with varsayılan`hata payı` . Varsayılan`hata payı` tarafından tanımlanır[`SpatialReferenceSystem`](../spatialreferencesystem/) Bu geometrinin 'si:  Öngörülen SRS Toleransı için 0,001 metredir (SRS birimlerinde) Coğrafi SRS Toleransı için`1e-5` derece (SRS birimlerinde) Bilinmeyen SRS Toleransı için`1e-5` Hangi dönüşümlerin uygulandığına ilişkin daha fazla ayrıntı için bkz.`ToLinearGeometry` belirtim.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| tolerance | Double | `hata payı`kullanmak. Sonucun şundan daha az olması garanti edilir:`hata payı` geometriyi doğrusallaştırmak için gereken nokta sayısı, şu anda 10000 noktaya eşit olan çeyrek başına maksimum değerini aşmadığı sürece, kavisli geometriden uzağa. |

### Geri dönüş değeri

Eğri geometrisi olmayan bir geometri. Aşağıdaki dönüşümler uygulanır: CircularString s doğrusallaştırılır (şuna dönüştürülür:LineString s ile belirtilen*tolerance* )CompoundCurve s birleştirilir`SatırDizesi` SCurvePolygon s dönüştürülürPolygon SMultiCurve s dönüştürülürMultiLineString SMultiSurface s dönüştürülürMultiPolygon S Sonuç olarak,[`HasCurveGeometry`](../hascurvegeometry/) çıkış geometrisinin`false` .

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | `hata payı` küçüktür veya eşittir`0` . |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


