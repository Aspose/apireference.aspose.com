---
title: Class Surface
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Geometries.Surface kelas. ASurface adalah objek geometri dua dimensi.
type: docs
weight: 1210
url: /id/net/aspose.gis.geometries/surface/
---
## Surface class

A`Surface` adalah objek geometri dua dimensi.

```csharp
public abstract class Surface : Geometry, ISurface
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Mendapat jumlah dimensi koordinat untuk ini[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension/) { get; } | Mendapat dimensi topologi ini[`Geometry`](../geometry/) . |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | Mendapatkan jenis geometri. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Mendapat nilai yang menunjukkan apakah geometri ini merupakan atau mengandung geometri kurva (bukan linier). |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat M. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | Mendapat nilai yang menunjukkan apakah instance ini memiliki koordinat Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini kosong. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini sederhana dari sudut pandang SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini valid. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | Mendapat Sistem Referensi Spasial dari instance ini. Properti ini dapat berupa`null` , apakah SpatialReferenceSystem tidak diketahui. Menetapkan SpatialReferenceSystem baru tidak akan melakukan transformasi koordinat apa pun, hanya referensi yang akan berubah. |

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
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | Menggandakan instance ini. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Menentukan apakah geometri ini tercakup oleh geometri tertentu. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Menentukan apakah geometri ini mencakup geometri tertentu. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersilangan. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Mengurangi geometri tertentu dari geometri ini. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Menentukan apakah geometri ini terpisah dari geometri tertentu. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Menghitung luas geometri ini. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Menghitung daerah penyangga di sekitar geometri ini. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Menghitung pusat massa geometri ini. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Menghitung convex hull dari geometri ini. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Menghitung jarak minimum antara geometri ini dan geometri tertentu. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Menghitung dan mengembalikan batasan geometri ini. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Menghitung panjang geometri ini. |
| abstract [GetPointOnSurface](../../aspose.gis.geometries/surface/getpointonsurface/)() | Menemukan titik yang dijamin berada di permukaan ini. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Membangun persimpangan antara geometri ini dan geometri tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Menentukan apakah geometri ini memotong batas tertentu. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu berpotongan. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Menentukan apakah geometri ini tumpang tindih dengan geometri tertentu. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Menentukan apakah matriks persimpangan DE-9IM dari geometri ini dan geometri tertentu cocok dengan pola yang diberikan. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Mendapat poligon yang direpresentasikan sebagai garis geometri ini. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Membulatkan koordinat M ke sejumlah digit pecahan yang ditentukan. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Membulatkan koordinat X dan Y ke sejumlah digit pecahan tertentu. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Membulatkan koordinat Z ke sejumlah digit pecahan yang ditentukan. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | Membuat ini[`Geometry`](../geometry/) kosong. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Menentukan apakah geometri ini secara spasial berisi geometri tertentu. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Menentukan apakah geometri ini secara spasial sama dengan geometri yang ditentukan. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Membuat perbedaan simetris antara geometri ini dan geometri tertentu. |
| [ToEditable](../../aspose.gis.geometries/surface/toeditable/#toeditable_1)() | Mendapatkan salinan geometri ini yang dapat diedit. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Mendapatkan salinan geometri ini yang dapat diedit. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/#tolineargeometry_2)() | Mendapat versi non-kurva perkiraan atau ekuivalen dari geometri ini menggunakan default`toleransi` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/#tolineargeometry_3)(double) | Mendapatkan perkiraan atau versi non-kurva yang setara dari geometri ini menggunakan yang ditentukan`toleransi` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Menentukan apakah geometri ini dan geometri tertentu bersentuhan. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Menyatukan geometri ini dan geometri tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Menentukan apakah geometri ini berada dalam batas tertentu. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Menentukan apakah geometri ini berada dalam geometri yang ditentukan. |

### Lihat juga

* class [Geometry](../geometry/)
* interface [ISurface](../isurface/)
* ruang nama [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* perakitan [Aspose.GIS](../../)


