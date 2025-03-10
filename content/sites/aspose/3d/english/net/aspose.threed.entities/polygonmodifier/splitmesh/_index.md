---
title: PolygonModifier.SplitMesh
second_title: Aspose.3D for .NET API Reference
description: PolygonModifier method. Split mesh into submeshes by VertexElementMaterial. Each submesh will use only one material. Perform mesh splitting on a node
type: docs
weight: 70
url: /net/aspose.threed.entities/polygonmodifier/splitmesh/
---
## SplitMesh(Node, SplitMeshPolicy, bool, bool) {#splitmesh_1}

Split mesh into sub-meshes by [`VertexElementMaterial`](../../vertexelementmaterial/). Each sub-mesh will use only one material. Perform mesh splitting on a node

```csharp
public static void SplitMesh(Node node, SplitMeshPolicy policy, bool createChildNodes = false, 
    bool removeOldMesh = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| node | Node |  |
| policy | SplitMeshPolicy |  |
| createChildNodes | Boolean | Create child nodes for each sub-mesh. |
| removeOldMesh | Boolean | Remove the old mesh after split, if this parameter is false, the old and new meshes will co-exists. |

## Examples

The following code shows how to split a box into sub meshes using material indices.

```csharp
// Create a mesh of box(A box is composed by 6 planes)
Mesh box = (new Box()).ToMesh();
// Create a material element on this mesh
VertexElementMaterial mat = (VertexElementMaterial)box.CreateElement(VertexElementType.Material, MappingMode.Polygon, ReferenceMode.Index);
// And specify different material index for each plane
mat.Indices.AddRange(new int[] { 0, 1, 2, 3, 4, 5 });
// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
Mesh[] planes = PolygonModifier.SplitMesh(box, SplitMeshPolicy.CloneData);

// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
mat.Indices.Clear();
mat.Indices.AddRange(new int[] { 0, 0, 0, 1, 1, 1 });
// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
planes = PolygonModifier.SplitMesh(box, SplitMeshPolicy.CompactData);
```

### See Also

* class [Node](../../../aspose.threed/node/)
* enum [SplitMeshPolicy](../../splitmeshpolicy/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## SplitMesh(Scene, SplitMeshPolicy, bool) {#splitmesh_2}

Split mesh into sub-meshes by [`VertexElementMaterial`](../../vertexelementmaterial/). Each sub-mesh will use only one material. Perform mesh splitting on all nodes of the scene.

```csharp
public static void SplitMesh(Scene scene, SplitMeshPolicy policy, bool removeOldMesh = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| scene | Scene |  |
| policy | SplitMeshPolicy |  |
| removeOldMesh | Boolean |  |

## Examples

The following code shows how to split a box into sub meshes using material indices.

```csharp
// Create a mesh of box(A box is composed by 6 planes)
Mesh box = (new Box()).ToMesh();
// Create a material element on this mesh
VertexElementMaterial mat = (VertexElementMaterial)box.CreateElement(VertexElementType.Material, MappingMode.Polygon, ReferenceMode.Index);
// And specify different material index for each plane
mat.Indices.AddRange(new int[] { 0, 1, 2, 3, 4, 5 });
// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
Mesh[] planes = PolygonModifier.SplitMesh(box, SplitMeshPolicy.CloneData);

// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
mat.Indices.Clear();
mat.Indices.AddRange(new int[] { 0, 0, 0, 1, 1, 1 });
// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
planes = PolygonModifier.SplitMesh(box, SplitMeshPolicy.CompactData);
```

### See Also

* class [Scene](../../../aspose.threed/scene/)
* enum [SplitMeshPolicy](../../splitmeshpolicy/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)

---

## SplitMesh(Mesh, SplitMeshPolicy) {#splitmesh}

Split mesh into sub-meshes by [`VertexElementMaterial`](../../vertexelementmaterial/). Each sub-mesh will use only one material. The original mesh will not get changed.

```csharp
public static Mesh[] SplitMesh(Mesh mesh, SplitMeshPolicy policy)
```

### Return Value

New splitted meshes

## Examples

The following code shows how to split a box into sub meshes using material indices.

```csharp
// Create a mesh of box(A box is composed by 6 planes)
Mesh box = (new Box()).ToMesh();
// Create a material element on this mesh
VertexElementMaterial mat = (VertexElementMaterial)box.CreateElement(VertexElementType.Material, MappingMode.Polygon, ReferenceMode.Index);
// And specify different material index for each plane
mat.Indices.AddRange(new int[] { 0, 1, 2, 3, 4, 5 });
// Now split it into 6 sub meshes, we specified 6 different materials on each plane, each plane will become a sub mesh.
// We used the CloneData policy, each plane will has the same control point information or control point-based vertex element information.
Mesh[] planes = PolygonModifier.SplitMesh(box, SplitMeshPolicy.CloneData);

// Now split it into 2 sub meshes, first mesh will contains 0/1/2 planes, and second mesh will contains the 3/4/5th planes.
mat.Indices.Clear();
mat.Indices.AddRange(new int[] { 0, 0, 0, 1, 1, 1 });
// We used the CompactData policy, each plane will has its own control point information or control point-based vertex element information.
planes = PolygonModifier.SplitMesh(box, SplitMeshPolicy.CompactData);
```

### See Also

* class [Mesh](../../mesh/)
* enum [SplitMeshPolicy](../../splitmeshpolicy/)
* class [PolygonModifier](../)
* namespace [Aspose.ThreeD.Entities](../../polygonmodifier/)
* assembly [Aspose.3D](../../../)


