---
title: Class VectorLayer
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.VectorLayer sınıf. Bir vektör katmanını temsil eder. Bir vektör katmanı bir dosyada saklanan bir coğrafi özellikler koleksiyonudur.
type: docs
weight: 2320
url: /tr/net/aspose.gis/vectorlayer/
---
## VectorLayer class

Bir vektör katmanını temsil eder. Bir vektör katmanı, bir dosyada saklanan bir coğrafi özellikler koleksiyonudur.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Buradaki özellikler için özel özniteliklerin koleksiyonunu alır`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Bu katmandaki özelliklerin sayısını alır. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Şunu alır:[`Driver`](./driver/) bu katmanı başlatan. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Katman için geometri türünü alır. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Şunu alır:[`Feature`](../feature/) belirtilen dizinde. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Bu özellik dizisinin uzamsal referans sistemini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Katmanı oluşturur ve yeni özellikler eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Katmanı oluşturur ve yeni özellikler eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Katmanı oluşturur ve yeni özellikler eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Katmanı oluşturur ve yeni özellikler eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Okumak için katmanı açın. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Okumak için katmanı açın. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Okumak için katmanı açın. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Okumak için katmanı açın. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | tarafından destekleniyorsa, katmana yeni bir özellik ekler.`VectorLayer` S[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | tarafından destekleniyorsa, katmana belirtilen stille yeni bir özellik ekler.`VectorLayer` S[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | InMemory formatında bir katman klonu oluşturun. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Bu katmanın öznitelik koleksiyonuyla eşleşen niteliklere sahip yeni bir özellik oluşturur (ancak katmana eklemez). Özellik için ayar verileri ile bittiğinde, şunu kullanın:[`Add`](./add/) özelliği katmana eklemek için. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Diğerlerinin özniteliklerini kopyalar`VectorLayer` buna. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Diğerlerinin özniteliklerini kopyalar`VectorLayer` buna. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | tarafından kullanılan kaynakları serbest bırakır.`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Belirtilen nesnenin geçerli nesneye eşit olup olmadığını belirler. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Koleksiyon boyunca yinelenen bir numaralandırıcı döndürür. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Bu katmanın uzamsal kapsamını alır. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Bir katmanı geçerli katmanla birleştirir. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Sağlanan noktaya en yakın özelliği alır. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Sağlanan koordinata en yakın özelliği alır. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Kaldır[`Feature`](../feature/) belirtilen dizinde. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Değiştir[`Feature`](../feature/) belirtilen dizinde. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Unsur sırasını katmana kaydeder. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Unsur sırasını katmana kaydeder. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Unsur sırasını katmana kaydeder. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Unsur sırasını katmana kaydeder. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Unsurları geometri türüne göre ayırın. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için öznitelik dizini yükler[`WhereGreater`](../featuressequence/wheregreater/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için öznitelik dizini yükler[`WhereGreater`](../featuressequence/wheregreater/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için uzamsal dizin yükler[`WhereIntersects`](../featuressequence/whereintersects/) ve[`NearestTo`](./nearestto/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | gibi filtre yöntemlerinde öznitelik değerine göre filtrelemeyi hızlandırmak için uzamsal dizin yükler[`WhereIntersects`](../featuressequence/whereintersects/) ve[`NearestTo`](./nearestto/). Dizin yoksa önce onu oluşturur. Kullanmak*forceRebuild* dizin oluşturmayı zorlamak için. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Özellik değeri sağlanan değere eşit olan özellikleri seçer. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Özellik değeri sağlanan değerden daha büyük olan özellikleri seçer. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Özellik değeri sağlanan değerden büyük veya ona eşit olan özellikleri seçer. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Kapsama göre özellikleri filtreler. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Unsurları, diğer unsurlar dizisindeki tüm geometrilerin birleşimine göre filtreler. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Sağlanan geometriye göre unsurları filtreler. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Özellik değeri sağlanan değere eşit olmayan özellikleri seçer. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Özniteliği null değerine eşit olmayan özellikleri seçer. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Özniteliği null değerine eşit olan özellikleri seçer. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Nitelik ayarlı özellikleri seçer. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Özellik değeri sağlanan değerden daha küçük olan özellikleri seçer. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Özellik değeri sağlanan değerden küçük veya ona eşit olan özellikleri seçer. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Belirtilen özniteliğin ayarlanmadığı özellikleri seçer. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Bir katmanı farklı bir formata dönüştürün. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Bir katmanı farklı bir formata dönüştürün. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Bir katmanı farklı bir formata dönüştürün. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Bir katmanı farklı bir formata dönüştürün. |

### Ayrıca bakınız

* class [FeaturesSequence](../featuressequence/)
* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


