---
title: IGeometry.AsBinary
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometriyi İyi Bilinen İkili gösterimine çevirir.
type: docs
weight: 100
url: /tr/net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

Bu geometriyi İyi Bilinen İkili gösterimine çevirir.

```csharp
public byte[] AsBinary()
```

### Geri dönüş değeri

Bu geometrinin İyi Bilinen İkili gösterimi.

### Notlar

Bu yöntemin çıktısıIso WKB varyantı.

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Bu geometriyi İyi Bilinen İkili gösterimine çevirir.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| variant | WkbVariant | Kullanılacak İyi Bilinen İkili varyant. |

### Geri dönüş değeri

Bu geometrinin İyi Bilinen İkili gösterimi.

### istisnalar

| istisna | şart |
| --- | --- |
| NotSupportedException | Geometri, istenen WKB varyantında temsil edilemez. Şu anda bu, olduğunda gerçekleşir[`HasCurveGeometry`](../hascurvegeometry/) geometrinin`true` ve WKB varyantı is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* geçerli değil[`WkbVariant`](../../wkbvariant/). |

### Ayrıca bakınız

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


