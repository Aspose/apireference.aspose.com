---
title: Class GdalOptions
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.GDAL.GdalOptions sınıf. GDAL biçimi için sürücüye özgü seçenekler.
type: docs
weight: 290
url: /tr/net/aspose.gis.formats.gdal/gdaloptions/
---
## GdalOptions class

GDAL biçimi için sürücüye özgü seçenekler.

```csharp
public class GdalOptions : DriverOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GdalOptions](gdaloptions/)(string) | Yeni bir örnek oluşturun. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Kapatılmayanların kapatılıp kapatılmadığını belirlerLinearRing her geometride varsayılanlar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Her bir geometri parçasının ortasına yeni bir nokta eklenip eklenmeyeceğini belirler. varsayılanlar`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Her bir geometrideki yakın noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | için mesafeyi belirler[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . varsayılanlar`0` . |
| [FileName](../../aspose.gis.formats.gdal/gdaloptions/filename/) { get; set; } | Başlatılacak uygulamanın adı |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eğri geometrilerini doğrusallaştırmak için kullanılacak bir tolerans. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde M koordinatına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [PathToTempFile](../../aspose.gis.formats.gdal/gdaloptions/pathtotempfile/) { get; } | Geçici dosyaların yolu. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Her geometride aynı parça üzerinde bulunan noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | için mesafeyi belirler[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . varsayılanlar`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Katmana eklendiklerinde geometrilerin doğrulanması gerekip gerekmediğini belirler. Eğer ayarlanırsa`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) katmana eklendiğinde ve doğrulama başarısız olursa ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dır-dir`false` ),[`GisException`](../../aspose.gis/gisexception/) atılır. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Çokgen veya çoklu çokgenin çizgi dizisine dönüştürülmesine izin verilip verilmediğini belirler. varsayılanlar`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde X ve Y koordinatlarına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde Z koordinatına uygulanacaktır.[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ayrıca bakınız

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ad alanı [Aspose.Gis.Formats.GDAL](../../aspose.gis.formats.gdal/)
* toplantı [Aspose.GIS](../../)


