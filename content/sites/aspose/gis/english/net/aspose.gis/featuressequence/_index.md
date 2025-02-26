---
title: Class FeaturesSequence
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.FeaturesSequence class. FeaturesSequence represents a set of vector features
type: docs
weight: 1660
url: /net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` represents a set of vector features.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Gets the collection of custom attributes for features in this [`VectorLayer`](../vectorlayer/). |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Gets spatial reference system of this features sequence. |

## Methods

| Name | Description |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Gets a spatial extent of this layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Saves features sequence to layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Saves features sequence to layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Saves features sequence to layer. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Saves features sequence to layer. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Split features by geometry type. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Selects features with attribute value equal to the provided value. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Selects features with attribute value greater than the provided value. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Selects features with attribute value greater or equal to the provided value. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Filters features based on the extent. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Filters features based on the union of all geometries in other features sequence. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Filters features based on the provided geometry. |
| virtual [WhereLinq](../../aspose.gis/featuressequence/wherelinq/)(Func&lt;Feature, bool&gt;) | Combining selection criteria into a single query using linq. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Selects features with attribute value not equal to the provided value. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Selects features with attribute not equal to null. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Selects features with attribute equal to null. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Selects features with attribute set. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Selects features with attribute value smaller than the provided value. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Selects features with attribute value smaller or equal to the provided value. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Selects features where specified attribute is not set. |

### See Also

* class [Feature](../feature/)
* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


