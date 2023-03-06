---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS untuk Referensi .NET API
description: GeoGenerator metode. Membuat susunan bintang semuanya dalam batas tertentu.
type: docs
weight: 40
url: /id/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Membuat susunan bintang, semuanya dalam batas tertentu.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rect | Extent | Area tertentu (lihat[`Cakupan`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Opsi pembuatan poligon (lihat[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Nilai Pengembalian

Susunan bintang (lihat pencacahan[`Poligon`](../../../aspose.gis.geometries/ipolygon/))

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah bintang harus lebih banyak daripada satu. |
| NullReferenceException | Luas harus memiliki nilai (bukan NULL) |
| ArgumentException | Panjang minimum dan maksimum harus tidak sama dan lebih besar dari 3 |
| ArgumentException | Panjang maksimum harus lebih besar dari minimum |

### Lihat juga

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* ruang nama [Aspose.Gis.GeoTools](../../geogenerator/)
* perakitan [Aspose.GIS](../../../)


