---
title: Class LocalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.LocalSpatialReferenceSystem sınıf. Yerel SRS ile ilgili bazı nesnelere koordinatlar dünyaya değil.
type: docs
weight: 2180
url: /tr/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Yerel SRS ile ilgili bazı nesnelere koordinatlar, dünyaya değil.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal/) { get; } | Bunu iade et. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount/) { get; } | Bu SRS'deki boyutların sayısı. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum/) { get; } | AtarInvalidOperationException çünkü Yerel SRS'nin coğrafi verisi yoktur. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum/) { get; } | İade`false` çünkü Yerel SRS'nin coğrafi verisi yoktur. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian/) { get; } | İade`false` , çünkü Yerel SRS başlangıç meridyenine sahip değildir. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonları geçerli kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Geographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Projected . SRS'lerin kombinasyonu farklıysa, bileşik SRS'nin türü şu olacaktır:Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | ile aynı[`Validate`](../spatialreferencesystem/validate/) , ancak hata mesajı döndürmeyin. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum/) { get; } | Ölçüm yöntemini açıklayan veri. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian/) { get; } | AtarInvalidOperationException , çünkü Yerel SRS başlangıç meridyenine sahip değildir. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type/) { get; } | DönüşLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit/) { get; } | Bu SRS'nin birimi. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 belirtimi ile eşleşir. |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis/)(int) | Al[`Axis`](../axis/) bu, boyutu tanımlar. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit/)(int) | Al[`Unit`](./unit/)boyut. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'ye eşdeğer olup olmadığını tespit eder. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate/)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. Görmek[`Validate`](../spatialreferencesystem/validate/) geçerlilik açıklaması için. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


