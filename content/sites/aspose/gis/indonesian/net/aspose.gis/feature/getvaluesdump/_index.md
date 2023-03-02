---
title: Feature.GetValuesDump
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Mengembalikan nilai untuk semua atribut dalam array. Pertimbangkan untuk menggunakanGetValues metode untuk menghindari alokasi memori tambahan.
type: docs
weight: 60
url: /id/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Mengembalikan nilai untuk semua atribut dalam array. Pertimbangkan untuk menggunakan[`GetValues`](../getvalues/) metode untuk menghindari alokasi memori tambahan.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| defaultValue | Object | Nilai yang akan dikembalikan jika nilai atribut tidak ada (tidak disetel). Nilai default adalah`null`. Pertimbangkan untuk menggunakan 'DBNull.Value' untuk memisahkan 'unset' dan '`null` nilai. |

### Nilai Pengembalian

Array baru untuk menyalin nilai atribut.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumennya adalah`null`. |
| InvalidOperationException | Atribut tidak terkunci. |

### Perkataan

Atribut nilai fitur disalin ke larik nilai yang diteruskan sebagai parameter. Untuk atribut dengan nilai yang tidak disetel, parameter 'unsetValue' yang ditentukan dikembalikan.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


