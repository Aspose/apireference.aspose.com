---
title: Geometry.AsBinary
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menerjemahkan geometri ini ke representasi Biner Terkenalnya.
type: docs
weight: 110
url: /id/net/aspose.gis.geometries/geometry/asbinary/
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

* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | Geometri tidak dapat direpresentasikan dalam varian WKB yang diminta. Saat ini terjadi kapan [`HasCurveGeometry`](../hascurvegeometry/) geometri adalah`true` dan varian WKB adalah SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* tidak valid[`WkbVariant`](../../wkbvariant/). |

### Lihat juga

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


