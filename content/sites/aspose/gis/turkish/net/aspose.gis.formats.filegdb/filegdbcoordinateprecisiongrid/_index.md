---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid sınıf. Bir FileGDB katmanı içinde bir koordinat kesinlik ızgarası.
type: docs
weight: 250
url: /tr/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Bir FileGDB katmanı içinde bir koordinat kesinlik ızgarası.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | M koordinatının orijinini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | M koordinatının ölçeğini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | X koordinatının orijinini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | X ve Y koordinatlarının ölçeğini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Y koordinatının orijinini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Z koordinatının orijinini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Z koordinatının ölçeğini alır veya ayarlar. olarak ayarlanırsa`null` varsayılan kullanılır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Yeni oluşturur`FileGdbCoordinatePrecisionGrid` öyle ki bir dikdörtgen içindeki tüm değerler temsil edilebilir. |

### Notlar

Koordinat kesinlik ızgarası, FileGDB katmanındaki koordinatların geçerli etki alanını ve çözünürlüğünü tanımlar. Kaynak, uzayda koordinat kesinlik ızgarasının yolunu tanımlar. Ölçek, çözünürlüğü tanımlar (ölçek ne kadar büyükse, değerler o kadar kesin yazılır). Kesinlik ızgarası, koordinatlar için geçerli değer aralığını belirtir: Her koordinat[`VectorLayer`](../../aspose.gis/vectorlayer/)bu aralık içinde olmalıdır. Aralık dışında kalan koordinatlar daha sonra okuma hatalarına neden olabilir ve ArcGIS tarafından yanlış işlenir. Herhangi bir özellik belirtmezseniz (bunları saklayın)`null` ) varsayılan değerler kullanılacaktır. Varsayılan değerler şunlara bağlıdır:[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) arasında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Coğrafi için[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) varsayılanlar: Öngörülen için[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) varsayılanlar: nerede`XY Toleransı` ,`ZTolerans` Ve`MTolerans` gelen değerler[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### Ayrıca bakınız

* ad alanı [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* toplantı [Aspose.GIS](../../)


