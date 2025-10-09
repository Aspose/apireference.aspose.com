---
title: Class Extent
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Extent class. A twodimensional spatial bounding box
type: docs
weight: 1610
url: /net/aspose.gis/extent/
---
## Extent class

A two-dimensional spatial bounding box.

```csharp
public class Extent : IEquatable<Extent>
```

## Constructors

| Name | Description |
| --- | --- |
| [Extent](extent/#constructor)() | Creates new instance. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Creates new instance. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Creates new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Center of the extent. |
| [Height](../../aspose.gis/extent/height/) { get; } | Height of the extent. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Determines whether this `Extent` is valid. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) associated with this extent. Can be `null` if [`SpatialReferenceSystem`](./spatialreferencesystem/) is unknown. Use [`GetTransformed`](./gettransformed/) in order to transform extent between difference spatial reference systems. |
| [Width](../../aspose.gis/extent/width/) { get; } | Width of the extent. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Maximum value of the X coordinate. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Minimum value of the X coordinate. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Maximum value of the Y coordinate. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Minimum value of the Y coordinate. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Clones this instance. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Determines whether this extent contains the argument. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Determines whether this extent contains the argument. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Determines whether this extent contains a coordinate defined by the arguments. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Indicates whether the current object is equal to another object of the same type. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Determines whether the specified object is equal to the current object. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Serves as the default hash function. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Returns new extent in specified [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) that contains this extent. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Grows this extent so it includes the argument. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Grows this extent so it includes the specified point. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Grows this extent along the X axis so it includes the specified value. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Grows this extent along the Y axis so it includes the specified value. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Determines whether this extent intersects with the argument. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Determines whether this extent intersects with the argument. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Swaps [`XMin`](./xmin/) with [`XMax`](./xmax/) if [`Width`](./width/) is negative and [`YMin`](./ymin/) with [`YMax`](./ymax/) if [`Height`](./height/) is negative. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Converts this extent to a rectangular polygon that represents it. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Returns a string that represents the current object. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Implements the '==' operator. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Implements the '!=' operator. |

### See Also

* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


