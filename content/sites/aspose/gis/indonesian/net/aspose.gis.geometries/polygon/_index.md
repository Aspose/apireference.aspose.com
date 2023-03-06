---
title: Class Polygon
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Geometries.Polygon kelas. APolygon adalah bidang datar ditentukan oleh 1 batas luar dan 0 atau lebih batas dalam.
type: docs
weight: 1200
url: /id/net/aspose.gis.geometries/polygon/
---
## Polygon class

A`Polygon` adalah bidang datar, ditentukan oleh 1 batas luar dan 0 atau lebih batas dalam.

```csharp
public class Polygon : Surface, IPolygon
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Polygon](polygon/#constructor)() | Menginisialisasi instance baru dari`Polygon` kelas. |
| [Polygon](polygon/#constructor_1)(ILinearRing) | Menginisialisasi instance baru dari`Polygon` kelas. |
| [Polygon](polygon/#constructor_2)(ILinearRing, IEnumerable&lt;ILinearRing&gt;) | Menginisialisasi instance baru dari`Polygon` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Mendapat jumlah dimensi koordinat untuk ini[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension/) { get; } | Mendapat dimensi topologi ini[`Geometry`](../geometry/) . |
| [ExteriorRing](../../aspose.gis.geometries/polygon/exteriorring/) { get; set; } | Mendapat ring luar. |
| override [GeometryType](../../aspose.gis.geometries/polygon/geometrytype/) { get; } | Mendapatkan jenis geometri. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Mendapat nilai yang menunjukkan apakah geometri ini merupakan atau mengandung geometri kurva (bukan linier). |
| override [HasM](../../aspose.gis.geometries/polygon/hasm/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat M. |
| override [HasZ](../../aspose.gis.geometries/polygon/hasz/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat Z. |
| [InteriorRingsCount](../../aspose.gis.geometries/polygon/interiorringscount/) { get; } | Mendapat jumlah cincin interior. |
| override [IsEmpty](../../aspose.gis.geometries/polygon/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini kosong. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini sederhana dari sudut pandang SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini valid. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/polygon/spatialreferencesystem/) { get; set; } | Mendapat Sistem Referensi Spasial dari instance ini. Properti ini dapat berupa`null` , apakah SpatialReferenceSystem tidak diketahui. Menetapkan SpatialReferenceSystem baru tidak akan melakukan transformasi koordinat apa pun, hanya referensi yang akan berubah. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddInteriorRing](../../aspose.gis.geometries/polygon/addinteriorring/)(ILinearRing) | Menambahkan cincin interior. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Menerjemahkan geometri ini ke representasi Biner Terkenalnya. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Menerjemahkan geometri ini ke representasi Biner Terkenalnya. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| override [Clone](../../aspose.gis.geometries/polygon/clone/)() | Menggandakan instance ini. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Menentukan apakah geometri ini tercakup oleh geometri tertentu. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Menentukan apakah geometri ini mencakup geometri tertentu. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersilangan. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Mengurangi geometri tertentu dari geometri ini. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Menentukan apakah geometri ini terpisah dari geometri tertentu. |
| [Equals](../../aspose.gis.geometries/polygon/equals/#equals)(ICurvePolygon) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| [Equals](../../aspose.gis.geometries/polygon/equals/#equals_1)(IPolygon) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| override [Equals](../../aspose.gis.geometries/polygon/equals/#equals_2)(object) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Menghitung luas geometri ini. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Menghitung daerah penyangga di sekitar geometri ini. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Menghitung pusat massa geometri ini. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Menghitung convex hull dari geometri ini. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Menghitung jarak minimum antara geometri ini dan geometri tertentu. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Menghitung dan mengembalikan batasan geometri ini. |
| override [GetHashCode](../../aspose.gis.geometries/polygon/gethashcode/)() | Berfungsi sebagai fungsi hash default. |
| [GetInteriorRing](../../aspose.gis.geometries/polygon/getinteriorring/)(int) | Mendapat cincin interior dengan indeksnya. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Menghitung panjang geometri ini. |
| override [GetPointOnSurface](../../aspose.gis.geometries/polygon/getpointonsurface/)() | Menemukan titik yang dijamin berada di poligon ini. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Membangun persimpangan antara geometri ini dan geometri tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Menentukan apakah geometri ini memotong batas tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu berpotongan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Menentukan apakah geometri ini tumpang tindih dengan geometri tertentu. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Menentukan apakah matriks persimpangan DE-9IM dari geometri ini dan geometri tertentu cocok dengan pola yang diberikan. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Mendapat poligon yang direpresentasikan sebagai garis geometri ini. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Membulatkan koordinat M ke sejumlah digit pecahan yang ditentukan. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Membulatkan koordinat X dan Y ke sejumlah digit pecahan tertentu. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Membulatkan koordinat Z ke sejumlah digit pecahan yang ditentukan. |
| override [SetEmpty](../../aspose.gis.geometries/polygon/setempty/)() | Membuat ini[`Geometry`](../geometry/) kosong. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Menentukan apakah geometri ini secara spasial berisi geometri tertentu. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Menentukan apakah geometri ini secara spasial sama dengan geometri yang ditentukan. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Membuat perbedaan simetris antara geometri ini dan geometri tertentu. |
| [ToEditable](../../aspose.gis.geometries/polygon/toeditable/#toeditable_1)() | Mendapatkan salinan geometri ini yang dapat diedit. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Mendapatkan salinan geometri ini yang dapat diedit. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)() | Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)(double) | Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersentuhan. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Menyatukan geometri ini dan geometri tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Menentukan apakah geometri ini berada dalam batas tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Menentukan apakah geometri ini berada dalam geometri yang ditentukan. |
| [operator ==](../../aspose.gis.geometries/polygon/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.gis.geometries/polygon/op_inequality/) | Menerapkan operator !=. |

### Lihat juga

* class [Surface](../surface/)
* interface [IPolygon](../ipolygon/)
* ruang nama [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* perakitan [Aspose.GIS](../../)


