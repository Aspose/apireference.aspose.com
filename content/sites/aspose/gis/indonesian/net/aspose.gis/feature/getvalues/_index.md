---
title: Feature.GetValues
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Mengembalikan nilai untuk semua atribut dalam array.
type: docs
weight: 50
url: /id/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Mengembalikan nilai untuk semua atribut dalam array.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| values | Object[] | Larik tempat menyalin nilai atribut. |
| defaultValue | Object | Nilai yang akan dikembalikan jika nilai atribut tidak ada (tidak disetel). Nilai default adalah`null`. Pertimbangkan untuk menggunakan 'DBNull.Value' untuk memisahkan 'unset' dan '`null` nilai. |

### Nilai Pengembalian

Sejumlah atribut disalin.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumennya adalah`null`. |
| InvalidOperationException | Atribut tidak terkunci. |

### Perkataan

Atribut nilai fitur disalin ke larik nilai yang diteruskan sebagai parameter. Untuk atribut dengan nilai yang tidak disetel, parameter 'unsetValue' yang ditentukan dikembalikan.  Panjang larik nilai tidak harus sama dengan jumlah atribut dalam fitur. Jika panjang larik lebih besar dari jumlah atribut, semua nilai atribut disalin ke dalam larik; jika kurang, hanya jumlah panjang array dari nilai atribut yang disalin ke dalam array, dimulai dari nilai atribut dengan ordinal 0.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


