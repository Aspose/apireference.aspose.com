---
title: Class GpxOptions
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.Gpx.GpxOptions sınıf. GPX biçimi için sürücüye özgü seçenekler.
type: docs
weight: 370
url: /tr/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

GPX biçimi için sürücüye özgü seçenekler.

```csharp
public class GpxOptions : DriverOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GpxOptions](gpxoptions/)() | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Kapatılmayanların kapatılıp kapatılmadığını belirlerLinearRing her geometride varsayılanlar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Her bir geometri parçasının ortasına yeni bir nokta eklenip eklenmeyeceğini belirler. varsayılanlar`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Her bir geometrideki yakın noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | için mesafeyi belirler[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . varsayılanlar`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eğri geometrilerini doğrusallaştırmak için kullanılacak bir tolerans. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | Ara noktaların, rota noktalarının ve izleme noktalarının 'M' koordinatı olarak hangi GPX özniteliğinin dışa aktarılacağını belirler. Davranış, ile aynıdır[`ZAttribute`](./zattribute/) , varsayılanlar`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde M koordinatına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | İç içe öznitelik adını ve dizinlerini ayırmak için bir dize. Varsayılan olarak "__". 'nin altını çift çizin |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | 'trkpt' ve 'rtept' gibi GPX noktalarının iç nitelikler içerip içermediğini ve okunması gerekip gerekmediğini belirler. varsayılanlar`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Her geometride aynı parça üzerinde bulunan noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | için mesafeyi belirler[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . varsayılanlar`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Katmana eklendiklerinde geometrilerin doğrulanması gerekip gerekmediğini belirler. Eğer ayarlanırsa`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) katmana eklendiğinde ve doğrulama başarısız olursa ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dır-dir`false` ),[`GisException`](../../aspose.gis/gisexception/) atılır. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Çokgen veya çoklu çokgenin çizgi dizisine dönüştürülmesine izin verilip verilmediğini belirler. varsayılanlar`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde X ve Y koordinatlarına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | Ara noktaların, rota noktalarının ve izleme noktalarının 'Z' koordinatı olarak hangi GPX özniteliğinin dışa aktarılacağını belirler. Eğer`null` hiçbir öznitelik 'Z' koordinatı olarak dışa aktarılmayacaktır. Varsayılanlar "ele"dir. Olası değerler, çift olarak temsil edilebilecek tüm GPX XML özniteliklerinin adlarıdır (örn. "hız", "magvar", "geoidheight" vb. ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde Z koordinatına uygulanacaktır.[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ayrıca bakınız

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ad alanı [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* toplantı [Aspose.GIS](../../)


