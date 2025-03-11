---
title: Struct EndPoint
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.EndPoint struct. The end point to trim the curve can be a parameter value or a Cartesian point
type: docs
weight: 370
url: /net/aspose.threed.entities/endpoint/
---
## EndPoint structure

The end point to trim the curve, can be a parameter value or a Cartesian point.

```csharp
public struct EndPoint
```

## Constructors

| Name | Description |
| --- | --- |
| [EndPoint](endpoint/#constructor_1)(double) | Construct a `EndPoint` from a real parameter. |
| [EndPoint](endpoint/#constructor)(Vector3) | Construct a `EndPoint` from a Cartesian point. |

## Properties

| Name | Description |
| --- | --- |
| [AsPoint](../../aspose.threed.entities/endpoint/aspoint/) { get; } | Gets the end point as Cartesian point, or thrown an exception. |
| [AsValue](../../aspose.threed.entities/endpoint/asvalue/) { get; } | Gets the end point as a real parameter, or throw an exception. |
| [IsCartesianPoint](../../aspose.threed.entities/endpoint/iscartesianpoint/) { get; } | Is the end point a Cartesian point? |

## Methods

| Name | Description |
| --- | --- |
| static [FromDegree](../../aspose.threed.entities/endpoint/fromdegree/)(double) | Create an end point measured in degree. |
| static [FromRadian](../../aspose.threed.entities/endpoint/fromradian/)(double) | Create an end point measured in radian. |
| override [ToString](../../aspose.threed.entities/endpoint/tostring/)() | Returns a string representation of the current end point. |

### See Also

* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


