---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS untuk Referensi .NET API
description: GeoGenerator metode. Membuat Pencacah IPolygon baru dengan sejumlah item acak tertentu semuanya dalam batas tertentu.
type: docs
weight: 30
url: /id/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Membuat Pencacah IPolygon baru dengan sejumlah item acak tertentu, semuanya dalam batas tertentu.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rect | Extent | Area tertentu (lihat[`Cakupan`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Opsi pembuatan poligon (lihat[`Opsi Generator Poligon`](../../polygongeneratoroptions/)) |

### Nilai Pengembalian

Susunan poligon (lihat pencacahan[`Poligon`](../../../aspose.gis.geometries/ipolygon/))

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah poligon harus lebih dari satu. |
| NullReferenceException | Luas harus memiliki nilai (bukan NULL) |
| ArgumentException | Panjang minimum dan maksimum harus tidak sama dan lebih besar dari 0 |
| ArgumentException | Panjang maksimum harus lebih besar dari minimum |

### Lihat juga

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* ruang nama [Aspose.Gis.GeoTools](../../geogenerator/)
* perakitan [Aspose.GIS](../../../)


