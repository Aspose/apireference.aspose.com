---
title: Mesh.Optimize
second_title: Aspose.3D for .NET API Reference
description: Mesh method. Optimize the meshs memory usage by eliminating duplicated control points
type: docs
weight: 90
url: /net/aspose.threed.entities/mesh/optimize/
---
## Mesh.Optimize method

Optimize the mesh's memory usage by eliminating duplicated control points

```csharp
public Mesh Optimize(bool vertexElements)
```

| Parameter | Type | Description |
| --- | --- | --- |
| vertexElements | Boolean | Optimize duplicated vertex element data |

### Return Value

New mesh instance with compact memory usage

### Examples

The following code shows how to eliminate duplicated control points from an unoptimized mesh:

```csharp
//Sphere.ToMesh generates 117 control points
var mesh = (new Sphere()).ToMesh();
//After optimized, there're only 86 control points, polygon indices are also remapped.
var optimized = mesh.Optimize(true);
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)


