---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS untuk Referensi .NET API
description: Dataset metode. Membuka layer pada indeks tertentu untuk dibaca.
type: docs
weight: 120
url: /id/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Membuka layer pada indeks tertentu untuk dibaca.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| index | Int32 | Indeks lapisan untuk membuka. |
| options | DriverOptions | Buka opsi. |

### Nilai Pengembalian

Lapisan dibuka untuk dibaca.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk kumpulan data ini. |
| ArgumentOutOfRangeException | Indeks berada di luar jangkauan |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk kumpulan data ini. |
| [GisException](../../gisexception/) | Kesalahan membaca fitur dari lapisan. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* ruang nama [Aspose.Gis](../../dataset/)
* perakitan [Aspose.GIS](../../../)


