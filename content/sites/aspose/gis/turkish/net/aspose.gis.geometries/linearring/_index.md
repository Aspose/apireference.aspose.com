---
title: LinearRing
second_title: Aspose.GIS for .NET API Referansı
description: ALinearRing./linearring birLineString./linestring bu hem kapalı hem de basit.
type: docs
weight: 1030
url: /tr/net/aspose.gis.geometries/linearring/
---
## LinearRing class

A[`LinearRing`](../linearring) bir[`LineString`](../linestring) bu hem kapalı hem de basit.

```csharp
public class LinearRing : LineString, ILinearRing
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [LinearRing](linearring#constructor)() | Yeni bir örneğini başlatır[`LinearRing`](../linearring) sınıf. |
| [LinearRing](linearring#constructor_2)(IEnumerable&lt;IPoint&gt;) | Yeni bir örneğini başlatır[`LinearRing`](../linearring) sınıf. |
| [LinearRing](linearring#constructor_1)(ILineString) | Yeni bir örneğini başlatır[`LinearRing`](../linearring) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Bunun için koordinat boyutlarının sayısını alır[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/linestring/count) { get; } | [`LineString`](../linestring) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | Bunun topolojik boyutunu alır[`Geometry`](../geometry) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint) { get; } | Eğrinin bitiş noktasının bir kopyasını döndürür. |
| override [GeometryType](../../aspose.gis.geometries/linearring/geometrytype) { get; } | Geometrinin türünü alır. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Bu geometrinin eğri (doğrusal değil) geometrisi olup olmadığını veya içerip içermediğini gösteren bir değer alır. |
| [HasM](../../aspose.gis.geometries/linestring/hasm) { get; set; } | Bu örneğin M koordinatına sahip olup olmadığını gösteren bir değer alır. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz) { get; set; } | Bu örneğin Z koordinatına sahip olup olmadığını gösteren bir değer alır. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | Bir eğrinin kapalı olup olmadığını gösteren bir değer alır. Başlangıç noktası bitiş noktasına eşitse bir eğri kapalıdır. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty) { get; } | Bu örneğin boş olup olmadığını gösteren bir değer alır. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Bu örneğin SFA açısından basit olup olmadığını gösteren bir değer alır. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Bu örneğin geçerli olup olmadığını gösteren bir değer alır. |
| [Item](../../aspose.gis.geometries/linestring/item) { get; set; } | Alır veya ayarlar[`IPoint`](../ipoint) belirtilen dizinde. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem) { get; set; } | Bu örneğin SpatialReferenceSystem'ını alır. Bu özellik`null` , eğer SpatialReferenceSystem ayarlanmamışsa. Yeni SpatialReferenceSystem atamak herhangi bir koordinat dönüşümü gerçekleştirmez, sadece referans değişir. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint) { get; } | Eğrinin başlangıç noktasının bir kopyasını döndürür. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(IPoint) | Satırın sonuna bir nokta ekler. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(double, double) | Satırın sonuna bir nokta ekler. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(double, double, double) | Satırın sonuna bir nokta ekler. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint)(double, double, double, double) | Satırın sonuna bir nokta ekler. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü temsiline aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü temsiline aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü temsiline aktarın. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| override [Clone](../../aspose.gis.geometries/linearring/clone)() | Bu örneği klonlar. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Bu geometrinin belirtilen bir geometri tarafından kapsanıp kapsanmadığını belirler. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Bu geometri ile belirtilen bir geometrinin kesişip kesişmediğini belirler. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Belirtilen bir geometriyi bu geometriden çıkarır. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Bu geometrinin belirtilen bir geometriden ayrı olup olmadığını belirler. |
| [Equals](../../aspose.gis.geometries/linestring/equals)(ILineString) | Geçerli nesnenin aynı türdeki başka bir nesneye eşit olup olmadığını gösterir. |
| override [Equals](../../aspose.gis.geometries/linestring/equals)(object) | Belirtilen nesnenin geçerli nesneye eşit olup olmadığını belirler. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Bu geometrinin alanını hesaplar. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Bu geometri etrafında bir tampon bölge hesaplar. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Bu geometrinin ağırlık merkezini hesaplar. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Bu geometrinin dışbükey gövdesini hesaplar. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator)() | Koleksiyon boyunca yinelenen bir Numaralandırıcı döndürür. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Bu geometrinin sınırlayıcı bir kapsamını hesaplar ve döndürür. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode)() | Varsayılan karma işlevi olarak hizmet eder. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Bu geometrinin uzunluğunu hesaplar. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Bu geometri ile belirli bir geometri arasında bir kesişim oluşturur. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Bu geometri ile belirtilen bir geometrinin kesişip kesişmediğini belirler. |
| [IsClockwise](../../aspose.gis.geometries/linearring/isclockwise)() | Halkanın saat yönünde sarılı olup olmadığını belirler. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Bu geometrinin belirtilen bir geometriyle örtüşüp örtüşmediğini belirler. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Bu geometrinin DE-9IM kesişim matrisi ile belirtilen bir geometrinin sağlanan desenle eşleşip eşleşmediğini belirler. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Bu geometrinin çizgileri olarak temsil edilen çokgenleri alır. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse)() | Buradaki noktaların sırasını tersine çevirir[`LineString`](../linestring) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | M koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | X ve Y koordinatlarını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Z koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty)() | Bunu yapar[`Geometry`](../geometry) boş. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Bu geometri ile belirli bir geometri arasında simetrik bir fark oluşturur. |
| [ToEditable](../../aspose.gis.geometries/linearring/toeditable#toeditable_2)() | Bu geometrinin düzenlenebilir bir kopyasını alır. (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Bu geometrinin ve belirtilen bir geometrinin dokunup dokunmayacağını belirler. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Bu geometriyi ve belirtilen bir geometriyi birleştirir. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Bu geometrinin belirli bir kapsam dahilinde olup olmadığını belirler. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Bu geometrinin belirtilen bir geometri içinde olup olmadığını belirler. |

### Ayrıca bakınız

* class [LineString](../linestring)
* interface [ILinearRing](../ilinearring)
* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
