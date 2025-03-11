---
title: Geometry.CreateElement
second_title: Aspose.3D for .NET API Reference
description: Geometry method. Creates a vertex element with specified type and add it to the geometry
type: docs
weight: 90
url: /net/aspose.threed.entities/geometry/createelement/
---
## CreateElement(VertexElementType) {#createelement}

Creates a vertex element with specified type and add it to the geometry.

```csharp
public VertexElement CreateElement(VertexElementType type)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | VertexElementType | Vertex element type |

### Return Value

Created element.

## Remarks

If type is UV, a [`VertexElementUV`](../../vertexelementuv/) with texture mapping type to Diffuse will be created.

### See Also

* class [VertexElement](../../vertexelement/)
* enum [VertexElementType](../../vertexelementtype/)
* class [Geometry](../)
* namespace [Aspose.ThreeD.Entities](../../geometry/)
* assembly [Aspose.3D](../../../)

---

## CreateElement(VertexElementType, MappingMode, ReferenceMode) {#createelement_1}

Creates a vertex element with specified type and add it to the geometry.

```csharp
public VertexElement CreateElement(VertexElementType type, MappingMode mappingMode, 
    ReferenceMode referenceMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | VertexElementType | Vertex element type |
| mappingMode | MappingMode | Default mapping mode |
| referenceMode | ReferenceMode | Default reference mode |

### Return Value

Created element.

## Remarks

If type is UV, a [`VertexElementUV`](../../vertexelementuv/) with texture mapping type to Diffuse will be created.

### See Also

* class [VertexElement](../../vertexelement/)
* enum [VertexElementType](../../vertexelementtype/)
* enum [MappingMode](../../mappingmode/)
* enum [ReferenceMode](../../referencemode/)
* class [Geometry](../)
* namespace [Aspose.ThreeD.Entities](../../geometry/)
* assembly [Aspose.3D](../../../)


