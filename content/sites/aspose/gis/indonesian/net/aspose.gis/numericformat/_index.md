---
title: Class NumericFormat
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.NumericFormat kelas. NumericFormat digunakan untuk memformat tipe numerik umum dalam text.
type: docs
weight: 1290
url: /id/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` digunakan untuk memformat tipe numerik umum dalam text.

```csharp
public abstract class NumericFormat
```

## Properti

| Nama | Keterangan |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Mengonversi dan berupaya memastikan bahwa nilai numerik yang diubah menjadi string diuraikan kembali menjadi nilai numerik yang sama. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Mengonversi angka menjadi teks titik tetap tanpa notasi ilmiah. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Mengonversi angka menjadi notasi titik tetap atau notasi ilmiah yang lebih ringkas, bergantung pada jenis angka dan apakah ada penentu presisi. Disarankan untuk digunakan. |

### Perkataan

Ada tiga jenis`NumericFormat` :  Umum - titik tetap atau notasi ilmiah. Beberapa jumlah digit signifikan. RoundTrip - titik tetap atau notasi ilmiah. Maks digit signifikan. Datar - notasi titik tetap. Beberapa jumlah digit signifikan. A`NumericFormat` dapat diatur ke[`IGeometry`](../../aspose.gis.geometries/igeometry/) melalui[`AsText`](../../aspose.gis.geometries/igeometry/astext/) untuk menentukan format numerik saat menerjemahkan geometri ke representasi Teks Terkenal (WKT).

### Lihat juga

* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


