---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS untuk Referensi .NET API
description: RasterLayer metode. Mengubah kolom dan baris tertentu menjadi koordinat spasial.
type: docs
weight: 150
url: /id/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Mengubah kolom dan baris tertentu menjadi koordinat spasial.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| cellX | Int32 | Nilai untuk kolom (koordinat x). Penomoran dimulai dari 0. |
| cellY | Int32 | Nilai untuk baris (koordinat y). Penomoran dimulai dari 0. |

### Nilai Pengembalian

Mengembalikan koordinat x sudut kiri atas yang diberi kolom dan baris.

### Perkataan

Jika salah satu parameter dilewatkan di luar rentang dimensi masing-masing raster, ia akan mengembalikan koordinat di luar raster dengan asumsi kisi raster berlaku di luar batas raster.

### Lihat juga

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* ruang nama [Aspose.Gis.Raster](../../rasterlayer/)
* perakitan [Aspose.GIS](../../../)


