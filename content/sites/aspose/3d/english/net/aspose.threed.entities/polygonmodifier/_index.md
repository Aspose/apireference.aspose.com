---
title: Class PolygonModifier
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.PolygonModifier class. Utilities to modify polygons
type: docs
weight: 590
url: /net/aspose.threed.entities/polygonmodifier/
---
## PolygonModifier class

Utilities to modify polygons

```csharp
public class PolygonModifier
```

## Methods

| Name | Description |
| --- | --- |
| static [ApplyTransform](../../aspose.threed.entities/polygonmodifier/applytransform/)(Node, Matrix4) | Apply transform matrix on control points of all geometries |
| static [BuildTangentBinormal](../../aspose.threed.entities/polygonmodifier/buildtangentbinormal/#buildtangentbinormal)(Mesh) | This will create tangent and binormal on the mesh Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. UV is also required, an exception will be raised if no UV found. |
| static [BuildTangentBinormal](../../aspose.threed.entities/polygonmodifier/buildtangentbinormal/#buildtangentbinormal_1)(Scene) | This will create tangent and binormal on all meshes of the scene Normal is required, if normal is not existing on the mesh, it will also create the normal data from position. UV is also required, the mesh will be ignored if no UV is defined. |
| static [GenerateNormal](../../aspose.threed.entities/polygonmodifier/generatenormal/)(Mesh) | Generate normal data from Mesh definition |
| static [GenerateUV](../../aspose.threed.entities/polygonmodifier/generateuv/#generateuv)(Mesh) | Generate UV data from the given input mesh |
| static [GenerateUV](../../aspose.threed.entities/polygonmodifier/generateuv/#generateuv_1)(Mesh, VertexElementNormal) | Generate UV data from the given input mesh and specified normal data. |
| static [MergeMesh](../../aspose.threed.entities/polygonmodifier/mergemesh/#mergemesh_2)(IList&lt;Node&gt;) |  |
| static [MergeMesh](../../aspose.threed.entities/polygonmodifier/mergemesh/#mergemesh)(Node) | Convert a whole node to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet |
| static [MergeMesh](../../aspose.threed.entities/polygonmodifier/mergemesh/#mergemesh_1)(Scene) | Convert a whole scene to a single transformed mesh Vertex elements like normal/texture coordinates are not supported yet |
| static [Scale](../../aspose.threed.entities/polygonmodifier/scale/#scale_1)(Node, Vector3) | Scale all geometries(Scale the control points not the transformation matrix) in this node |
| static [Scale](../../aspose.threed.entities/polygonmodifier/scale/#scale)(Scene, Vector3) | Scale all geometries(Scale the control points not the transformation matrix) in this scene |
| static [SplitMesh](../../aspose.threed.entities/polygonmodifier/splitmesh/#splitmesh)(Mesh, SplitMeshPolicy) | Split mesh into sub-meshes by [`VertexElementMaterial`](../vertexelementmaterial/). Each sub-mesh will use only one material. The original mesh will not get changed. |
| static [SplitMesh](../../aspose.threed.entities/polygonmodifier/splitmesh/#splitmesh_2)(Scene, SplitMeshPolicy, bool) | Split mesh into sub-meshes by [`VertexElementMaterial`](../vertexelementmaterial/). Each sub-mesh will use only one material. Perform mesh splitting on all nodes of the scene. |
| static [SplitMesh](../../aspose.threed.entities/polygonmodifier/splitmesh/#splitmesh_1)(Node, SplitMeshPolicy, bool, bool) | Split mesh into sub-meshes by [`VertexElementMaterial`](../vertexelementmaterial/). Each sub-mesh will use only one material. Perform mesh splitting on a node |
| static [Triangulate](../../aspose.threed.entities/polygonmodifier/triangulate/#triangulate_1)(IList&lt;Vector4&gt;) |  |
| static [Triangulate](../../aspose.threed.entities/polygonmodifier/triangulate/#triangulate)(Mesh) | Convert a polygon-based mesh into full triangle mesh |
| static [Triangulate](../../aspose.threed.entities/polygonmodifier/triangulate/#triangulate_5)(Scene) | Convert all polygon-based meshes into full triangle mesh |
| static [Triangulate](../../aspose.threed.entities/polygonmodifier/triangulate/#triangulate_3)(IList&lt;Vector4&gt;, IList&lt;int[]&gt;) |  |
| static [Triangulate](../../aspose.threed.entities/polygonmodifier/triangulate/#triangulate_2)(IList&lt;Vector4&gt;, int[]) |  |
| static [Triangulate](../../aspose.threed.entities/polygonmodifier/triangulate/#triangulate_4)(IList&lt;Vector4&gt;, IList&lt;int[]&gt;, bool, out Vector3[]) |  |

### See Also

* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


