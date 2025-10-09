---
title: Class VectorMapLayer
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Rendering.VectorMapLayer class. A layer inside Map that represents a vector layer data
type: docs
weight: 4450
url: /net/aspose.gis.rendering/vectormaplayer/
---
## VectorMapLayer class

A layer inside [`Map`](../map/) that represents a vector layer data.

```csharp
public class VectorMapLayer : MapLayer
```

## Constructors

| Name | Description |
| --- | --- |
| [VectorMapLayer](vectormaplayer/#constructor)(FeaturesSequence) | Creates new instance with default symbolizer. |
| [VectorMapLayer](vectormaplayer/#constructor_1)(FeaturesSequence, VectorSymbolizer) | Creates new instance with default symbolizer. |
| [VectorMapLayer](vectormaplayer/#constructor_6)(VectorLayer, bool) | Creates new instance with default symbolizer. |
| [VectorMapLayer](vectormaplayer/#constructor_5)(VectorLayer, VectorSymbolizer, bool) | Creates new instance. |
| [VectorMapLayer](vectormaplayer/#constructor_2)(FeaturesSequence, VectorSymbolizer, Labeling, SpatialReferenceSystem) | Creates new instance with default symbolizer. |
| [VectorMapLayer](vectormaplayer/#constructor_4)(VectorLayer, VectorSymbolizer, Labeling, bool) | Creates new instance. |
| [VectorMapLayer](vectormaplayer/#constructor_3)(VectorLayer, VectorSymbolizer, Labeling, SpatialReferenceSystem, bool) | Creates new instance. |

## Properties

| Name | Description |
| --- | --- |
| [FeaturesSequence](../../aspose.gis.rendering/vectormaplayer/featuressequence/) { get; } | The features sequence represented by this `VectorMapLayer`. |
| [Labeling](../../aspose.gis.rendering/vectormaplayer/labeling/) { get; set; } | Specifies warp options of the map layer. |
| [Opacity](../../aspose.gis.rendering/maplayer/opacity/) { get; set; } | Opacity of the layer. |
| [Symbolizer](../../aspose.gis.rendering/vectormaplayer/symbolizer/) { get; set; } | Symbolizer to use to render features of the layer. |

## Methods

| Name | Description |
| --- | --- |
| override [Dispose](../../aspose.gis.rendering/vectormaplayer/dispose/)() | Disposes resources. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld)(AbstractPath, SldImportOptions) | Imports style from Styled Layer Descriptor file located at the specified path. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld_1)(string, SldImportOptions) | Imports style from Styled Layer Descriptor file located at the specified path. |
| [ImportSldFromString](../../aspose.gis.rendering/vectormaplayer/importsldfromstring/)(string, SldImportOptions) | Imports style from the specified Styled Layer Descriptor string. |

### See Also

* class [MapLayer](../maplayer/)
* namespace [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* assembly [Aspose.GIS](../../)


