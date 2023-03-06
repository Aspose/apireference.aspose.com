---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid kelas. Kisi presisi koordinat di dalam lapisan FileGDB.
type: docs
weight: 250
url: /id/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Kisi presisi koordinat di dalam lapisan FileGDB.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Mendapat atau menetapkan asal koordinat M. Jika disetel ke`null` defaultnya adalah digunakan. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Mendapat atau mengatur skala koordinat M. Jika disetel ke`null` defaultnya adalah digunakan. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Mendapat atau menetapkan asal koordinat X. Jika disetel ke`null` defaultnya adalah digunakan. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Mendapat atau mengatur skala koordinat X dan Y. Jika disetel ke`null` defaultnya adalah digunakan. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Mendapat atau menetapkan asal koordinat Y. Jika disetel ke`null` defaultnya adalah digunakan. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Mendapat atau menetapkan asal koordinat Z. Jika disetel ke`null` defaultnya adalah digunakan. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Mendapat atau mengatur skala koordinat Z. Jika disetel ke`null` defaultnya adalah digunakan. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Membuat baru`FileGdbCoordinatePrecisionGrid` sehingga semua nilai dalam persegi panjang dapat direpresentasikan. |

### Perkataan

Kisi presisi koordinat menentukan domain yang valid dan resolusi koordinat di lapisan FileGDB. Asal menentukan Jalur untuk mengkoordinasikan kisi presisi dalam ruang. Skala menentukan resolusi (skala yang lebih besar, nilai yang lebih tepat ditulis). Kisi presisi menentukan rentang nilai yang valid untuk koordinat: Setiap koordinat di[`VectorLayer`](../../aspose.gis/vectorlayer/)harus berada dalam rentang ini. Koordinat yang berada di luar rentang dapat menyebabkan kesalahan pembacaan di kemudian hari dan akan diproses dengan salah oleh ArcGIS. Jika Anda tidak menentukan properti apa pun (simpan`null` ) nilai default akan digunakan. Nilai default tergantung pada[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) dari[`VectorLayer`](../../aspose.gis/vectorlayer/) . Untuk geografis[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) defaultnya adalah: Untuk diproyeksikan[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) defaultnya adalah: dimana`Toleransi XY` ,`ZToleransi` Dan`Toleransi` adalah nilai dari[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### Lihat juga

* ruang nama [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* perakitan [Aspose.GIS](../../)


