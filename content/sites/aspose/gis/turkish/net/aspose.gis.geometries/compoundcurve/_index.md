---
title: Class CompoundCurve
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Geometries.CompoundCurve sınıf. Bitişik eğrilerin bitiş noktalarında birleştirildiği bir dizi bitişik eğriyi temsil eden bir eğri.
type: docs
weight: 890
url: /tr/net/aspose.gis.geometries/compoundcurve/
---
## CompoundCurve class

Bitişik eğrilerin bitiş noktalarında birleştirildiği bir dizi bitişik eğriyi temsil eden bir eğri.

```csharp
public class CompoundCurve : Curve, ICompoundCurve
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [CompoundCurve](compoundcurve/#constructor)() | Yeni bir örneğini başlatır.`CompoundCurve` sınıf. |
| [CompoundCurve](compoundcurve/#constructor_1)(ICompoundCurve) | Yeni bir örneğini başlatır.`CompoundCurve` sınıf. |
| [CompoundCurve](compoundcurve/#constructor_2)(IEnumerable&lt;ICurve&gt;) | Yeni bir örneğini başlatır.`CompoundCurve` sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Bunun için koordinat boyutlarının sayısını alır[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/compoundcurve/count/) { get; } | Eğri sayısını alır[`ICompoundCurve`](../icompoundcurve/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Bunun topolojik boyutunu alır[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/compoundcurve/endpoint/) { get; } | Eğrinin bitiş noktasının bir kopyasını döndürür. |
| override [GeometryType](../../aspose.gis.geometries/compoundcurve/geometrytype/) { get; } | Geometrinin türünü alır. |
| override [HasCurveGeometry](../../aspose.gis.geometries/compoundcurve/hascurvegeometry/) { get; } | Bu geometrinin eğri (doğrusal olmayan) geometri olup olmadığını veya içerip içermediğini gösteren bir değer alır. |
| [HasM](../../aspose.gis.geometries/compoundcurve/hasm/) { get; set; } | Bu örneğin M koordinatına sahip olup olmadığını gösteren bir değer alır. |
| [HasZ](../../aspose.gis.geometries/compoundcurve/hasz/) { get; set; } | Bu örneğin Z koordinatına sahip olup olmadığını gösteren bir değer alır. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Bir eğrinin kapalı olup olmadığını gösteren bir değer alır. Bir eğri, başlangıç noktası bitiş noktasına eşitse kapalıdır. |
| override [IsEmpty](../../aspose.gis.geometries/compoundcurve/isempty/) { get; } | Bu örneğin boş olup olmadığını gösteren bir değer alır. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Bu örneğin SFA açısından basit olup olmadığını gösteren bir değer alır. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Bu örneğin geçerli olup olmadığını gösteren bir değer alır. |
| [Item](../../aspose.gis.geometries/compoundcurve/item/) { get; } | Şunu alır:[`ICurve`](../icurve/) belirtilen dizinde. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/compoundcurve/spatialreferencesystem/) { get; set; } | Bu örneğin SpatialReferenceSystem'ını alır. Bu özellik şu şekilde olabilir:`null` , SpatialReferenceSystem ayarlanmamışsa. Yeni SpatialReferenceSystem atandığında herhangi bir koordinat dönüşümü gerçekleştirilmez, sadece referans değişir. |
| override [StartPoint](../../aspose.gis.geometries/compoundcurve/startpoint/) { get; } | Eğrinin başlangıç noktasının bir kopyasını döndürür. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddCurve](../../aspose.gis.geometries/compoundcurve/addcurve/)(ICurve) | Bunun sonuna bir eğri ekler`CompoundCurve` . |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Bu geometriyi İyi Bilinen İkili gösterimine çevirir. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Bu geometriyi bir görüntü sunumuna aktarın. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Bu geometriyi İyi Bilinen Metin temsiline çevirir. |
| override [Clone](../../aspose.gis.geometries/compoundcurve/clone/)() | Bu örneği klonlar. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Bu geometrinin belirli bir geometri tarafından kapsanıp kapsanmadığını belirler. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Belirtilen geometriyi bu geometriden çıkarır. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Bu geometrinin belirli bir geometriden ayrık olup olmadığını belirler. |
| [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals)(ICompoundCurve) | Geçerli nesnenin aynı türden başka bir nesneye eşit olup olmadığını gösterir. |
| override [Equals](../../aspose.gis.geometries/compoundcurve/equals/#equals_1)(object) | Belirtilen nesnenin geçerli nesneye eşit olup olmadığını belirler. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Bu geometrinin alanını hesaplar. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Bu geometri etrafında bir tampon bölge hesaplar. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Bu geometrinin ağırlık merkezini hesaplar. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Bu geometrinin dışbükey gövdesini hesaplar. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar. |
| [GetEnumerator](../../aspose.gis.geometries/compoundcurve/getenumerator/)() | Koleksiyon boyunca yinelenen bir Numaralandırıcı döndürür. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Bu geometrinin sınırlayıcı kapsamını hesaplar ve döndürür. |
| override [GetHashCode](../../aspose.gis.geometries/compoundcurve/gethashcode/)() | Varsayılan karma işlevi olarak işlev görür. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Bu geometrinin uzunluğunu hesaplar. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında bir kesişim oluşturur. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Bu geometrinin belirtilen bir geometri ile örtüşüp örtüşmediğini belirler. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Bu geometrinin ve belirli bir geometrinin DE-9IM kesişim matrisinin sağlanan desenle eşleşip eşleşmediğini belirler. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Bu geometrinin çizgileri olarak temsil edilen çokgenleri alır. |
| override [Reverse](../../aspose.gis.geometries/compoundcurve/reverse/)() | Bunu tersine çevirir`CompoundCurve` . Yani - eğrilerin sırasının tersi ve bu bileşik eğri içindeki her eğri. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X ve Y koordinatlarını belirtilen sayıda kesirli basamağa yuvarlar. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z koordinatını belirtilen sayıda kesirli basamağa yuvarlar. |
| override [SetEmpty](../../aspose.gis.geometries/compoundcurve/setempty/)() | Bunu yapar[`Geometry`](../geometry/) boş. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Bu geometrinin uzamsal olarak belirtilen bir geometriye eşit olup olmadığını belirler. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Bu geometri ile belirtilen bir geometri arasında simetrik bir fark oluşturur. |
| [ToEditable](../../aspose.gis.geometries/compoundcurve/toeditable/#toeditable)() | Bu geometrinin düzenlenebilir bir kopyasını alır. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Bu geometrinin düzenlenebilir bir kopyasını alır. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Varsayılanı kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan sürümünü alır`hata payı` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Belirtilen geometriyi kullanarak bu geometrinin yaklaşık veya eşdeğer eğri olmayan versiyonunu alır.`hata payı` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Bu geometri ile belirli bir geometrinin birbirine değip değmediğini belirler. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Bu geometriyi ve belirtilen bir geometriyi birleştirir. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Bu geometrinin belirli bir kapsam içinde olup olmadığını belirler. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Bu geometrinin belirli bir geometri içinde olup olmadığını belirler. |
| [operator ==](../../aspose.gis.geometries/compoundcurve/op_equality/) | ==. operatörünü uygular |
| [operator !=](../../aspose.gis.geometries/compoundcurve/op_inequality/) | !=. operatörünü uygular |

### Notlar

Bileşik eğri başka bileşik eğriler içeremez.

### Ayrıca bakınız

* class [Curve](../curve/)
* interface [ICompoundCurve](../icompoundcurve/)
* ad alanı [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* toplantı [Aspose.GIS](../../)


