---
title: Class Map
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Rendering.Map klass. Karta är en samling lager som kan renderas ovanpå varandra viaRenderer .
type: docs
weight: 1720
url: /sv/net/aspose.gis.rendering/map/
---
## Map class

Karta är en samling lager som kan renderas ovanpå varandra via[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Skapar en ny instans av`Karta` class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Bakgrundsfärg på kartan. Standard tillTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Hämtar antalet lager i kartan. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Anger gränser för kartan som ska renderas. Om satt till`null` , omfattningen beräknas under renderingen för att inkludera alla geometrier i alla lager. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Visuell höjd på kartan. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Hämtar lagret vid angivet index. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Anger utfyllnad att lägga till i omfattningen. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Upplösning som ska användas för att rendera denna karta och för att konvertera mellan[`Measurement`](../measurement/) . Standard är 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) av kartan. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Visuell bredd på kartan. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Skapar och lägger till en[`VectorMapLayer`](../vectormaplayer/) till kartan. Lager renderas i tilläggsordning. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Lägger till ett lager på kartan. Lager renderas i tilläggsordning. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Skapar och lägger till en[`VectorMapLayer`](../vectormaplayer/) till kartan. Lager renderas i tilläggsordning. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | Skapar en[`VectorMapLayer`](../vectormaplayer/) med standardsymboliseraren och lägger till den på kartan. Lager renderas i tilläggsordning. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Skapar och lägger till en[`VectorMapLayer`](../vectormaplayer/) till kartan. Lager renderas i tilläggsordning. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Skapar en[`RasterMapLayer`](../rastermaplayer/) med standardfärgare och lägger till den på kartan. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Skapar och lägger till en[`VectorMapLayer`](../vectormaplayer/) till kartan. Lager renderas i tilläggsordning. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Skapar och lägger till en[`VectorMapLayer`](../vectormaplayer/) till kartan. Lager renderas i tilläggsordning. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Förfogar över resurser. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Returnerar en uppräkning som itererar genom lagren i kartan. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Återger kartan till en fil. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Återger kartan till en fil. |

### Se även

* class [MapLayer](../maplayer/)
* namnutrymme [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* hopsättning [Aspose.GIS](../../)


