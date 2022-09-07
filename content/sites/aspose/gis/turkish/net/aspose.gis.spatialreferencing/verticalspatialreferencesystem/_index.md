---
title: VerticalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Dikey SRS yükseklik koordinatlarını tanımlayan tek boyutlu bir SRSdir.
type: docs
weight: 2210
url: /tr/net/aspose.gis.spatialreferencing/verticalspatialreferencesystem/
---
## VerticalSpatialReferenceSystem class

Dikey SRS, yükseklik koordinatlarını tanımlayan tek boyutlu bir SRS'dir.

```csharp
public class VerticalSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Dönüştürülen bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Dönüştürülen bu SRS'yi döndürür[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Dönüştürülen bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| override [AsVertical](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/asvertical) { get; } | Bu SRS'yi döndürür. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/dimensionscount) { get; } | Dikey SRS her zaman tek boyutlu olduğundan 1 döndürür. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Bu nesne tanımlayıcısı EPSG tanımlayıcısıysa - kodunu döndürün. Aksi takdirde - -1. döndürün |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/geographicdatum) { get; } | FırlatmaInvalidOperationException , Dikey SRS coğrafi veriye sahip olmadığından. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasgeographicdatum) { get; } | İade`false` , Dikey SRS coğrafi veriye sahip olmadığından. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/hasprimemeridian) { get; } | İade`false` , çünkü Dikey SRS'nin başlangıç meridyeni yoktur. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonlarının geçerli olduğu kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türüGeographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS tipiProjected . SRS'lerin kombinasyonu farklıysa, bileşik SRS türüUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Şununla aynı[`Validate`](../spatialreferencesystem/validate) , ancak hata mesajı döndürmeyin. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Bu nesnenin adı. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/primemeridian) { get; } | FırlatmaInvalidOperationException , çünkü Dikey SRS'nin başlangıç meridyeni yoktur. |
| override [Type](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/type) { get; } | DönüşVertical . |
| [VerticalDatum](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticaldatum) { get; } | Bu SRS'de kullanılan veri. |
| [VerticalUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/verticalunit) { get; } | Bu SRS'de kullanılan birim. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 spesifikasyonuyla eşleşir. |
| override [GetAxis](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getaxis)(int) | Al[`Axis`](../axis) bu boyutu açıklar. |
| override [GetUnit](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/getunit)(int) | Al[`Unit`](../unit)boyut. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'lere eşdeğer olup olmadığını algılar. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| override [Validate](../../aspose.gis.spatialreferencing/verticalspatialreferencesystem/validate)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. Görmek[`Validate`](../spatialreferencesystem/validate) geçerlilik açıklaması için. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
