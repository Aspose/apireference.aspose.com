---
title: Class FeaturesSequence
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.FeaturesSequence kelas. FeaturesSequence mewakili sekumpulan fitur vektor.
type: docs
weight: 170
url: /id/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` mewakili sekumpulan fitur vektor.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Properti

| Nama | Keterangan |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Mendapatkan kumpulan atribut khusus untuk fitur di sini[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Mendapat sistem referensi spasial dari urutan fitur ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Mengembalikan pencacah yang mengulang melalui koleksi. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Mendapatkan jangkauan spasial dari lapisan ini. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Menyimpan urutan fitur ke lapisan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Menyimpan urutan fitur ke lapisan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Menyimpan urutan fitur ke lapisan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Menyimpan urutan fitur ke lapisan. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Pisahkan fitur berdasarkan jenis geometri. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Memilih fitur dengan nilai atribut yang sama dengan nilai yang diberikan. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Memilih fitur dengan nilai atribut lebih besar dari nilai yang diberikan. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Memilih fitur dengan nilai atribut lebih besar atau sama dengan nilai yang diberikan. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filter fitur berdasarkan jangkauan. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Memfilter fitur berdasarkan penyatuan semua geometri dalam urutan fitur lainnya. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Memfilter fitur berdasarkan geometri yang disediakan. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Memilih fitur dengan nilai atribut tidak sama dengan nilai yang diberikan. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Memilih fitur dengan atribut tidak sama dengan null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Memilih fitur dengan atribut yang sama dengan nol. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Memilih fitur dengan set atribut. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Memilih fitur dengan nilai atribut lebih kecil dari nilai yang diberikan. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Memilih fitur dengan nilai atribut lebih kecil atau sama dengan nilai yang diberikan. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Memilih fitur di mana atribut yang ditentukan tidak disetel. |

### Lihat juga

* class [Feature](../feature/)
* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


