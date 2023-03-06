---
title: IGeometry.AsText
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menerjemahkan geometri ini ke representasi Teks Terkenalnya.
type: docs
weight: 120
url: /id/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Menerjemahkan geometri ini ke representasi Teks Terkenalnya.

```csharp
public string AsText()
```

### Nilai Pengembalian

Representasi Teks Terkenal dari geometri ini.

### Perkataan

Keluaran dari metode ini adalahIso varian WKT.

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
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
| NotSupportedException | Geometri tidak didukung oleh varian WKT yang diminta. Geometri berikut hanya didukung olehIsoVarian WKT: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Semua geometri lainnya didukung oleh varian WKT apa pun. |
| ArgumentOutOfRangeException | *variant* tidak valid[`WktVariant`](../../wktvariant/). |

### Lihat juga

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
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
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


