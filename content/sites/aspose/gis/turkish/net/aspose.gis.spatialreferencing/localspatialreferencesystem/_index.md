---
title: LocalSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Referansı
description: Bazı nesnelerle ilgili yerel SRS ile ilgili koordinatlar toprakla değil.
type: docs
weight: 2080
url: /tr/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Bazı nesnelerle ilgili yerel SRS ile ilgili koordinatlar, toprakla değil.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Dönüştürülen bu SRS'yi döndürür[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . Kullanım[`IsCompound`](../spatialreferencesystem/iscompound) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Dönüştürülen bu SRS'yi döndürür[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal) { get; } | Bunu döndür. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Dönüştürülen bu SRS'yi döndürür[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Dönüştürülen bu SRS'yi döndürür[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . Kullanım[`Type`](../spatialreferencesystem/type) dönüştürmenin mümkün olup olmadığını öğrenmek için. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount) { get; } | Bu SRS'deki boyutların sayısı. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Bu nesne tanımlayıcısı EPSG tanımlayıcısıysa - kodunu döndürün. Aksi takdirde - -1. döndürün |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum) { get; } | FırlatmaInvalidOperationException Yerel SRS'nin coğrafi verisi olmadığından. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum) { get; } | İade`false` Yerel SRS'nin coğrafi verisi olmadığından. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian) { get; } | İade`false` , çünkü Yerel SRS'nin başlangıç meridyeni yoktur. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Bu SRS'nin bileşik (iki SRS'nin birleşimi) olup olmadığını döndürür. Bileşik SRS'de aşağıdaki SRS kombinasyonlarının geçerli olduğu kabul edilir: Coğrafi SRS + Dikey SRS, bu durumda bileşik SRS türüGeographic . Öngörülen SRS + Dikey SRS, bu durumda bileşik SRS tipiProjected . SRS'lerin kombinasyonu farklıysa, bileşik SRS türüUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Bu SRS'nin tek olup olmadığını döndürür (iki SRS'nin birleşimi değil). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Şununla aynı[`Validate`](../spatialreferencesystem/validate) , ancak hata mesajı döndürmeyin. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum) { get; } | Ölçüm yöntemini açıklayan veri. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Bu nesnenin adı. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian) { get; } | FırlatmaInvalidOperationException , çünkü Yerel SRS'nin başlangıç meridyeni yoktur. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type) { get; } | DönüşLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit) { get; } | Bu SRS'nin birimi. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Bu SRS'nin WKT dizesi olarak temsilini döndürür. Sonuç WKT dizesi, genellikle "WKT1" olarak adlandırılan OGC 01-009 spesifikasyonuyla eşleşir. |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis)(int) | Al[`Axis`](../axis) bu boyutu açıklar. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit)(int) | Al[`Unit`](./unit)boyut. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Bu SRS'nin diğer SRS'lere eşdeğer olup olmadığını algılar. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Bundan dönüşüm oluşturur`Mekansal Referans Sistemi` başka bir`Mekansal Referans Sistemi` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate)(out string) | Bu SRS'nin geçerli olup olmadığını belirleyin. Görmek[`Validate`](../spatialreferencesystem/validate) geçerlilik açıklaması için. |

### Ayrıca bakınız

* class [SpatialReferenceSystem](../spatialreferencesystem)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
