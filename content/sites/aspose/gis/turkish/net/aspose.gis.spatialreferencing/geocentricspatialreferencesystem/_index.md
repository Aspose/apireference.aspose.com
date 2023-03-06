---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem sınıf. Geocentric SRS dünyanın merkezinden başlayan 3 boyutlu kartezyen SRSdir.
type: docs
weight: 2090
url: /tr/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Geocentric SRS, dünyanın merkezinden başlayan 3 boyutlu kartezyen SRS'dir.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | Bunu iade et. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | Bu SRS'deki eksen sırası. Bu SRS geçerli değilse ve yanlış eksen yönlerine sahipse,Invalid döndürülür. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | Yer merkezli SRS her zaman üç boyutlu olduğundan 3'ü döndür. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | Bu SRS. 'nin coğrafi verisini döndür |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | Dönüş`true` , yer merkezli SRS'nin her zaman coğrafi referans noktası olduğundan. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | Dönüş`true` , çünkü jeosantrik SRS her zaman başlangıç meridyenine sahiptir. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonları geçerli kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Geographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Projected . SRS'lerin kombinasyonu farklıysa, bileşik SRS'nin türü şu olacaktır:Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | ile aynı[`Validate`](../spatialreferencesystem/validate/) , ancak hata mesajı döndürmeyin. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | Bu SRS'de kullanılan birim. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | Bu SRS'nin ana meridyenini döndür. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | DönüşGeocentric . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 belirtimi ile eşleşir. |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | Al[`Axis`](../axis/) bu, boyutu tanımlar. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | Al[`Unit`](../unit/)boyut. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'ye eşdeğer olup olmadığını tespit eder. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. Görmek[`Validate`](../spatialreferencesystem/validate/) geçerlilik açıklaması için. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


