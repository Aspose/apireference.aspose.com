---
title: GeographicSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Coğrafi SRS boylam ve enlemi temel alan bir SRSdir. Bir Coğrafi SRS iki boyutlu veya üç boyutlu olabilir. Coğrafi SRS üç boyutluysa aslında iki boyutlu SRS ve dikey SRSnin bir bileşik SRSsidir.
type: docs
weight: 2030
url: /tr/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Coğrafi SRS, boylam ve enlemi temel alan bir SRS'dir. Bir Coğrafi SRS, iki boyutlu veya üç boyutlu olabilir. Coğrafi SRS üç boyutluysa, aslında iki boyutlu SRS ve dikey SRS'nin bir bileşik SRS'sidir.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit) { get; } | Bu SRS'de açısal boyutlar için kullanılan birim. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Dönüştürülen bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic) { get; } | Bunu döndürür. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Dönüştürülen bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Dönüştürülen bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Dönüştürülen bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder) { get; } | Bu SRS'deki eksenlerin sırası. Bu SRS geçerli değilse ve yanlış eksen yönlerine sahipse,Invalid döndürülür. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount) { get; } | Bu SRS'deki boyut sayısını döndürür. Coğrafi SRS için bu şu olabilir: iki - bu tek coğrafi SRS ise. üç - bu, üçüncü boyutu ekleyen tek, iki boyutlu, coğrafi SRS ve dikey SRS'den oluşan bileşik SRS ise. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Bu nesne tanımlayıcısı EPSG tanımlayıcısıysa - kodunu döndürün. Aksi takdirde - -1. döndürün |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Bu SRS'nin coğrafi verisini döndürür. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum) { get; } | İade`true` , çünkü coğrafi SRS'nin her zaman asal meridyeni vardır. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian) { get; } | İade`true` , çünkü coğrafi SRS'nin her zaman asal meridyeni vardır. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonlarının geçerli olduğu kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türüGeographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS tipiProjected . SRS'lerin kombinasyonu farklıysa, bileşik SRS türüUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Şununla aynı[`Validate`](../spatialreferencesystem/validate) , ancak hata mesajı döndürmeyin. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Bu nesnenin adı. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Bu SRS'nin ana meridyenini döndürür. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type) { get; } | İadeGeographic . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 spesifikasyonuyla eşleşir. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Al[`Axis`](../axis) bu boyutu açıklar. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Al[`Unit`](../unit)boyut. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'lere eşdeğer olup olmadığını algılar. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
