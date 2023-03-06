---
title: Class Feature
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Feature kelas. Fitur geografis yang terdiri dari geometri dan atribut yang ditentukan pengguna.
type: docs
weight: 130
url: /id/net/aspose.gis/feature/
---
## Feature class

Fitur geografis yang terdiri dari geometri dan atribut yang ditentukan pengguna.

```csharp
public class Feature
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Mendapat atau menyetel geometri fitur. Tidak bisa`null` , menggunakan[`Null`](../../aspose.gis.geometries/geometry/null/) untuk menunjukkan geometri yang hilang. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Menyalin nilai atribut dari fitur lain. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Mendapat nilai atribut. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Mendapat nilai atribut. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Mendapat nilai atribut, atau[`DefaultValue`](../featureattribute/defaultvalue/) jika nilainya tidak disetel atau`batal` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Mendapat nilai atribut, atau[`DefaultValue`](../featureattribute/defaultvalue/) jika nilainya tidak disetel atau`batal` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Mendapat nilai atribut, atau[`DefaultValue`](../featureattribute/defaultvalue/) jika nilainya tidak disetel atau`batal` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Mengembalikan nilai untuk semua atribut dalam array. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Mengembalikan nilai untuk semua atribut dalam array. Pertimbangkan untuk menggunakan[`GetValues`](./getvalues/) metode untuk menghindari alokasi memori tambahan. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Mendapat nilai urutan atribut sebagai daftar. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Menentukan apakah atribut yang ditentukan telah ditetapkan secara eksplisit`batal` nilai. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Memeriksa apakah nilai atribut diatur dalam fitur ini. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Menetapkan nilai baru dari suatu atribut. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Menetapkan nilai atribut ke`batal` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Menetapkan nilai baru untuk semua atribut. Pertimbangkan juga untuk menggunakan[`CopyValues`](./copyvalues/) metode untuk merampingkan nilai pengaturan dalam satu panggilan. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Menghapus nilai atribut dari fitur ini. |

### Lihat juga

* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


