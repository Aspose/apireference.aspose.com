---
title: GmlOptions
second_title: Aspose.GIS for .NET API Referansı
description: GML formatı için sürücüye özel seçenekler.
type: docs
weight: 300
url: /tr/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

GML formatı için sürücüye özel seçenekler.

```csharp
public class GmlOptions : DriverOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GmlOptions](gmloptions)() | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Kapatılmamış birLinearRing her geometride Varsayılan`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Her geometri parçasının ortasına yeni bir nokta eklenip eklenmeyeceğini belirler. Varsayılan`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Her geometrideki yakın noktaların silinip silinmeyeceğini belirler. Varsayılan`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | için mesafeyi belirler[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Varsayılan`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Eğri geometrilerini doğrusallaştırmak için kullanılacak bir tolerans. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet) { get; set; } | Aspose.GIS'in İnternet'ten XML şeması yüklemesine izin verilip verilmediğini belirler. olarak ayarlanırsa`false` , 'file://' ile başlamayan mutlak URI'lere sahip şemalar yüklenmez. Varsayılan`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) geometriler eklendiğinde M koordinat öğesine uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer) ya da oradan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer) . Varsayılan değer[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator) { get; set; } | İç içe özniteliklerin bileşenlerini ayırmak için kullanılan bir dize alır veya ayarlar. Varsayılan "_"'dir. |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema) { get; set; } | Aspose.GIS'in bir XML şemasının eksik olduğu veya yüklenemediği bir Gml dosyasındaki öznitelikleri ayrıştırmasına izin verilip verilmediğini belirler. olarak ayarlanırsa`true` , Aspose.GIS okuyucu bir XML Schema'nın varlığını gerektirmez. Varsayılandır`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation) { get; set; } | URI çiftlerinin boşlukla ayrılmış listesi. Her çiftteki ilk URI, ad alanının URI'sidir, ikinci URI, ad alanının XML şemasına giden yoldur. `null` ,[`GmlDriver`](../gmldriver) belgenin kök öğesinden schemaLocation okumayı deneyecek. Varsayılan`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Her geometride aynı segment üzerinde bulunan noktaların silinip silinmeyeceğini belirler. Varsayılan`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | için mesafeyi belirler[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Varsayılan`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Katmana eklendiklerinde geometrilerin doğrulanıp doğrulanmayacağını belirler. olarak ayarlanırsa`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)katmana eklendiğinde ve doğrulama başarısız olursa her geometrisi için çağrılır ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) dır-dir`false` ),[`GisException`](../../aspose.gis/gisexception) atılır. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Çokgenin veya çok çokgenin çizgi dizisine dönüştürülmesine izin verilip verilmediğini belirler. Varsayılan`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver) { get; set; } | A[`XmlResolver`](./xmlresolver) dış kaynakları çözmek için kullanılır. VarsayılanXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)geometriler eklendiğinde X ve Y koordinatlarına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer) ya da oradan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer) . Varsayılan değer[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) geometriler eklendiğinde Z koordinat öğesine uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer) ya da oradan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer) . Varsayılan değer[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Ayrıca bakınız

* class [DriverOptions](../../aspose.gis/driveroptions)
* ad alanı [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
