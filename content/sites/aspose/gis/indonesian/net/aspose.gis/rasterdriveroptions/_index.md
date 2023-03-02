---
title: Class RasterDriverOptions
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.RasterDriverOptions kelas. Opsi untuk aRasterDriver .
type: docs
weight: 1470
url: /id/net/aspose.gis/rasterdriveroptions/
---
## RasterDriverOptions class

Opsi untuk a[`RasterDriver`](../rasterdriver/) .

```csharp
public abstract class RasterDriverOptions : DriverOptions
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Menentukan apakah menutup yang tidak tertutupLinearRing dalam setiap geometri. Default ke`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Menentukan jika menambahkan titik baru di tengah setiap segmen geometri. Default ke`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Menentukan apakah menghapus titik dekat di setiap geometri. Default ke`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Menentukan jarak untuk[`DeleteNearPoints`](../driveroptions/deletenearpoints/) . Default ke`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Toleransi yang digunakan untuk linierisasi geometri kurva. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) yang akan diterapkan ke koordinat M saat geometri ditambahkan ke[`VectorLayer`](../vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../vectorlayer/) . Nilai defaultnya adalah[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Menentukan apakah menghapus titik yang terletak pada segmen yang sama di setiap geometri. Default ke`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Menentukan jarak untuk[`SimplifySegments`](../driveroptions/simplifysegments/) . Default ke`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Menentukan apakah geometri harus divalidasi saat ditambahkan ke lapisan. Jika disetel ke`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dipanggil untuk each geometri saat ditambahkan ke lapisan, dan jika validasi gagal ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) adalah`false` ),[`GisException`](../gisexception/) dilempar. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Menentukan apakah transformasi poligon atau multipoligon ke garis garis diperbolehkan. Default ke`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) yang akan diterapkan ke koordinat X dan Y saat geometri ditambahkan ke[`VectorLayer`](../vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../vectorlayer/) . Nilai defaultnya adalah[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) yang akan diterapkan ke koordinat Z saat geometri ditambahkan ke[`VectorLayer`](../vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../vectorlayer/) . Nilai defaultnya adalah[`Exact`](../precisionmodel/exact/) . |

### Lihat juga

* class [DriverOptions](../driveroptions/)
* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


