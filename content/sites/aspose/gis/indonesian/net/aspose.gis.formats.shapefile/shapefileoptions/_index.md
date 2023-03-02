---
title: Class ShapefileOptions
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.Shapefile.ShapefileOptions kelas. Opsi khusus driver untuk format Shapefile. Saat ini driver tidak menyediakan opsi yang dapat disesuaikan.
type: docs
weight: 670
url: /id/net/aspose.gis.formats.shapefile/shapefileoptions/
---
## ShapefileOptions class

Opsi khusus driver untuk format Shapefile. Saat ini, driver tidak menyediakan opsi yang dapat disesuaikan.

```csharp
public class ShapefileOptions : DriverOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [ShapefileOptions](shapefileoptions/)() | Buat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Menentukan apakah menutup yang tidak tertutupLinearRing dalam setiap geometri. Default ke`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Menentukan jika menambahkan titik baru di tengah setiap segmen geometri. Default ke`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Menentukan apakah menghapus titik dekat di setiap geometri. Default ke`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Menentukan jarak untuk[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Default ke`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Toleransi yang digunakan untuk linierisasi geometri kurva. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat M saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Menentukan apakah menghapus titik yang terletak pada segmen yang sama di setiap geometri. Default ke`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Menentukan jarak untuk[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Default ke`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Menentukan apakah geometri harus divalidasi saat ditambahkan ke lapisan. Jika disetel ke`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dipanggil untuk each geometri saat ditambahkan ke lapisan, dan jika validasi gagal ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) adalah`false` ),[`GisException`](../../aspose.gis/gisexception/) dilempar. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Menentukan apakah transformasi poligon atau multipoligon ke garis garis diperbolehkan. Default ke`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat X dan Y saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat Z saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Lihat juga

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ruang nama [Aspose.Gis.Formats.Shapefile](../../aspose.gis.formats.shapefile/)
* perakitan [Aspose.GIS](../../)


