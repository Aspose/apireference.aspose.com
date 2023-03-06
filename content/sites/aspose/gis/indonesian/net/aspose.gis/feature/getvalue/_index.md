---
title: Feature.GetValue
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Mendapat nilai atribut.
type: docs
weight: 30
url: /id/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

Mendapat nilai atribut.

```csharp
public T GetValue<T>(string attributeName)
```

| Parameter | Keterangan |
| --- | --- |
| T | Jenis yang diinginkan untuk nilai. |
| attributeName | Nama atribut. |

### Nilai Pengembalian

Nilai atribut.

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

Metode ini mengonversi nilai secara otomatis ke tipe yang diminta di parameter tipe umum.  Jika layer tidak mengharuskan fiturnya memiliki nilai untuk semua atribut yang ditentukan untuk layer, metode ini mungkin gagalInvalidOperationException ketika nilai yang hilang diminta. Saat bekerja dengan lapisan seperti itu, pertimbangkan untuk menggunakan[`GetValueOrDefault`](../getvalueordefault/) .

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

Mendapat nilai atribut.

```csharp
public object GetValue(string attributeName)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| attributeName | String | Nama atribut. |

### Nilai Pengembalian

Nilai atribut.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Nama atributnya adalah`null`. |
| ArgumentException | Atribut dengan nama ini tidak ada di lapisan ini. |
| InvalidOperationException | Atribut tidak terkunci. |
| InvalidOperationException | Nilai atribut ini tidak disetel untuk fitur ini. |

### Perkataan

Jika layer tidak mengharuskan fiturnya memiliki nilai untuk semua atribut yang ditentukan untuk layer, metode ini mungkin gagalInvalidOperationException ketika nilai yang hilang diminta. Saat bekerja dengan lapisan seperti itu, pertimbangkan untuk menggunakan[`GetValueOrDefault`](../getvalueordefault/) .

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


