---
title: Class CircularString
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Geometries.CircularString kelas. Kurva multisimpul dengan interpolasi melingkar antar titik.
type: docs
weight: 880
url: /id/net/aspose.gis.geometries/circularstring/
---
## CircularString class

Kurva multi-simpul dengan interpolasi melingkar antar titik.

```csharp
public class CircularString : Curve, ICircularString
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [CircularString](circularstring/#constructor)() | Menginisialisasi instance baru dari`CircularString` kelas. |
| [CircularString](circularstring/#constructor_1)(ICircularString) | Menginisialisasi instance baru dari`CircularString` kelas. |
| [CircularString](circularstring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | Menginisialisasi instance baru dari`CircularString` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Mendapat jumlah dimensi koordinat untuk ini[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/circularstring/count/) { get; } | Mendapat jumlah poin di`CircularString` . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Mendapat dimensi topologi ini[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/circularstring/endpoint/) { get; } | Mengembalikan salinan titik akhir kurva. |
| override [GeometryType](../../aspose.gis.geometries/circularstring/geometrytype/) { get; } | Mendapatkan jenis geometri. |
| override [HasCurveGeometry](../../aspose.gis.geometries/circularstring/hascurvegeometry/) { get; } | Mendapat nilai yang menunjukkan apakah geometri ini merupakan atau mengandung geometri kurva (bukan linier). |
| [HasM](../../aspose.gis.geometries/circularstring/hasm/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat M. |
| [HasZ](../../aspose.gis.geometries/circularstring/hasz/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Mendapat nilai yang menunjukkan apakah kurva tertutup. Kurva ditutup jika titik awalnya sama dengan titik akhirnya. |
| override [IsEmpty](../../aspose.gis.geometries/circularstring/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini kosong. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini sederhana dari sudut pandang SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini valid. |
| [Item](../../aspose.gis.geometries/circularstring/item/) { get; set; } | Mendapat atau menyetel[`IPoint`](../ipoint/) pada indeks yang ditentukan. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/circularstring/spatialreferencesystem/) { get; set; } | Mendapat Sistem Referensi Spasial dari instance ini. Properti ini dapat berupa`null` , jika SpatialReferenceSystem tidak disetel. Menetapkan SpatialReferenceSystem baru tidak akan melakukan transformasi koordinat apa pun, hanya referensi yang akan berubah. |
| override [StartPoint](../../aspose.gis.geometries/circularstring/startpoint/) { get; } | Mengembalikan salinan titik awal kurva. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint)(IPoint) | Menambahkan titik ke ujung string melingkar. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint_1)(double, double) | Menambahkan titik ke ujung string melingkar. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint_2)(double, double, double) | Menambahkan titik ke ujung string melingkar. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint/#addpoint_3)(double, double, double, double) | Menambahkan titik ke ujung string melingkar. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Menerjemahkan geometri ini ke representasi Biner Terkenalnya. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Menerjemahkan geometri ini ke representasi Biner Terkenalnya. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Ekspor geometri ini ke representasi gambar. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Menerjemahkan geometri ini ke representasi Teks Terkenalnya. |
| override [Clone](../../aspose.gis.geometries/circularstring/clone/)() | Menggandakan instance ini. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Menentukan apakah geometri ini tercakup oleh geometri tertentu. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Menentukan apakah geometri ini mencakup geometri tertentu. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersilangan. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Mengurangi geometri tertentu dari geometri ini. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Menentukan apakah geometri ini terpisah dari geometri tertentu. |
| [Equals](../../aspose.gis.geometries/circularstring/equals/#equals)(ICircularString) | Menunjukkan apakah objek saat ini sama dengan objek lain dari tipe yang sama. |
| override [Equals](../../aspose.gis.geometries/circularstring/equals/#equals_1)(object) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Menghitung luas geometri ini. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Menghitung daerah penyangga di sekitar geometri ini. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Menghitung pusat massa geometri ini. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Menghitung convex hull dari geometri ini. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Menghitung jarak minimum antara geometri ini dan geometri tertentu. |
| [GetEnumerator](../../aspose.gis.geometries/circularstring/getenumerator/)() | Mengembalikan pencacah yang mengulang melalui koleksi. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Menghitung dan mengembalikan batasan geometri ini. |
| override [GetHashCode](../../aspose.gis.geometries/circularstring/gethashcode/)() | Berfungsi sebagai fungsi hash default. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Menghitung panjang geometri ini. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Membangun persimpangan antara geometri ini dan geometri tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Menentukan apakah geometri ini memotong batas tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu berpotongan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Menentukan apakah geometri ini tumpang tindih dengan geometri tertentu. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Menentukan apakah matriks persimpangan DE-9IM dari geometri ini dan geometri tertentu cocok dengan pola yang diberikan. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Mendapat poligon yang direpresentasikan sebagai garis geometri ini. |
| override [Reverse](../../aspose.gis.geometries/circularstring/reverse/)() | Membalik urutan poin dalam hal ini`CircularString` . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Membulatkan koordinat M ke sejumlah digit pecahan yang ditentukan. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Membulatkan koordinat X dan Y ke sejumlah digit pecahan tertentu. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Membulatkan koordinat Z ke sejumlah digit pecahan yang ditentukan. |
| override [SetEmpty](../../aspose.gis.geometries/circularstring/setempty/)() | Membuat ini[`Geometry`](../geometry/) kosong. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Menentukan apakah geometri ini secara spasial berisi geometri tertentu. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Menentukan apakah geometri ini secara spasial sama dengan geometri yang ditentukan. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Membuat perbedaan simetris antara geometri ini dan geometri tertentu. |
| [ToEditable](../../aspose.gis.geometries/circularstring/toeditable/#toeditable)() | Mendapatkan salinan geometri ini yang dapat diedit. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Mendapatkan salinan geometri ini yang dapat diedit. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersentuhan. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Menyatukan geometri ini dan geometri tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Menentukan apakah geometri ini berada dalam batas tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Menentukan apakah geometri ini berada dalam geometri yang ditentukan. |
| [operator ==](../../aspose.gis.geometries/circularstring/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.gis.geometries/circularstring/op_inequality/) | Menerapkan operator !=. |

### Perkataan

Itu`CircularString` terdiri dari satu atau lebih segmen busur lingkaran yang terhubung ujung ke ujung. Tiga titik pertama menentukan segmen pertama. Titik pertama adalah titik awal dari busur. Titik kedua adalah titik tengah pada busur selain dari titik awal atau akhir. Titik ketiga adalah akhir dari busur. Busur selanjutnya ditentukan oleh titik tengah dan titik akhir saja, karena titik awal secara implisit ditentukan sebagai titik akhir segmen sebelumnya.

### Lihat juga

* class [Curve](../curve/)
* interface [ICircularString](../icircularstring/)
* ruang nama [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* perakitan [Aspose.GIS](../../)


