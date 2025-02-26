---
title: Class VectorLayer
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.VectorLayer class. Represents a vector layer. A vector layer is a collection of geographic features stored in a file
type: docs
weight: 5050
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
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | Gets the collection of custom attributes for features in this `VectorLayer`. |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | Gets the number of features in this layer. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | Gets the [`Driver`](./driver/) that instantiated this layer. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | Gets the type of the geometry for the layer. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | Gets the [`Feature`](../feature/) at the specified index. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Gets spatial reference system of this features sequence. |

## Methods

| Name | Description |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | Creates the layer and opens it for adding new features. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | Creates the layer and opens it for adding new features. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Creates the layer and opens it for adding new features. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | Creates the layer and opens it for adding new features. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | Creates the layer and opens it for appending. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | Open the layer for reading. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | Open the layer for reading. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Open the layer for reading. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | Open the layer for reading. |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | Adds a new feature to the layer, if supported by the `VectorLayer`'s [`Driver`](./driver/). |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | Adds a new feature with the specified style to the layer, if supported by the `VectorLayer`'s [`Driver`](./driver/). |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | Create a layer clon as the InMemory format. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | Creates (but does not add to the layer) a new feature with attributes matching the collection of attributes of this layer. When done with setting data for the feature, use [`Add`](./add/) to add the feature to the layer. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | Copies attributes of other `VectorLayer` to this one. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | Copies attributes of other `VectorLayer` to this one. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | Releases the resources used by the `VectorLayer`. |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | Determines whether the specified object is equal to the current object. |
| virtual [FindIndex](../../aspose.gis/vectorlayer/findindex/)(Func&lt;Feature, bool&gt;) | Searching for a [`Feature`](../feature/) index according to the condition. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Gets a spatial extent of this layer. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | Joins a layer to the current layer. |
| [JoinByGeometry](../../aspose.gis/vectorlayer/joinbygeometry/)(VectorLayer, JoinByGeometryOptions) | Joins a layer to the current layer by geometry. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | Gets the nearest feature to the provided point. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | Gets the nearest feature to the provided coordinate. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | Remove the [`Feature`](../feature/) at the specified index. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | Replace the [`Feature`](../feature/) at the specified index. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | Saves features sequence to layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | Saves features sequence to layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | Saves features sequence to layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | Saves features sequence to layer. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Split features by geometry type. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | Loads attribute index to speed up filtering by attributes value in filter methods like [`WhereGreater`](../featuressequence/wheregreater/). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | Loads attribute index to speed up filtering by attributes value in filter methods like [`WhereGreater`](../featuressequence/wheregreater/). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | Loads spatial index to speed up filtering by attributes value in filter methods like [`WhereIntersects`](../featuressequence/whereintersects/) and [`NearestTo`](./nearestto/). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | Loads spatial index to speed up filtering by attributes value in filter methods like [`WhereIntersects`](../featuressequence/whereintersects/) and [`NearestTo`](./nearestto/). If index does not exist creates it first. Use *forceRebuild* to force index recreation. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Selects features with attribute value equal to the provided value. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Selects features with attribute value greater than the provided value. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Selects features with attribute value greater or equal to the provided value. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | Filters features based on the extent. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | Filters features based on the union of all geometries in other features sequence. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | Filters features based on the provided geometry. |
| virtual [WhereLinq](../../aspose.gis/featuressequence/wherelinq/)(Func&lt;Feature, bool&gt;) | Combining selection criteria into a single query using linq. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Selects features with attribute value not equal to the provided value. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Selects features with attribute not equal to null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Selects features with attribute equal to null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Selects features with attribute set. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Selects features with attribute value smaller than the provided value. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Selects features with attribute value smaller or equal to the provided value. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Selects features where specified attribute is not set. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | Convert a layer to a different format. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | Convert a layer to a different format. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | Convert a layer to a different format. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | Convert a layer to a different format. |

### See Also

* class [FeaturesSequence](../featuressequence/)
* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


