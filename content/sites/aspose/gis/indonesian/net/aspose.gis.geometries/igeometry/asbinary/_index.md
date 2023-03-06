---
title: IGeometry.AsBinary
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menerjemahkan geometri ini ke representasi Biner Terkenalnya.
type: docs
weight: 100
url: /id/net/aspose.gis.geometries/igeometry/asbinary/
---
## AsBinary() {#asbinary}

Menerjemahkan geometri ini ke representasi Biner Terkenalnya.

```csharp
public byte[] AsBinary()
```

### Nilai Pengembalian

Representasi Biner Terkenal dari geometri ini.

### Perkataan

Keluaran dari metode ini adalahIso varian WKB.

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Menerjemahkan geometri ini ke representasi Biner Terkenalnya.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| variant | WkbVariant | Varian Biner Terkenal untuk digunakan. |

### Nilai Pengembalian

Representasi Biner Terkenal dari geometri ini.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| NotSupportedException | Geometri tidak dapat direpresentasikan dalam varian WKB yang diminta. Saat ini terjadi ketika [`HasCurveGeometry`](../hascurvegeometry/) geometri adalah`true` dan varian WKB adalah SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* tidak valid[`WkbVariant`](../../wkbvariant/). |

### Lihat juga

* enum [WkbVariant](../../wkbvariant/)
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


