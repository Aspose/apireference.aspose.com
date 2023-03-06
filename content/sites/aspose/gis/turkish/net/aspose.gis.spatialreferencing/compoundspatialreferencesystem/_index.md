---
title: Class CompoundSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem sınıf. Bileşik SRS hiçbiri bileşik olamayacak olan iki temel SRSyi birleştirir.
type: docs
weight: 2060
url: /tr/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Bileşik SRS, hiçbiri bileşik olamayacak olan iki temel SRS'yi birleştirir.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Bunu iade et. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Bu SRS'nin coğrafi temsilini döndürür. Bu bileşik SRS gerçekten de bir coğrafi SRS'yi temsil ediyorsa, sonuç üç boyutlu coğrafi SRS olacaktır (boylam, enlem, yükseklik boyutları ile). Aksi takdirde bir istisna atılacaktır. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Bu SRS'nin tahmini gösterimini döndürür. Bu bileşik SRS gerçekten de yansıtılmış bir SRS'yi temsil ediyorsa, sonuç üç boyutlu yansıtılmış SRS olacaktır (X, Y, yükseklik boyutları ile). Aksi takdirde bir istisna atılacaktır. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Dönüştürülmüş bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Kullanım[`Type`](../spatialreferencesystem/type/) dönüşümün mümkün olup olmadığını öğrenmek için. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Boyut sayısı. Bileşik SRS için bu, altta yatan SRS. boyutlarının toplamıdır. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Bu SRS'nin coğrafi verisini döndürür. Her ikisi de[`Head`](./head/) Ve[`Tail`](./tail/) coğrafi veriye sahip - başın coğrafi verisini döndür. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | Altta yatan herhangi bir SRS'nin coğrafi verisi varsa Bileşik SRS'nin coğrafi verisi vardır. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | Altta yatan herhangi bir SRS'nin başlangıç meridyeni varsa Bileşik SRS'nin başlangıç meridyeni vardır. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | İlk temel SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | İade`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | ile aynı[`Validate`](../spatialreferencesystem/validate/) , ancak hata mesajı döndürmeyin. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Bu SRS'nin başlangıç meridyenini döndürür. Her ikisi de[`Head`](./head/) Ve[`Tail`](./tail/) başlangıç meridyeni var - başın başlangıç meridyenini döndürür. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Alttaki ikinci SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Bu Bileşik SRS'nin türü. OlabilirGeographicif bu Bileşik SRS, coğrafi ve dikey SRS'nin birleşimidir veyaProjected if bu Bileşik SRS, öngörülen ve dikey SRS'nin birleşimidir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 belirtimi ile eşleşir. |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Al[`Axis`](../axis/) bu, boyutu tanımlar. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Al[`Unit`](../unit/)boyut. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'ye eşdeğer olup olmadığını tespit eder. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. Görmek[`Validate`](../spatialreferencesystem/validate/) geçerlilik açıklaması için. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


