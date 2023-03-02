---
title: Class Map
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Rendering.Map klas. Map is een verzameling van lagen die over elkaar kunnen worden weergegeven viaRenderer .
type: docs
weight: 1720
url: /nl/net/aspose.gis.rendering/map/
---
## Map class

Map is een verzameling van lagen die over elkaar kunnen worden weergegeven via[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Maakt een nieuw exemplaar van het`Kaart` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Achtergrondkleur van de kaart. Standaard naarTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Krijgt het aantal lagen op de kaart. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Specificeert de grenzen van de te renderen kaart. Indien ingesteld op`null` , wordt de mate tijdens het renderen berekend om alle geometrieën in alle lagen op te nemen. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Visuele hoogte van de kaart. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Haalt de laag op bij de opgegeven index. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Specificeert opvulling om toe te voegen aan het bereik. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Resolutie die moet worden gebruikt om deze kaart weer te geven en ertussen te converteren[`Measurement`](../measurement/) . Standaard ingesteld op 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) van de kaart. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Visuele breedte van de kaart. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Creëert en voegt een[`VectorMapLayer`](../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Voegt een laag toe aan de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Creëert en voegt een[`VectorMapLayer`](../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | Creëert een[`VectorMapLayer`](../vectormaplayer/) met standaard symbolizer en voegt deze toe aan de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Creëert en voegt een[`VectorMapLayer`](../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Creëert een[`RasterMapLayer`](../rastermaplayer/) met standaardkleurmaker en voegt deze toe aan de kaart. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Creëert en voegt een[`VectorMapLayer`](../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Creëert en voegt een[`VectorMapLayer`](../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Beschikt over middelen. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Retourneert een teller die de lagen op de kaart herhaalt. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Rendert kaart in een bestand. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Rendert kaart in een bestand. |

### Zie ook

* class [MapLayer](../maplayer/)
* naamruimte [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* montage [Aspose.GIS](../../)


