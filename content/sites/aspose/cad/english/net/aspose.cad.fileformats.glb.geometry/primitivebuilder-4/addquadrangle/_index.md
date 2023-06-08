---
title: PrimitiveBuilder4.AddQuadrangle
second_title: Aspose.CAD for .NET API Reference
description: PrimitiveBuilder method. Adds a quadrangle
type: docs
weight: 120
url: /net/aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addquadrangle/
---
## AddQuadrangle(IVertexBuilder, IVertexBuilder, IVertexBuilder, IVertexBuilder) {#addquadrangle}

Adds a quadrangle.

```csharp
public (int A, int B, int C, int D) AddQuadrangle(IVertexBuilder a, IVertexBuilder b, 
    IVertexBuilder c, IVertexBuilder d)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | IVertexBuilder | First corner of the quadrangle. |
| b | IVertexBuilder | Second corner of the quadrangle. |
| c | IVertexBuilder | Third corner of the quadrangle. |
| d | IVertexBuilder | Fourth corner of the quadrangle. |

### Return Value

The indices of the vertices, or, in case the quadrangle is degenerated, (-1,-1,-1,-1).

## Remarks

If only one of the vertices is degenerated, leading to a single triangle, the resulting indices would have just one negative index, like this: (16,-1,17,18)

### See Also

* interface [IVertexBuilder](../../ivertexbuilder/)
* class [PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../primitivebuilder-4/)
* assembly [Aspose.CAD](../../../)

---

## AddQuadrangle(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;) {#addquadrangle_1}

Adds a quadrangle.

```csharp
public virtual (int A, int B, int C, int D) AddQuadrangle(VertexBuilder<TvG, TvM, TvS> a, 
    VertexBuilder<TvG, TvM, TvS> b, VertexBuilder<TvG, TvM, TvS> c, VertexBuilder<TvG, TvM, TvS> d)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | VertexBuilder`3 | First corner of the quadrangle. |
| b | VertexBuilder`3 | Second corner of the quadrangle. |
| c | VertexBuilder`3 | Third corner of the quadrangle. |
| d | VertexBuilder`3 | Fourth corner of the quadrangle. |

### Return Value

The indices of the vertices, or, in case the quadrangle is degenerated, (-1,-1,-1,-1).

### See Also

* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* class [PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../primitivebuilder-4/)
* assembly [Aspose.CAD](../../../)


