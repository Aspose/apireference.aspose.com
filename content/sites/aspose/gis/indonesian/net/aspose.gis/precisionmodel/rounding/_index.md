---
title: PrecisionModel.Rounding
second_title: Aspose.GIS untuk Referensi .NET API
description: PrecisionModel metode. Mengembalikan model presisi pembulatan. Menurut model presisi pembulatan hanya sejumlah digit yang signifikan.
type: docs
weight: 20
url: /id/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Mengembalikan model presisi pembulatan. Menurut model presisi pembulatan hanya sejumlah digit yang signifikan.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| significantDigits | Int32 | Jumlah digit signifikan. |

### Nilai Pengembalian

Model Presisi Pembulatan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Jumlah digit signifikan kurang dari 0 atau lebih dari 15. |

### Perkataan

Saat diterapkan ke koordinat, kode berikut digunakan untuk mengurangi presisi:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Lihat juga

* class [PrecisionModel](../)
* ruang nama [Aspose.Gis](../../precisionmodel/)
* perakitan [Aspose.GIS](../../../)


