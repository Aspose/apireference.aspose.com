---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS untuk Referensi .NET API
description: GeoGenerator metode. Membuat larik titik milik area yang ditentukan.
type: docs
weight: 20
url: /id/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Membuat larik titik milik area yang ditentukan.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rect | Extent | Area tertentu (lihat[`Cakupan`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Opsi pembuatan titik (lihat[`PointGeneratorOptions`](../../pointgeneratoroptions/)). |

### Nilai Pengembalian

Susunan poin (lihat pencacahan[`IGeometri`](../../../aspose.gis.geometries/igeometry/)).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah poin harus lebih kecil dari satu. |
| NullReferenceException | Extent harus memiliki nilai (bukan NULL). |

### Lihat juga

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* ruang nama [Aspose.Gis.GeoTools](../../geogenerator/)
* perakitan [Aspose.GIS](../../../)


