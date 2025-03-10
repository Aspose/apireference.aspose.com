---
title: Class TransformBuilder
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Utilities.TransformBuilder class. The TransformBuilder is used to build transform matrix by a chain of transformations
type: docs
weight: 2760
url: /net/aspose.threed.utilities/transformbuilder/
---
## TransformBuilder class

The `TransformBuilder` is used to build transform matrix by a chain of transformations.

```csharp
public class TransformBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [TransformBuilder](transformbuilder/#constructor)(ComposeOrder) | Construct a `TransformBuilder` with initial identity transform matrix and specified compose order |
| [TransformBuilder](transformbuilder/#constructor_1)(Matrix4, ComposeOrder) | Construct a `TransformBuilder` with initial transform matrix and specified compose order |

## Properties

| Name | Description |
| --- | --- |
| [ComposeOrder](../../aspose.threed.utilities/transformbuilder/composeorder/) { get; set; } | Gets or sets the chain compose order. |
| [Matrix](../../aspose.threed.utilities/transformbuilder/matrix/) { get; set; } | Gets or sets the current matrix value |

## Methods

| Name | Description |
| --- | --- |
| [Append](../../aspose.threed.utilities/transformbuilder/append/)(Matrix4) | Append the new transform matrix to the transform chain. |
| [Compose](../../aspose.threed.utilities/transformbuilder/compose/)(Matrix4) | Append or prepend the argument to internal matrix. |
| [Prepend](../../aspose.threed.utilities/transformbuilder/prepend/)(Matrix4) | Prepend the new transform matrix to the transform chain. |
| [Rearrange](../../aspose.threed.utilities/transformbuilder/rearrange/)(Axis, Axis, Axis) | Rearrange the layout of the axis. |
| [Reset](../../aspose.threed.utilities/transformbuilder/reset/)() | Reset the transform to identity matrix |
| [Rotate](../../aspose.threed.utilities/transformbuilder/rotate/)(Quaternion) | Chain a rotation by a quaternion |
| [RotateDegree](../../aspose.threed.utilities/transformbuilder/rotatedegree/#rotatedegree)(double, Vector3) | Chain a rotation transform in degree |
| [RotateDegree](../../aspose.threed.utilities/transformbuilder/rotatedegree/#rotatedegree_1)(Vector3, RotationOrder) | Append rotation with specified order |
| [RotateEulerDegree](../../aspose.threed.utilities/transformbuilder/rotateeulerdegree/)(double, double, double) | Chain a rotation by Euler angles in degree |
| [RotateEulerRadian](../../aspose.threed.utilities/transformbuilder/rotateeulerradian/#rotateeulerradian)(Vector3) | Chain a rotation by Euler angles in radian |
| [RotateEulerRadian](../../aspose.threed.utilities/transformbuilder/rotateeulerradian/#rotateeulerradian_1)(double, double, double) | Chain a rotation by Euler angles in radian |
| [RotateRadian](../../aspose.threed.utilities/transformbuilder/rotateradian/#rotateradian)(double, Vector3) | Chain a rotation transform in radian |
| [RotateRadian](../../aspose.threed.utilities/transformbuilder/rotateradian/#rotateradian_1)(Vector3, RotationOrder) | Append rotation with specified order |
| [Scale](../../aspose.threed.utilities/transformbuilder/scale/#scale_1)(double) | Chain a scaling transform matrix with a component scaled by s |
| [Scale](../../aspose.threed.utilities/transformbuilder/scale/#scale)(Vector3) | Chain a scale transform |
| [Scale](../../aspose.threed.utilities/transformbuilder/scale/#scale_2)(double, double, double) | Chain a scaling transform matrix |
| [Translate](../../aspose.threed.utilities/transformbuilder/translate/#translate)(Vector3) | Chain a translation transform |
| [Translate](../../aspose.threed.utilities/transformbuilder/translate/#translate_1)(double, double, double) | Chain a translation transform |

## Examples

The following code shows how to create a matrix by a set of operation

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Translate(10, 20, 0);
tb.Scale(10, 10, 10);
tb.RotateEulerDegree(90, 0, 0);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* namespace [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../)


