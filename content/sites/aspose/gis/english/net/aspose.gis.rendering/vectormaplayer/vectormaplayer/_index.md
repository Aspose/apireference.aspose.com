---
title: VectorMapLayer.VectorMapLayer
second_title: Aspose.GIS for .NET API Reference
description: VectorMapLayer constructor. Creates new instance with default symbolizer
type: docs
weight: 10
url: /net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

Creates new instance with default symbolizer.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Features sequence. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

Creates new instance with default symbolizer.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Features sequence. |
| symbolizer | VectorSymbolizer | Symbolizer to use to render layer. If `null`, default symbolizer will be used. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling, SpatialReferenceSystem) {#constructor_2}

Creates new instance with default symbolizer.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling, SpatialReferenceSystem defaultReferenceSystem = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Features sequence. |
| symbolizer | VectorSymbolizer | Symbolizer to use to render layer. If `null`, default symbolizer will be used. |
| labeling | Labeling | Labeling to use to label features in layer. If `null`, default [`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| defaultReferenceSystem | SpatialReferenceSystem | Specifies a value for a source spatial reference (layer\sequence) if that is missing. Default **null** will be used. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_6}

Creates new instance with default symbolizer.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | Vector layer. |
| keepOpen | Boolean | `true` to leave the layer open after the [`VectorMapLayer`](../) object is disposed; otherwise, `false`. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_5}

Creates new instance.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | Vector layer. |
| symbolizer | VectorSymbolizer | Symbolizer to use to render layer. If `null`, default symbolizer will be used. |
| keepOpen | Boolean | `true` to leave the layer open after the [`VectorMapLayer`](../) object is disposed; otherwise, `false`. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_4}

Creates new instance.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | Vector layer. |
| symbolizer | VectorSymbolizer | Symbolizer to use to render layer. If `null`, default symbolizer will be used. |
| labeling | Labeling | Labeling to use to label features in layer. If `null`, default [`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| keepOpen | Boolean | `true` to leave the layer open after the [`VectorMapLayer`](../) object is disposed; otherwise, `false`. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, SpatialReferenceSystem, bool) {#constructor_3}

Creates new instance.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    SpatialReferenceSystem defaultReferenceSystem, bool keepOpen = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| layer | VectorLayer | Vector layer. |
| symbolizer | VectorSymbolizer | Symbolizer to use to render layer. If `null`, default symbolizer will be used. |
| labeling | Labeling | Labeling to use to label features in layer. If `null`, default [`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) will be used. |
| defaultReferenceSystem | SpatialReferenceSystem | Specifies a value for a source spatial reference (layer\sequence) if that is missing. Default **null** will be used. |
| keepOpen | Boolean | `true` to leave the layer open after the [`VectorMapLayer`](../) object is disposed; otherwise, `false`. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Layer is `null`. |

### See Also

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorMapLayer](../)
* namespace [Aspose.Gis.Rendering](../../vectormaplayer/)
* assembly [Aspose.GIS](../../../)


