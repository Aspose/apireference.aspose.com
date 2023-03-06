---
title: Class FileGdbOptions
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.FileGdb.FileGdbOptions kelas. Opsi khusus driver untuk format FileGDB.
type: docs
weight: 270
url: /id/net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

Opsi khusus driver untuk format FileGDB.

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [FileGdbOptions](filegdboptions/)() | Buat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Menentukan apakah menutup yang tidak tertutupLinearRing dalam setiap geometri. Default ke`false` . |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid/) { get; set; } | Kisi presisi koordinat untuk digunakan di layer baru. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Menentukan jika menambahkan titik baru di tengah setiap segmen geometri. Default ke`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Menentukan apakah menghapus titik dekat di setiap geometri. Default ke`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Menentukan jarak untuk[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Default ke`0` . |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/) { get; set; } | Apakah koordinat harus dalam rentang yang valid. |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/) { get; set; } | Nama bidang geometri. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Toleransi yang digunakan untuk linierisasi geometri kurva. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat M saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance/) { get; set; } | M toleransi gertakan. |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/) { get; set; } | Nama bidang ID objek. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Menentukan apakah menghapus titik yang terletak pada segmen yang sama di setiap geometri. Default ke`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Menentukan jarak untuk[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Default ke`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Menentukan apakah geometri harus divalidasi saat ditambahkan ke lapisan. Jika disetel ke`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dipanggil untuk each geometri saat ditambahkan ke lapisan, dan jika validasi gagal ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) adalah`false` ),[`GisException`](../../aspose.gis/gisexception/) dilempar. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Menentukan apakah transformasi poligon atau multipoligon ke garis garis diperbolehkan. Default ke`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat X dan Y saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance/) { get; set; } | Toleransi gertakan X dan Y. |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) yang akan diterapkan ke koordinat Z saat geometri ditambahkan ke[`VectorLayer`](../../aspose.gis/vectorlayer/) atau ketika mereka dibaca dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Nilai defaultnya adalah[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance/) { get; set; } | Toleransi gertakan Z. |

### Lihat juga

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ruang nama [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* perakitan [Aspose.GIS](../../)


