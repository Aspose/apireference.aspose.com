---
title: Node.EvaluateGlobalTransform
second_title: Aspose.3D for .NET API Reference
description: Node method. Evaluate the global transform include the geometric transform or not
type: docs
weight: 180
url: /net/aspose.threed/node/evaluateglobaltransform/
---
## Node.EvaluateGlobalTransform method

Evaluate the global transform, include the geometric transform or not.

```csharp
public Matrix4 EvaluateGlobalTransform(bool withGeometricTransform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| withGeometricTransform | Boolean | Whether the geometric transform is needed. |

### Return Value

The global transform matrix.

## Examples

The following code shows how to read the node's global transform matrix.

```csharp
Scene scene = new Scene();
var boxNode = scene.RootNode.CreateChildNode(new Box());
//place the box at (10, 0, 0)
boxNode.Transform.Translation = new Vector3(10, 0, 0);
Matrix4 mat = boxNode.EvaluateGlobalTransform(true);
Console.WriteLine($"The box's global transform matrix is {mat}");
```

### See Also

* struct [Matrix4](../../../aspose.threed.utilities/matrix4/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


