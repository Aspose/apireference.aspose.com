---
title: Feature.GetValuesList
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Mendapat nilai urutan atribut sebagai daftar.
type: docs
weight: 70
url: /id/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

Mendapat nilai urutan atribut sebagai daftar.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| Parameter | Keterangan |
| --- | --- |
| T | Jenis yang diinginkan untuk nilai. |
| attributeName | Nama atribut. |
| separator | Sebuah string yang digunakan untuk memisahkan nama atribut dan nilai indeks dari sequence. |

### Nilai Pengembalian

Daftar nilai atribut yang namanya berbeda berdasarkan urutan nilai indeks.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Nama atributnya adalah`null`. |
| ArgumentException | Atribut dengan nama ini tidak ada di lapisan ini. |
| InvalidOperationException | Atribut tidak terkunci. |
| InvalidOperationException | Nilai atribut ini tidak disetel untuk fitur ini. |
| InvalidCastException | Jenis yang diminta tidak diterapkanIConvertible. |
| InvalidCastException | Nilai atributnya adalah`null`, tetapi tipe yang diminta adalah tipe nilai. |
| FormatException | Konversi gagal karena nilai dalam format yang salah. |
| OverflowException | Konversi gagal karena luapan. |

### Perkataan

Ini menggunakan[`GetValue`](../getvalue/) untuk mendapatkan nilai tunggal. Jadi, metode ini mengonversi nilai secara otomatis ke tipe yang diminta di parameter tipe generik.  Jika atribut dengan indeks 0 tidak ditemukan maka akan dihasilkanArgumentException .

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


