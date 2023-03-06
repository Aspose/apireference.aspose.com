---
title: Class VectorLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.VectorLayer kelas. Mewakili lapisan vektor. Lapisan vektor adalah kumpulan fitur geografis yang disimpan dalam file.
type: docs
weight: 2320
url: /id/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Mewakili lapisan vektor. Lapisan vektor adalah kumpulan fitur geografis, yang disimpan dalam file.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Properti

| Nama | Keterangan |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Mendapatkan kumpulan atribut khusus untuk fitur di sini`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Mendapat jumlah fitur di lapisan ini. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Mendapatkan[`Driver`](./driver/) yang membuat lapisan ini. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Mendapatkan tipe geometri untuk layer. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Mendapatkan[`Feature`](../feature/) pada indeks yang ditentukan. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Mendapat sistem referensi spasial dari urutan fitur ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Buka layer untuk dibaca. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Buka layer untuk dibaca. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Buka layer untuk dibaca. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Buka layer untuk dibaca. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Menambahkan fitur baru ke layer, jika didukung oleh`VectorLayer` S[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Menambahkan fitur baru dengan gaya tertentu ke lapisan, jika didukung oleh`VectorLayer` S[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Buat klon layer sebagai format InMemory. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Membuat (tetapi tidak menambah lapisan) fitur baru dengan atribut yang cocok dengan kumpulan atribut lapisan ini. Setelah selesai mengatur data untuk fitur tersebut, gunakan[`Add`](./add/) untuk menambahkan fitur ke layer. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Menyalin atribut lainnya`VectorLayer` ke yang ini. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Menyalin atribut lainnya`VectorLayer` ke yang ini. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Merilis sumber daya yang digunakan oleh`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Mengembalikan pencacah yang mengulang melalui koleksi. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Mendapatkan jangkauan spasial dari lapisan ini. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Menggabungkan layer ke layer saat ini. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Mendapat fitur terdekat ke titik yang disediakan. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Mendapat fitur terdekat dengan koordinat yang disediakan. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Hapus[`Feature`](../feature/) pada indeks yang ditentukan. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Ganti[`Feature`](../feature/) pada indeks yang ditentukan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Menyimpan urutan fitur ke lapisan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Menyimpan urutan fitur ke lapisan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Menyimpan urutan fitur ke lapisan. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Menyimpan urutan fitur ke lapisan. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Pisahkan fitur berdasarkan jenis geometri. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Memuat indeks atribut untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereGreater`](../featuressequence/wheregreater/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Memuat indeks atribut untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereGreater`](../featuressequence/wheregreater/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Memuat indeks spasial untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereIntersects`](../featuressequence/whereintersects/) dan[`NearestTo`](./nearestto/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Memuat indeks spasial untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereIntersects`](../featuressequence/whereintersects/) dan[`NearestTo`](./nearestto/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Memilih fitur dengan nilai atribut yang sama dengan nilai yang diberikan. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Memilih fitur dengan nilai atribut lebih besar dari nilai yang diberikan. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Memilih fitur dengan nilai atribut lebih besar atau sama dengan nilai yang diberikan. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Filter fitur berdasarkan jangkauan. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Memfilter fitur berdasarkan penyatuan semua geometri dalam urutan fitur lainnya. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Memfilter fitur berdasarkan geometri yang disediakan. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Memilih fitur dengan nilai atribut tidak sama dengan nilai yang diberikan. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Memilih fitur dengan atribut tidak sama dengan null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Memilih fitur dengan atribut yang sama dengan nol. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Memilih fitur dengan set atribut. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Memilih fitur dengan nilai atribut lebih kecil dari nilai yang diberikan. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Memilih fitur dengan nilai atribut lebih kecil atau sama dengan nilai yang diberikan. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Memilih fitur di mana atribut yang ditentukan tidak disetel. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Mengonversi layer ke format lain. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Mengonversi layer ke format lain. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Mengonversi layer ke format lain. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Mengonversi layer ke format lain. |

### Lihat juga

* class [FeaturesSequence](../featuressequence/)
* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


