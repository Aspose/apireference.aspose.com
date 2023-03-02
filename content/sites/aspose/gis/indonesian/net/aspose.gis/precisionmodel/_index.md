---
title: Class PrecisionModel
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.PrecisionModel kelas. PrecisionModel menentukan sejumlah digit signifikan dalam sebuah koordinat.
type: docs
weight: 1310
url: /id/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` menentukan sejumlah digit signifikan dalam sebuah koordinat.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Properti

| Nama | Keterangan |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Mengembalikan model presisi tepat. Menurut model presisi tepat, semua digit dalam nilai ganda adalah signifikan. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Mendapat nilai yang menunjukkan apakah model presisi ini tepat. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Mendapat nilai yang menunjukkan apakah model presisi ini membulat. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Mendapat sejumlah digit signifikan dalam model presisi jika dibulatkan. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Mengembalikan model presisi pembulatan. Menurut model presisi pembulatan hanya sejumlah digit yang signifikan. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Menunjukkan apakah objek saat ini sama dengan objek lain dari tipe yang sama. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Menunjukkan apakah objek saat ini sama dengan objek lain dari tipe yang sama. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Berfungsi sebagai fungsi hash default. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Menerapkan operator !=. |

### Perkataan

Ada dua jenis PrecisionModel:  Akurat`PrecisionModel` (semua digit signifikan); Bulat`PrecisionModel` (beberapa angka signifikan). A`PrecisionModel` dapat diatur ke[`VectorLayer`](../vectorlayer/) melalui[`DriverOptions`](../driveroptions/) untuk membulatkan koordinat saat menulis atau membaca geometri.

### Lihat juga

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


