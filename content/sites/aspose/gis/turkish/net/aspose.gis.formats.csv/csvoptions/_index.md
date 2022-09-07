---
title: CsvOptions
second_title: Aspose.GIS for .NET API Referansı
description: CSV formatı için sürücüye özel seçenekler.
type: docs
weight: 190
url: /tr/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

CSV formatı için sürücüye özel seçenekler.

```csharp
public class CsvOptions : DriverOptions
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [CsvOptions](csvoptions)() | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Kapatılmamış birLinearRing her geometride Varsayılan`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm) { get; set; } | M koordinat değeri içeren bir sütun adını alır veya ayarlar. Varsayılan`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt) { get; set; } | Geometriyi temsil etmek için İyi Bilinen Metin içeren bir sütun adını alır veya ayarlar. Varsayılandır`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx) { get; set; } | X koordinat değeri içeren sütunun adını alır veya ayarlar. Varsayılan`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny) { get; set; } | Y koordinat değerini içeren sütun adını alır veya ayarlar. Varsayılan`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz) { get; set; } | Z koordinat değeri içeren sütun adını alır veya ayarlar. Varsayılan`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Her geometri parçasının ortasına yeni bir nokta eklenip eklenmeyeceğini belirler. Varsayılan`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Her geometrideki yakın noktaların silinip silinmeyeceğini belirler. Varsayılan`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | için mesafeyi belirler[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Varsayılan`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter) { get; set; } | Değerleri ayırmak için sınırlayıcı olarak kullanılan bir karakter alır veya ayarlar. Varsayılan ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape) { get; set; } | Çift tırnak için kaçış harfi olarak kullanılan bir karakter alır veya ayarlar. Varsayılan '"''dir. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames) { get; set; } | Öznitelik adlarına sahip bir başlık satırının olup olmadığını belirler. Varsayılan`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Eğri geometrilerini doğrusallaştırmak için kullanılacak bir tolerans. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) geometriler eklendiğinde M koordinat öğesine uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer) ya da oradan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer) . Varsayılan değer[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Her geometride aynı segment üzerinde bulunan noktaların silinip silinmeyeceğini belirler. Varsayılan`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | için mesafeyi belirler[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Varsayılan`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber) { get; set; } | Veriler okunduğunda ilk olacak sıfır tabanlı bir satır sayısını alır veya ayarlar. Varsayılan 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Katmana eklendiklerinde geometrilerin doğrulanıp doğrulanmayacağını belirler. olarak ayarlanırsa`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)katmana eklendiğinde ve doğrulama başarısız olursa her geometrisi için çağrılır ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) dır-dir`false` ),[`GisException`](../../aspose.gis/gisexception) atılır. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Çokgenin veya çok çokgenin çizgi dizisine dönüştürülmesine izin verilip verilmediğini belirler. Varsayılan`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)geometriler eklendiğinde X ve Y koordinatlarına uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer) ya da oradan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer) . Varsayılan değer[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) geometriler eklendiğinde Z koordinat öğesine uygulanacak[`VectorLayer`](../../aspose.gis/vectorlayer) ya da oradan okunduklarında[`VectorLayer`](../../aspose.gis/vectorlayer) . Varsayılan değer[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Ayrıca bakınız

* class [DriverOptions](../../aspose.gis/driveroptions)
* ad alanı [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
