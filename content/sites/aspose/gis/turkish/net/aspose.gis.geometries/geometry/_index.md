---
title: Class Geometry
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Geometries.Geometry sınıf. Geometri hiyerarşisinin soyut kök sınıfı.
type: docs
weight: 920
url: /tr/net/aspose.gis.geometries/geometry/
---
## Geometry class

Geometri hiyerarşisinin soyut kök sınıfı.

```csharp
public abstract class Geometry : IGeometry
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Bunun için koordinat boyutlarının sayısını alır`Geometry` . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension/) { get; } | Bunun topolojik boyutunu alır`Geometry` . Boyut bilinmiyorsa (örn. boş bir GEOMETRYCOLLECTION için)Point döndürülür. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | Geometrinin türünü alır. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Bu geometrinin eğri (doğrusal olmayan) geometri olup olmadığını veya içerip içermediğini gösteren bir değer alır. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | Bu örneğin M koordinatına sahip olup olmadığını gösteren bir değer alır. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | Bu örneğin Z koordinatına sahip olup olmadığını gösteren bir değer alır. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Bu örneğin boş olup olmadığını gösteren bir değer alır. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Bu örneğin SFA açısından basit olup olmadığını gösteren bir değer alır. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Bu örneğin geçerli olup olmadığını gösteren bir değer alır. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | Bu örneğin SpatialReferenceSystem'ını alır. Bu özellik şu şekilde olabilir:`null` , SpatialReferenceSystem isknown. Yeni SpatialReferenceSystem ataması herhangi bir koordinat dönüşümü gerçekleştirmeyecek, sadece referans değişecek. |
| static [Null](../../aspose.gis.geometries/geometry/null/) { get; } | Boş geometri örneğini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary)() | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary_1)(WkbVariant) | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext)() | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_1)(WktVariant) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_2)(WktVariant, NumericFormat) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | Bu örneği klonlar. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bu geometrinin belirli bir geometri tarafından kapsanıp kapsanmadığını belirler. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Belirtilen geometriyi bu geometriden çıkarır. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bu geometrinin belirli bir geometriden ayrık olup olmadığını belirler. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Bu geometrinin alanını hesaplar. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Bu geometri etrafında bir tampon bölge hesaplar. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Bu geometrinin ağırlık merkezini hesaplar. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Bu geometrinin dışbükey gövdesini hesaplar. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Bu geometrinin sınırlayıcı kapsamını hesaplar ve döndürür. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Bu geometrinin uzunluğunu hesaplar. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında bir kesişim oluşturur. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects)(Extent) | Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects_1)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bu geometrinin belirtilen bir geometri ile örtüşüp örtüşmediğini belirler. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bu geometrinin ve belirli bir geometrinin DE-9IM kesişim matrisinin sağlanan desenle eşleşip eşleşmediğini belirler. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Bu geometrinin çizgileri olarak temsil edilen çokgenleri alır. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X ve Y koordinatlarını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | Bunu yapar`Geometry` boş. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında simetrik bir fark oluşturur. |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable/#toeditable)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/#toeditable_1)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry)() | Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry_1)(double) | Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bu geometri ile belirli bir geometrinin birbirine değip değmediğini belirler. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Bu geometriyi ve belirtilen bir geometriyi birleştirir. |
| [Within](../../aspose.gis.geometries/geometry/within/#within)(Extent) | Bu geometrinin belirli bir kapsam içinde olup olmadığını belirler. |
| [Within](../../aspose.gis.geometries/geometry/within/#within_1)(IGeometry) | Bu geometrinin belirli bir geometri içinde olup olmadığını belirler. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary)(byte[]) | İyi Bilinen İkili temsilinden bir geometri oluşturur. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary_1)(byte[], SpatialReferenceSystem) | İyi Bilinen İkili temsilinden bir geometri oluşturur. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext)(string) | İyi Bilinen Metin gösteriminden bir geometri oluşturur. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext_1)(string, SpatialReferenceSystem) | İyi Bilinen Metin gösteriminden bir geometri oluşturur. |

### Ayrıca bakınız

* interface [IGeometry](../igeometry/)
* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* toplantı [Aspose.GIS](../../)


