---
title: Class Point
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Geometries.Point kelas. APoint mewakili satu lokasi dalam ruang koordinat.
type: docs
weight: 1190
url: /id/net/aspose.gis.geometries/point/
---
## Point class

A`Point` mewakili satu lokasi dalam ruang koordinat.

```csharp
public class Point : Geometry, IPoint
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Point](point/#constructor)() | Menginisialisasi instance baru dari`Point` kelas. |
| [Point](point/#constructor_1)(IPoint) | Menginisialisasi instance baru dari`Point` kelas. |
| [Point](point/#constructor_2)(double, double) | Menginisialisasi instance baru dari`Point` kelas. |
| [Point](point/#constructor_3)(double, double, double) | Menginisialisasi instance baru dari`Point` kelas. |
| [Point](point/#constructor_4)(double, double, double, double) | Menginisialisasi instance baru dari`Point` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Mendapat jumlah dimensi koordinat untuk ini[`Geometry`](../geometry/) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension/) { get; } | Mendapat dimensi topologi ini[`Geometry`](../geometry/) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype/) { get; } | Mendapatkan jenis geometri. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Mendapat nilai yang menunjukkan apakah geometri ini merupakan atau mengandung geometri kurva (bukan linier). |
| override [HasM](../../aspose.gis.geometries/point/hasm/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat M. |
| override [HasZ](../../aspose.gis.geometries/point/hasz/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini kosong. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini sederhana dari sudut pandang SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini valid. |
| [M](../../aspose.gis.geometries/point/m/) { get; set; } | Mendapat atau menetapkan nilai untuk m-coordinate. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem/) { get; set; } | Mendapat Sistem Referensi Spasial dari instance ini. Properti ini dapat berupa`null` , apakah SpatialReferenceSystem tidak diketahui. Menetapkan SpatialReferenceSystem baru tidak akan melakukan transformasi koordinat apa pun, hanya referensi yang akan berubah. |
| [X](../../aspose.gis.geometries/point/x/) { get; set; } | Mendapat atau menetapkan nilai untuk koordinat x. |
| [Y](../../aspose.gis.geometries/point/y/) { get; set; } | Mendapat atau menetapkan nilai koordinat y. |
| [Z](../../aspose.gis.geometries/point/z/) { get; set; } | Mendapat atau menetapkan nilai untuk koordinat z. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Menerjemahkan geometri ini ke representasi Biner Terkenalnya. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Menerjemahkan geometri ini ke representasi Biner Terkenalnya. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| override [Clone](../../aspose.gis.geometries/point/clone/)() | Menggandakan instance ini. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Menentukan apakah geometri ini tercakup oleh geometri tertentu. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Menentukan apakah geometri ini mencakup geometri tertentu. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersilangan. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Mengurangi geometri tertentu dari geometri ini. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Menentukan apakah geometri ini terpisah dari geometri tertentu. |
| [Equals](../../aspose.gis.geometries/point/equals/#equals)(IPoint) | Menunjukkan apakah objek saat ini sama dengan objek lain dari tipe yang sama. |
| override [Equals](../../aspose.gis.geometries/point/equals/#equals_1)(object) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Menghitung luas geometri ini. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Menghitung daerah penyangga di sekitar geometri ini. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Menghitung pusat massa geometri ini. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Menghitung convex hull dari geometri ini. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Menghitung jarak minimum antara geometri ini dan geometri tertentu. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Menghitung dan mengembalikan batasan geometri ini. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode/)() | Berfungsi sebagai fungsi hash default. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Menghitung panjang geometri ini. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Membangun persimpangan antara geometri ini dan geometri tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Menentukan apakah geometri ini memotong batas tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu berpotongan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Menentukan apakah geometri ini tumpang tindih dengan geometri tertentu. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Menentukan apakah matriks persimpangan DE-9IM dari geometri ini dan geometri tertentu cocok dengan pola yang diberikan. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Mendapat poligon yang direpresentasikan sebagai garis geometri ini. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Membulatkan koordinat M ke sejumlah digit pecahan yang ditentukan. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Membulatkan koordinat X dan Y ke sejumlah digit pecahan tertentu. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Membulatkan koordinat Z ke sejumlah digit pecahan yang ditentukan. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty/)() | Membuat ini[`Geometry`](../geometry/) kosong. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Menentukan apakah geometri ini secara spasial berisi geometri tertentu. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Menentukan apakah geometri ini secara spasial sama dengan geometri yang ditentukan. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Membuat perbedaan simetris antara geometri ini dan geometri tertentu. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable/#toeditable_1)() | Mendapatkan salinan geometri ini yang dapat diedit. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Mendapatkan salinan geometri ini yang dapat diedit. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)() | Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)(double) | Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersentuhan. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Menyatukan geometri ini dan geometri tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Menentukan apakah geometri ini berada dalam batas tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Menentukan apakah geometri ini berada dalam geometri yang ditentukan. |
| [operator ==](../../aspose.gis.geometries/point/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality/) | Menerapkan operator !=. |

### Lihat juga

* class [Geometry](../geometry/)
* interface [IPoint](../ipoint/)
* ruang nama [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* perakitan [Aspose.GIS](../../)


