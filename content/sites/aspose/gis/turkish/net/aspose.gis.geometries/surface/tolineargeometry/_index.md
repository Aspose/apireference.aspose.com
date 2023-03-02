---
title: Surface.ToLinearGeometry
second_title: Aspose.GIS for .NET API Referansı
description: Surface yöntem. Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alırhata payı .
type: docs
weight: 40
url: /tr/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` .

```csharp
public IPolygon ToLinearGeometry()
```

### Geri dönüş değeri

bir[`IPolygon`](../../ipolygon/) buna yaklaşan veya buna eşdeğer olan`IYüzey`. Bu şuna eşdeğerdir:[`ToLinearGeometry`](../../isurface/tolineargeometry/) with varsayılan`hata payı` . Varsayılan`hata payı` s değeri bağlıdır[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) Bu geometrinin 'si:  Öngörülen SRS Toleransı için 0,001 metredir (SRS birimlerinde) Coğrafi SRS Toleransı için`1e-5` derece (SRS birimlerinde) Bilinmeyen SRS Toleransı için`1e-5` Hangi dönüşümlerin uygulandığına ilişkin daha fazla ayrıntı için bkz.[`ToLinearGeometry`](../../isurface/tolineargeometry/) belirtim.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* ad alanı [Aspose.Gis.Geometries](../../surface/)
* toplantı [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| tolerance | Double | `hata payı`kullanmak. Sonucun şundan daha az olması garanti edilir:`hata payı` geometriyi lineerleştirmek için gereken nokta sayısı kadran başına maksimum değeri aşmadığı sürece, şu anda 10000 noktaya eşittir. |

### Geri dönüş değeri

Bir[`IPolygon`](../../ipolygon/) buna yaklaşan veya buna eşdeğer olan`IYüzey` :  Bu nesne ise[`IPolygon`](../../ipolygon/) kendisi sonuç bu object ile eşdeğerdir Bu nesne değilse[`IPolygon`](../../ipolygon/) doğrusallaştırılmıştır ve[`IPolygon`](../../ipolygon/) oluşturuldu

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | `hata payı` küçüktür veya eşittir`0` . |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* ad alanı [Aspose.Gis.Geometries](../../surface/)
* toplantı [Aspose.GIS](../../../)


