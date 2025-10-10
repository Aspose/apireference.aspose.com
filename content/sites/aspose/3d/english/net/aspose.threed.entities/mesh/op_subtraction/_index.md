---
title: Mesh.op_Subtraction
second_title: Aspose.3D for .NET API Reference
description: Mesh method. Calculate the difference of two meshes
type: docs
weight: 150
url: /net/aspose.threed.entities/mesh/op_subtraction/
---
## Mesh Subtraction operator

Calculate the difference of two meshes

```csharp
public static Mesh operator -(Mesh a, Mesh b)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | Mesh | First mesh |
| b | Mesh | Second mesh |

### Return Value

Result mesh

## Examples

The following code shows how to calculate the difference of two meshes:

```csharp
var box1 = new Box(10, 10, 1).ToMesh();
var box2 = new Box(1, 1, 10).ToMesh();
Mesh merged = box1 - box2;
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../mesh/)
* assembly [Aspose.3D](../../../)


