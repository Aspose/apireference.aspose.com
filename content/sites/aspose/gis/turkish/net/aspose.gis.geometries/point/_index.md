---
title: Class Point
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Geometries.Point sınıf. birPoint koordinat uzayında tek bir konumu temsil eder.
type: docs
weight: 1190
url: /tr/net/aspose.gis.geometries/point/
---
## Point class

bir`Point` koordinat uzayında tek bir konumu temsil eder.

```csharp
public class Point : Geometry, IPoint
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Point](point/#constructor)() | Yeni bir örneğini başlatır.`Point` sınıf. |
| [Point](point/#constructor_1)(IPoint) | Yeni bir örneğini başlatır.`Point` sınıf. |
| [Point](point/#constructor_2)(double, double) | Yeni bir örneğini başlatır.`Point` sınıf. |
| [Point](point/#constructor_3)(double, double, double) | Yeni bir örneğini başlatır.`Point` sınıf. |
| [Point](point/#constructor_4)(double, double, double, double) | Yeni bir örneğini başlatır.`Point` sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Bunun için koordinat boyutlarının sayısını alır[`Geometry`](../geometry/) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension/) { get; } | Bunun topolojik boyutunu alır[`Geometry`](../geometry/) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype/) { get; } | Geometrinin türünü alır. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Bu geometrinin eğri (doğrusal olmayan) geometri olup olmadığını veya içerip içermediğini gösteren bir değer alır. |
| override [HasM](../../aspose.gis.geometries/point/hasm/) { get; set; } | Bu örneğin bir M koordinatına sahip olup olmadığını gösteren bir değer alır. |
| override [HasZ](../../aspose.gis.geometries/point/hasz/) { get; set; } | Bu örneğin Z koordinatına sahip olup olmadığını gösteren bir değer alır. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Bu örneğin boş olup olmadığını gösteren bir değer alır. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Bu örneğin SFA açısından basit olup olmadığını gösteren bir değer alır. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Bu örneğin geçerli olup olmadığını gösteren bir değer alır. |
| [M](../../aspose.gis.geometries/point/m/) { get; set; } | m-koordinatı için bir değer alır veya ayarlar. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem/) { get; set; } | Bu örneğin SpatialReferenceSystem'ını alır. Bu özellik şu şekilde olabilir:`null` , SpatialReferenceSystem isknown. Yeni SpatialReferenceSystem ataması herhangi bir koordinat dönüşümü gerçekleştirmeyecek, sadece referans değişecek. |
| [X](../../aspose.gis.geometries/point/x/) { get; set; } | x-koordinatı için bir değer alır veya ayarlar. |
| [Y](../../aspose.gis.geometries/point/y/) { get; set; } | y koordinatı için bir değer alır veya ayarlar. |
| [Z](../../aspose.gis.geometries/point/z/) { get; set; } | z-koordinatı için bir değer alır veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| override [Clone](../../aspose.gis.geometries/point/clone/)() | Bu örneği klonlar. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bu geometrinin belirli bir geometri tarafından kapsanıp kapsanmadığını belirler. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Belirtilen geometriyi bu geometriden çıkarır. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bu geometrinin belirli bir geometriden ayrık olup olmadığını belirler. |
| [Equals](../../aspose.gis.geometries/point/equals/#equals)(IPoint) | Geçerli nesnenin aynı türden başka bir nesneye eşit olup olmadığını gösterir. |
| override [Equals](../../aspose.gis.geometries/point/equals/#equals_1)(object) | Belirtilen nesnenin geçerli nesneye eşit olup olmadığını belirler. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Bu geometrinin alanını hesaplar. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Bu geometri etrafında bir tampon bölge hesaplar. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Bu geometrinin ağırlık merkezini hesaplar. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Bu geometrinin dışbükey gövdesini hesaplar. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Bu geometrinin sınırlayıcı kapsamını hesaplar ve döndürür. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode/)() | Varsayılan karma işlevi olarak işlev görür. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Bu geometrinin uzunluğunu hesaplar. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında bir kesişim oluşturur. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bu geometrinin belirtilen bir geometri ile örtüşüp örtüşmediğini belirler. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bu geometrinin ve belirli bir geometrinin DE-9IM kesişim matrisinin sağlanan desenle eşleşip eşleşmediğini belirler. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Bu geometrinin çizgileri olarak temsil edilen çokgenleri alır. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X ve Y koordinatlarını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty/)() | Bunu yapar[`Geometry`](../geometry/) boş. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında simetrik bir fark oluşturur. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable/#toeditable_1)() | Bu geometrinin düzenlenebilir bir kopyasını alır. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)() | Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)(double) | Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bu geometri ile belirli bir geometrinin birbirine değip değmediğini belirler. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Bu geometriyi ve belirtilen bir geometriyi birleştirir. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Bu geometrinin belirli bir kapsam içinde olup olmadığını belirler. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Bu geometrinin belirli bir geometri içinde olup olmadığını belirler. |
| [operator ==](../../aspose.gis.geometries/point/op_equality/) | ==. operatörünü uygular |
| [operator !=](../../aspose.gis.geometries/point/op_inequality/) | !=. operatörünü uygular |

### Ayrıca bakınız

* class [Geometry](../geometry/)
* interface [IPoint](../ipoint/)
* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* toplantı [Aspose.GIS](../../)


