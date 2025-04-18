---
title: Class GlobalTransform
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.GlobalTransform class. Global transform is similar to Transform but its immutable while it represents the final evaluated transformation. Righthand coordinate system is used while evaluating global transform
type: docs
weight: 1470
url: /net/aspose.threed/globaltransform/
---
## GlobalTransform class

Global transform is similar to [`Transform`](../transform/) but it's immutable while it represents the final evaluated transformation. Right-hand coordinate system is used while evaluating global transform

```csharp
public class GlobalTransform
```

## Properties

| Name | Description |
| --- | --- |
| [EulerAngles](../../aspose.threed/globaltransform/eulerangles/) { get; } | Gets the rotation represented in Euler angles, measured in degree |
| [Rotation](../../aspose.threed/globaltransform/rotation/) { get; } | Gets the rotation represented in quaternion. |
| [Scale](../../aspose.threed/globaltransform/scale/) { get; } | Gets the scale |
| [TransformMatrix](../../aspose.threed/globaltransform/transformmatrix/) { get; } | Gets the transform matrix. |
| [Translation](../../aspose.threed/globaltransform/translation/) { get; } | Gets the translation |

## Examples

The following code shows how to read node's global transform

```csharp
Scene scene = new Scene();
var boxNode = scene.RootNode.CreateChildNode(new Box());
//place the box at (10, 0, 0)
boxNode.Transform.Translation = new Vector3(10, 0, 0);
var global = boxNode.GlobalTransform;
Console.WriteLine($"The box's position in world coordinate is {global.Translation}");
```

### See Also

* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


