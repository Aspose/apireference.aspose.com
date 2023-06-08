---
title: MeshBuilder4.AddMesh
second_title: Aspose.CAD for .NET API Reference
description: MeshBuilder method. 
type: docs
weight: 60
url: /net/aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/
---
## AddMesh(IMeshBuilder&lt;TMaterial&gt;, Matrix4x4) {#addmesh_1}

```csharp
public void AddMesh(IMeshBuilder<TMaterial> mesh, Matrix4x4 vertexTransform)
```

### See Also

* interface [IMeshBuilder&lt;TMaterial&gt;](../../imeshbuilder-1/)
* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../meshbuilder-4/)
* assembly [Aspose.CAD](../../../)

---

## AddMesh(IMeshBuilder&lt;TMaterial&gt;, Func&lt;TMaterial, TMaterial&gt;, Converter&lt;IVertexBuilder, VertexBuilder&lt;TvG, TvM, TvS&gt;&gt;) {#addmesh}

```csharp
public void AddMesh(IMeshBuilder<TMaterial> mesh, 
    Func<TMaterial, TMaterial> materialTransform = null, 
    Converter<IVertexBuilder, VertexBuilder<TvG, TvM, TvS>> vertexTransform = null)
```

### See Also

* interface [IMeshBuilder&lt;TMaterial&gt;](../../imeshbuilder-1/)
* interface [IVertexBuilder](../../ivertexbuilder/)
* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../meshbuilder-4/)
* assembly [Aspose.CAD](../../../)

---

## AddMesh&lt;TSourceMaterial&gt;(IMeshBuilder&lt;TSourceMaterial&gt;, Func&lt;TSourceMaterial, TMaterial&gt;, Converter&lt;IVertexBuilder, VertexBuilder&lt;TvG, TvM, TvS&gt;&gt;) {#addmesh_2}

```csharp
public void AddMesh<TSourceMaterial>(IMeshBuilder<TSourceMaterial> mesh, 
    Func<TSourceMaterial, TMaterial> materialTransform, 
    Converter<IVertexBuilder, VertexBuilder<TvG, TvM, TvS>> vertexTransform = null)
```

### See Also

* interface [IMeshBuilder&lt;TMaterial&gt;](../../imeshbuilder-1/)
* interface [IVertexBuilder](../../ivertexbuilder/)
* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../meshbuilder-4/)
* assembly [Aspose.CAD](../../../)


