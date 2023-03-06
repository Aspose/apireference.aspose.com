---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: GdalDriver metode. Membuat layer dan membukanya untuk menambahkan fitur baru.
type: docs
weight: 40
url: /id/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Membuat layer dan membukanya untuk menambahkan fitur baru.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| options | DriverOptions | Opsi khusus pengemudi. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | Lapisan sudah ada. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh pengemudi. |

### Lihat juga

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* ruang nama [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* perakitan [Aspose.GIS](../../../)


