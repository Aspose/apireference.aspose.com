---
title: SpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Uzamsal referans sistemi koordinatları Dünya üzerindeki yerlere eşler. Farklı SRS türleri vardır bkz.Type./spatialreferencesystem/type . Dahası eğer SRS tipi iseGeographic or Projected SRS bileşik veya tek olabilir bkz.IsCompound./spatialreferencesystem/iscompound .
type: docs
weight: 2150
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Uzamsal referans sistemi, koordinatları Dünya üzerindeki yerlere eşler. Farklı SRS türleri vardır, bkz.[`Type`](./type) . Dahası, eğer SRS tipi iseGeographic or Projected SRS bileşik veya tek olabilir, bkz.[`IsCompound`](./iscompound) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Dönüştürülen bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Kullanım[`IsCompound`](./iscompound) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Kullanım[`Type`](./type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Kullanım[`Type`](./type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Dönüştürülen bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Kullanım[`Type`](./type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Dönüştürülen bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Kullanım[`Type`](./type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Dönüştürülen bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Kullanım[`Type`](./type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount) { get; } | Bu SRS'deki boyutların sayısını verir. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Bu nesne tanımlayıcısı EPSG tanımlayıcısıysa - kodunu döndürün. Aksi takdirde - -1. döndürün |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Bu SRS'nin coğrafi verisini döndürür. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum) { get; } | Bu SRS'nin coğrafi veriye sahip olup olmadığını belirler. Bu, her coğrafi, tahmini ve yer merkezli SRS için geçerlidir. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian) { get; } | Bu SRS'nin başlangıç meridyeni olup olmadığını döndürür. Bu, her coğrafi, tahmini ve yer merkezli SRS için geçerlidir. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonlarının geçerli olduğu kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türüGeographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS tipiProjected . SRS'lerin kombinasyonu farklıysa, bileşik SRS türüUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Şununla aynı[`Validate`](./validate) , ancak hata mesajı döndürmeyin. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Bu nesnenin adı. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Bu SRS'nin ana meridyenini döndürür. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type) { get; } | Bu SRS'nin türünü alır, bkz.[`SpatialReferenceSystemType`](../spatialreferencesystemtype) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89) { get; } | ETRS 89 (EPSG:4258) uzamsal referans sistemi. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea) { get; } | ETRS 89 / ETRS Lambert Azimutal Eşit Alan (EPSG:3035) uzamsal referans sistemi. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) uzamsal referans sistemi. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83) { get; } | NAD 83 (EPSG:4269) uzamsal referans sistemi. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36) { get; } | OSGB 36 (EPSG:4277) uzamsal referans sistemi. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid) { get; } | OSGB 36 / British National Grid (EPSG:27700) uzamsal referans sistemi. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator) { get; } | Web Mercator (EPSG:3857) uzamsal referans sistemi. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72) { get; } | WGS 72 (EPSG:4322) uzamsal referans sistemi. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84) { get; } | WGS 84 (EPSG:4326) uzamsal referans sistemi. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg)(int) | Belirtilen EPSG kodunu temel alan bir uzamsal referans sistemi oluşturun. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt)(string) | Yeni bir`Mekansal Referans Sistemi` WKT (İyi Bilinen Metin) dizesine dayalıdır. |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 spesifikasyonuyla eşleşir. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Al[`Axis`](../axis) bu boyutu açıklar. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Al[`Unit`](../unit)boyut. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'lere eşdeğer olup olmadığını algılar. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Bileşik SRS oluşturun. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | Özel parametrelerden yer merkezli SRS oluşturun. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | Özel parametrelerden coğrafi SRS oluşturun. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Yerel SRS oluşturun. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | Özel parametrelerden tahmini SRS oluşturun. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | Dikey SRS oluşturun. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | İki SRS'nin eşdeğer olup olmadığını belirler. Eşdeğer SRS'nin aynı koordinatları Dünya'daki aynı yerle eşleşir. Eşdeğer SRS'nin bazı parametreleri farklı olabilir, örneğin[`Name`](../identifiableobject/name) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg)(int, out SpatialReferenceSystem) | Belirtilen EPSG kodunu temel alan bir uzamsal referans sistemi oluşturun. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt)(string, out SpatialReferenceSystem) | Yeni bir`Mekansal Referans Sistemi` WKT (İyi Bilinen Metin) dizesine dayalıdır. |

### Ayrıca bakınız

* class [IdentifiableObject](../identifiableobject)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
