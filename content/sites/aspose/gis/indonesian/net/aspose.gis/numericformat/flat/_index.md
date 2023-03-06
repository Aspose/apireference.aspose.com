---
title: NumericFormat.Flat
second_title: Aspose.GIS untuk Referensi .NET API
description: NumericFormat metode. Mengonversi angka menjadi teks titik tetap tanpa notasi ilmiah.
type: docs
weight: 20
url: /id/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Mengonversi angka menjadi teks titik tetap tanpa notasi ilmiah.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| significantDigits | Int32 | Jumlah digit signifikan. Presisi maksimum yang tersedia adalah "308" |

### Nilai Pengembalian

Penentu Presisi Pembulatan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah digit signifikan kurang dari 0 atau lebih dari 308. |

### Perkataan

Kode internal menghasilkan string angka untuk WKT melalui: coordinat.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### Lihat juga

* class [NumericFormat](../)
* ruang nama [Aspose.Gis](../../numericformat/)
* perakitan [Aspose.GIS](../../../)


