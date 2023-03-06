---
title: IGeometry.AsText
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometriyi İyi Bilinen Metin temsiline çevirir.
type: docs
weight: 120
url: /tr/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Bu geometriyi İyi Bilinen Metin temsiline çevirir.

```csharp
public string AsText()
```

### Geri dönüş değeri

Bu geometrinin İyi Bilinen Metin gösterimi.

### Notlar

Bu yöntemin çıktısıIso WKT varyantı.

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Bu geometriyi İyi Bilinen Metin temsiline çevirir.

```csharp
public string AsText(WktVariant variant)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| variant | WktVariant | Kullanılacak İyi Bilinen Metin varyantı. |

### Geri dönüş değeri

Bu geometrinin İyi Bilinen Metin gösterimi.

### istisnalar

| istisna | şart |
| --- | --- |
| NotSupportedException | Geometri, istenen WKT varyantı tarafından desteklenmiyor. Aşağıdaki geometriler yalnızca tarafından destekleniyorIsoWKT varyantı: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Diğer tüm geometriler, herhangi bir WKT varyantı tarafından desteklenir. |
| ArgumentOutOfRangeException | *variant* geçerli değil[`WktVariant`](../../wktvariant/). |

### Ayrıca bakınız

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Bu geometriyi İyi Bilinen Metin temsiline çevirir.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| variant | WktVariant | Kullanılacak İyi Bilinen Metin varyantı. |
| format | NumericFormat | Dizeye dönüştürme için koordinat formatı. Bkz.[`NumericFormat`](../../../aspose.gis/numericformat/) Onu almak için. |

### Geri dönüş değeri

Bu geometrinin İyi Bilinen Metin gösterimi.

### istisnalar

| istisna | şart |
| --- | --- |
| NotSupportedException | Geometri, istenen WKT varyantında temsil edilemez. Şu anda bu, ne zaman gerçekleşir [`HasCurveGeometry`](../hascurvegeometry/) geometrinin`true` ve WKT varyantı is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* geçerli değil[`WktVariant`](../../wktvariant/). |

### Ayrıca bakınız

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


