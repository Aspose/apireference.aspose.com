---
title: Dataset.EditLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: Dataset metode. Membuka layer dengan nama tertentu untuk diedit.
type: docs
weight: 90
url: /id/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

Membuka layer dengan nama tertentu untuk diedit.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| name | String | Nama layer yang akan diedit. |
| options | DriverOptions | Buka opsi. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial untuk geometri baru. |

### Nilai Pengembalian

Lapisan dibuka untuk diedit.

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
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* ruang nama [Aspose.Gis](../../dataset/)
* perakitan [Aspose.GIS](../../../)


