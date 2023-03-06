---
title: Class Map
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Rendering.Map sınıf. Harita birbirinin üzerine işlenebilen bir katman koleksiyonudur.Renderer .
type: docs
weight: 1720
url: /tr/net/aspose.gis.rendering/map/
---
## Map class

Harita, birbirinin üzerine işlenebilen bir katman koleksiyonudur.[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Yeni örneğini oluşturur`Harita` sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Haritanın arka plan rengi. varsayılanlarTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Haritadaki katman sayısını alır. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Oluşturulacak haritanın sınırlarını belirtir. Olarak ayarlanırsa`null` , kapsam, oluşturma sırasında tüm katmanlardaki tüm geometrileri içerecek şekilde hesaplanır. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Haritanın görsel yüksekliği. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Katmanı belirtilen dizinde alır. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Kapsama eklenecek dolguyu belirtir. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Bu haritayı oluşturmak ve arasında dönüştürmek için kullanılacak çözünürlük[`Measurement`](../measurement/) . Varsayılanlar 96'dır. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) haritanın. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Haritanın görsel genişliği. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Bir oluşturur ve ekler[`VectorMapLayer`](../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Haritaya bir katman ekler. Katmanlar ek sırayla işlenir. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Bir oluşturur ve ekler[`VectorMapLayer`](../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | oluşturur[`VectorMapLayer`](../vectormaplayer/) varsayılan sembolleştirici ile ve haritaya ekler. Katmanlar ek sırayla işlenir. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Bir oluşturur ve ekler[`VectorMapLayer`](../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | oluşturur[`RasterMapLayer`](../rastermaplayer/) varsayılan renklendirici ile ve haritaya ekler. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Bir oluşturur ve ekler[`VectorMapLayer`](../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Bir oluşturur ve ekler[`VectorMapLayer`](../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Kaynakları bertaraf eder. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Haritadaki katmanlar arasında yinelenen bir Numaralandırıcı döndürür. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Haritayı bir dosyaya dönüştürür. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Haritayı bir dosyaya dönüştürür. |

### Ayrıca bakınız

* class [MapLayer](../maplayer/)
* ad alanı [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* toplantı [Aspose.GIS](../../)


