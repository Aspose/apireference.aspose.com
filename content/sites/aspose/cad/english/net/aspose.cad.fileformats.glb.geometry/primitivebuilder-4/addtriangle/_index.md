---
title: PrimitiveBuilder4.AddTriangle
second_title: Aspose.CAD for .NET API Reference
description: PrimitiveBuilder method. Adds a triangle
type: docs
weight: 130
url: /net/aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addtriangle/
---
## AddTriangle(IVertexBuilder, IVertexBuilder, IVertexBuilder) {#addtriangle}

Adds a triangle.

```csharp
public (int A, int B, int C) AddTriangle(IVertexBuilder a, IVertexBuilder b, IVertexBuilder c)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | IVertexBuilder | First corner of the triangle. |
| b | IVertexBuilder | Second corner of the triangle. |
| c | IVertexBuilder | Third corner of the triangle. |

### Return Value

The indices of the vertices, or, in case the triangle is degenerated, (-1,-1,-1).

### See Also

* interface [IVertexBuilder](../../ivertexbuilder/)
* class [PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../primitivebuilder-4/)
* assembly [Aspose.CAD](../../../)

---

## AddTriangle(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;) {#addtriangle_1}

Adds a triangle.

```csharp
public virtual (int A, int B, int C) AddTriangle(VertexBuilder<TvG, TvM, TvS> a, 
    VertexBuilder<TvG, TvM, TvS> b, VertexBuilder<TvG, TvM, TvS> c)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | VertexBuilder`3 | First corner of the triangle. |
| b | VertexBuilder`3 | Second corner of the triangle. |
| c | VertexBuilder`3 | Third corner of the triangle. |

### Return Value

The indices of the vertices, or, in case the triangle is degenerated, (-1,-1,-1).

### See Also

* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* class [PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../primitivebuilder-4/)
* assembly [Aspose.CAD](../../../)


