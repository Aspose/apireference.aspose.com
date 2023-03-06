---
title: ICurve.ToLinearGeometry
second_title: Aspose.GIS for .NET API Referansı
description: ICurve yöntem. Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alırhata payı .
type: docs
weight: 50
url: /tr/net/aspose.gis.geometries/icurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` .

```csharp
public ILineString ToLinearGeometry()
```

### Geri dönüş değeri

bir[`ILineString`](../../ilinestring/) bu eğriye yaklaşan veya eşdeğer olan. Bu, şuna eşdeğerdir:`ToLinearGeometry` with varsayılan`hata payı` . Varsayılan`hata payı` s değeri bağlıdır[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) Bu geometrinin 'si:  Öngörülen SRS Toleransı için 0,001 metredir (SRS birimlerinde) Coğrafi SRS Toleransı için`1e-5` derece (SRS birimlerinde) Bilinmeyen SRS Toleransı için`1e-5` Hangi dönüşümlerin uygulandığına ilişkin daha fazla ayrıntı için bkz.`ToLinearGeometry` belirtim.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* ad alanı [Aspose.Gis.Geometries](../../icurve/)
* toplantı [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| tolerance | Double | `hata payı`kullanmak. Sonucun şundan daha az olması garanti edilir:`hata payı` geometriyi lineerleştirmek için gereken nokta sayısı kadran başına maksimum değeri aşmadığı sürece, şu anda 10000 noktaya eşittir. |

### Geri dönüş değeri

Bir[`ILineString`](../../ilinestring/) bu eğriye yaklaşan veya eşdeğer olan:  Bu nesne ise[`ILineString`](../../ilinestring/) kendisi sonuç bu object ile eşdeğerdir.[`ICircularString`](../../icircularstring/) sonuç, belirtilen ile doğrusallaştırılmış dairesel dizedir.*tolerance* Bu nesne ise[`ICompoundCurve`](../../icompoundcurve/) - ondan gelen tüm eğriler doğrusallaştırılır ve sonra birleştirilir[`ILineString`](../../ilinestring/)

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | `hata payı` küçüktür veya eşittir`0` . |
| InvalidOperationException | Bu geometri o kadar geçersiz ki işlem tamamlanamıyor. |

### Ayrıca bakınız

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* ad alanı [Aspose.Gis.Geometries](../../icurve/)
* toplantı [Aspose.GIS](../../../)


