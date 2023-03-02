---
title: Dataset.OpenLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: Dataset metode. Membuka layer dengan nama tertentu untuk dibaca.
type: docs
weight: 110
url: /id/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Membuka layer dengan nama tertentu untuk dibaca.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama layer yang akan dibuka. |
| options | DriverOptions | Buka opsi. |

### Nilai Pengembalian

Lapisan dibuka untuk dibaca.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentException | Lapisan dengan nama tertentu tidak ada; Objek opsi memiliki jenis yang salah untuk kumpulan data ini. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk kumpulan data ini. |
| ArgumentNullException | Namanya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca fitur dari lapisan. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* ruang nama [Aspose.Gis](../../dataset/)
* perakitan [Aspose.GIS](../../../)


