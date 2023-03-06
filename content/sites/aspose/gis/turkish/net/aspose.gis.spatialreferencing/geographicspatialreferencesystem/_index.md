---
title: Class GeographicSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.GeographicSpatialReferenceSystem sınıf. Bir Coğrafi SRS boylam ve enleme dayalı bir SRSdir. Bir Coğrafi SRS iki boyutlu veya üç boyutlu olabilir. Coğrafi SRS üç boyutluysa o zaman aslında iki boyutlu SRS ve dikey SRSnin bileşik bir SRSsidir.
type: docs
weight: 2130
url: /tr/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Bir Coğrafi SRS, boylam ve enleme dayalı bir SRS'dir. Bir Coğrafi SRS, iki boyutlu veya üç boyutlu olabilir. Coğrafi SRS üç boyutluysa, o zaman aslında iki boyutlu SRS ve dikey SRS'nin bileşik bir SRS'sidir.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit/) { get; } | Bu SRS'de açısal boyutlar için kullanılan birim. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic/) { get; } | Bunu döndürür. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder/) { get; } | Bu SRS'deki eksen sırası. Bu SRS geçerli değilse ve yanlış eksen yönlerine sahipse,Invalid döndürülür. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount/) { get; } | Bu SRS'deki boyut sayısını verir. Coğrafi SRS için bu: iki - bu tek coğrafi SRS ise. üç - bu, üçüncü boyut ekleyen tek, iki boyutlu, coğrafi SRS ve dikey SRS'den oluşan bileşik SRS ise. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Bu SRS'nin coğrafi verisini verir. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum/) { get; } | İade`true` , çünkü coğrafi SRS her zaman başlangıç meridyenine sahiptir. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian/) { get; } | İade`true` , çünkü coğrafi SRS her zaman başlangıç meridyenine sahiptir. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonları geçerli kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Geographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Projected . SRS'lerin kombinasyonu farklıysa, bileşik SRS'nin türü şu olacaktır:Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | ile aynı[`Validate`](../spatialreferencesystem/validate/) , ancak hata mesajı döndürmeyin. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Bu SRS'nin ana meridyenini verir. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type/) { get; } | İadeGeographic . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 belirtimi ile eşleşir. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Al[`Axis`](../axis/) bu, boyutu tanımlar. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Al[`Unit`](../unit/)boyut. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'ye eşdeğer olup olmadığını tespit eder. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


