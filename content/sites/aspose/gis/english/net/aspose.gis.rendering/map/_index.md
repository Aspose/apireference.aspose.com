---
title: Class Map
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.Map class. Map is a collection of layers that can be rendered on top of each other via Renderer
type: docs
weight: 4170
url: /net/aspose.gis.rendering/map/
---
## Map class

Map is a collection of layers that can be rendered on top of each other via [`Renderer`](../renderer/).

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Constructors

| Name | Description |
| --- | --- |
| [Map](map/#constructor)() | Creates new instance of the `Map` class. |
| [Map](map/#constructor_1)(Measurement, Measurement) | Creates new instance of the `Map` class. |

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Background color of the map. Defaults to Transparent. |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Gets the number of layers in the map. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Specifies bounds of map to render. If set to `null`, extent is calculated during rendering to include all geometries in all layers. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Visual height of the map. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Gets the layer at the specified index. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Specifies padding to add to the extent. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Resolution to be used to render this map and to convert between [`Measurement`](../measurement/). Defaults to 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) of the map. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Visual width of the map. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Creates and adds a [`VectorMapLayer`](../vectormaplayer/) to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Adds a layer to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Creates and adds a [`VectorMapLayer`](../vectormaplayer/) to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_8)(VectorLayer, bool) | Creates a [`VectorMapLayer`](../vectormaplayer/) with default symbolizer and adds it to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Creates and adds a [`VectorMapLayer`](../vectormaplayer/) to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Creates a [`RasterMapLayer`](../rastermaplayer/) with default colorizer and adds it to the map. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, VectorSymbolizer, bool) | Creates and adds a [`VectorMapLayer`](../vectormaplayer/) to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, Labeling, bool) | Creates and adds a [`VectorMapLayer`](../vectormaplayer/) to the map. Layers are rendered in addition order. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, SpatialReferenceSystem, bool) | Creates and adds a [`VectorMapLayer`](../vectormaplayer/) to the map. Layers are rendered in addition order. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Disposes resources. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Returns an enumerator that iterates through the layers in the map. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Renders map into a file. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Renders map into a file. |

### See Also

* class [MapLayer](../maplayer/)
* namespace [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* assembly [Aspose.GIS](../../)


