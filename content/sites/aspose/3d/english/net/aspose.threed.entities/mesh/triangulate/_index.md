---
title: Mesh.Triangulate
second_title: Aspose.3D for .NET API Reference
description: Mesh method. Return triangulated mesh
type: docs
weight: 110
url: /net/aspose.threed.entities/mesh/triangulate/
---
## Mesh.Triangulate method

Return triangulated mesh

```csharp
public Mesh Triangulate()
```

### Return Value

Current mesh if current mesh is already triangulated, otherwise a new triangulated mesh will be calculated and returned

## Examples

The following code shows how to triangulate a mesh:

```csharp
//The plane mesh has only one polygon with 4 control points
var mesh = (new Plane()).ToMesh();
//After triangulated, the new mesh's rectangle will become 2 triangles.
var triangulated = mesh.Triangulate();
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../mesh/)
* assembly [Aspose.3D](../../../)


