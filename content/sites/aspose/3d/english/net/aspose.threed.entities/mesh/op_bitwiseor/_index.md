---
title: Mesh.op_BitwiseOr
second_title: Aspose.3D for .NET API Reference
description: Mesh method. Calculate the union of two meshes
type: docs
weight: 130
url: /net/aspose.threed.entities/mesh/op_bitwiseor/
---
## Mesh BitwiseOr operator

Calculate the union of two meshes

```csharp
public static Mesh operator |(Mesh a, Mesh b)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | Mesh | First mesh |
| b | Mesh | Second mesh |

### Return Value

Result mesh

## Examples

The following code shows how to union two meshes into one mesh:

```csharp
var box1 = new Box(10, 10, 1).ToMesh();
var box2 = new Box(1, 1, 10).ToMesh();
var merged = box1 | box2;
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../mesh/)
* assembly [Aspose.3D](../../../)


