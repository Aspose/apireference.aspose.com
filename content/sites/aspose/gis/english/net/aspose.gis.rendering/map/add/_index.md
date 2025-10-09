---
title: Map.Add
second_title: Aspose.GIS for .NET API Reference
description: Map method. Creates a VectorMapLayer with default symbolizer and adds it to the map. Layers are rendered in addition order
type: docs
weight: 110
url: /net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_8}

Creates a [`VectorMapLayer`](../../vectormaplayer/) with default symbolizer and adds it to the map. Layers are rendered in addition order.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | A vector layer to represent by [`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` to leave the vector layer open after the [`Map`](../) object is disposed; `false` to dispose the layer. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_7}

Creates and adds a [`VectorMapLayer`](../../vectormaplayer/) to the map. Layers are rendered in addition order.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | A vector layer to represent by [`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |
| keepOpen | Boolean | `true` to leave the vector layer open after the [`Map`](../) object is disposed; `false` to dispose the layer. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_6}

Creates and adds a [`VectorMapLayer`](../../vectormaplayer/) to the map. Layers are rendered in addition order.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | A vector layer to represent by [`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |
| labeling | Labeling | Labeling to use to label features in layer. If `null`, default [`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| keepOpen | Boolean | `true` to leave the layer open after the [`Map`](../) object is disposed; otherwise, `false`. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, SpatialReferenceSystem, bool) {#add_5}

Creates and adds a [`VectorMapLayer`](../../vectormaplayer/) to the map. Layers are rendered in addition order.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    SpatialReferenceSystem defaultReferenceSystem, bool keepOpen = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | A vector layer to represent by [`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |
| labeling | Labeling | Labeling to use to label features in layer. If `null`, default [`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| defaultReferenceSystem | SpatialReferenceSystem | Specifies a value for a source spatial reference (layer\sequence) if that is missing. Default **null** will be used. |
| keepOpen | Boolean | `true` to leave the layer open after the [`Map`](../) object is disposed; otherwise, `false`. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Creates and adds a [`VectorMapLayer`](../../vectormaplayer/) to the map. Layers are rendered in addition order.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | A features sequence to represent by [`VectorMapLayer`](../../vectormaplayer/). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Features sequence is `null`. |

### See Also

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Creates and adds a [`VectorMapLayer`](../../vectormaplayer/) to the map. Layers are rendered in addition order.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | A features sequence to represent by [`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. If `null`, default symbolizer is used. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Features sequence is `null`. |

### See Also

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Creates and adds a [`VectorMapLayer`](../../vectormaplayer/) to the map. Layers are rendered in addition order.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | A features sequence to represent by [`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | A symbolizer to use for rendering. |
| labeling | Labeling | Labeling to use to label features in layer. If `null`, [`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) will be used. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Features sequence is `null`. |

### See Also

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Adds a layer to the map. Layers are rendered in addition order.

```csharp
public void Add(MapLayer mapLayer)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mapLayer | MapLayer | The layer to be added. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* class [MapLayer](../../maplayer/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Creates a [`RasterMapLayer`](../../rastermaplayer/) with default colorizer and adds it to the map.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | RasterLayer | A vector layer to represent by [`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | A colorizer to use for rendering. If `null`, default colorizer is used. |
| keepOpen | Boolean | `true` to leave the raster layer open after the [`Map`](../) object is disposed; `false` to dispose the layer. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* namespace [Aspose.Gis.Rendering](../../map/)
* assembly [Aspose.GIS](../../../)


