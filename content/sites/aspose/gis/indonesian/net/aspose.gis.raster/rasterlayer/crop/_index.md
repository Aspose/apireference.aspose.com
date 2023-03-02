---
title: RasterLayer.Crop
second_title: Aspose.GIS untuk Referensi .NET API
description: RasterLayer metode. Pangkas lapisan raster menggunakan formulir bentuk dan topeng pita.
type: docs
weight: 110
url: /id/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Pangkas lapisan raster menggunakan formulir bentuk (dan topeng pita).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| geometry | IGeometry | Geometri mewakili bentuk bentuk. |
| masks | Double[] | Masker untuk lapisan tanaman |

### Nilai Pengembalian

Lapisan raster yang dipotong. Jika tidak ada persimpangan ditemukan kembali`null`.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen tidak boleh nol. Nama parameter: geometri. |
| NotSupportedException | Argumen tidak boleh berbeda dari poligon atau permukaan. Nama parameter: geometri. |
| InvalidOperationException | Lapisan asli tidak boleh berupa CropRasterLayer lain. |
| [GisException](../../../aspose.gis/gisexception/) | Kesalahan saat memotong lapisan. |

### Lihat juga

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* ruang nama [Aspose.Gis.Raster](../../rasterlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Pangkas lapisan raster menggunakan band mask).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| masks | Double[] | Masker untuk lapisan tanaman |

### Nilai Pengembalian

Lapisan raster yang dipotong. Jika tidak ada persimpangan ditemukan kembali`null`.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException |  |

### Lihat juga

* class [RasterLayer](../)
* ruang nama [Aspose.Gis.Raster](../../rasterlayer/)
* perakitan [Aspose.GIS](../../../)


