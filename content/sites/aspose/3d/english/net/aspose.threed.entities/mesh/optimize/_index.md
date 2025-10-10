---
title: Mesh.Optimize
second_title: Aspose.3D for .NET API Reference
description: Mesh method. Optimize the meshs memory usage by eliminating duplicated control points
type: docs
weight: 100
url: /net/aspose.threed.entities/mesh/optimize/
---
## Optimize(bool) {#optimize}

Optimize the mesh's memory usage by eliminating duplicated control points

```csharp
public Mesh Optimize(bool vertexElements)
```

| Parameter | Type | Description |
| --- | --- | --- |
| vertexElements | Boolean | Optimize duplicated vertex element data |

### Return Value

New mesh instance with compact memory usage

## Examples

The following code shows how to eliminate duplicated control points from an unoptimized mesh:

```csharp
//Sphere.ToMesh generates 117 control points
var mesh = (new Sphere()).ToMesh();
//After optimized, there're only 86 control points, polygon indices are also remapped.
var optimized = mesh.Optimize(true);
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../mesh/)
* assembly [Aspose.3D](../../../)

---

## Optimize(bool, float, float, float) {#optimize_1}

Optimize the mesh's memory usage by eliminating duplicated control points

```csharp
public Mesh Optimize(bool vertexElements, float toleranceControlPoint = 1E-09, 
    float toleranceNormal = 1E-09, float toleranceUV = 1E-09)
```

| Parameter | Type | Description |
| --- | --- | --- |
| vertexElements | Boolean | Optimize duplicated vertex element data |
| toleranceControlPoint | Single | The tolerance for control point, default value is 1e-9 |
| toleranceNormal | Single | The tolerance for normal/tangent/binormal default value is 1e-9 |
| toleranceUV | Single | The tolerance for uv, default value is 1e-9 |

### Return Value

New mesh instance with compact memory usage

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../mesh/)
* assembly [Aspose.3D](../../../)


