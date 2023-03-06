---
title: Feature.SetValue
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Menetapkan nilai baru dari suatu atribut.
type: docs
weight: 100
url: /id/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Menetapkan nilai baru dari suatu atribut.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Parameter | Keterangan |
| --- | --- |
| T | Jenis nilai. |
| attributeName | Nama atribut. |
| value | Nilai atribut. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Nama atributnya adalah`null`. |
| ArgumentException | Atribut dengan nama ini tidak ada di lapisan ini. |
| InvalidOperationException | Atribut tidak terkunci. |
| InvalidCastException | Jenis nilai tidak diterapkanIConvertible. |
| FormatException | Konversi gagal karena nilai dalam format yang salah. |
| OverflowException | Konversi gagal karena luapan. |

### Perkataan

Metode ini mengonversi nilai secara otomatis ke tipe atribut.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


