---
title: Class RasterLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Raster.RasterLayer kelas. Merupakan lapisan raster.
type: docs
weight: 1390
url: /id/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Merupakan lapisan raster.

```csharp
public abstract class RasterLayer : IDisposable
```

## Properti

| Nama | Keterangan |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Mendapat jumlah band di lapisan raster. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Mendapat batas raster. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Mendapatkan ukuran sel atau piksel dari raster. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Mendapatkan[`Driver`](./driver/) yang membuat lapisan ini. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Mendapat tinggi raster dalam piksel. Juga dikenal sebagai jumlah baris. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Mendapat nilai yang mewakili latar belakang atau 'tidak ada data' dari raster. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Mendapat sistem referensi spasial raster. Bisa`null` jika tidak diketahui. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Mendapat koordinat x dari sudut kiri atas raster. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Mendapat koordinat y dari sudut kiri atas raster. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Mendapatkan lebar raster dalam piksel. Juga dikenal sebagai jumlah kolom. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Pangkas lapisan raster menggunakan band mask). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Pangkas lapisan raster menggunakan formulir bentuk (dan topeng pita). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Rilis sumber daya yang digunakan oleh`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Mendapat band dengan indeks yang ditentukan. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Menghitung jangkauan spasial dari lapisan ini. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Mengubah kolom dan baris tertentu menjadi koordinat spasial. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Menghitung ringkasan statistik yang terdiri dari count, sum, mean, min, max. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Membaca nilai dalam sel yang ditentukan. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Membaca nilai dalam blok yang ditentukan sebagai larik 1 dimensi. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Membaca dan memproses nilai pita dalam sebuah ekspresi. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Melengkungkan lapisan raster ke lapisan lain. |

### Lihat juga

* ruang nama [Aspose.Gis.Raster](../../aspose.gis.raster/)
* perakitan [Aspose.GIS](../../)


