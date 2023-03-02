---
title: Geometry.AsBinary
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometriyi İyi Bilinen İkili gösterimine çevirir.
type: docs
weight: 110
url: /tr/net/aspose.gis.geometries/geometry/asbinary/
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

* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | Geometri, istenen WKB varyantında temsil edilemez. Şu anda bu, ne zaman gerçekleşir [`HasCurveGeometry`](../hascurvegeometry/) geometrinin`true` ve WKB varyantı is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* geçerli değil[`WkbVariant`](../../wkbvariant/). |

### Ayrıca bakınız

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


