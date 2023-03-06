---
title: Geometry.AsText
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menerjemahkan geometri ini ke representasi Teks Terkenalnya.
type: docs
weight: 130
url: /id/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Menerjemahkan geometri ini ke representasi Teks Terkenalnya.

```csharp
public string AsText()
```

### Nilai Pengembalian

Representasi Teks Terkenal dari geometri ini.

### Perkataan

Output dari metode ini masukIso Varian WKT. Format numerik default adalah[`General`](../../../aspose.gis/numericformat/general/) (dengan presisi "0").

### Lihat juga

* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Menerjemahkan geometri ini ke representasi Teks Terkenalnya.

```csharp
public string AsText(WktVariant variant)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| variant | WktVariant | Varian Teks Terkenal untuk digunakan. |

### Nilai Pengembalian

Representasi Teks Terkenal dari geometri ini.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| NotSupportedException | Geometri tidak dapat direpresentasikan dalam varian WKT yang diminta. Saat ini terjadi kapan [`HasCurveGeometry`](../hascurvegeometry/) geometri adalah`true` dan varian WKT is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* tidak valid[`WktVariant`](../../wktvariant/). |

### Perkataan

Format numerik default adalah[`General`](../../../aspose.gis/numericformat/general/) (dengan presisi "0").

### Lihat juga

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Menerjemahkan geometri ini ke representasi Teks Terkenalnya.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| variant | WktVariant | Varian Teks Terkenal untuk digunakan. |
| format | NumericFormat | Koordinat format untuk konversi ke string. Lihat[`NumericFormat`](../../../aspose.gis/numericformat/) untuk mendapatkan. |

### Nilai Pengembalian

Representasi Teks Terkenal dari geometri ini.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| NotSupportedException | Geometri tidak dapat direpresentasikan dalam varian WKT yang diminta. Saat ini terjadi kapan [`HasCurveGeometry`](../hascurvegeometry/) geometri adalah`true` dan varian WKT is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* tidak valid[`WktVariant`](../../wktvariant/). |

### Lihat juga

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


