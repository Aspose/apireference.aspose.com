---
title: Class ProjectedSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem sınıf. Öngörülen SRS coğrafi SRSye yapılan bir projeksiyon uygulamasının sonucudur. Bir yansıtılan SRS iki boyutlu veya üç boyutlu olabilir. Yansıtılan SRS üç boyutluysa o zaman aslında iki boyutlu yansıtılan SRS ve bir boyutlu dikeyden oluşan bir bileşik SRSdir. SRS.
type: docs
weight: 2220
url: /tr/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

Öngörülen SRS, coğrafi SRS'ye yapılan bir projeksiyon uygulamasının sonucudur. Bir yansıtılan SRS iki boyutlu veya üç boyutlu olabilir. Yansıtılan SRS üç boyutluysa, o zaman aslında iki boyutlu yansıtılan SRS ve bir boyutlu dikeyden oluşan bir bileşik SRS'dir. SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | Bu SRS'deki açısal değerler için ve açısal parametreler için kullanılan birim[`Projection`](./projection/) . Açısal birimiyle eşleşir[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | Bunu iade et. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | Bu SRS'deki eksen sırası. Bu SRS geçerli değilse ve yanlış eksen yönlerine sahipse,Invalid döndürülür. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | Hangisine Coğrafi SRS[`Projection`](./projection/) bu SRS. 'yi almak için uygulandı |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | Bu SRS'deki boyut sayısını verir. Projeksiyonlu SRS için bu şöyle olabilir: iki - bu tek projeksiyonlu SRS ise. üç - bu, üçüncü boyut ekleyen tek, iki boyutlu, projeksiyonlu SRS ve dikey SRS'den oluşan bileşik SRS ise. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Bu SRS'nin coğrafi verisini verir. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | Tahmini SRS her zaman başlangıç meridyenine sahip olduğundan, doğru döndürür. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | Tahmini SRS her zaman başlangıç meridyenine sahip olduğundan, doğru döndürür. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonları geçerli kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Geographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS türü şu olacaktır:Projected . SRS'lerin kombinasyonu farklıysa, bileşik SRS'nin türü şu olacaktır:Unknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | ile aynı[`Validate`](../spatialreferencesystem/validate/) , ancak hata mesajı döndürmeyin. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | Bu SRS'deki doğrusal boyutlar ve aşağıdakilerin doğrusal parametreleri için kullanılan birim[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Bu SRS'nin ana meridyenini verir. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | Uygulanan Projeksiyon[`Base`](./base/) bu SRS. 'yi almak için |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | İadeProjected . |

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


