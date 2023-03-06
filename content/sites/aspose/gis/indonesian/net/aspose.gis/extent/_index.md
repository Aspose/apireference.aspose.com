---
title: Class Extent
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Extent kelas. Kotak pembatas spasial dua dimensi.
type: docs
weight: 120
url: /id/net/aspose.gis/extent/
---
## Extent class

Kotak pembatas spasial dua dimensi.

```csharp
public class Extent : IEquatable<Extent>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Extent](extent/#constructor)() | Membuat instance baru. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Membuat instance baru. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Membuat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Pusat luasan. |
| [Height](../../aspose.gis/extent/height/) { get; } | Ketinggian luasnya. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Menentukan apakah ini`Extent` valid. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) terkait dengan sejauh ini. Bisa`null` jika[`SpatialReferenceSystem`](./spatialreferencesystem/) tidak diketahui. Gunakan[`GetTransformed`](./gettransformed/) untuk mengubah jangkauan antara sistem referensi spasial yang berbeda. |
| [Width](../../aspose.gis/extent/width/) { get; } | Lebar luasnya. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Nilai maksimum koordinat X. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Nilai minimum koordinat X. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Nilai maksimum koordinat Y. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Nilai minimum koordinat Y. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Menggandakan instance ini. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Menentukan apakah sejauh ini berisi argumen. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Menentukan apakah sejauh ini berisi argumen. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Menentukan apakah jangkauan ini berisi koordinat yang ditentukan oleh argumen. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Menunjukkan apakah objek saat ini sama dengan objek lain dari tipe yang sama. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Berfungsi sebagai fungsi hash default. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Mengembalikan tingkat baru yang ditentukan[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) yang berisi sejauh ini. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Memperbesar sejauh ini sehingga menyertakan argumen. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Tumbuh sejauh ini sehingga termasuk titik yang ditentukan. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Menumbuhkan sejauh ini sepanjang sumbu X sehingga menyertakan nilai yang ditentukan. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Menumbuhkan sejauh ini sepanjang sumbu Y sehingga menyertakan nilai yang ditentukan. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Menentukan apakah batas ini bersinggungan dengan argumen. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Menentukan apakah batas ini bersinggungan dengan argumen. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Pertukaran[`XMin`](./xmin/) dengan[`XMax`](./xmax/) jika[`Width`](./width/) negatif dan [`YMin`](./ymin/) dengan[`YMax`](./ymax/) jika[`Height`](./height/) negatif. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Mengonversi luasan ini menjadi poligon persegi panjang yang mewakilinya. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Mengimplementasikan '==' operator. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Menerapkan operator '!='. |

### Lihat juga

* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


