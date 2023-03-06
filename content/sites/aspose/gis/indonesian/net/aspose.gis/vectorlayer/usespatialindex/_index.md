---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS untuk Referensi .NET API
description: VectorLayer metode. Memuat indeks spasial untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter sepertiWhereIntersects danNearestTo. Jika indeks tidak ada buat dulu. MenggunakanforceRebuild untuk memaksa rekreasi indeks.
type: docs
weight: 190
url: /id/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Memuat indeks spasial untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereIntersects`](../../featuressequence/whereintersects/) dan[`NearestTo`](../nearestto/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| indexPath | String | Jalur ke file indeks. |
| forceRebuild | Boolean | Apakah akan membuat ulang indeks meskipun sudah ada. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalan adalah`null`. |
| IOException | Terjadi kesalahan I/O. |
| InvalidOperationException | Indeks spasial sudah dimuat untuk lapisan ini. |
| [GisException](../../gisexception/) | File ada dan bukan file indeks spasial yang dibuat oleh Aspose.GIS. |

### Lihat juga

* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Memuat indeks spasial untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereIntersects`](../../featuressequence/whereintersects/) dan[`NearestTo`](../nearestto/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| indexPath | AbstractPath | Jalur ke file indeks. |
| forceRebuild | Boolean | Apakah akan membuat ulang indeks meskipun sudah ada. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalan adalah`null`. |
| IOException | Terjadi kesalahan I/O. |
| InvalidOperationException | Indeks spasial sudah dimuat untuk lapisan ini. |
| [GisException](../../gisexception/) | File ada dan bukan file indeks spasial yang dibuat oleh Aspose.GIS. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)


