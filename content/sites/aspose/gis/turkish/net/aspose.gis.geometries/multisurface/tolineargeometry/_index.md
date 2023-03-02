---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS for .NET API Referansı
description: MultiSurface yöntem. Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alırhata payı .
type: docs
weight: 60
url: /tr/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### Geri dönüş değeri

bir[`IMultiPolygon`](../../imultipolygon/) buna yaklaşan veya buna eşdeğer olan[`IMultiSurface`](../../imultisurface/). Bu şuna eşdeğerdir:[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) with varsayılan`hata payı` . Varsayılan`hata payı` s değeri bağlıdır[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) Bu geometrinin 'si:  Öngörülen SRS Toleransı için 0,001 metredir (SRS birimlerinde) Coğrafi SRS Toleransı için`1e-5` derece (SRS birimlerinde) Bilinmeyen SRS Toleransı için`1e-5` Hangi dönüşümlerin uygulandığına ilişkin daha fazla ayrıntı için bkz.[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) belirtim.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* ad alanı [Aspose.Gis.Geometries](../../multisurface/)
* toplantı [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| tolerance | Double | `hata payı`kullanmak. Sonucun şundan daha az olması garanti edilir:`hata payı` geometriyi lineerleştirmek için gereken nokta sayısı kadran başına maksimum değeri aşmadığı sürece, şu anda 10000 noktaya eşittir. |

### Geri dönüş değeri

Bir[`IMultiPolygon`](../../imultipolygon/) buna yaklaşan veya buna eşdeğer olan[`IMultiSurface`](../../imultisurface/) :  Bu nesne ise[`IMultiPolygon`](../../imultipolygon/) kendisi sonuç bu object ile eşdeğerdir Bu nesne değilse[`IMultiPolygon`](../../imultipolygon/) - tüm yüzeyler doğrusallaştırılmış ve yeni`IMultiPolygon` oluşturuldu

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | `hata payı` küçüktür veya eşittir`0` . |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* ad alanı [Aspose.Gis.Geometries](../../multisurface/)
* toplantı [Aspose.GIS](../../../)


