---
title: Class GmlOptions
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.Gml.GmlOptions sınıf. GML biçimi için sürücüye özgü seçenekler.
type: docs
weight: 350
url: /tr/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

GML biçimi için sürücüye özgü seçenekler.

```csharp
public class GmlOptions : DriverOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GmlOptions](gmloptions/)() | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Kapatılmayanların kapatılıp kapatılmadığını belirlerLinearRing her geometride varsayılanlar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Her bir geometri parçasının ortasına yeni bir nokta eklenip eklenmeyeceğini belirler. varsayılanlar`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Her bir geometrideki yakın noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | için mesafeyi belirler[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . varsayılanlar`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Eğri geometrilerini doğrusallaştırmak için kullanılacak bir tolerans. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Aspose.GIS'in Internet'ten XML şeması yüklemesine izin verilip verilmediğini belirler. Eğer olarak ayarlanırsa`false` 'file://' ile başlamayan mutlak URI'lere sahip şemalar yüklenmez. Varsayılan:`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde M koordinatına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | İç içe özniteliklerin bileşenlerini ayırmak için kullanılan bir dizeyi alır veya ayarlar. Varsayılan değer "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Aspose.GIS'in, bir XML şemasının eksik olduğu veya yüklenemediği bir Gml dosyasındaki nitelikleri ayrıştırmasına izin verilip verilmediğini belirler. Eğer ayarlanırsa`true` , Aspose.GIS okuyucu, bir XML Şemasının varlığını gerektirmez. Varsayılan değer:`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | URI çiftlerinin boşlukla ayrılmış listesi. Her çiftteki ilk URI, ad alanının bir URI'sidir, ikinci URI, ad alanının XML Yolu şemasıdır. Olarak ayarlanırsa`null` ,[`GmlDriver`](../gmldriver/) belgenin kök öğesinden schemaLocation okumayı deneyecek. Varsayılan:`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Her geometride aynı parça üzerinde bulunan noktaların silinip silinmediğini belirler. varsayılanlar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | için mesafeyi belirler[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . varsayılanlar`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Katmana eklendiklerinde geometrilerin doğrulanması gerekip gerekmediğini belirler. Eğer ayarlanırsa`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) katmana eklendiğinde ve doğrulama başarısız olursa ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) dır-dir`false` ),[`GisException`](../../aspose.gis/gisexception/) atılır. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Çokgen veya çoklu çokgenin çizgi dizisine dönüştürülmesine izin verilip verilmediğini belirler. varsayılanlar`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | bir[`XmlResolver`](./xmlresolver/) dış kaynakları çözmek için kullanılır. varsayılanXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde X ve Y koordinatlarına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | bir[`PrecisionModel`](../../aspose.gis/precisionmodel/) geometriler eklendiğinde Z koordinatına uygulanacaktır.[`VectorLayer`](../../aspose.gis/vectorlayer/) veya sayfadan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer/) . Varsayılan değer:[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Ayrıca bakınız

* class [DriverOptions](../../aspose.gis/driveroptions/)
* ad alanı [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* toplantı [Aspose.GIS](../../)


