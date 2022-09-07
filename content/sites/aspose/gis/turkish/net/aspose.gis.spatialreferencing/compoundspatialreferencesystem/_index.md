---
title: CompoundSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Bileşik SRS hiçbiri bileşik olamayan iki temel SRSyi birleştirir.
type: docs
weight: 1960
url: /tr/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Bileşik SRS, hiçbiri bileşik olamayan iki temel SRS'yi birleştirir.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound) { get; } | Bunu döndür. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic) { get; } | Bu SRS'nin coğrafi temsilini döndür. Bu bileşik SRS gerçekten de bir coğrafi SRS'yi temsil ediyorsa, sonuç üç boyutlu coğrafi SRS olacaktır (boylam, enlem, yükseklik boyutlarıyla). Aksi takdirde bir istisna atılacaktır. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Dönüştürülen bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected) { get; } | Bu SRS'nin tahmini temsilini döndürür. Bu bileşik SRS gerçekten de bir öngörülen SRS'yi temsil ediyorsa, sonuç üç boyutlu yansıtılmış SRS olacaktır (X, Y, yükseklik boyutları ile). Aksi takdirde bir istisna atılacaktır. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Dönüştürülen bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount) { get; } | Boyut sayısı. Bileşik SRS için bu, temel alınan SRS'nin boyut sayısının toplamıdır. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Bu nesne tanımlayıcısı EPSG tanımlayıcısıysa - kodunu döndürün. Aksi takdirde - -1. döndürün |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum) { get; } | Bu SRS'nin coğrafi verisini döndür. Her ikisi birden ise[`Head`](./head) ve[`Tail`](./tail) coğrafi veriye sahip - head. coğrafi verisini döndürür |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum) { get; } | Temel SRS'lerden herhangi birinin coğrafi verisi varsa, Bileşik SRS'nin coğrafi verisi vardır. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian) { get; } | Temeldeki SRS'lerden herhangi birinin başlangıç meridyeni varsa, Bileşik SRS'nin başlangıç meridyeni vardır. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head) { get; } | İlk temel SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound) { get; } | İade`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Şununla aynı[`Validate`](../spatialreferencesystem/validate) , ancak hata mesajı döndürmeyin. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Bu nesnenin adı. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian) { get; } | Bu SRS'nin ana meridyenini döndürün. Her ikisi de ise[`Head`](./head) ve[`Tail`](./tail) başlangıç meridyeni var - başın başlangıç meridyenini döndürür. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail) { get; } | İkinci temel SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type) { get; } | Bu Bileşik SRS'nin türü. OlabilirGeographicif bu Bileşik SRS, coğrafi ve dikey SRS'nin birleşimiyse veyaProjected if bu Bileşik SRS, öngörülen ve dikey SRS'nin birleşimidir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 spesifikasyonuyla eşleşir. |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis)(int) | Al[`Axis`](../axis) bu boyutu açıklar. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit)(int) | Al[`Unit`](../unit)boyut. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'lere eşdeğer olup olmadığını algılar. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. Görmek[`Validate`](../spatialreferencesystem/validate) geçerlilik açıklaması için. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
