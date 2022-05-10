---
title: VectorLayer
second_title: Aspose.GIS for .NET API Reference
description: 
type: docs
weight: 2180
url: /net/aspose.gis/vectorlayer/
---
## VectorLayer class

Represents a vector layer. A vector layer is a collection of geographic features, stored in a file.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| override [Attributes](attributes) { get; } | Gets the collection of custom attributes for features in this [`VectorLayer`](../vectorlayer). |
| virtual [Count](count) { get; } | Gets the number of features in this layer. |
| abstract [Driver](driver) { get; } | Gets the [`Driver`](./driver) that instantiated this layer. |
| abstract [GeometryType](geometrytype) { get; } | Gets the type of the geometry for the layer. |
| virtual [Item](item) { get; } | Gets the [`Feature`](../feature) at the specified index. |

## Methods

| Name | Description |
| --- | --- |
| static [Create](create)(AbstractPath, FileDriver) | Creates the layer and opens it for adding new features. |
| static [Create](create)(string, FileDriver) | Creates the layer and opens it for adding new features. |
| static [Create](create)(AbstractPath, FileDriver, DriverOptions) | Creates the layer and opens it for adding new features. |
| static [Create](create)(AbstractPath, FileDriver, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Create](create)(string, FileDriver, DriverOptions) | Creates the layer and opens it for adding new features. |
| static [Create](create)(string, FileDriver, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Create](create)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Create](create)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Open](open)(AbstractPath, FileDriver) | Open the layer for reading. |
| static [Open](open)(string, FileDriver) | Open the layer for reading. |
| static [Open](open)(AbstractPath, FileDriver, DriverOptions) | Open the layer for reading. |
| static [Open](open)(string, FileDriver, DriverOptions) | Open the layer for reading. |
| [Add](add)(Feature) | Adds a new feature to the layer, if supported by the [`VectorLayer`](../vectorlayer)'s [`Driver`](./driver). |
| virtual [Add](add)(Feature, IFeatureStyle) | Adds a new feature with the specified style to the layer, if supported by the [`VectorLayer`](../vectorlayer)'s [`Driver`](./driver). |
| [ConstructFeature](constructfeature)() | Creates (but does not add to the layer) a new feature with attributes matching the collection of attributes of this layer. When done with setting data for the feature, use [`Add`](./add) to add the feature to the layer. |
| [CopyAttributes](copyattributes)(FeaturesSequence) | Copies attributes of other [`VectorLayer`](../vectorlayer) to this one. |
| [CopyAttributes](copyattributes)(FeaturesSequence, IAttributesConverter) | Copies attributes of other [`VectorLayer`](../vectorlayer) to this one. |
| [Dispose](dispose)() | Releases the resources used by the [`VectorLayer`](../vectorlayer). |
| [Join](join)(VectorLayer, JoinOptions) | Joins a layer to the current layer. |
| [NearestTo](nearestto)(IPoint) | Gets the nearest feature to the provided point. |
| [NearestTo](nearestto)(double, double) | Gets the nearest feature to the provided coordinate. |
| virtual [RemoveAt](removeat)(int) | Remove the [`Feature`](../feature) at the specified index. |
| virtual [ReplaceAt](replaceat)(int, Feature) | Replace the [`Feature`](../feature) at the specified index. |
| virtual [UseAttributesIndex](useattributesindex)(AbstractPath, string, bool) | Loads attribute index to speed up filtering by attributes value in filter methods like [`WhereGreater`](../featuressequence/wheregreater). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| [UseAttributesIndex](useattributesindex)(string, string, bool) | Loads attribute index to speed up filtering by attributes value in filter methods like [`WhereGreater`](../featuressequence/wheregreater). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| virtual [UseSpatialIndex](usespatialindex)(AbstractPath, bool) | Loads spatial index to speed up filtering by attributes value in filter methods like [`WhereIntersects`](../featuressequence/whereintersects) and [`NearestTo`](./nearestto). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| [UseSpatialIndex](usespatialindex)(string, bool) | Loads spatial index to speed up filtering by attributes value in filter methods like [`WhereIntersects`](../featuressequence/whereintersects) and [`NearestTo`](./nearestto). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| static [Convert](convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Convert a layer to a different format. |
| static [Convert](convert)(string, FileDriver, string, FileDriver) | Convert a layer to a different format. |
| static [Convert](convert)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Convert a layer to a different format. |
| static [Convert](convert)(string, FileDriver, string, FileDriver, ConversionOptions) | Convert a layer to a different format. |

### See Also

* class [FeaturesSequence](../featuressequence)
* namespace [Aspose.Gis](../../aspose.gis)
* assembly [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
