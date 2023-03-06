---
title: GeoGenerator.ProduceLines
second_title: Aspose.GIS untuk Referensi .NET API
description: GeoGenerator metode. Membuat Enumerator ILineString baru dengan sejumlah item acak tertentu semuanya dalam batas tertentu.
type: docs
weight: 10
url: /id/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Membuat Enumerator ILineString baru dengan sejumlah item acak tertentu, semuanya dalam batas tertentu.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rect | Extent | Area tertentu (lihat[`Cakupan`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Opsi pembuatan garis (lihat[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### Nilai Pengembalian

Susunan garis (lihat pencacahan[`iLineString`](../../../aspose.gis.geometries/ilinestring/))

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah baris harus lebih banyak daripada satu. |
| NullReferenceException | Luas harus memiliki nilai (bukan NULL) |

### Lihat juga

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* ruang nama [Aspose.Gis.GeoTools](../../geogenerator/)
* perakitan [Aspose.GIS](../../../)


