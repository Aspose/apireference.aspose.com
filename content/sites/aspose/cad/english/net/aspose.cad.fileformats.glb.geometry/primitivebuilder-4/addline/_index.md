---
title: PrimitiveBuilder4.AddLine
second_title: Aspose.CAD for .NET API Reference
description: PrimitiveBuilder method. Adds a line
type: docs
weight: 100
url: /net/aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addline/
---
## AddLine(IVertexBuilder, IVertexBuilder) {#addline}

Adds a line.

```csharp
public (int A, int B) AddLine(IVertexBuilder a, IVertexBuilder b)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | IVertexBuilder | First end of the line. |
| b | IVertexBuilder | Last end of the line. |

### Return Value

The indices of the vertices, or, in case the line is degenerated, (-1,-1).

### See Also

* interface [IVertexBuilder](../../ivertexbuilder/)
* class [PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../primitivebuilder-4/)
* assembly [Aspose.CAD](../../../)

---

## AddLine(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;) {#addline_1}

Adds a line.

```csharp
public virtual (int A, int B) AddLine(VertexBuilder<TvG, TvM, TvS> a, 
    VertexBuilder<TvG, TvM, TvS> b)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | VertexBuilder`3 | First corner of the line. |
| b | VertexBuilder`3 | Second corner of the line. |

### Return Value

The indices of the vertices, or, in case the line is degenerated, (-1,-1).

### See Also

* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* class [PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../primitivebuilder-4/)
* assembly [Aspose.CAD](../../../)


