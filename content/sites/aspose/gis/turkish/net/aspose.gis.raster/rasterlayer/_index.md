---
title: Class RasterLayer
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Raster.RasterLayer sınıf. Bir tarama katmanını temsil eder.
type: docs
weight: 1390
url: /tr/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Bir tarama katmanını temsil eder.

```csharp
public abstract class RasterLayer : IDisposable
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Tarama katmanındaki bant sayısını alır. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Raster sınırlarını alır. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Taramanın hücre veya piksel boyutunu alır. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Şunu alır:[`Driver`](./driver/) bu katmanı başlatan. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Rasterin yüksekliğini piksel olarak alır. Satır sayısı olarak da bilinir. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Rasterin arka planını veya "veri yok"unu temsil eden değerleri alır. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Bir uzamsal raster referans sistemi alır. Olabilir`null` bilinmiyorsa. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Taramalı sol üst köşenin x koordinatını alır. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Rasterin sol üst köşesinin y koordinatını alır. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Raster genişliğini piksel cinsinden alır. Sütun sayısı olarak da bilinir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Bir bant maskesi kullanarak tarama katmanını kırpar). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Bir şekil formu (ve bant maskesi) kullanarak tarama katmanını kırpar. |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | tarafından kullanılan kaynakları serbest bırakır.`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Belirtilen dizine göre bir bant alır. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Bu katmanın uzamsal kapsamını hesaplar. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Belirtilen sütunu ve satırı uzamsal koordinata dönüştürür. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Sayı, toplam, ortalama, min, maks. 'den oluşan özet istatistikleri hesaplayın |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Belirtilen hücredeki değerleri okur. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Belirtilen bloktaki değerleri 1 boyutlu bir dizi olarak okur. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Bir ifadedeki bant değerlerini okur ve işler. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Raster katmanını başka bir katmana çözer. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis.Raster](../../aspose.gis.raster/)
* toplantı [Aspose.GIS](../../)


