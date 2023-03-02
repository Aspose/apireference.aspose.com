---
title: NumericFormat.General
second_title: Aspose.GIS untuk Referensi .NET API
description: NumericFormat metode. Mengonversi angka menjadi notasi titik tetap atau notasi ilmiah yang lebih ringkas bergantung pada jenis angka dan apakah ada penentu presisi. Disarankan untuk digunakan.
type: docs
weight: 30
url: /id/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

Mengonversi angka menjadi notasi titik tetap atau notasi ilmiah yang lebih ringkas, bergantung pada jenis angka dan apakah ada penentu presisi. Disarankan untuk digunakan.

```csharp
public static NumericFormat General(int precision = 0)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| precision | Int32 | Presisi menentukan jumlah maksimum digit signifikan yang dapat muncul dalam string hasil. Jika presisinya nol, nilai "15" digunakan. Presisi maksimum yang tersedia adalah "17". |

### Nilai Pengembalian

Penentu Format Umum.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah digit signifikan kurang dari 0 atau lebih dari 17. |

### Perkataan

Kode internal menghasilkan string angka untuk WKT melalui: koordinat.ToString("G", CultureInfo.InvariantCulture).

### Lihat juga

* class [NumericFormat](../)
* ruang nama [Aspose.Gis](../../numericformat/)
* perakitan [Aspose.GIS](../../../)


