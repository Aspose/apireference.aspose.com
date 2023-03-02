---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS untuk Referensi .NET API
description: Feature metode. Mendapat nilai atribut atauDefaultValue jika nilainya tidak disetel ataubatal .
type: docs
weight: 40
url: /id/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

Mendapat nilai atribut, atau[`DefaultValue`](../../featureattribute/defaultvalue/) jika nilainya tidak disetel atau`batal` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

Metode ini mengonversi nilai secara otomatis ke tipe yang diminta di parameter tipe umum.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

Mendapat nilai atribut, atau[`DefaultValue`](../../featureattribute/defaultvalue/) jika nilainya tidak disetel atau`batal` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| attributeName | String | Nama atribut. |
| defaultValue | Object | Nilai yang akan dikembalikan jika nilai atribut tidak ada. Nilai default adalah`null` . |

### Nilai Pengembalian

Nilai atribut.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Nama atributnya adalah`null`. |
| ArgumentException | Atribut dengan nama ini tidak ada di lapisan ini. |
| InvalidOperationException | Atribut tidak terkunci. |
| InvalidOperationException | Nilai atribut ini tidak disetel untuk fitur ini. |

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

Mendapat nilai atribut, atau[`DefaultValue`](../../featureattribute/defaultvalue/) jika nilainya tidak disetel atau`batal` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| Parameter | Keterangan |
| --- | --- |
| T | Jenis yang diinginkan untuk nilai. |
| attributeName | Nama atribut. |
| defaultValue | Nilai yang akan dikembalikan jika nilai atribut tidak ada. |

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

Metode ini mengonversi nilai secara otomatis ke tipe yang diminta di parameter tipe umum.

### Lihat juga

* class [Feature](../)
* ruang nama [Aspose.Gis](../../feature/)
* perakitan [Aspose.GIS](../../../)


