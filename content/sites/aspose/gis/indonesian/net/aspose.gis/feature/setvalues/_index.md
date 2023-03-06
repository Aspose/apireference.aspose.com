---
title: Feature.SetValues
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Menetapkan nilai baru untuk semua atribut. Pertimbangkan juga untuk menggunakanCopyValues metode untuk merampingkan nilai pengaturan dalam satu panggilan.
type: docs
weight: 120
url: /id/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Menetapkan nilai baru untuk semua atribut. Pertimbangkan juga untuk menggunakan[`CopyValues`](../copyvalues/) metode untuk merampingkan nilai pengaturan dalam satu panggilan.

```csharp
public int SetValues(object[] values)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| values | Object[] | Array nilai baru. |

### Nilai Pengembalian

Jumlah nilai atribut yang ditetapkan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen tidak bisa`null`. |
| ArgumentException | Atribut dengan nama ini tidak ada di lapisan ini. |
| InvalidOperationException | Atribut tidak terkunci. |
| InvalidCastException | Jenis nilai tidak diterapkanIConvertible. |
| FormatException | Konversi gagal karena nilai dalam format yang salah. |
| OverflowException | Konversi gagal karena luapan. |

### Perkataan

Metode ini mengonversi setiap nilai secara otomatis menjadi tipe atribut.  Panjang larik nilai tidak harus sama dengan jumlah atribut dalam fitur. Jika panjang larik lebih besar dari jumlah atribut, semua nilai larik disalin ke dalam atribut; jika kurang, hanya jumlah nilai panjang array yang disalin ke dalam atribut, dimulai dari nilai atribut dengan ordinal 0.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


