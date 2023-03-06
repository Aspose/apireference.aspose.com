---
title: Interface IGeometry
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Geometries.IGeometry arayüz. Geometri hiyerarşisinin arayüz kök sınıfı
type: docs
weight: 1000
url: /tr/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

Geometri hiyerarşisinin arayüz kök sınıfı

```csharp
public interface IGeometry
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension/) { get; } | Bunun topolojik boyutunu alır`IGeometry` . Boyut bilinmiyorsa (örn. boş bir GEOMETRYCOLLECTION için)Point döndürülür. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype/) { get; } | Geometrinin türünü alır. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry/) { get; } | Bu geometrinin eğri (doğrusal olmayan) geometri olup olmadığını veya içerip içermediğini gösteren bir değer alır. |
| [HasM](../../aspose.gis.geometries/igeometry/hasm/) { get; } | Bu örneğin M koordinatına sahip olup olmadığını gösteren bir değer alır. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz/) { get; } | Bu örneğin Z koordinatına sahip olup olmadığını gösteren bir değer alır. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty/) { get; } | Bu örneğin boş olup olmadığını gösteren bir değer alır (boş nokta kümesini temsil eder). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple/) { get; } | Bu örneğin SFA açısından basit olup olmadığını gösteren bir değer alır. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid/) { get; } | Bu örneğin geçerli olup olmadığını gösteren bir değer alır. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem/) { get; } | Bu örneğin SpatialReferenceSystem'ını alır. Bu özellik şu şekilde olabilir:`null` , SpatialReferenceSystem bilinmiyorsa. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary)() | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary_1)(WkbVariant) | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext)() | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_1)(WktVariant) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_2)(WktVariant, NumericFormat) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [Clone](../../aspose.gis.geometries/igeometry/clone/)() | Bu örneği klonlar. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby/)(IGeometry) | Bu geometrinin belirli bir geometri tarafından kapsanıp kapsanmadığını belirler. |
| [Covers](../../aspose.gis.geometries/igeometry/covers/)(IGeometry) | Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses/)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Difference](../../aspose.gis.geometries/igeometry/difference/)(IGeometry) | Belirtilen geometriyi bu geometriden çıkarır. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint/)(IGeometry) | Bu geometrinin belirli bir geometriden ayrık olup olmadığını belirler. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea/)() | Bu geometrinin alanını hesaplar. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer/)(double, int) | Bu geometri etrafında bir tampon bölge hesaplar. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid/)() | Bu geometrinin ağırlık merkezini hesaplar. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull/)() | Bu geometrinin dışbükey gövdesini hesaplar. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto/)(IGeometry) | Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent/)() | Bu geometrinin sınırlayıcı kapsamını hesaplar ve döndürür. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength/)() | Bu geometrinin uzunluğunu hesaplar. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında bir kesişim oluşturur. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects)(Extent) | Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects_1)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps/)(IGeometry) | Bu geometrinin belirtilen bir geometri ile örtüşüp örtüşmediğini belirler. |
| [Relate](../../aspose.gis.geometries/igeometry/relate/)(IGeometry, string) | Bu geometrinin ve belirli bir geometrinin DE-9IM kesişim matrisinin sağlanan desenle eşleşip eşleşmediğini belirler. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines/)() | Bu geometrinin çizgileri olarak temsil edilen çokgenleri alır. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains/)(IGeometry) | Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals/)(IGeometry) | Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında simetrik bir fark oluşturur. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable/#toeditable)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable/#toeditable_1)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry)() | Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry_1)(double) | Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches/)(IGeometry) | Bu geometri ile belirli bir geometrinin birbirine değip değmediğini belirler. |
| [Union](../../aspose.gis.geometries/igeometry/union/)(IGeometry) | Bu geometriyi ve belirtilen bir geometriyi birleştirir. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within)(Extent) | Bu geometrinin belirli bir kapsam içinde olup olmadığını belirler. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within_1)(IGeometry) | Bu geometrinin belirli bir geometri içinde olup olmadığını belirler. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* toplantı [Aspose.GIS](../../)


