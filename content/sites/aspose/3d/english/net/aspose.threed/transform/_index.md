---
title: Class Transform
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Transform class. A transform contains information that allow access to objects translate/scale/rotation or transform matrix at minimum cost This is used by local transform
type: docs
weight: 2550
url: /net/aspose.threed/transform/
---
## Transform class

A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost This is used by local transform.

```csharp
public class Transform : A3DObject
```

## Properties

| Name | Description |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles/) { get; set; } | Gets or sets the rotation represented in Euler angles, measured in degree |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation/) { get; set; } | Gets or sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling/) { get; set; } | Gets or sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation/) { get; set; } | Gets or sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [PostRotation](../../aspose.threed/transform/postrotation/) { get; set; } | Gets or sets the post-rotation represented in degree |
| [PreRotation](../../aspose.threed/transform/prerotation/) { get; set; } | Gets or sets the pre-rotation represented in degree |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Rotation](../../aspose.threed/transform/rotation/) { get; set; } | Gets or sets the rotation represented in quaternion. |
| [RotationOffset](../../aspose.threed/transform/rotationoffset/) { get; set; } | Gets or sets the rotation offset |
| [RotationPivot](../../aspose.threed/transform/rotationpivot/) { get; set; } | Gets or sets the rotation pivot |
| [Scaling](../../aspose.threed/transform/scaling/) { get; set; } | Gets or sets the scaling |
| [ScalingOffset](../../aspose.threed/transform/scalingoffset/) { get; set; } | Gets or sets the scaling offset |
| [ScalingPivot](../../aspose.threed/transform/scalingpivot/) { get; set; } | Gets or sets the scaling pivot |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix/) { get; set; } | Gets or sets the transform matrix. |
| [Translation](../../aspose.threed/transform/translation/) { get; set; } | Gets or sets the translation |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles/)(double, double, double) | Sets the Euler angles in degrees of current transform. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation/)(double, double, double) | Sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling/)(double, double, double) | Sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation/)(double, double, double) | Sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation/)(double, double, double) | Sets the post-rotation represented in degree |
| [SetPreRotation](../../aspose.threed/transform/setprerotation/)(double, double, double) | Sets the pre-rotation represented in degree |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| [SetRotation](../../aspose.threed/transform/setrotation/)(double, double, double, double) | Sets the rotation(as quaternion components) of current transform. |
| [SetScale](../../aspose.threed/transform/setscale/)(double, double, double) | Sets the scale of current transform. |
| [SetTranslation](../../aspose.threed/transform/settranslation/)(double, double, double) | Sets the translation of current transform. |

## Examples

The following code shows how to change the transform of the node:

```csharp
Scene scene = new Scene();
var boxNode = scene.RootNode.CreateChildNode(new Box());
//place the box at (10, 0, 0)
boxNode.Transform.Translation = new Vector3(10, 0, 0);
```

### See Also

* class [A3DObject](../a3dobject/)
* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


