---
title: Class GeoJsonOptions
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions sınıf. GeoJSON biçimi için sürücüye özgü seçenekler.
type: docs
weight: 310
url: /tr/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

GeoJSON biçimi için sürücüye özgü seçenekler.

```csharp
public class GeoJsonOptions : DriverOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Dizilerin, tam sayıların veya gerçeklerin JSon dizilerinin dize olarak gösterilip gösterilmeyeceği. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | özniteliklerin çevirisini kontrol eder: evet - tüm öznitelikleri atla |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Kimlikleri otomatik oluştur |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Kapatılmayanların kapatılıp kapatılmadığını belirlerLinearRing her geometride varsayılanlar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Her bir geometri parçasının ortasına yeni bir nokta eklenip eklenmeyeceğini belirler. varsayılanlar`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | JSon tarih/saat/tarih-saatinin string. olarak gösterilip gösterilmeyeceği |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Her bir geometrideki yakın noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | için mesafeyi belirler[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . varsayılanlar`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Özellik koleksiyonu düzeyinde açıklama (katman oluşturma için) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | geometrilerin çevirisini kontrol et: evet - geometrileri GeometryCollection type ile sarın |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eğri geometrilerini doğrusallaştırmak için kullanılacak bir tolerans. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde M koordinatına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Özellik koleksiyonu seviyesindeki ad (katman oluşturma için) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | İç içe özniteliklerin bileşenlerini ayırmak için kullanılan bir dizeyi alır veya ayarlar. Varsayılan değer "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Sınırlayıcı Kutuların ('bbox') 'bbox_0', 'bbox_1', vb. adlı nitelikler olarak okunup okunmayacağını belirler. Varsayılan değer:`false` . [`NestedPropertiesSeparator`](./nestedpropertiesseparator/) dize bbox_0, bbox_1,.. içinde kullanılır. name. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Her geometride aynı parça üzerinde bulunan noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | için mesafeyi belirler[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . varsayılanlar`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Katmana eklendiklerinde geometrilerin doğrulanması gerekip gerekmediğini belirler. Eğer ayarlanırsa`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) katmana eklendiğinde ve doğrulama başarısız olursa ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dır-dir`false` ),[`GisException`](../../aspose.gis/gisexception/) atılır. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | GeoJSON nesnelerinin, Geometrileri için koordinat aralığı bilgilerine dahil edilip edilmeyeceğini belirler. Şuna ayarlanırsa`true` , katmana eklendiğinde her geometri için (null değil) bir üye "bbox" oluşturulur. Varsayılan değer:`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Çokgen veya çoklu çokgenin çizgi dizisine dönüştürülmesine izin verilip verilmediğini belirler. varsayılanlar`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | 'null' value ekleyerek ayarlanmayan özniteliklerin yazıp yazılmayacağı |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde X ve Y koordinatlarına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde Z koordinatına uygulanacaktır.[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ayrıca bakınız

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ad alanı [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* toplantı [Aspose.GIS](../../)


